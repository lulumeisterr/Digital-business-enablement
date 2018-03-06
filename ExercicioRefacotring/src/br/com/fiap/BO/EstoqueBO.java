package br.com.fiap.BO;

import java.util.ArrayList;

import br.com.fiap.bean.Produto;


public class EstoqueBO {	
	ArrayList<Produto> listaProd = new ArrayList<>();	
	public EstoqueBO(){
		
		Produto pTO = new Produto();
		
		pTO.setCdProd(401);
		pTO.setDescricao("Camiseta Masculina Manga Curta Branca");
		pTO.setPreco(25.0);
		pTO.setEstoque(5);
		
		this.listaProd.add(pTO);
		
		Produto pTO2 = new Produto();
		
		pTO2.setCdProd(402);
		pTO2.setDescricao("Camiseta Feminina Manga Longa Rosa");
		pTO2.setPreco(10.0);
		pTO2.setEstoque(2);
		
		this.listaProd.add(pTO2);
		
	}
	

	public Produto consultarProduto(int cdProd){
		
		for (Produto produto : listaProd) {
			if(produto.getCdProd() == cdProd){
				return produto;
			}
		}
		
		
//		for(int i = 0; i < this.listaProd.size(); i++){
//			if(this.listaProd.get(i).getCdProd() == cdProd){
//				return this.listaProd.get(i);
//			}
		
		
		Produto msg = new Produto();
		msg.setDescricao("Produto n�o Cadastrado");
		return msg;
	}
	


}
