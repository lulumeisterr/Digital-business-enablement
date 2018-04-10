package br.com.fiap.teste;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.fiap.bean.Cliente;

public class POST {

	public static void main(String[] args) {

		Client client = Client.create();
		WebResource webResource = client.resource("http://localhost:8080/ExemploParaNac_RestFULL/rest/Cliente/");
		Cliente cli  = new Cliente("Xablau" , "977931383" , 103855);
		ClientResponse response = webResource.type("application/json").post(ClientResponse.class, cli);
		if (response.getStatus() == 201) {
			System.out.println("Sucesso! " + response.getLocation());
		} else{
			System.err.println("Erro: HTTP error code : " + response.getStatus());
		}

	}

}
