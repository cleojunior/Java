package br.ulbra.lpoo.teste;

import br.ulbra.lpoo.sistema.internacao.Consulta;
import br.ulbra.lpoo.sistema.internacao.Medico;
import br.ulbra.lpoo.sistema.internacao.Paciente;

public class TesteSistemaIntenacao {

	public static void main(String[] args) {
		Paciente p = new Paciente();
		
		p.setNome("Antonio");
		
		Medico m = new Medico();
		
		Consulta c = new Consulta();
		
		c.adicionaPaciente(p);
		
		c.setDataConsulta("12/08/2008");
		
		c.exibeConsulta();
		
		// N�o � legal... n�o � boa pr�tica de programa��o
		// n�o tem encaspulamento
		m.nome = "Joao";

	}

}
