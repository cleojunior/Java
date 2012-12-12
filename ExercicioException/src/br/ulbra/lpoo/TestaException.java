package br.ulbra.lpoo;

import br.ulbra.lpoo.ProdutoNaoExisteException;

public class TestaException {

	public static void main(String[] args) {

		Estoque est = new Estoque();
		
		Produto p1 = new Produto("01","Produto 1","1,99");
		Produto p2 = new Produto("02","Produto 2","2,99");
		Produto p3 = new Produto("03","Produto 3","3,99");
		Produto p4 = new Produto("04","Produto 4","4,99");
		
		try{
			/**
			 * Adicionando produtos no estoque...	
			 */
			est.adicionaProduto(p1);
			est.adicionaProduto(p2);
			est.adicionaProduto(p3);
			/**
			 * Removendo produtos do estoque...
			 */
			est.excluirProduto(p1);
			est.excluirProduto(p2);
			//est.excluirProduto(p4); // Exceção!!!
			/**
			 * Pesquisando produto em estoque...
			 */
			est.pesquisaProdutos(p1);
			//est.pesquisaProdutos(p4); //Exceção
			
		}catch(ProdutoNaoExisteException e){ 
			System.out.println("Produto não existe: " + e.getMessage());
		}
//		finally{
//			System.out.println("Fim do teste de exceção!");
//		}
		
	}

}
