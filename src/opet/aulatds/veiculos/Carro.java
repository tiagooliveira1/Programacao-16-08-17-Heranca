package opet.aulatds.veiculos;

/**
 * Classe que irá representar o carro
 * @author troli
 *
 */
public class Carro {
	
	/**
	 * Armazena a cor do veículo
	 */
	private String cor = "";
	/**
	 * Armazena o ano do veículo
	 * 
	 */
	private int ano = 0;
	/**
	 * Armazena a marca do veículo
	 * 
	 */
	private String marca = "";
	/**
	 * Armazena o fabricante do veículo
	 */
	private String fabricante = "";
	
	/**
	 * Construtor da classe Carro. 
	 * @param cor cor do veículo
	 * @param ano ano do veículo
	 */
	public Carro(String cor, int ano) {
		this.cor = cor;
		this.ano = ano;
	}
	/**
	 * Construtor da classe Carro. 
	 * Não recebe nenhum parâmetro
	 */
	public Carro() {
		
	}
	
	/**
	 * Retorna o ano do veículo
	 */
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	/**
	 * Retorna a cor do veículo
	 */
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}



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
