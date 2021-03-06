package br.com.fiap.teste.insercao;

import java.text.DecimalFormat;
import java.util.Scanner;

import br.com.fiap.BO.EstoqueBO;
import br.com.fiap.bean.Produto;

public class TerminalConsulta2 {

	public static void main(String[] args) throws Exception {
		
		int cdProd = 0;
		
		Produto p = new Produto();
		EstoqueBO bo = new EstoqueBO();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Codigo do produto");
		cdProd = entrada.nextInt();
		
		Produto prod = bo.consultarProduto(cdProd);
		System.out.println(prod.getDescricao());
		
		
		DecimalFormat df = new DecimalFormat("R$ #,###.00");
		System.out.println(df.format(prod.getPreco()));
	
		
	}
}
