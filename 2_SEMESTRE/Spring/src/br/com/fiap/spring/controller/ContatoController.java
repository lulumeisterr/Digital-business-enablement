package br.com.fiap.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("contato")
public class ContatoController {
	
	//Metodo que abre a p�gina com o formul�rio
	@RequestMapping("enviar")
	public String abrirForm() {
		return "contato/form";
	}
	
	//Metodo que processa as informa��es do formul�rio
	//@RequestMapping(value="enviar" ,method=RequestMethod.POST)
	//ou
	@PostMapping("enviar")
	public String processarForm(String tName, String tTelefone, String tEmail) {
		System.out.println(tName + " " + tTelefone +" " + tEmail);
		return "contato/form";
	}

}
