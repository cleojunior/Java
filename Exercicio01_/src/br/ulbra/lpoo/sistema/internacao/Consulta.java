package br.ulbra.lpoo.sistema.internacao;

public class Consulta {
	private String dataConsulta;
	private Paciente paciente;
		
	public void adicionaPaciente(Paciente p){
		paciente = p;
	}
	
	public Paciente retornaPaciente(){
		return paciente;
	}
	
	protected String getDataConsulta(){
		return dataConsulta;
	}
	
	public void setDataConsulta(String data){
		dataConsulta = data;
	}
	
	/**
	 * Exibir o nome do paciente e data da consulta
	 * usando System.out.println() 
	 */
	public void exibeConsulta(){
		System.out.println("Data: " + dataConsulta);
		System.out.println("Nome: " + paciente.getNome());		
	}
}
