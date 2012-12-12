package br.ulbra.lpoo;

/**
 * Isso é um comentário de classe.
 * 
 * @author Antonio_Techio
 */
public class Veiculo {
	//Atributos de classe.
	private String nome;
	private String cor;
	private String placa;
	private double valor;
	
	/*
	 * Construtor.
	 */
	public Veiculo(){
	}
	
	public Veiculo(String nome, String cor, String placa){
		this.nome = nome;
		this.cor = cor;
		this.placa = placa;
	}

	public String getCor(){
		return cor;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNome(){
		return nome;
	}

	public String getPlaca(){
		return placa;
	}
	
	public void setNome(String n){
		nome = n;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return "Nome: " + nome + " Cor: " + cor + " Placa: " + placa + " Valor: R$ " + valor;
	}
}







