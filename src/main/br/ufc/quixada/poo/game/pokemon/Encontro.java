package br.ufc.quixada.poo.game.pokemon;

import java.util.Random;

public class Encontro {

  public static Pokemon getRandomPokemon() {
    Random random = new Random();
    EspeciePokemon base  = EspeciePokemon.values()[random.nextInt(EspeciePokemon.values().length)];
    return getRandomPokemon(base);
  }

  public static Pokemon getRandomPokemon(EspeciePokemon pokemon) {
    return new Pokemon(pokemon.ordinal() + 1, pokemon.getNome(), pokemon.getHpBase(), pokemon.getAtaqueBase(), pokemon.getDefesaBase(), pokemon.getVelocidadeBase(), pokemon.getAmizadeBase(), pokemon.getPeso(), pokemon.getTaxaDeCaptura());
  }
}

