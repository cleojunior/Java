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
	
	public String getDataConsulta(){
		return dataConsulta;
	}
	
	public void setDataConsulta(String data){
		dataConsulta = data;
	}	
	
	/**
	 * Exibir o nome do paciente e data consulta
	 * usando System.out.println();
	 */
	public void exibeInformacaoConsulta(){

		System.out.println("Data Consulta: " + dataConsulta);
		System.out.println("Nome Paciente: " + paciente.getNome());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
