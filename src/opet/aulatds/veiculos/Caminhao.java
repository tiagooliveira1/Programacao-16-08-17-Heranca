package opet.aulatds.veiculos;

public class Caminhao extends Automovel{
	
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
