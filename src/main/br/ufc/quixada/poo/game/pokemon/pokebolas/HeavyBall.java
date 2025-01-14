package br.ufc.quixada.poo.game.pokemon.pokebolas;

import br.ufc.quixada.poo.game.pokemon.Pokemon;

public class HeavyBall extends Pokebola {

  @Override
  protected float getTaxaDeCaptura(Pokemon pokemon) {
    int bonus = 0;
    if(pokemon.getPeso() < 100) {
      bonus = -20;
    } else if(pokemon.getPeso() >= 200 && pokemon.getPeso() < 300) {
      bonus = 20;
    } else if(pokemon.getPeso() >= 300 ) {
      bonus = 30;
    }
    return super.getTaxaDeCaptura(pokemon) + bonus;
  }
}
