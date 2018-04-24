package br.com.fiap.bo;

import java.util.ArrayList;

import br.com.fiap.bean.loginBean;


public class EstoqueBO {	


	ArrayList<loginBean> logBean = new ArrayList<loginBean>();	

	public EstoqueBO(){

		loginBean log = new loginBean();

		log.setLogin("Rafael");
		log.setSenha("123");
		
		this.logBean.add(log);

	}


	public loginBean consultarProduto(String login , String senha)throws Exception{

		for(int i = 0; i < this.logBean.size(); i++){
			if(this.logBean.get(i).getLogin() == login && this.logBean.get(i).getSenha() == senha){
				return this.logBean.get(i);
			}else{
				throw new Exception("Login invalido");
			}

		}
		return null;
	}
}
