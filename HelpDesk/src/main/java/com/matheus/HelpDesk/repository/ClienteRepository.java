package com.matheus.HelpDesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.HelpDesk.domain.Pessoa;

public interface ClienteRepository extends JpaRepository<Pessoa, Integer> {

}
