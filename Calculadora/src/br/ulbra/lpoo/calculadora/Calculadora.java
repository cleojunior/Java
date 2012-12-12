package br.ulbra.lpoo.calculadora;

/**
 * Primeira versão da classe
 * Calculadora utilizando atributos de classe
 * @author Cleo Hickmann Junior
 *
 */

public class Calculadora {
	
	/*
	 * Atributos da classe
	 */
	
	private int valor1;
	private int valor2;
	private int resultado;
	
	/*
	 * Construtor com parâmetros
	 */
	
	public Calculadora(int v1, int v2){
		valor1 = v1;
		valor2 = v2;
		resultado = 0;		
	}
	
	/*
	 * Construtor sem parâmetros
	 */
	
	public Calculadora(){
		resultado = 0;
	}
	
	public int getValor1(){
		return valor1;
	}
	
	public int getValor2(){
		return valor2;
	}
	
	public int getResultado(){
		return resultado;
	}
	
	public void setValor1(int v1){
		valor1 = v1;
	}
	
	public void setValor2(int v2){
		valor2 = v2;
	}
	
	public int somar(){
		return valor1 + valor2;
	}
	
	public int subtrair(){
		return valor1 - valor2;
	}
	
	public int dividir(){
		return valor1 / valor2;
	}
	
	public int multiplicar(){
		return valor1 * valor2;
	}

	
}
