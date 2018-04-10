package br.com.fiap.teste;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.fiap.bean.Cliente;

public class GET_BUSCAR_NOME {

	public static void main(String[] args) {

		Client client = Client.create();
		WebResource resource = client.resource("http://localhost:8080/ExemploParaNac_RestFULL/rest/Cliente/Lucas");
		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		if (response.getStatus() == 200){
			Cliente cli = response.getEntity(Cliente.class);
			System.out.println(cli.getNome());
		} else{
			System.out.println("Erro - HTTP Status: " + response.getStatus());
		}

	}

}
