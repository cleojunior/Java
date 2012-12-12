package br.ulbra.lpoo;

public class Ponto {
	
	private int x;
	private int y;
	
	/**
	 * M�todos GET 
	 */
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	/**
	 * M�todos SET
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
	 * Com inicializa��o dos pontos
	 */
	public Ponto(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	/*
	 * Sem inicializa��o dos pontos
	 */
	public Ponto() {}

}
