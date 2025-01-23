package br.ufc.quixada.poo.game.pokemon;

import java.util.Random;

public class Encontro {

  public static Pokemon getRandomPokemon() {
    Random random = new Random();
    int sorteado = random.nextInt(EspeciePokemon.values().length);
    EspeciePokemon base  = EspeciePokemon.values()[random.nextInt(EspeciePokemon.values().length)];
    return new Pokemon(sorteado + 1, base.getNome(), base.getHpBase(), base.getAtaqueBase(), base.getDefesaBase(), base.getVelocidadeBase(), base.getAmizadeBase(), base.getPeso(), base.getTaxaDeCaptura());
  }
}

