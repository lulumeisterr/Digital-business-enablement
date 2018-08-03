package br.com.fiap.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class HomeController {
	@RequestMapping("/home")
	public String abrirHome() {
		return "home/index"; //pasta + o nome do arquivo jsp
	}

}
