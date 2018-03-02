package com.everis.agendadigital.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.everis.agendadigital.model.Agenda;
import com.everis.agendadigital.model.Estados;
import com.everis.agendadigital.model.TipoLogradouro;
import com.everis.agendadigital.repository.AgendaRepositoty;

@Controller
@RequestMapping("/agendas")
public class AgendaController {
	//para log Debug (logging.level.root=DEBUG)
	
	private static final String CADASTRO_VIEW = "CadastroAgenda";
	@Autowired
	private AgendaRepositoty agendaRepositoty;
	
	@RequestMapping("/novo")
	public ModelAndView novo(){
		ModelAndView mv = new ModelAndView("CadastroAgenda");
		mv.addObject(new Agenda());
		return mv;
	}
	
	/**
	 * Ao invés de retornar a String, vamos retornar um cara que carrega o nome da View e também 
	 * carrega mais informações da View.
	 * Com ModelAndView
	 * **/
	@RequestMapping(method =  RequestMethod.POST)
	public String salvar(@Validated Agenda agenda, Errors erros, RedirectAttributes attributes){
		if(erros.hasErrors()){
			return "CadastroAgenda";
		}
		agendaRepositoty.save(agenda);
		attributes.addFlashAttribute("mensagem", "Agenda salva com sucesso!");
		return "redirect:/agendas/novo";
	}
	
	/**
	 * Carrega dinamicamente o combo logradouros e recarrega após salvar
	 * **/
	@ModelAttribute("todosTiposLogradouro")
	public List<TipoLogradouro> todosOsLogradouros(){
		return Arrays.asList(TipoLogradouro.values());
	}
	
	
	// Metodo para listar todos os títulos, já está mapeado no início da classe
	// como ("/titulos")
	@RequestMapping
	public ModelAndView pesquisar(Pageable pageable) {
		List<Agenda> todosContatos = agendaRepositoty.findAll(); // FindAll
																// retorna a
		// lista de titulos
		ModelAndView mv = new ModelAndView("PesquisaContato");
		mv.addObject("contatos", todosContatos);
		return mv;
	}
	
	@RequestMapping("{codigo}")
	public ModelAndView edicaor(@PathVariable Long codigo){
		Agenda agenda = agendaRepositoty.findOne(codigo);
		
		ModelAndView mv = new ModelAndView(CADASTRO_VIEW);
		mv.addObject(agenda);
		return mv;
	}
	
	/**
	 * Carrega dinamicamente o combo estados e recarrega após salvar
	 * **/
	@ModelAttribute("todosOsEstados")
	public List<Estados> todosOsEstados(){
		return Arrays.asList(Estados.values());
	}
}
