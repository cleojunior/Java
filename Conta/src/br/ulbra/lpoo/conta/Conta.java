package br.ulbra.lpoo.conta;

public class Conta {
	private double saldo;
	private String numero;
	private String nome;
	
	public Conta (String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void depositar(double valor){
		if (saldo < 0){
			if (valor > Math.abs(saldo)){
				System.out.println("At� que enfim man�... Tava bom os juros aqui.");
			}
			System.out.println();
		}
		saldo += valor;		
		System.out.println(" Foi depositado R$ "+valor);	
	}
	
	public void sacar(double valor){
		if (valor > saldo){
			System.out.println("Saldo insuficiente! Voc� entrou no cheque especial.");
		}
		saldo -= valor;		
		System.out.println(" Foi sacado R$ "+valor);	
	} 
	
	public String toString(){
		return "Saldo atual: R$ " + getSaldo();
	}

	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}
