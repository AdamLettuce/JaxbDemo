
package pl.adamlettuce.xmlobjects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xmlobjects package.
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

    private final static QName _Operations_QNAME = new QName("", "operations");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xmlobjects
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Operation }
     * 
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link Operations }
     * 
     */
    public Operations createOperations() {
        return new Operations();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "operations")
    public JAXBElement<Operations> createOperations(Operations value) {
        return new JAXBElement<Operations>(_Operations_QNAME, Operations.class, null, value);
    }

}
