package br.com.fiap.teste.insercao;

import javax.swing.JOptionPane;

import br.com.fiap.BO.EstoqueBO;
import br.com.fiap.bean.Produto;

public class TerminalConsulta {

	public static void main(String[] args)throws Exception{
		
		Produto p = new Produto();
		
		int n1 = 0;
		int ver = 0; 
		
			ver = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 Para entrar")); 
			switch (ver) {
			case 1:
				
				EstoqueBO e = new EstoqueBO();
				
				e.consultarProduto(n1);
				n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do produto"));
				System.out.println(p.getDescricao());
				
					//JOptionPane.showMessageDialog(null, "Camiseta Masculina Manga Curta Branca" + " Dia da semana " + new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime()));
					//JOptionPane.showMessageDialog(null, "Camiseta Feminina Manga Longa Rosa." + " Dia da semana " + new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime()));;
				break;
			case 0:
				System.out.println("Saiu");
				break;
			default:
				throw new Exception("Numero invalido");
			}
		
	}

}


