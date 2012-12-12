package br.ulbra.lpoo.universidade;

public class Universidade {
	
		/* array de Professores */
		private Professor[] listaProfessores;
		/* array de Cursos */
		private Curso[] listaCursos;
		/* índices */
		private int indiceProf;
		private int indiceCurso;
		
		/* construtor */
		public Universidade(){
			listaProfessores = new Professor[2];
			listaCursos = new Curso[2];
		}
		
		/* cria professor */ 
		public void criaProfessores(String nome){
			Professor p = new Professor();
			p.setNome(nome);
		}
		
		public void cadastraCurso(){
				
		}

		
		public void criaCurso(){
			
		}
		
		public void criaProfessor(String nome){
			Professor p = new Professor();
			p.setNome(nome);
		}
}
