package br.com.fiap.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.bean.Cliente;

public class ClienteBO {


	ArrayList<Cliente> listaCliente = new ArrayList<>();

	public ClienteBO(){

		Cliente c = new Cliente();

		c.setNome("Lucas");
		c.setTelefone("41672128");
		c.setCpf(45445);
		this.listaCliente.add(c);

		Cliente c2 = new Cliente();

		c2.setNome("Jaber");
		c2.setTelefone("55782482");
		c2.setCpf(154453);
		this.listaCliente.add(c2);

		Cliente c3 = new Cliente();

		c3.setNome("YUDI");
		c3.setTelefone("55782482");
		c3.setCpf(154453);
		this.listaCliente.add(c3);

	}

// Consultando por nome
	public Cliente listarClienteConsultar(String nm)throws Exception{

		for (Cliente cliente : listaCliente) {
			if(cliente.getNome().equals(nm)){
				return cliente;
			}else{
				throw new Exception("Cliente não encontrado");
			}
		}
		Cliente c = new Cliente();
		c.setNome("Consulta nao realizada");
		return c;
	}


	// Exibindo
	public List<Cliente> ExibirCliente() {
		return listaCliente;
	}


	@Deprecated
	public String Buscar(String nome) throws Exception{

		for (int i = 0; i < listaCliente.size(); i++) {
			if(listaCliente.get(i).getNome().equals(nome)){
				return this.listaCliente.get(i).getNome();
			}else{
				throw new Exception("Cliente nao encontrado");
			}
		}

		for (Cliente cliente : listaCliente) {
			System.out.println(cliente.getNome());
		}

		return "Busca realizada";
	}


	//DELETANDO PARA CONSOLE
	public String Apagar(String nome) {
		for (int i =0; i <listaCliente.size(); i++) {
			Cliente c = listaCliente.get(i);
			if(c.getNome().equals(nome)){
				listaCliente.remove(c);
				break;
			}
		}
		for (Cliente cliente : listaCliente) {
			System.out.println(cliente.getNome());
		}
		return "Removido";
	}

	//REMOVENDO VIA JSON
	public void remover(String nome){
		listaCliente.remove(nome);
	}


	//BUSCANDO POR NOME
	public Cliente consultarPorNome(String nome) {
	
		for (Cliente cliente : listaCliente) {
			if(cliente.getNome().equals(nome)){
				return cliente;
			}
		}
		
		return null;
	}




}
