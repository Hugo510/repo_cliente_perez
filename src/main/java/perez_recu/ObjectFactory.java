
package perez_recu;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the perez_recu package. 
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

    private static final QName _Hello_QNAME = new QName("http://perez_recu/", "hello");
    private static final QName _HelloResponse_QNAME = new QName("http://perez_recu/", "helloResponse");
    private static final QName _Masa_QNAME = new QName("http://perez_recu/", "masa");
    private static final QName _MasaResponse_QNAME = new QName("http://perez_recu/", "masaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: perez_recu
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello }
     * 
     * @return
     *     the new instance of {@link Hello }
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     * @return
     *     the new instance of {@link HelloResponse }
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Masa }
     * 
     * @return
     *     the new instance of {@link Masa }
     */
    public Masa createMasa() {
        return new Masa();
    }

    /**
     * Create an instance of {@link MasaResponse }
     * 
     * @return
     *     the new instance of {@link MasaResponse }
     */
    public MasaResponse createMasaResponse() {
        return new MasaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://perez_recu/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://perez_recu/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Masa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Masa }{@code >}
     */
    @XmlElementDecl(namespace = "http://perez_recu/", name = "masa")
    public JAXBElement<Masa> createMasa(Masa value) {
        return new JAXBElement<>(_Masa_QNAME, Masa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MasaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MasaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://perez_recu/", name = "masaResponse")
    public JAXBElement<MasaResponse> createMasaResponse(MasaResponse value) {
        return new JAXBElement<>(_MasaResponse_QNAME, MasaResponse.class, null, value);
    }

}
