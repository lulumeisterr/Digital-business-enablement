package br.com.fiap.bo;

import java.util.ArrayList;

import br.com.fiap.bean.produtoBean;

public class EstoqueBO {	
	
	
	ArrayList<produtoBean> listaProd = new ArrayList<produtoBean>();	
	
	public EstoqueBO(){
		
		produtoBean pTO = new produtoBean();
		
		pTO.setCdProd(401);
		pTO.setDescricao("Camiseta Masculina Manga Curta Branca");
		pTO.setPreco(25.0);
		pTO.setEstoque(5);
		
	
		
		this.listaProd.add(pTO);
		
		produtoBean pTO2 = new produtoBean();
		
		pTO2.setCdProd(402);
		pTO2.setDescricao("Camiseta Feminina Manga Longa Rosa");
		pTO2.setPreco(10.0);
		pTO2.setEstoque(2);
		
		this.listaProd.add(pTO2);
		
	}
	

	public produtoBean consultarProduto(int cdProd){
		
		for (produtoBean produto : listaProd) {
			if(produto.getCdProd() == cdProd){
				return produto;
			}
		}
		
		
//		for(int i = 0; i < this.listaProd.size(); i++){
//			if(this.listaProd.get(i).getCdProd() == cdProd){
//				return this.listaProd.get(i);
//			}
		
		
		produtoBean msg = new produtoBean();
		msg.setDescricao("Produto nao cadastrado");
		return msg;
	}
	

	
}
