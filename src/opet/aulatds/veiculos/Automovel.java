package opet.aulatds.veiculos;

/**
 * Classe que irá representar automovel 
 * @author Tiago Oliveira
 *
 */
public class Automovel extends Veiculo {
	private String marca = "";
	private String fabricante = "";
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
}
