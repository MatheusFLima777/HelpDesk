package com.matheus.HelpDesk.domain;

import java.util.Set;

import com.matheus.HelpDesk.domain.enums.Perfil;

public class Tecnico extends Pessoa {

    private static final long serialVersionUID = 1L;


    public Tecnico(){
        addPerfil(Perfil.TECNICO);

    }
        public Tecnico(Integer id, String nome, String cpf, String email,String senha, Set<Integer>perfis){
        super(id, nome, cpf, email, senha, perfis);
        addPerfil(Perfil.TECNICO);
}
}
