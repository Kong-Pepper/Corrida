package eteczl.corrida;

import eteczl.corrida.model.Carro;
import eteczl.corrida.model.Corrida;
import eteczl.corrida.model.Moto;
import eteczl.corrida.model.Pista;

public class App {
  public static void main(String[] args) {
	  
	  Pista p = new Pista();
	  Carro carro1 = new Carro();
	  Carro carro2 = new Carro();
	  Carro carro3 = new Carro();
	  Moto moto1 = new Moto();
	  Corrida corrida = new Corrida();
	  corrida.pistaEscolhida(p);
	  corrida.adicionarAutomovel(carro1);
	  corrida.adicionarAutomovel(carro2);
	  corrida.adicionarAutomovel(carro3);
	  corrida.adicionarAutomovel(moto1);
	  corrida.iniciarCorrida();
	  
  }
}
