package br.ulbra.lpoo;

public class Revenda {
	
	private String nome;
	private Veiculo[] veiculos = new Veiculo[5];	
	private int indice = 0;
	
	/*
	 * Construtor
	 */
	public Revenda(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void cadastraVeiculo(Veiculo v){
		veiculos[indice++] = v;
	}
	
	public void pesquisaVeiculoPorPreco(double faixaInicial, double faixaFinal){
		for (int i = 0; i < veiculos.length; i++) {
			Veiculo v = veiculos[i];
			if (v != null){
				if (v.getValor() > faixaInicial && v.getValor() < faixaFinal){
					System.out.println(v);					
				}
				
			}
		}
	}

}
