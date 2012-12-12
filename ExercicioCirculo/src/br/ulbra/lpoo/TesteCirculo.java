package br.ulbra.lpoo;

public class TesteCirculo {

	public static void main(String[] args) {
		
		Circulo[] circulos = new Circulo[5];
		
		circulos[0] = new Circulo (8,1,2);
		circulos[1] = new Circulo (5, new Ponto (2,4));
		circulos[2] = new Circulo (3,1,9);
		circulos[3] = new Circulo (12,6,2);
		circulos[4] = new Circulo (7,5,5);
		
		for (int i = 0; i < circulos.length; i++){
			System.out.println("Área do círculo " + (i + 1) + ": " + circulos[i].calculaArea());
		}
	}
	
	

}
