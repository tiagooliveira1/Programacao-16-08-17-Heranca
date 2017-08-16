package opet.aulatds.veiculos;

import java.util.ArrayList;

public class Trem {

	private ArrayList<Vagao> vagoes;
	
	public Trem() {
		this.vagoes = new ArrayList<Vagao>();
		
	}
	public int TotalVagoes() {
		return this.vagoes.size();
	}
	public void addVagao(float capacidade, String cor) {
		Vagao vag = new Vagao();
		vag.setCapacidade(capacidade);
		vag.setCor(cor);
		vagoes.add(vag);
	}
	
	
}
