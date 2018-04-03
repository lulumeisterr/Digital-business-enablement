package br.com.fiap.bean;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/*
 * Marca o objetivo para ser convertido para algum formato como XML ou json
 * No Inicio sempre é convertida para XML e depois para os outros formatos
 */

@XmlRootElement
public class Produto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private int cdProd;
	private String descricao;
	private double preco;
	private int estoque;
	
	public Produto(){
		
	}	

	public Produto(int cdProd, String descricao, double preco, int estoque) {
		super();
		this.cdProd = cdProd;
		this.descricao = descricao;
		this.preco = preco;
		this.estoque = estoque;
	}



	public int getCdProd() {
		return cdProd;
	}


	public void setCdProd(int cdProd) {
		this.cdProd = cdProd;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public int getEstoque() {
		return estoque;
	}


	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	
	

	
}
