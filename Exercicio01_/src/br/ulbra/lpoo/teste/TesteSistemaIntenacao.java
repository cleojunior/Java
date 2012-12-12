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
		
		// Não é legal... não é boa prática de programação
		// não tem encaspulamento
		m.nome = "Joao";

	}

}
