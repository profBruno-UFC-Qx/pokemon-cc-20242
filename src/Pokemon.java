public class Pokemon {
  String nome = "Pikachu";
  String tipo;
  int nivel;
  int pontosDeVida;
  int ataque;
  int defesa;
  int velocidade;
  int experiencia;

  Pokemon(String nome) {
    super();
    this.nome = nome;
    System.out.println("Iniciando...");
  }

  String falar() {
    return nome + " " + nome;
  }

  int curar(int pontosDeVida) {
    this.pontosDeVida += pontosDeVida;
    return this.pontosDeVida;
  }

  void atacar(int movimento, Pokemon alvo) {
    if (taVivo()) {
      //ataque!
      System.out.println("Atacando o " + alvo + " com ataque" + movimento);
    } else {
      System.out.println("to morto :/");
    }
  }

  boolean taVivo() {
    return this.pontosDeVida > 0;
  }
  

  @Override
  public String toString() {
    return "Pokemon{" +
            "nome='" + nome + '\'' +
            ", pontosDeVida=" + pontosDeVida +
            ", ataque=" + ataque +
            ", defesa=" + defesa +
            ", velocidade=" + velocidade  +
            '}';
  }
}
