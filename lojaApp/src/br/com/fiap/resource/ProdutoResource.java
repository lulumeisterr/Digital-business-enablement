package br.com.fiap.resource;


/*
 * GET Criando um metodo que irá retornar conteudo
 * Produces : Ele retorna a informação do browse
 * 
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/produto")
public class ProdutoResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String buscar(){
		return "Ola Mundo!";
	}
}

