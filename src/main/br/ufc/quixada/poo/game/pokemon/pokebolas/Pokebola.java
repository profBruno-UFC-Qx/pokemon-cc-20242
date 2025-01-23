package br.ufc.quixada.poo.game.pokemon.pokebolas;

import br.ufc.quixada.poo.game.pokemon.Pokemon;

import java.util.Random;

public class Pokebola {

  public float getBonus(Pokemon pokemon) {
    return 1;
  }

  protected float getTaxaDeCaptura(Pokemon pokemon) {
    return (3f*pokemon.getHpMax() - 2*pokemon.getHpAtual())/(3*pokemon.getHpMax())
            * pokemon.getTaxaDeCaptura() * getBonus(pokemon) * 1;
  }

  public boolean capturar(Pokemon p) {
    float chance = getTaxaDeCaptura(p);
    System.out.println("Você tem " + (chance/255f)*100 + "% para capturar o pokemon");
    Random r = new Random();
    double sorteio = r.nextInt(255);
    return sorteio < chance;
  }
}
