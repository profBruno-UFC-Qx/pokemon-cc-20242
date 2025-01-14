package br.ufc.quixada.poo.game.pokemon;

public class Pokemon {
  private String nome;
  private int nivel;
  private final int hpBase;
  private final int hpMax;
  private int hpAtual;
  private int taxaDeCaptura;
  private int ataque;
  private int defesa;
  private int velocidade;
  private int experiencia;
  private int peso;
  private int amizade;


  public Pokemon(String nome) {
    this(nome, 1);
  }

  public Pokemon(String nome, int nivel) {
    this(nome, nivel, 100);
  }

  public Pokemon(String nome, int nivel, int hpBase) {
    this.nome = nome;
    this.hpBase = hpBase;
    this.nivel = nivel;
    this.hpMax = calcularHP(nivel); // Nível 1
  }

  private int calcularHP(int nivel) {
    return ((2 * hpBase * nivel) / 100) + nivel + 10;
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

  public int getPeso() {
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
  public String toString() {
    return "Pokemon{" +
            "nome='" + nome + "[" + nivel + "]" + '\'' +
            ", hpAtual=" + hpAtual +
            ", ataque=" + ataque +
            ", defesa=" + defesa +
            ", velocidade=" + velocidade  +
            '}';
  }


}
