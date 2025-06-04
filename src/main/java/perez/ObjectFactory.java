
package perez;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the perez package. 
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

    private static final QName _Hello_QNAME = new QName("http://perez/", "hello");
    private static final QName _HelloResponse_QNAME = new QName("http://perez/", "helloResponse");
    private static final QName _Parcial_QNAME = new QName("http://perez/", "parcial");
    private static final QName _ParcialResponse_QNAME = new QName("http://perez/", "parcialResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: perez
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
     * Create an instance of {@link Parcial }
     * 
     * @return
     *     the new instance of {@link Parcial }
     */
    public Parcial createParcial() {
        return new Parcial();
    }

    /**
     * Create an instance of {@link ParcialResponse }
     * 
     * @return
     *     the new instance of {@link ParcialResponse }
     */
    public ParcialResponse createParcialResponse() {
        return new ParcialResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://perez/", name = "hello")
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
    @XmlElementDecl(namespace = "http://perez/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parcial }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Parcial }{@code >}
     */
    @XmlElementDecl(namespace = "http://perez/", name = "parcial")
    public JAXBElement<Parcial> createParcial(Parcial value) {
        return new JAXBElement<>(_Parcial_QNAME, Parcial.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParcialResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ParcialResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://perez/", name = "parcialResponse")
    public JAXBElement<ParcialResponse> createParcialResponse(ParcialResponse value) {
        return new JAXBElement<>(_ParcialResponse_QNAME, ParcialResponse.class, null, value);
    }

}
