package br.com.fiap.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.fiap.bean.Cliente;
import br.com.fiap.bo.ClienteBO;

//Definir uma URI
@Path("/Cliente")
public class ClienteResource {

	private ClienteBO cliBO = new ClienteBO();
	
	/**
	 * Este metodo esta retornando um Cliente via Json 
	 * @author Lucas
	 * @since 1
	 * @return Cliente
	 */

	
	
	// Respondendo requisição GET , Retornando o conteudo em Json
	@GET
	// Definindo o tipo de retorno
	@Produces(MediaType.APPLICATION_JSON)
	// Retornando um cliente
	public List<Cliente> ExibindoCliente (){
		return cliBO.ExibirCliente();
	}

	
	/**
	 * Exibindo Cliente via XML
	 * @author Lucas
	 */

//	@GET
//	@Produces(MediaType.TEXT_XML)
//	public List<Cliente> exibir(){
//		return cliBO.ExibirCliente();
//	}
	
	
	/**
	 * Realizando consulta por nome
	 * @param nome
	 * @return nome
	 * @author Lucas
	 * 
	 */
	
	@GET
	@Path("/{nome}")
	@Produces(MediaType.APPLICATION_JSON)
	public Cliente buscar(@PathParam("nome") String nome){
		return cliBO.consultarPorNome(nome);
	}
	
	
	
	/**
	 * DELETANDO POR NOME
	 * @param nome
	 * @author Lucas
	 * 
	 */
	
	@DELETE
	@Path("/{nome}")
	@Produces(MediaType.APPLICATION_JSON)
	public void Apagar(@PathParam("nome") String nome){
		cliBO.remover(nome);
	}
	
	
	
	/**
	 *  Atualizando por Nome
	 * @param cli
	 * @param nome
	 * @return
	 */
	
	@PUT
	@Path("/{nome}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizar(Cliente cli, @PathParam("nome") String nome){
	cli.setNome(nome);
	//cliBO.atualizar(nome);
	return Response.ok().build();
			
	}

}
