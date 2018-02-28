package com.everis.agendadigital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.everis.agendadigital.model.Agenda;

@Controller
@RequestMapping("/agendas")
public class AgendaController {

	@RequestMapping("/novo")
	public String novo(){
		return "CadastroAgenda";
	}
	
	@RequestMapping(method =  RequestMethod.POST)
	public String salvar(Agenda agenda){
		System.out.println(">>>> "+agenda.getNome()+" -- "+agenda.getTipoLogradouro());
		return "CadastroAgenda";
	}
}
