package br.ufc.quixada.poo.game.pokemon;

public class Mapa {

  private final int largura;
  private final int altura;
  private String[][] layout;

  public Mapa(int largura, int altura) {
    this.largura = largura;
    this.altura = altura;
    this.layout = new String[largura][altura];
    inicializarMapa();
  }

  private void inicializarMapa() {
    for (int x = 0; x < largura; x++) {
      for (int y = 0; y < altura; y++) {
        if(Math.random() > 0.4){
          layout[x][y] = " w ";
        } else {
          layout[x][y] = " . ";
        }
      }
    }
  }

  public boolean posicaoValida(int x, int y) {
    return !(x >= largura || x < 0 || y >= altura || y < 0);
  }

  public void exibirMapa(int x, int y) {
    String aux = layout[x][y];
    layout[y][x] = " T ";
    for (int i = 0; i < this.largura; i++) {
      System.out.print('|');
      for (int j = 0; j < this.altura; j++) {
        System.out.print(this.layout[i][j]);
      }
      System.out.println('|');
    }
    layout[y][x] = aux;
  }


  public void moverTreinador(Treinador treinador, String direcao) {
    int x = treinador.getX();
    int y = treinador.getY();

    switch (direcao) {
      case "c":
        y = Math.max(0, --y);
        break;
      case "b":
        y = Math.min(altura - 1, ++y);
        break;
      case "t":
        x = Math.max(0, --x);
        break;
      case "f":
        x = Math.min(largura - 1, ++x);
        break;
      case "sair":
        System.exit(0);
      default:
        System.out.println("Direção inválida");
        break;
    }
    treinador.setPosicao(x, y);
  }

}
