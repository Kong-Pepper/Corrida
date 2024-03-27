package eteczl.corrida.model;

import java.util.ArrayList;
import java.util.Date;

public class Corrida {
	public Date inicio;
	private Pista pistaEscolhida;
	private ArrayList<Automovel> automovel = new ArrayList<Automovel>();
	
	
	public void adicionarAutomovel(Automovel a) {
		this.automovel.add(a);
	}
	public void pistaEscolhida(Pista p) {
		this.pistaEscolhida = p;
		
	}
	
	private void liguemSeusMotores() {
		for (Automovel a : this.automovel) {
			System.out.println(a.acelerar());
		}
	}
	
	public void iniciarCorrida() {
		this.liguemSeusMotores();
	}
}

