package br.ufc.quixada.poo.game.pokemon.pokebolas;

import br.ufc.quixada.poo.game.pokemon.Pokemon;

public class Pokebola {

  public float getBonus(Pokemon pokemon) {
    return 1;
  };

  protected float getTaxaDeCaptura(Pokemon pokemon) {
    return (3*pokemon.getHpMax() - 2*pokemon.getHpAtual())/(3*pokemon.getHpMax())
            * pokemon.getTaxaDeCaptura() * getBonus(pokemon) * 1;
  }

  public boolean capturar(Pokemon p) {
    float chance = getTaxaDeCaptura(p);
    System.out.println("Você tem " + chance + "% para capturar o pokemon");
    double sorteio = Math.random();
    System.out.println(sorteio);
    return sorteio < chance;
  }
}
