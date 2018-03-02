package com.everis.agendadigital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.agendadigital.model.Agenda;
import com.everis.agendadigital.repository.AgendaRepositoty;
import com.everis.agendadigital.repository.filter.AgendaFilter;

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
	
	public List<Agenda> filtrar(AgendaFilter filter){
		String nome = filter.getNome() == null ? "%" : filter.getNome();
		return repositoty.findByNomeContaining(nome); 
	}
	
}
