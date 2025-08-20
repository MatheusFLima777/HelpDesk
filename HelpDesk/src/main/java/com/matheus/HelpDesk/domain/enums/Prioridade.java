package com.matheus.HelpDesk.domain.enums;

public enum Prioridade {

    BAIXA(0, "BAIXA"),
    MEDIA(1, "MEDIA"),
    ALTA(2,"ALTA");

            
    private String descrição;
    private Integer codigo;

    Prioridade(Integer codigo, String descrição) {
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
        public static Prioridade toEnum(Integer codigo){
            if(codigo == null){
                if(codigo == null){
                    return null;
                }
               
            }
            for(Prioridade p: Prioridade.values()){
                if(codigo.equals(p.getCodigo()))
                return p;
            }
            throw new IllegalArgumentException("Prioridade Inválido!");

        }
}
