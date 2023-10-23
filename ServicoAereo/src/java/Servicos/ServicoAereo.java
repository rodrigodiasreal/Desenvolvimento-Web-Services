/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicos;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author rodri
 */
@WebService(serviceName = "ServicoAereo")
public class ServicoAereo {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "getPrecoViagem")
    public float getPrecoViagem(@WebParam(name = "destino") String destino) {
        if(destino.equals("Campinas"))
            return 200;
        if(destino.equals("Belo Horizonte"))
            return 150;
        return 0;
    }
}
