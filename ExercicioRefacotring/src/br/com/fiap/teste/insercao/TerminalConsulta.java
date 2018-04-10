package br.com.fiap.teste.insercao;

import javax.swing.JOptionPane;

import br.com.fiap.BO.EstoqueBO;
import br.com.fiap.bean.Produto;

public class TerminalConsulta {

	public static void main(String[] args)throws Exception{
		
	
		int n1 = 0;
		int ver = 0; 
		
			ver = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para entrar")); 
			switch (ver) {
			case 1:
				
				EstoqueBO e = new EstoqueBO();
				
				n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do produto"));
			
				Produto prod = e.consultarProduto(n1);
				System.out.println(prod.getDescricao());
				
				break;
			case 0:
				System.out.println("Saiu");
				break;
			default:
				throw new Exception("Numero invalido");
			}
		
	}

}


