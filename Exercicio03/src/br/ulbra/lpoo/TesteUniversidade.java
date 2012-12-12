package br.ulbra.lpoo;

public class TesteUniversidade {

	private static Universidade univ;
	
	public static void main(String[] args) {
	
		univ = new Universidade("ULBRA-GUAIBA",2,2);
		
		Professor p1 = univ.criaProfessor("Antonio Techio");
		Professor p2 = univ.criaProfessor("Daniel Barcia");
		
		Curso cursoSistemas = new Curso("Sistemas de Informação",2);
		Curso cursoEducacao = new Curso("Educação Física",3);
		
		univ.cadastraCurso(cursoSistemas);
		univ.cadastraCurso(cursoEducacao);
		
		univ.adicionaProfessorAoCurso(p1, cursoSistemas);
		
		univ.adicionaProfessorAoCurso(p1, cursoEducacao);
		
		univ.adicionaProfessorAoCurso(p2, null);
		
		
	}
	
}
