package br.ufc.quixada.poo.game;

import br.ufc.quixada.poo.game.pokemon.EspeciePokemon;
import br.ufc.quixada.poo.game.pokemon.Pokemon;

import java.util.Scanner;

public class MenuPokedex {

  private Pokedex pokedex;

  public MenuPokedex(Pokedex pokedex) {
    this.pokedex = pokedex;
  }

  private void mostrarOpcoes() {
    System.out.println("\nMenu de Pokedex");
    System.out.println("1. Mostrar Capturados");
    System.out.println("2. Mostrar Vistos");
    System.out.println("3. Detalhes sobre um pokemon");
    System.out.println("4. Voltar");
  }

  public void mostrarMenu() {
    Scanner scanner = new Scanner(System.in);
    String opcao;
    do {
      mostrarOpcoes();
      opcao = scanner.nextLine();
      switch (Integer.parseInt(opcao)) {
        case 1:
          listarCapturados();
          break;
        case 2:
          listarVistos();
          break;
        case 3:
          System.out.println("Digite o nome do pokemon: ");
          opcao = scanner.nextLine();
          detalhes(opcao);
          break;
      }

    } while(!opcao.equalsIgnoreCase("4"));
  }

  private void listarCapturados() {
    for (Pokemon pokemon: pokedex.listarCapturados()) {
      System.out.println(pokemon);
    }
  }

  private void listarVistos() {
//    for(int i = 0; i < EspeciePokemon.values().length; i++) {
//      for (EspeciePokemon pokemon: pokedex.listarVistos()) {
//        if(i == pokemon.ordinal()) {
//          System.out.println(pokemon.getNome());
//        } else {
//          System.out.println("?????????");
//        }
//      }
//    }
    for (EspeciePokemon pokemon: pokedex.listarVistos()) {
      System.out.println(pokemon);
    }

  }

  private void detalhes(String pokemon) {
    EspeciePokemon especie = EspeciePokemon.valueOf(pokemon.toUpperCase());
    long capturados = pokedex.contarCapturasPorEspecie(especie);
    double taxa = pokedex.taxaDeSucess(especie);
    System.out.println("Você capturou " + capturados + " " + especie.getNome() + " dos " + pokedex.contarVisualizacoes(especie) + "que voce viu. Com uma taxa de captura de " + taxa + "%");
  }
}
