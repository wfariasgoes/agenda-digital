package com.everis.agendadigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.agendadigital.model.Agenda;

public interface AgendaRepositoty extends JpaRepository<Agenda, Long>{

}
