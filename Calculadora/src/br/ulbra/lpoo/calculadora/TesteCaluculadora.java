package br.ulbra.lpoo.calculadora;

public class TesteCaluculadora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Calculadora c = new Calculadora(50,10);
		
		System.out.println("Soma          : " + c.somar());
		System.out.println("Subtra��o     : " + c.subtrair());
		System.out.println("Divis�o       : " + c.dividir());
		System.out.println("Multiplica��o : " + c.multiplicar());
		
		

	}

}
