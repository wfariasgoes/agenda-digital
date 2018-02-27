package com.everis.agendadigital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AgendaController {

	@RequestMapping("/agenda/novo")
	public String novo(){
		return "CadastroAgenda";
	}
}
