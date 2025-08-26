package com.matheus.HelpDesk.domain.enums;

public enum Perfil {

    ADMIN(0, "ROLE_ADMIN"),
    CLIENTE(1, "ROLE_CLIENTE"),
    TECNICO(2,"ROLE_TECNICO");

            
    private String descrição;
    private Integer codigo;

    Perfil(Integer codigo, String descrição) {
          this.codigo = codigo;
          this.descrição = descrição;
        }
    
        public Integer getCodigo(){
            return codigo;
        }
        public String getdescricao(){
            return descrição;
        } 

        @SuppressWarnings("unsed")
        public static Perfil toEnum(Integer codigo){
                if(codigo == null){
                    return null;
                }
               
            for(Perfil p: Perfil.values()){
                if(codigo.equals(p.getCodigo()))
                return p;
            }
            throw new IllegalArgumentException("Perfil Inválido!");

        }
}
