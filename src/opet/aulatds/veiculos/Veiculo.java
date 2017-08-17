package opet.aulatds.veiculos;

/**
 * Classe que irá representar o veículo,e  será a superclass 
 * @author Tiago Oliveira
 *
 */

public class Veiculo {
	/**
	 * Armazena o ano do veículo
	 */
	private int ano = 0;
	
	/**
	 * Armazena a cor do veículo
	 */
	private String cor = "";
	
	/**
	 * Construtor da classe Veiculo. 
	 */
	public Veiculo()
	{
		
	}
	/**
	 *  Retorna o ano do veículo
	 * @return ano
	 */
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

}
