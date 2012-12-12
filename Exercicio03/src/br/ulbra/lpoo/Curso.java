package br.ulbra.lpoo;

public class Curso {
	private String nome;
	private Professor[] listaProfessores;
	private int indiceProfs;
	
	public Curso(String n, int nroProfessores){
		nome = n;
		listaProfessores = new Professor[nroProfessores];
	}
	
	public void adicionarProfessor(Professor p){
		listaProfessores[indiceProfs++] = p;
	}
	
	public void setProfessores(Professor[] lista){
		listaProfessores = lista;
	}
	
	public Professor[] getProfessores(){
		return listaProfessores;
	}
	
	public void setNome(String n){
		nome = n;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String toString(){
		return "Nome curso: " + getNome();
	}
}
