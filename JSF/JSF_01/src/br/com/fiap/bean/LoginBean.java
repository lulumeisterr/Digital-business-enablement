package br.com.fiap.bean;

import javax.annotation.ManagedBean;

@ManagedBean

public class LoginBean {

	private String login;
	private String senha;
	
	public LoginBean() {
		
	}
	
	public LoginBean(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void logar() {
		if ("rafael".equals(getLogin()) &&
				"password".equals(getSenha())) {
			System.out.println("Usuario logado: " + getLogin());
		} else {
			System.out.println("Usuario com senha incorreta: " +
					getLogin());
		}
	}
}