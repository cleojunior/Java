package br.ulbra.lpoo.agencia;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String sexo;
	private String fone;
	
	/**
	 * Construtor da classe Cliente com sobrecarga
	 * @param nome
	 * @param cpf
	 * @param sexo
	 * @param fone
	 */

	public Cliente(String nome, String cpf, String sexo, String fone){		
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.fone = fone;
	}
	
	/**
	 * Construtor da classe Cliente sem sobrecarga
	 */
	
	public Cliente(){		
		
	}
	
	/**
	 * Getter's da classe Cliente
	 */
	
	public String getNome(){
		return nome;
	}
	public String getCpf(){
		return cpf;
	}
	public String getSexo(){
		return sexo;
	}
	public String getFone(){
		return fone;
	}
		
	
	/**
	 * Setter'a da classe Cliente
	 */
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	public void setSexo(String sexo){
		this.sexo = sexo;
	}
	public void setFone(String fone){
		this.fone = fone;
	}

	/**
	 * Método toString utilizado para exibir 
	 * os dados da classe Cliente
	 */
	
	public String toString(){
		return "Nome: "+nome+"\n CPF : "+cpf+"\n Sexo: "+sexo+"\n Fone: "+fone;
	}

}
