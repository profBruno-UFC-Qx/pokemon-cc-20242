public class Main {
  public static void main(String[] args) {
    Pokemon pikachu = new Pokemon("pikachu");
    Pokemon pikachu2 = new Pokemon("Eve");


    int pocao = 100;
    System.out.println(pikachu);
    System.out.println(pikachu2);
    System.out.println(pikachu.taVivo());
    pikachu.curar(pocao);
    System.out.println(pikachu.taVivo());
    pikachu.atacar(1, pikachu);
  }
}