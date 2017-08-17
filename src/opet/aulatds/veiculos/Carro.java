package opet.aulatds.veiculos;

/**
 * Classe que irá representar o carro
 * @author troli
 *
 */
public class Carro extends Automovel{
	
	/**
	 * Armazena a cor do veículo
	 */
	private int tamanho_porta_malas = 0;
	
	
	/**
	 * Construtor da classe Carro. 
	 * @param cor cor do veículo
	 * @param ano ano do veículo
	 */
	public Carro(String cor, int ano) {
		this.setAno(ano);
		this.setCor(cor); 
		this.setAno(ano);
	}
	/**
	 * Construtor da classe Carro. 
	 * Não recebe nenhum parâmetro
	 */
	public Carro() {
		
	}
	public int getTamanho_porta_malas() {
		return tamanho_porta_malas;
	}
	public void setTamanho_porta_malas(int tamanho_porta_malas) {
		this.tamanho_porta_malas = tamanho_porta_malas;
	}
	
	/**
	 * Retorna o ano do veículo
	 */
	

}
