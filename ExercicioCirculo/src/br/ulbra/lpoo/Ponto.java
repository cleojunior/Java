package br.ulbra.lpoo;

public class Ponto {
	
	private int x;
	private int y;
	
	/**
	 * Métodos GET 
	 */
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	/**
	 * Métodos SET
	 */
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
			
	/**
	 * Construtores da classe Ponto
	 */
	
	/*
	 * Com inicialização dos pontos
	 */
	public Ponto(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	/*
	 * Sem inicialização dos pontos
	 */
	public Ponto() {}

}
