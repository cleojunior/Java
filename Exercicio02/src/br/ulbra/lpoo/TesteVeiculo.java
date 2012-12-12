package br.ulbra.lpoo;

/**
 * @author Antonio_Techio
 */
public class TesteVeiculo {

	/*
	 * Array estático com apenas 4 posições.
	 * Primeira posição possui índice 0 (zero).
	 */	
	static Veiculo[]lista = new Veiculo[4]; 
	static int indice = 0;
		

	/**
	 * Inserir um veiculo no array
	 * @param v
	 */
	private static void insereVeiculo(Veiculo v){
		lista[indice++] = v;
	}
	
	public static void main(String[] args) {

		/*
		 * Criar um Veículo
		 */
		
		Veiculo celta = new Veiculo("Celta","Azul","IOG-1045");
		Veiculo corsa = new Veiculo("Corsa","Vermelho","IKI-8767");
		Veiculo vectra = new Veiculo("Vectra","Branco","IFG-9878");
		Veiculo focus = new Veiculo("Focus",null,"ABC-9878");
		
		insereVeiculo(celta);
		insereVeiculo(corsa);
		insereVeiculo(vectra);
		insereVeiculo(focus);
		
		imprimirVeiculosPorCor("Vermelho");
		
		
	}

	/**
	 * Imprime na console todos os veículos de 
	 * uma determinada cor.
	 * 
	 * @param cor
	 */
	private static void imprimirVeiculosPorCor(String cor){
		
		
		
		
		/*
		 * Percorrer a lista de veiculos
		 */
		for (int i = 0; i < lista.length; i++) {

			/*
			 * Pega uma instância de Veiculo do array
			 * na posição do indice "i".
			 */
			Veiculo v = lista[i];
			
			/*
			 * Comparar com a cor que veio por paramêtro
			 * usando o método equals da classe Object.
			 */
			if(v.getCor() != null && v.getCor().equals(cor)){
				System.out.println(v);
			}
		}		
	}
}
