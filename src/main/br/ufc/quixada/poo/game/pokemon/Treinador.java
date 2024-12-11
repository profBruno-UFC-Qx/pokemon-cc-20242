package br.ufc.quixada.poo.game.pokemon;

public class Treinador {

  private String nome;
  private int x;
  private int y;
  private Pokemon[] pokemons;

  public Treinador(String nome) {
    this.nome = nome;
    this.x = 0;
    this.y = 0;
    this.pokemons = new Pokemon[3];
  }

  public String getNome() {
    return nome;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void setPosicao(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void listar() {
    for(Pokemon pokemon: pokemons) {
      if(pokemon != null) {
        System.out.println(pokemon.nome);
      }
    }
  }

  public boolean capturar(Pokemon pokemon) {
    for(int i = 0; i < pokemons.length; i++) {
      if(pokemons[i] == null) {
        pokemons[i] = pokemon;
        return true;
      }
    }
    return false;
  }











}
