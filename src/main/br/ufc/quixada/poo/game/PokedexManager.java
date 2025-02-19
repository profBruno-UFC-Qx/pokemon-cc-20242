package br.ufc.quixada.poo.game;

import br.ufc.quixada.poo.game.pokemon.Pokemon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PokedexManager {

  public static void salvarPokedex(Pokedex pokedex) {
    salvarCapturados(pokedex);
    salvarVistos(pokedex);
  }

  private static void salvarCapturados(Pokedex pokedex) {
    try(FileWriter fw = new FileWriter("pokedex.csv")) {
      fw.write("especie,nome,hpBase,ataque,defesa,velocidade,amizade,peso,taxaDeCaptura\n");
      for(Pokemon p: pokedex.listarCapturados()) {
        fw.write(String.format("%d,%s,%d,%d,%d,%d,%d,%.2f,%d\n",
                p.getEspecie(), p.getNome(), p.getHpBase(), p.getAtaqueBase(),
                p.getDefesaBase(), p.getVelocidade(), p.getAmizade(), p.getPeso(),
                p.getTaxaDeCaptura()));
      }
    } catch (IOException e) {
      System.out.println("Arquivo nao encontrado");
    }
  }

  private static void salvarVistos(Pokedex pokedex) {
    try(FileWriter fw = new FileWriter("vistos.csv")) {
      for(int ocorrencia: pokedex.getOcorrencias()) {
        fw.write(ocorrencia + "\n");
      }
    } catch (IOException e) {
      System.out.println("Arquivo nao encontrado");
    }
  }

  public static Pokedex carregarPokedex() {
    Pokedex pokedex = new Pokedex(carregarCapturados(), carregarVistos());
    return pokedex;
  }

  private static List<Pokemon> carregarCapturados() {
    List<Pokemon> capturados = new ArrayList<Pokemon>();
    try(BufferedReader br = new BufferedReader(new FileReader("pokedex.csv"))) {
      br.readLine();
      String line;
      while((line = br.readLine()) != null) {
        String[] campos = line.split(",");
        Pokemon p = new Pokemon(Integer.parseInt(campos[0]),
          campos[1],
          Integer.parseInt(campos[2]),
          Integer.parseInt(campos[3]),
          Integer.parseInt(campos[4]),
          Integer.parseInt(campos[5]),
          Integer.parseInt(campos[6]),
          Double.parseDouble(campos[7]),
          Integer.parseInt(campos[8])
        );
        capturados.add(p);
      }
    } catch (IOException e) {
      System.out.println("Uma nova podekex foi criada");
    }
    return capturados;
  }

  private static int[] carregarVistos() {
    int ocorrencia[] = new int[151];
    try(BufferedReader br = new BufferedReader(new FileReader("vistos.csv"))) {
      String line;
      int i = 0;
      while((line = br.readLine()) != null) {
        ocorrencia[i] = Integer.parseInt(line);
        i++;
      }
    } catch (IOException e) {
      System.out.println("Uma nova podekex foi criada");
    }
    return ocorrencia;
  }
}
