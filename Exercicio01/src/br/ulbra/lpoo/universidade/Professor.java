package br.ulbra.lpoo.universidade;

public class Professor {
	
	private String nome;

	
	/*
	 * Métodos GET e SET
	 */
	public String getNome() {
		return nome;
	}

	public void setNome(String n) {
		nome = n;
	}


	/*
	 *  Construtor
	 */
	public Professor(String n){
		nome = n;
	}
	
	public String toString(){
		return "Nome professor: " + getNome();
	}
	
	

}
