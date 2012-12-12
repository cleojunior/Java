package br.ulbra.lpoo;

public class Circulo {
	
	private int raio;
	private Ponto origem;
	
	/**
	 * Construtores
	 */
	
	public Circulo(int raio, Ponto origem){
		this.raio = raio;
		this.origem = origem;
	}
	
	public Circulo(int raio, int x, int y){
		this.raio = raio;
		origem = new Ponto(x,y);
	}
	
	
	/**
	 * M�todo que calcula a �rea do c�rculo
	 */
	public double calculaArea(){
		return Math.PI * raio * raio;
	}
	
	
	/**
	 * M�todos GET
	 */
	public int getRaio(){
		return raio;
	}
	
	public Ponto getOrigem(){
		return origem;
	}

}
