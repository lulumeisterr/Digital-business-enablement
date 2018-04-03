package br.com.fiap.lojaClient;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.fiap.bean.Produto;

public class Cliente {


	public static void main(String[] args) {

			
		int i = 2;
		
		switch (i) {
		case 1:
			ListarProdutoClient();
			break;

		case 2:
			BuscarProdutoClient();
			break;
			
		default:
			break;
		}
		
		
		

	}

	private static void BuscarProdutoClient() {

		Client client = Client.create();
		WebResource resource = client.resource("http://localhost:8080/lojaApp/rest/produto/401");
		
		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		
		if (response.getStatus() == 200){
			
			Produto produto = response.getEntity(Produto.class);
			System.out.println(produto.getDescricao());
			
		} else{
			
			System.out.println("Erro - HTTP Status: " + response.getStatus());
		}

	}

	private static void ListarProdutoClient() {

		Client client = Client.create();
		WebResource resource = client.resource("http://localhost:8080/lojaApp/rest/produto");

		// Desconverter o json para procurar o codigo do http , e getStatus() é OK caso contrario erro !

		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);

		if (response.getStatus() == 200){
			Produto[] produtos = response.getEntity(Produto[].class);
			for (Produto produtoTO : produtos) {
				System.out.println(produtoTO.getDescricao());
			}
		}else{
			System.out.println("Erro - HTTP Status: " + response.getStatus());
		}


	}






}