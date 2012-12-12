package br.ulbra.lpoo.teste;

import br.ulbra.lpoo.sistema.internacao.Consulta;
import br.ulbra.lpoo.sistema.internacao.Medico;
import br.ulbra.lpoo.sistema.internacao.Paciente;

public class TestaSistemaInternacao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Paciente p = new Paciente();
		p.setNome("Antonio Techio");
		
		Medico m = new Medico();
		
		//não tem encapsulamento
		m.nome = "Joao";
		
		Consulta c = new Consulta();
		
		c.adicionaPaciente(p);
		
		c.setDataConsulta("12/08/2008");
		
		c.exibeInformacaoConsulta();

	}

}