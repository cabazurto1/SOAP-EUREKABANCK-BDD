
package org.datacontract.schemas._2004._07.ec_edu_monster;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.ec_edu_monster package. 
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

    private final static QName _ArrayOfMovimiento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ec.edu.monster.modelo", "ArrayOfMovimiento");
    private final static QName _Movimiento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ec.edu.monster.modelo", "Movimiento");
    private final static QName _MovimientoAccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ec.edu.monster.modelo", "Accion");
    private final static QName _MovimientoCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/ec.edu.monster.modelo", "Cuenta");
    private final static QName _MovimientoTipo_QNAME = new QName("http://schemas.datacontract.org/2004/07/ec.edu.monster.modelo", "Tipo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.ec_edu_monster
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfMovimiento }
     * 
     */
    public ArrayOfMovimiento createArrayOfMovimiento() {
        return new ArrayOfMovimiento();
    }

    /**
     * Create an instance of {@link Movimiento }
     * 
     */
    public Movimiento createMovimiento() {
        return new Movimiento();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimiento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimiento }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ec.edu.monster.modelo", name = "ArrayOfMovimiento")
    public JAXBElement<ArrayOfMovimiento> createArrayOfMovimiento(ArrayOfMovimiento value) {
        return new JAXBElement<ArrayOfMovimiento>(_ArrayOfMovimiento_QNAME, ArrayOfMovimiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Movimiento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Movimiento }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ec.edu.monster.modelo", name = "Movimiento")
    public JAXBElement<Movimiento> createMovimiento(Movimiento value) {
        return new JAXBElement<Movimiento>(_Movimiento_QNAME, Movimiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ec.edu.monster.modelo", name = "Accion", scope = Movimiento.class)
    public JAXBElement<String> createMovimientoAccion(String value) {
        return new JAXBElement<String>(_MovimientoAccion_QNAME, String.class, Movimiento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ec.edu.monster.modelo", name = "Cuenta", scope = Movimiento.class)
    public JAXBElement<String> createMovimientoCuenta(String value) {
        return new JAXBElement<String>(_MovimientoCuenta_QNAME, String.class, Movimiento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ec.edu.monster.modelo", name = "Tipo", scope = Movimiento.class)
    public JAXBElement<String> createMovimientoTipo(String value) {
        return new JAXBElement<String>(_MovimientoTipo_QNAME, String.class, Movimiento.class, value);
    }

}
