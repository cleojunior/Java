package br.ulbra.lpoo.agencia;

public class Cidade {
	private String nome;
	private String estado;
	
	/**
	 * Construtor da classe Cidade com sobrecarga
	 */
	
	public Cidade(String nome, String estado){
		this.nome = nome;
		this.estado = estado;
	}
	
	/**
	 * Construtor da classe Cidade sem sobrecarga
	 */
	
	public Cidade(){
		
	}
	
	/**
	 * Getter's da classe Cidade
	 */
	
	public String getNome(){
		return nome;
	}
	
	public String getEstado(){
		return estado;
	}
	
	/**
	 * Setter's da classe Cidade
	 */
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setEstado(String estado){
		this.estado = estado;
	}
	
	/**
	 * Método toString utilizado para exibir 
	 * os dados da classe Cidade
	 */
	
	public String toString(){
		return "Cidade: " + nome + " \n Estado: "+estado;
	}
	
}
