package com.matheus.HelpDesk.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.matheus.HelpDesk.domain.dtos.TecnicoDTO;
import com.matheus.HelpDesk.domain.enums.Perfil;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Tecnico extends Pessoa {

    private static final long serialVersionUID = 1L;
    
    @JsonIgnore
    @OneToMany(mappedBy = "tecnico")
    private List<Chamado> chamados = new ArrayList<>();

    public Tecnico(Integer id, String nome, String cpf, String email,String senha){
        addPerfil(Perfil.TECNICO);

    }
        public Tecnico(){
        super();
}

        public Tecnico(TecnicoDTO obj) {
        this.id = obj.getId();
        this.nome = obj.getNome();
        this.cpf = obj.getCpf();
        this.email = obj.getEmail();
        this.senha = obj.getSenha();
        this.perfis = obj.getPerfis().stream().map(x -> x.getCodigo()).collect(Collectors.toSet());
        this.dtCriacao = obj.getDtCriacao();
    }
        public List<Chamado> getChamados() {
            return chamados;
        }
        public void setChamados(List<Chamado> chamados) {
            this.chamados = chamados;
        }


}
