package opet.aulatds.veiculos;
/**
 * Classe que irá representar o trem 
 * @author Tiago Oliveira
 *
 */
import java.util.ArrayList;

public class Trem extends Veiculo{

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
