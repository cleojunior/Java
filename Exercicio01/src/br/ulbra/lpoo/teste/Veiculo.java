package br.ulbra.lpoo.teste;

public class Veiculo {
	
	private String nome;
	private String cor;
	private String placa;
	
	/*
	 *  Construtor
	 */
	public Veiculo(String aplaca, String anome, String acor){
		placa = aplaca;
		nome  = anome;
		cor   = acor;
	}
	
	/*
	 * Métodos
	 */
	public String getNomeVeiculo(){
		return nome;
	}
	
	public String getCorVeiculo(){
		return cor;
	}
	
	public String getPlacaVeiculo(){
		return placa;
	}
	
	public void setCorVeiculo(String acor){
		cor = acor;
	}
	
	public void setPlacaVeiculo(String aplaca){
		placa = aplaca;
	}
	
	public void setNomeVeiculo(String anome){
		nome = anome;
	}
	
	public void imprimeVeiculo() {
		System.out.println("Placa: " + getPlacaVeiculo());
		System.out.println("Nome : " + getNomeVeiculo());
		System.out.println("Cor  : " + getCorVeiculo());
	}
		
}
