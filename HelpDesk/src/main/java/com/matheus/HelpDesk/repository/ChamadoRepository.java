package com.matheus.HelpDesk.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.HelpDesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
