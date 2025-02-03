package br.ufc.quixada.poo.game.pokemon;

import br.ufc.quixada.poo.game.MenuPokedex;
import br.ufc.quixada.poo.game.Pokedex;
import br.ufc.quixada.poo.game.pokemon.batalha.Batalha;

import java.util.Scanner;

public class Jogo {

  private final Mapa mapa;
  private final Treinador treinador;

  public Jogo(String nome) {
    treinador = new Treinador(nome, new Pokedex());
    mapa = new Mapa(10, 10);
  }

  public void iniciar() {
    Scanner scanner = new Scanner(System.in);
    String opcao;
    do {
      mapa.exibirMapa(treinador.getX(), treinador.getY());
      System.out.println("Para onde quer ir? c, b, f, t, P ou sair");
      opcao = scanner.nextLine();
      if(opcao.equalsIgnoreCase("P")) {
        MenuPokedex menuPokedex = new MenuPokedex(treinador.getPokedex());
        menuPokedex.mostrarMenu();
      } else {
        mapa.moverTreinador(treinador, opcao);
        if(mapa.encontrouPokemon(treinador)) {
          Pokemon encontrado = Encontro.getRandomPokemon();
          Batalha batalha = new Batalha(treinador, encontrado);
          batalha.iniciar();
          do {
            batalha.proximoTurno();
          } while(!batalha.terminou());
        }
      }
    } while(!opcao.equals("sair"));


  }
}
