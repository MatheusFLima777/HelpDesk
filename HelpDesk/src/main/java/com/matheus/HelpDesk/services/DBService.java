package com.matheus.HelpDesk.services;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheus.HelpDesk.domain.Chamado;
import com.matheus.HelpDesk.domain.Cliente;
import com.matheus.HelpDesk.domain.Tecnico;
import com.matheus.HelpDesk.domain.enums.Perfil;
import com.matheus.HelpDesk.domain.enums.Prioridade;
import com.matheus.HelpDesk.domain.enums.Status;
import com.matheus.HelpDesk.repository.ChamadoRepository;
import com.matheus.HelpDesk.repository.ClienteRepository;
import com.matheus.HelpDesk.repository.TecnicoRepository;

import jakarta.annotation.PostConstruct;

@Service
public class DBService {

    @Autowired
	private TecnicoRepository tecnicoRepository;

    @Autowired
	private ClienteRepository clienteRepository;

    @Autowired
	private ChamadoRepository chamadoRepository;


   @PostConstruct
    public void instanciaDB(){
        
    	Tecnico tecnico = new Tecnico(null, "Matheus LIma", "45769669870", "matheus.lima@dellavolpe.com.br", "1234321");
		tecnico.addPerfil(Perfil.ADMIN);

		tecnicoRepository.saveAll(Arrays.asList(tecnico));

        Cliente cliente = new Cliente(null, "Tyrion Bjorn", "00000000000", "tyrion.silva@dellavolpe.com.br", "123421");
        cliente.addPerfil(Perfil.CLIENTE);

        clienteRepository.saveAll(Arrays.asList(cliente));

        

        Chamado chamado = new Chamado(null, Prioridade.BAIXA, Status.ABERTO, "Testes", "Teste teste teste", tecnico, cliente);
        
        chamadoRepository.saveAll(Arrays.asList(chamado));
        
    }
}
