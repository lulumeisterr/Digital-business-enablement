package br.com.fiap.spring.controllerCar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.spring.model.Carro;

@Controller
@RequestMapping("carro")
public class CarroController {
	
	@RequestMapping("enviar")
	public String openForm() {
		return "automovel/carro";
	}
	
	@PostMapping("enviar")
	public ModelAndView finishCadastro(Carro c) {
		
		ModelAndView r = new ModelAndView("automovel/carro");
	
		r.addObject("key" ,c);
		
		//System.out.println(c.getPlaca()  + " " +  c.getPreco()  +" " + c.isAutomatico() + "" + c.getMarca());
		
		return r;
	
	}
	
}
