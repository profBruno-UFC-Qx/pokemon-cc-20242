package br.ufc.quixada.poo.game.pokemon;

import java.util.Objects;

public class Pokemon {
  private final int especie;
  private final String nome;
  private final int nivel;
  private final int hpBase;
  private final int hpMax;
  private int hpAtual;
  private final int taxaDeCaptura;
  private final int velocidade;
  private int experiencia;
  private int amizade;
  private int ataqueBase;
  private int defesaBase;
  private double peso;

  public Pokemon(int especie, String nome, int hpBase, int ataque, int defesa, int velocidade, int amizade, double peso, int taxaDeCaptura) {
    this.especie = especie;
    this.nome = nome;
    this.hpBase = hpBase;
    this.ataqueBase = ataque;
    this.defesaBase = defesa;
    this.velocidade = velocidade;
    this.amizade = amizade;
    this.peso = peso;
    this.taxaDeCaptura = taxaDeCaptura;
    this.nivel = 1;
    this.hpMax = calcularHP(nivel);
  }

  private int calcularHP(int nivel) {
    return ((2 * hpBase * nivel) / 100) + nivel + 10;
  }

  public int getEspecie() {
    return especie;
  }

  public String getNome() {
    return nome;
  }

  public int getHpMax() {
    return hpMax;
  }

  public int getHpAtual() {
    return this.hpAtual;
  }

  public int getTaxaDeCaptura() {
    return taxaDeCaptura;
  }

  public int getVelocidade() {
    return this.velocidade;
  }

  public double getPeso() {
    return this.peso;
  }

  public int getNivel() {
    return nivel;
  }

  public String falar() {
    return nome + " " + nome;
  }

  public void setAmizade(int amizade) {
    this.amizade = amizade;
  }

  public void setHpAtual(int hp) {
    hpAtual = hp + hpAtual;

    if(hpAtual > hpMax) {
        hpAtual = hpMax;
    }

    if (hpAtual < 0) {
        hpAtual = 0;
    }
  }

  public int curar(int pontosDeVida) {
    setHpAtual(pontosDeVida);
    return this.hpAtual;
  }

  public void atacar(int movimento, Pokemon alvo) {
    if (taVivo()) {
      //ataque!
      System.out.println("Atacando o " + alvo + " com ataque" + movimento);
    } else {
      System.out.println("to morto :/");
    }
  }

  private boolean taVivo() {
    return this.hpAtual > 0;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Pokemon pokemon = (Pokemon) o;
    return especie == pokemon.especie && nivel == pokemon.nivel && hpBase == pokemon.hpBase && hpMax == pokemon.hpMax && hpAtual == pokemon.hpAtual && taxaDeCaptura == pokemon.taxaDeCaptura && velocidade == pokemon.velocidade && experiencia == pokemon.experiencia && amizade == pokemon.amizade && ataqueBase == pokemon.ataqueBase && defesaBase == pokemon.defesaBase && Double.compare(peso, pokemon.peso) == 0 && Objects.equals(nome, pokemon.nome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(especie, nome, nivel, hpBase, hpMax, hpAtual, taxaDeCaptura, velocidade, experiencia, amizade, ataqueBase, defesaBase, peso);
  }

  @Override
  public String toString() {
    return "Pokemon{" +
            "nome='" + nome + "[" + nivel + "]" + '\'' +
            ", hpAtual=" + hpAtual +
            ", ataque=" + ataqueBase +
            ", defesa=" + defesaBase +
            ", velocidade=" + velocidade  +
            '}';
  }


}
