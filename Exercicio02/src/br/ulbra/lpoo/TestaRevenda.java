package br.ulbra.lpoo;

public class TestaRevenda {

	
	public static void main(String[] args) {
		
		Revenda r1 = new Revenda("Sinoscar");
		
		/*
		 * Adiciona o Corsa na Revenda
		 */
		Veiculo corsa = new Veiculo("Corsa","Vermelho","IDB-3751");
		corsa.setValor(10000.50);
		r1.cadastraVeiculo(corsa);
		
		/*
		 * Adiciona o Palio na Revenda
		 */
		Veiculo palio = new Veiculo("Palio","Branco","INT-6976");
		palio.setValor(25000.00);
		r1.cadastraVeiculo(palio);
		
		
		/*
		 * Adiciona o Vectra na Revenda
		 */
		Veiculo vectra = new Veiculo("Vectra","Preto","IWE-8096");
		vectra.setValor(28000.00);
		r1.cadastraVeiculo(vectra);
		
		/*
		 * Adiciona a S10 na Revenda
		 */
		Veiculo s10 = new Veiculo("S-10","Preto","IUI-8896");
		s10.setValor(50000.00);
		r1.cadastraVeiculo(s10);
		
		r1.pesquisaVeiculoPorPreco(10000.00, 80000.00);

	}

}
