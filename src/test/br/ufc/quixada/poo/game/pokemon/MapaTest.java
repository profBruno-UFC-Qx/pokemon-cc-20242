package br.ufc.quixada.poo.game.pokemon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MapaTest {

  @Test
  void posicaoCentral() {
    Mapa mapa = new Mapa(5, 5);
    assertTrue(mapa.posicaoValida(2, 2), "A posicao esta dentro do mapa");
  }

  @Test
  void posicaoMuitoFora() {
    Mapa mapa = new Mapa(5, 5);
    assertFalse(mapa.posicaoValida(12, 12), "A posicao esta fora do mapa");
  }

  @Test
  void posicaoNaBordaX() {
    Mapa mapa = new Mapa(5, 5);
    assertTrue(mapa.posicaoValida(0, 3), "A posicao esta dentro do mapa");
    assertTrue(mapa.posicaoValida(4, 3), "A posicao esta dentro do mapa");
  }

  @Test
  void posicaoNaBordaY() {
    Mapa mapa = new Mapa(5, 5);
    assertTrue(mapa.posicaoValida(3, 0), "A posicao esta dentro do mapa");
    assertTrue(mapa.posicaoValida(3, 4), "A posicao esta dentro do mapa");
  }
}