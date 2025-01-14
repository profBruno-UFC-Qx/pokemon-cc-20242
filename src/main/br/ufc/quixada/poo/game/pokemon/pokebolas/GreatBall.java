package br.ufc.quixada.poo.game.pokemon.pokebolas;

import br.ufc.quixada.poo.game.pokemon.Pokemon;

public class GreatBall extends PokebolaAfetaTaxaCaptura {

  @Override
  public float getBonus(Pokemon pokemon) {
    return 1.5f;
  }
}
