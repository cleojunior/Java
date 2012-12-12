package br.ulbra.lpoo.agencia;

public class TestaAgencia {
	
	static int codigoViagem = 1;
	
	public static void main(String[] args) {
		
		
		/**
		 * 1) Cria a agencia
		 */
		Agencia agencia = new Agencia("Dubai Turismo");
		
		/**
		 * 2) Cria 10 cidades
		 */
		
		Cidade c1  = new Cidade("Porto Alegre", "RS");		
		Cidade c2  = new Cidade("Florianópolis", "SC");
		Cidade c3  = new Cidade("Curitiba", "PR");
		Cidade c4  = new Cidade("Rio de Janeiro", "RJ");
		Cidade c5  = new Cidade("São Paulo", "SP");
		Cidade c6  = new Cidade("Fortaleza", "CE");
		Cidade c7  = new Cidade("Salvador", "BA");
		Cidade c8  = new Cidade("Natal", "RN");
		Cidade c9  = new Cidade("Recife", "PE");
		Cidade c10 = new Cidade("João Pessoa", "PA");
		
		/**
		 * 3) Cria 5 clientes
		 */
		
		Cliente cli1 = new Cliente("Sílvio Santos","111.222.333-21","M","1111-2222");
		Cliente cli2 = new Cliente("Pedro de Lara","333.444.555-22","M","1221-2112");
		Cliente cli3 = new Cliente("Sônia Lima","212.121.343-11","F","5555-5555");
		Cliente cli4 = new Cliente("Décio Pitinini","444.212.666-99","M","1212-5544");
		Cliente cli5 = new Cliente("Elke Maravilha","777.121.444-00","F","7777-3232");
		
		/**
		 * 4) Cadastra os clientes na agencia
		 */
		
		agencia.cadastraCliente(cli1);
		agencia.cadastraCliente(cli2);
		agencia.cadastraCliente(cli3);
		agencia.cadastraCliente(cli4);
		agencia.cadastraCliente(cli5);
		
		/**
		 * 5) Cria viagem para cliente 1 com cidade de origem e destino
		 */
		
		if (agencia.verificaViagemCliente(agencia.retornaCliente(0), "10/10/2008") == false) {
			Viagem v1 = new Viagem(codigoViagem++, "10/10/2008", agencia.retornaCliente(0), 2);
			v1.cadastraCidadeViagem(c1);
			v1.cadastraCidadeViagem(c2);
			v1.listaCidadesDaViagem();
		}else{
			System.out.println("Cliente com viagem já cadastrada nesta data.");
		}
		
		/**
		 * 6) Cria viagem para o cliente 2 com 3 cidades
		 */
		if (agencia.verificaViagemCliente(agencia.retornaCliente(1), "01/11/2008") == false) {
			Viagem v2 = new Viagem(codigoViagem++, "10/10/2008", agencia.retornaCliente(1), 3);
			v2.cadastraCidadeViagem(c1);
			v2.cadastraCidadeViagem(c4);
			v2.cadastraCidadeViagem(c1);
			v2.listaCidadesDaViagem();
		} else {
			System.out.println("Cliente com viagem já cadastrada nesta data.");
		}

		/**
		 * 7) Cria viagem para o cliente 3 com 8 cidades
		 */
		
		if (agencia.verificaViagemCliente(agencia.retornaCliente(1), "01/01/2009") == false) {
			Viagem v3 = new Viagem(codigoViagem++, "10/10/2008", agencia.retornaCliente(2), 8);
			v3.cadastraCidadeViagem(c1);
			v3.cadastraCidadeViagem(c2);
			v3.cadastraCidadeViagem(c3);
			v3.cadastraCidadeViagem(c4);
			v3.cadastraCidadeViagem(c5);
			v3.cadastraCidadeViagem(c6);
			v3.cadastraCidadeViagem(c7);
			v3.cadastraCidadeViagem(c1);
			v3.listaCidadesDaViagem();
		}else{
			System.out.println("Cliente com viagem já cadastrada nesta data.");
		}
		
		/**
		 * 8) Cria viagem para o cliente 4 com 5 cidades
		 */
		
		if (agencia.verificaViagemCliente(agencia.retornaCliente(1), "24/12/2008") == false) {
			Viagem v4 = new Viagem(codigoViagem++, "10/10/2008", agencia.retornaCliente(3), 5);
			v4.cadastraCidadeViagem(c1);
			v4.cadastraCidadeViagem(c4);
			v4.cadastraCidadeViagem(c6);
			v4.cadastraCidadeViagem(c1);			
			v4.listaCidadesDaViagem();
		}else{
			System.out.println("Cliente com viagem já cadastrada nesta data.");
		}
		
		
		
		
	}
		
}
		

		
		
		


	


