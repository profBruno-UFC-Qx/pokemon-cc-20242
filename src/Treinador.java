public class Treinador {

  String nome;
  int x;
  int y;
  Pokemon[] pokemons;

  Treinador(String nome) {
    this.nome = nome;
    this.x = 0;
    this.y = 0;
    this.pokemons = new Pokemon[3];
  }

  void listar() {
    for(Pokemon pokemon: pokemons) {
      if(pokemon != null) {
        System.out.println(pokemon.nome);
      }
    }
  }

  void mover(String direcao) {
    switch (direcao) {
      case "cima":
        y--;
        break;
      case "baixo":
        y++;
        break;
      case "esq":
        x--;
        break;
      case "dir":
        x++;
        break;
      default:
        System.out.println("Direção inválida");
    }
  }

  boolean capturar(Pokemon pokemon) {
    for(int i = 0; i < pokemons.length; i++) {
      if(pokemons[i] == null) {
        pokemons[i] = pokemon;
        return true;
      }
    }
    return false;
  }











}
