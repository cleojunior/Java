package br.ulbra.lpoo;

public class Universidade {
	/** Nome da Universidade */
	private String nome;
	/** Array de professores */
	private Professor[] listaProfessores;
	/** Array de Cursos */
	private Curso[] listaCursos;
	/** índice do array de professores */
	private int indiceProf;
	/** índice do array de cursos */
	private int indiceCurso;

	/**
	 * Construtor da classe
	 */
	public Universidade(String nome, int nroProfessores, int nroCursos){
		this.nome = nome;
		listaProfessores = new Professor[nroProfessores];
		listaCursos = new Curso[nroCursos];
		System.out.println("Universidade "+nome+" criada...");
	}
	
	/**
	 * Método para criar um Professor.
	 * 
	 * @param nome - Nome do professor
	 */
	public Professor criaProfessor(String nome){
		/*
		 * Cria uma instância de Professor
		 */
		Professor p = new Professor();
		p.setNome(nome);
		
		/*
		 * Adiciona professor no array
		 */
		listaProfessores[indiceProf++] = p;
		
		System.out.println("Professor "+p.getNome()+" criado com sucesso.");
		
		return p;
	}
	
	/**
	 * Insere uma instância de Curso no array.
	 * 
	 * @param c - objeto Curso
	 */
	public void cadastraCurso(Curso curso){
		listaCursos[indiceCurso++] = curso;
		System.out.println("Curso "+curso.getNome()+" criado com sucesso.");
	}
	
	public void adicionaProfessorAoCurso(Professor prof, Curso curso){
		/*
		 * Para adicionar o professor ao curso,
		 * você deve utilizar a instância de Curso.
		 */
		if(curso != null){
			System.out.println("Adicionando professor "+prof.getNome()+" ao curso " + curso.getNome());
			curso.adicionarProfessor(prof);
		}else{
			System.out.println("Curso não pode ser nullo.");
		}
	}
}
