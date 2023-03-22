package org.labPadroesDeProjeto.subsistema2cep;

public class APIcep {
    private static APIcep instancia =new APIcep();
     private APIcep(){
         super();
     }
     public static APIcep getInstancia(){
         return instancia;
     }
     public String recuperarCidade(String cep){
         return "Recife";
    }
    public String recuperarEstado(String cep){
         return "PE";
    }


}
