package br.ulbra.lpoo.teste;

public class TestaObjeto {
	
	static Veiculo[]lista = new Veiculo[3];
	static int indice = 0;
	
	private static void insereVeiculo(Veiculo v) {
		lista[indice++] = v;
	}
	
	public static void main(String[] args) {

		
		Veiculo celta  = new Veiculo("IOG-1045", "Celta",  "Vermelho");
		Veiculo corsa  = new Veiculo("IKI-8767", "Corsa",  "Vermelho");
		Veiculo vectra = new Veiculo("IFG-9878", "Vectra", "Branco");
		
		insereVeiculo(celta);
		insereVeiculo(corsa);
		insereVeiculo(vectra);

		imprimirVeiculoPorCor("Vermelho");
		
				
	}
	
	private static void imprimirVeiculoPorCor(String cor) {
		for (int i = 0; i <lista.length; i++) {
			Veiculo v = lista[i];			
			if ((v.getCorVeiculo() != null) && (v.getCorVeiculo().equals(cor))){	
				v.imprimeVeiculo();
			}
				
		}
	}

}
