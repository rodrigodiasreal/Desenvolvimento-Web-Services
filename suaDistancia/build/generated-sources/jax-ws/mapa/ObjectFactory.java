
package mapa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mapa package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetKm_QNAME = new QName("http://Mapa/", "getKm");
    private final static QName _GetKmResponse_QNAME = new QName("http://Mapa/", "getKmResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mapa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetKm }
     * 
     */
    public GetKm createGetKm() {
        return new GetKm();
    }

    /**
     * Create an instance of {@link GetKmResponse }
     * 
     */
    public GetKmResponse createGetKmResponse() {
        return new GetKmResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Mapa/", name = "getKm")
    public JAXBElement<GetKm> createGetKm(GetKm value) {
        return new JAXBElement<GetKm>(_GetKm_QNAME, GetKm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKmResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Mapa/", name = "getKmResponse")
    public JAXBElement<GetKmResponse> createGetKmResponse(GetKmResponse value) {
        return new JAXBElement<GetKmResponse>(_GetKmResponse_QNAME, GetKmResponse.class, null, value);
    }

}
