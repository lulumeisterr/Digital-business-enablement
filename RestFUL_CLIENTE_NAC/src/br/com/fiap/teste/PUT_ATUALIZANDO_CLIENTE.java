package br.com.fiap.teste;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.fiap.bean.Cliente;

public class PUT_ATUALIZANDO_CLIENTE {

	public static void main(String[] args) {

		Client client = Client.create();
		WebResource webResource = client.resource("http://localhost:8080/ExemploParaNac_RestFULL/rest/Cliente/Jaber");
		Cliente cli = new Cliente("XABLAU" , "40028922" , 10803);
		ClientResponse response = webResource.type("application/json").put(ClientResponse.class, cli);
		if (response.getStatus() == 200) {
			System.out.println("Sucesso! ");
		} else{
			System.err.println("Erro: HTTP error code : " + response.getStatus());
		}

	}

}
