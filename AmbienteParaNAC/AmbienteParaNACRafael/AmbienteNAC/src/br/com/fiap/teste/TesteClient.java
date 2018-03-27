package br.com.fiap.teste;

import java.rmi.RemoteException;
import java.util.Scanner;

import br.com.fiap.BO.EstoqueBOStub;
import br.com.fiap.BO.EstoqueBOStub.ConsultarProduto;
import br.com.fiap.BO.EstoqueBOStub.ConsultarProdutoResponse;
import br.com.fiap.BO.EstoqueBOStub.Produto;

public class TesteClient {

	public static void main(String[] args) throws RemoteException {
	
		// Uma classe espelho que será possivel acessar outras maquinas ou aplicações
		
		EstoqueBOStub stub = new EstoqueBOStub();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite codigo do produto");
		int codigo = entrada.nextInt();
		
		//Chamar o metodo que sera acessado na classe EstoqueBOStub
		ConsultarProduto consulta = new ConsultarProduto();
		consulta.setCdProd(codigo);
		
		// Estou recuperando o XML da outra CLASSE
		ConsultarProdutoResponse response = stub.consultarProduto(consulta);
		
		// Estou desembrulhando os metodos da classe;
		Produto produto = response.get_return();
		
		// Trazendo os objs de volta
		System.out.println(produto.getDescricao());
	
		
		


	}

}
