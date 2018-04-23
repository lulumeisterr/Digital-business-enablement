package br.com.fiap.bean;



import javax.faces.bean.ManagedBean;

import br.com.fiap.bo.EstoqueBO;

@ManagedBean
public class produtoBean {
	
	private int cdProd;
	private String descricao;
	private double preco;
	private int estoque;


	public produtoBean() {
		
	}
	
	public void ConsultarProdutoBean()throws Exception{
		EstoqueBO est = new EstoqueBO();
		
		produtoBean p = est.consultarProduto(getCdProd());
	
		System.out.println(p.getCdProd());
		System.out.println(p.getDescricao());
		
	}
	
	public produtoBean(int cdProd, String descricao, double preco, int estoque) {
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
