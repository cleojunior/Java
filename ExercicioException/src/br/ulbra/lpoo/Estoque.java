package br.ulbra.lpoo;

import java.util.ArrayList;
import java.util.List;
import br.ulbra.lpoo.ProdutoNaoExisteException;

public class Estoque {

	private List<Produto> listaProdutos;
	private boolean achouProduto;
	
	public Estoque() {
		if (listaProdutos == null)
			listaProdutos = new ArrayList<Produto>();
	}
	
	/**
	 * Adiciona um produto em estoque
	 * @param produto
	 */
	public void adicionaProduto(Produto produto) throws ProdutoNaoExisteException {
		listaProdutos.add(produto);
		System.out.println("Produto " + produto.getNome() + " adicionado no estoque.");
	}

	/**
	 * Remove um produto do estoque
	 * @param produto
	 */
	public void excluirProduto(Produto produto) throws ProdutoNaoExisteException {
		achouProduto = false;
		for (Produto prod : listaProdutos){
			if (prod.equals(produto)){
				listaProdutos.remove(produto);
				System.out.println("Produto " + produto.getNome() + " excluído com sucesso.");
				achouProduto = true;
			}
		}
		if (!achouProduto){
			throw new ProdutoNaoExisteException("Produto não encontrado.");
		}
	}
	
	/**
	 * Lista todos os produtos em estoque
	 */
	public void pesquisaProdutos(Produto produto) throws ProdutoNaoExisteException {
		achouProduto = false;
		for (Produto prod : listaProdutos){
			if (prod.equals(produto)) {
				System.out.println(prod);
				achouProduto = true;
			}
		}
		if (!achouProduto){
			throw new ProdutoNaoExisteException("Produto não encontrado.");
		}
	}
	
}
