package br.ufc.quixada.poo.game;

import br.ufc.quixada.poo.game.pokemon.Mapa;
import br.ufc.quixada.poo.game.pokemon.Pokemon;
import br.ufc.quixada.poo.game.pokemon.Treinador;

public class Main {
  public static void main(String[] args) {
    Mapa mapa = new Mapa(10, 10);
    mapa.exibirMapa(4, 4 );
  }

}