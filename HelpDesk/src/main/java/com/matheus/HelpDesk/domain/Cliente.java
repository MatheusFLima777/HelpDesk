package com.matheus.HelpDesk.domain;

import java.util.Set;

import com.matheus.HelpDesk.domain.enums.Perfil;

public class Cliente extends Pessoa {

    private static final long serialVersionUID = 1L;


    public Cliente(){
        super();
        addPerfil(Perfil.CLIENTE);
        
    }

    public Cliente(Integer id, String nome, String cpf, String email,String senha, Set<Integer>perfis){
        super(id, nome, cpf, email, senha, perfis);
        addPerfil(Perfil.CLIENTE);
    }
}

