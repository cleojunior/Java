public class PhraseOMatic {
	public static void main(String[] args) {
		String[] wordListOne = {"24/7", "várias camadas", "30.000 pés", "B-to-B", "todos ganham", 
								"front-end", "baseado na Web", "difundido", "inteligente", "seis",
								"sigma", "caminho crítico", "dinâmico"};

		String[] wordListTwo = {"habilitado", "adesivo", "valor agregado", "orientado", "central",
								"distribuído", "agrupado", "solidificado", "independente da maquina",
								"posicionado", "em rede", "dedicado", "alavancado", "alinhado", "destinado",
								"compartilhado", "cooperativo", "acelerado"};

		String[] wordLisThree = {"processo", "ponto", "máximo", "solução", "arquitetura", "habilitação no núvleo",
								 "estratégia", "midshare", "portal", "espaço", "visão", "paradigma", "missão"};

		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordLisThree.length;

		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);

		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordLisThree[rand3];

		System.out.println("Precisamos de " + phrase);
	}
}