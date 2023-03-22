package org.labPadroesDeProjeto.facade;

import org.labPadroesDeProjeto.subsistema1crm.CrmService;
import org.labPadroesDeProjeto.subsistema2cep.APIcep;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade =APIcep.getInstancia().recuperarCidade(cep);
        String estado =APIcep.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome,cep,cidade,estado);
    }
}
