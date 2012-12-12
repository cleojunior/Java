package br.ulbra.lpoo.teste;

public class Hello {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		/**
		 * Tipos primitivos
		 */
		
		double valor = 100.5;
	
		
		/**
		 *  Exemplo do SWITCH CASE
		 */
		int k = 0, j = 0;
		
		switch (k) {
		case 1:
		case 2:
			j = 2 * k - 1;		
			break;
		case 3:
		case 5:
			j = 3 * k + 1;
			break;
		case 4:
			j = 4 * k - 1;
			break;
		case 6:
		case 7:
		case 8:
			j = k - 2;
			break;
		}
		
		
		/*int mes = 10;
		String mesDesc = null;
		switch (mes){
		case 1:
		mesDesc = "Janeiro";
		break;
		case 2:
		mesDesc = "Favereiro";
		break;
		default:
		mesDesc = "Nenhum mês selecionado";*/
		
		
	}

}
