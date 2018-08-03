package br.com.fiap.spring.model;

import java.io.Serializable;

public class Carro implements Serializable{
	

	private static final long serialVersionUID = 1922529650132385719L;
	
	
	private String placa;
	private boolean automatico;
	private double preco;
	private String marca;
	

	public Carro () {
		
	}
	
	

	public Carro(String placa, boolean automatico, double preco, String marca) {
		super();
		this.placa = placa;
		this.automatico = automatico;
		this.preco = preco;
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public boolean isAutomatico() {
		return automatico;
	}

	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}


}
