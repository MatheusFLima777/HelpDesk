package com.matheus.HelpDesk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheus.HelpDesk.domain.Tecnico;
import com.matheus.HelpDesk.repository.TecnicoRepository;
import com.matheus.HelpDesk.services.exceptions.ObjNotFoundException;

@Service
public class TecnicoService {

    @Autowired
    TecnicoRepository tecnicoRepository;

    public Tecnico buscarPorId(Integer id){
        Optional<Tecnico> tecnico = tecnicoRepository.findById(id);
        return tecnico.orElseThrow(()-> new ObjNotFoundException("Registro não encontrado! ID:  "+ id));

    }

    public List<Tecnico> findAll() {
        return tecnicoRepository.findAll();
    }

}
