package br.ufc.quixada.poo.game.pokemon.pokebolas;

import br.ufc.quixada.poo.game.pokemon.Pokemon;

public class FastBall extends PokebolaAfetaTaxaCaptura {

  @Override
  public float getBonus(Pokemon pokemon) {
    if (pokemon.getVelocidade() >= 100) {
      return 4f;
    }
    return 1f;
  }
}
