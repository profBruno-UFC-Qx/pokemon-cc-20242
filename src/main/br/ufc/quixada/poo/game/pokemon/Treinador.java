package br.ufc.quixada.poo.game.pokemon;

import br.ufc.quixada.poo.game.Pokedex;
import br.ufc.quixada.poo.game.pokemon.pokebolas.MasterBall;
import br.ufc.quixada.poo.game.pokemon.pokebolas.Pokebola;

public class Treinador {

  private String nome;
  private int x;
  private int y;
  private Pokedex pokedex;
  private Pokebola[] pokebolas = {new Pokebola(), new Pokebola(), new MasterBall()};

  public Treinador(String nome, Pokedex pokedex) {
    this.nome = nome;
    this.x = 0;
    this.y = 0;
    this.pokedex = pokedex;
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

  public boolean temPokebola() {
    for(Pokebola pokebola: pokebolas) {
      if(pokebola != null) return true;
    }
    return false;
  }

  public Pokebola arremessarPokebola() {
    for(int i = 0; i < pokebolas.length; i++) {
      if(pokebolas[i] != null) {
        Pokebola pokebola = pokebolas[i];
        pokebolas[i] = null;
        return pokebola;
      }
    }
    return null;
  }


  public Pokedex getPokedex() {
    return pokedex;
  }
}
