
package mapa;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Distancia", targetNamespace = "http://Mapa/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Distancia {


    /**
     * 
     * @param longitude
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getKm", targetNamespace = "http://Mapa/", className = "mapa.GetKm")
    @ResponseWrapper(localName = "getKmResponse", targetNamespace = "http://Mapa/", className = "mapa.GetKmResponse")
    @Action(input = "http://Mapa/Distancia/getKmRequest", output = "http://Mapa/Distancia/getKmResponse")
    public float getKm(
        @WebParam(name = "longitude", targetNamespace = "")
        String longitude);

}
