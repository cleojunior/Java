package br.ulbra.lpoo.agencia;

public class Viagem {
	
	private int codigoViagem;
	private String dataSaida;
	private Cliente cliente;
	private Cidade[] listaCidades;
	private int indice = 0;
	
	/**
	 * Construtor da classe Viagem com sobrecarga
	 */
	
	public Viagem(int codigoViagem, String dataSaida, Cliente cliente, int numeroCidades){
		this.codigoViagem = codigoViagem;
		this.dataSaida = dataSaida;
		this.cliente = cliente;	
		this.listaCidades = new Cidade[numeroCidades];		
	}
	
	/**
	 * Getter's da classe Viagem
	 */
	
	public int getCodigoViagem() {
		return codigoViagem;
	}
	
	public String getDataSaida() {
		return dataSaida;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * Setter's da classe Viagem
	 */
		
	public void setCodigoViagem(int codigoViagem) {
		this.codigoViagem = codigoViagem;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * Cadastro de Cidades na Viagem
	 */
	
	public void cadastraCidadeViagem(Cidade cidade){
		listaCidades[indice++] = cidade;
		System.out.println("Cidade cadastrada: "+cidade.getNome());
	}
	
	/**
	 * Lista Cidades por Viagem 
	 */
	
	public void listaCidadesDaViagem(){
		for (int i = 0; i < listaCidades.length; i++) {
			Cidade cidade = listaCidades[i];
			System.out.println(cidade);									
		}
	}
	
}
