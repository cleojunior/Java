package br.ulbra.lpoo.agencia;

public class Agencia {
	
	private String nome;
	private Cliente[] listaClientes;
	private Viagem[] listaViagens;
	private int indiceV = 0;
	private int indiceC = 0;
	
	public Agencia(String nome){
		this.nome = nome;		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void cadastraViagem(Viagem viagem){
		listaViagens[indiceV++] = viagem;
	}
	
	public void cadastraCliente(Cliente cliente){
		listaClientes[indiceC++] = cliente;
		System.out.println("Cliente cadastrado: "+cliente.getNome());
	}
	
	public Viagem retornaViagem(int indice) {
		return listaViagens[indice];
	}
	
	public Cliente retornaCliente(int indice) {
		return listaClientes[indice];
	}
	
	public boolean verificaViagemCliente(Cliente cliente, String dataSaida) {
		boolean Achou = false;		
		for (int i = 0; i < listaViagens.length; i++) {
			Viagem v = listaViagens[i];
			if (v != null){				
				Achou = ((v.getCliente() == cliente) && (v.getDataSaida().equals(dataSaida)));
			}
		}
		return Achou; 
	}

}
