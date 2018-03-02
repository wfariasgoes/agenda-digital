package com.everis.agendadigital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.agendadigital.model.Agenda;

public interface AgendaRepositoty extends JpaRepository<Agenda, Long>{

	public List<Agenda> findByNomeContaining(String nome);
}
