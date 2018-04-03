package br.com.fiap.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.fiap.bean.Produto;
import br.com.fiap.bo.EstoqueBO;

/*
 * 
 */

@Path("/produto")
public class ProdutoResource {

	private EstoqueBO estoqueBO = new EstoqueBO();

	/*
	 * GET Criando um metodo que irá retornar conteudo
	 * Produces : Ele retorna a informação do browse
	 * 
	 */

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String buscaR(){
		return "Ola Mundo!";
	}


	//Listando os produtos em json

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Produto> buscar(){
		return estoqueBO.listar();
	}


	// Consultando produto

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Produto buscar(@PathParam("id") int codigo){
		return estoqueBO.consultarProduto(codigo);
	}

	
	
	//Cadastrando via json
	
	// Mandando um json para o serviço e castrando na hora via json
	// Uribuilder pega o caminho url que você utilizou
	// Response.Create verifica se existe o atributo e se nao tiver ele cira
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(Produto prod, @Context UriInfo uriInfo){
		estoqueBO.cadastrar(prod);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(prod.getCdProd()));
		return Response.created(builder.build()).build();
	}
	
	
	

}

