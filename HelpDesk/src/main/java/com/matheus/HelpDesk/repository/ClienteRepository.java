package com.matheus.HelpDesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.HelpDesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
