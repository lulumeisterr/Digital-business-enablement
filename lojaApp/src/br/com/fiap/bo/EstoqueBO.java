package br.com.fiap.bo;

import java.util.ArrayList;
import java.util.List;

// import org.slf4j.LoggerFactory;
// import org.slf4j.Logger;

import br.com.fiap.bean.Produto;



public class EstoqueBO {	
	
	//private static final Logger log = LoggerFactory.getLogger(EstoqueBO.class);

	
	ArrayList<Produto> listaProd = new ArrayList<Produto>();	
	public EstoqueBO(){
		
		//log.info("Inicialização do LOG");
		
		//log.debug("Inicializando o set");
		
		Produto pTO = new Produto();
		
		pTO.setCdProd(401);
		pTO.setDescricao("Camiseta Masculina Manga Curta Branca");
		pTO.setPreco(25.0);
		pTO.setEstoque(5);
		
		//log.debug("Cadastrando o primeiro produto");
		
		this.listaProd.add(pTO);
		
		Produto pTO2 = new Produto();
		
		pTO2.setCdProd(402);
		pTO2.setDescricao("Camiseta Feminina Manga Longa Rosa");
		pTO2.setPreco(10.0);
		pTO2.setEstoque(2);
		//log.debug("Cadastrando o Segundoo produto");
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
		msg.setDescricao("Produto nao cadastrado");
		return msg;
	}
	

	
	//Listando
	
	public List<Produto> listar(){	
		Produto p = new Produto();
		listaProd.add(p);
		return listaProd;
		
	}
	
	
	//Cadastrando
	public List<Produto> cadastrar(Produto p){
		return listaProd;
		
	}
	
}
