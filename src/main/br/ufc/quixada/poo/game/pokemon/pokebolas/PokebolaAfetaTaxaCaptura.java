package br.ufc.quixada.poo.game.pokemon.pokebolas;

import br.ufc.quixada.poo.game.pokemon.Pokemon;

public abstract class PokebolaAfetaTaxaCaptura extends Pokebola{

  @Override
  public abstract float getBonus(Pokemon pokemon);
}
