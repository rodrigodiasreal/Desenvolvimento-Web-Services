/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote1;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author rodri
 */
@WebService(serviceName = "Soma")
@Stateless()
public class Soma {

    @WebMethod(operationName = "Somar")
    public int Somar(@WebParam(name = "numero1") int numero1, @WebParam(name = "numero2") int numero2) {
        //TODO write your implementation code here:
        int result = numero1+numero2;
        return result;
    }
}
