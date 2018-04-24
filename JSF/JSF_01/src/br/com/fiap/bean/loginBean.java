package br.com.fiap.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class loginBean {

	private String login;
	private String senha;


	public String logar() {
		if ("rafael".equals(getLogin()) && "123".equals(getSenha())) {
			//System.out.println("Usuario logado: " + getLogin());
			return "logRight";
		} else {
			return "logWrong";
		}
	}

	public loginBean() {

	}

	public loginBean(String login, String senha) {
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

}