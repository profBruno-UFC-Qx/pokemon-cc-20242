package br.ufc.quixada.poo.game.pokemon;

public class Mapa {

  private final int largura;
  private final int altura;
  private String[][] layout;

  public Mapa(int largura, int altura) {
    this.largura = largura;
    this.altura = altura;
    this.layout = new String[largura][altura];
    inicializar();
  }

  private void inicializar() {
    for (int i = 0; i < largura; i++) {
      for (int j = 0; j < altura; j++) {
        layout[i][j] = " . ";
      }
    }
  }

  public void exibirMapa(int x, int y) {
    layout[x][y] = " T ";
    for (int i = 0; i < largura; i++) {
      System.out.print('|');
      for (int j = 0; j < altura; j++) {
        System.out.print(layout[i][j]);
      }
      System.out.println('|');
    }
  }

  public boolean posicaoValida(int x, int y) {
    return !(x < 0 || x >= largura || y < 0 || y >= altura);
  }
}
