package br.ufc.quixada.poo.game.pokemon.pokebolas;

import br.ufc.quixada.poo.game.pokemon.Pokemon;

public class HealBall extends PokebolaAfetaPokemon {

  @Override
  protected void aplicarEfeito(Pokemon pokemon) {
    pokemon.curar(pokemon.getHpMax());
  }
}
