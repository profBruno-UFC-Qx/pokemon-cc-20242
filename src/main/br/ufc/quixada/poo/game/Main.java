package br.ufc.quixada.poo.game;

import br.ufc.quixada.poo.game.pokemon.Pokemon;
import br.ufc.quixada.poo.game.pokemon.Treinador;

public class Main {
  public static void main(String[] args) {
    Pokemon pikachu = new Pokemon("Pikachu", 1, 5);
    Pokemon eevee = new Pokemon("Eevee");

    Treinador ash = new Treinador("Ash");
    System.out.println(ash.getNome() + "[" + ash.getX() + "," + ash.getY() + "]");
    ash.mover("baixo");
    System.out.println(ash.getNome() + "[" + ash.getX() + "," + ash.getY() + "]");
    ash.listar();
    ash.capturar(pikachu);
    ash.capturar(pikachu);
    ash.capturar(eevee);
    if(ash.capturar(pikachu) == false) {
      System.out.println("A bolsa está cheia");
    }
    ash.listar();

  }

}