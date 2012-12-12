package br.ulbra.lpoo.universidade;

public class Curso {
	
	private String nome;
	private Professor professor;
	
	/*
	 *  Construtor
	 */
	public Curso(String n){
		nome      = n;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public String toString(){
		return "Nome curso: " + getNome();
	}

	
}
