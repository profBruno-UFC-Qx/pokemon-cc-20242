package br.ufc.quixada.poo.game.pokemon;

public class Pokebola {
  protected float taxaBase;

  public Pokebola() {
    this.taxaBase = 0.4f;
  }

  private float getTaxaDeCaptura(Pokemon pokemon) {
    return taxaBase - (taxaBase *(pokemon.getNivel()/100f)) + 0.05f;
  }

  public boolean capturar(Pokemon p) {
    float chance = getTaxaDeCaptura(p);
    System.out.println("Você tem " + chance + "% para capturar o pokemon");
    double sorteio = Math.random();
    System.out.println(sorteio);
    return sorteio < chance;
  }
}
