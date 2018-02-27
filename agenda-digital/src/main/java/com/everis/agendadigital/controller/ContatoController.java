package com.everis.agendadigital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContatoController {
	
	@RequestMapping("/contato/novo")
	public String novo(){
		return "CadastroContato";
	}

}
