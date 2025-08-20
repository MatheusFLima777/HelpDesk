package com.matheus.HelpDesk.domain.enums;

public enum Status {

    ABERTO(0, "ABERTO"),
    PENDENTE(1, "PENDENTE"),
    FECHADO(2,"FECHADO");

            
    private String descrição;
    private Integer codigo;

    Status(Integer codigo, String descrição) {
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
        public static Status toEnum(Integer codigo){
            if(codigo == null){
                if(codigo == null){
                    return null;
                }
               
            }
            for(Status p: Status.values()){
                if(codigo.equals(p.getCodigo()))
                return p;
            }
            throw new IllegalArgumentException("Status Inválido!");

        }
}
