package br.com.fiap.bean;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1681595106543420824L;

	private String nome;
	private String telefone;
	private long cpf;


	public Cliente(){

	}

	public Cliente(String nome, String telefone, long cpf) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}



}
