package com.matheus.HelpDesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.matheus.HelpDesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
