package br.com.fiap.teste;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class DELETEANDO_CLIENTE {

	public static void main(String[] args) {

		Client client = Client.create();
		WebResource webResource = client.resource("http://localhost:8080/ExemploParaNac_RestFULL/rest/Cliente/Jaber");
		ClientResponse response = webResource.delete(ClientResponse.class);
		if (response.getStatus() == 204) {
			System.out.println("Sucesso! DELETADO");
		} else{
			System.err.println("Erro: HTTP error code : " + response.getStatus());
		}

	}

}
