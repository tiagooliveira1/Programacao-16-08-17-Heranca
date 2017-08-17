package opet.aulatds.veiculos;

/**
 * Classe que irá representar o o caminhão
 * @author troli
 *
 */

public class Caminhao extends Automovel{
	
	/**
	 * Armazena a tara do caminhao
	 */
	private float tara = 0.0f;
	
	public Caminhao(float tara)
	{
		this.tara = tara;
	}
	
	public float getTara() {
		return tara;
	}
	public void setTara(float tara) {
		this.tara = tara;
	}

}
