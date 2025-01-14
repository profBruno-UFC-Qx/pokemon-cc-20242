package br.ufc.quixada.poo.game.pokemon.pokebolas;

import br.ufc.quixada.poo.game.pokemon.Pokemon;

public class UltraBall extends PokebolaAfetaTaxaCaptura {

  @Override
  public float getBonus(Pokemon pokemon) {
    return 2.0f;
  }
}
