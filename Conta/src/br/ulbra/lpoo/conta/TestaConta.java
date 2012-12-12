package br.ulbra.lpoo.conta;

public class TestaConta {

	public static void main(String[] args) {
		
		Conta contaCorrente = new Conta("Conta Corrente");
		Conta poupanca = new Conta("Poupanca");
		
		System.out.println("Movimentação na " + contaCorrente.getNome());
		
		contaCorrente.depositar(100.00);
		contaCorrente.depositar(50.45);
		contaCorrente.sacar(90.00);
		System.out.println(contaCorrente.toString());
		
		System.out.println("Movimentação na " + poupanca.getNome());
		
		poupanca.depositar(2000.00);
		poupanca.depositar(100.55);
		poupanca.sacar(50.00);
		System.out.println(poupanca);

	}

}

