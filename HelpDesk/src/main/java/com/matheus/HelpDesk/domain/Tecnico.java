package com.matheus.HelpDesk.domain;

import java.util.ArrayList;
import java.util.List;
import com.matheus.HelpDesk.domain.enums.Perfil;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Tecnico extends Pessoa {

    private static final long serialVersionUID = 1L;
    
    @OneToMany(mappedBy = "tecnico")
    private List<Chamado> chamados = new ArrayList<>();

    public Tecnico(Object object, String string, String string2, String string3, String string4){
        addPerfil(Perfil.TECNICO);

    }
        public Tecnico(Integer id, String nome, String cpf, String email,String senha){
        super(id, nome, cpf, email, senha);
        addPerfil(Perfil.TECNICO);
}
        public List<Chamado> getChamados() {
            return chamados;
        }
        public void setChamados(List<Chamado> chamados) {
            this.chamados = chamados;
        }


}
