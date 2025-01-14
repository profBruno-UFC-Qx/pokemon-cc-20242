package br.ufc.quixada.poo.game.pokemon.pokebolas;

import br.ufc.quixada.poo.game.pokemon.Pokemon;

public abstract class PokebolaAfetaPokemon extends Pokebola {

  protected abstract void aplicarEfeito(Pokemon pokemon);

  @Override
  public final boolean capturar(Pokemon p) {
    boolean capturou = super.capturar(p);
    if (capturou) {
      aplicarEfeito(p);
    }
    return capturou;
  }
}
