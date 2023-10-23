/*
 Criar um serviço Web que informe a distância entre dois pontos:
São Paulo x Campinas e São Paulo x Guarulhos.
 */
package Mapa;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author rodri
 */
@WebService(serviceName = "Distancia")
public class Distancia {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "getKm")
    public float getKm(@WebParam(name = "longitude") String longitude) {
        if(longitude.equals("Sao Paulo Campinas"))
            return 97;
        if(longitude.equals("Sao Paulo Guarulhos"))
            return 21;
        return 0;
    }
}