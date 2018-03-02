package com.everis.agendadigital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.agendadigital.model.Agenda;
import com.everis.agendadigital.repository.AgendaRepositoty;

@Service
public class CadastroAgendaService {

	@Autowired
	private AgendaRepositoty repositoty; 
	
	public void salvar(Agenda agenda){
		repositoty.save(agenda);
	}

	public void excluir(Long codigo) {
		repositoty.delete(codigo);
	}
	
	
}
