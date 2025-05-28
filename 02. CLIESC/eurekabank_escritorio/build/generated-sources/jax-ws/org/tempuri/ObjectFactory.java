
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.ec_edu_monster.ArrayOfMovimiento;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _ObtenerPorCuentaCuenta_QNAME = new QName("http://tempuri.org/", "cuenta");
    private final static QName _ObtenerPorCuentaResponseObtenerPorCuentaResult_QNAME = new QName("http://tempuri.org/", "ObtenerPorCuentaResult");
    private final static QName _RegistrarDepositoResponseRegistrarDepositoResult_QNAME = new QName("http://tempuri.org/", "RegistrarDepositoResult");
    private final static QName _RegistrarRetiroResponseRegistrarRetiroResult_QNAME = new QName("http://tempuri.org/", "RegistrarRetiroResult");
    private final static QName _RegistrarTransferenciaCuentaOrigen_QNAME = new QName("http://tempuri.org/", "cuentaOrigen");
    private final static QName _RegistrarTransferenciaCuentaDestino_QNAME = new QName("http://tempuri.org/", "cuentaDestino");
    private final static QName _RegistrarTransferenciaResponseRegistrarTransferenciaResult_QNAME = new QName("http://tempuri.org/", "RegistrarTransferenciaResult");
    private final static QName _LoginUsername_QNAME = new QName("http://tempuri.org/", "username");
    private final static QName _LoginPassword_QNAME = new QName("http://tempuri.org/", "password");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerPorCuenta }
     * 
     */
    public ObtenerPorCuenta createObtenerPorCuenta() {
        return new ObtenerPorCuenta();
    }

    /**
     * Create an instance of {@link ObtenerPorCuentaResponse }
     * 
     */
    public ObtenerPorCuentaResponse createObtenerPorCuentaResponse() {
        return new ObtenerPorCuentaResponse();
    }

    /**
     * Create an instance of {@link RegistrarDeposito }
     * 
     */
    public RegistrarDeposito createRegistrarDeposito() {
        return new RegistrarDeposito();
    }

    /**
     * Create an instance of {@link RegistrarDepositoResponse }
     * 
     */
    public RegistrarDepositoResponse createRegistrarDepositoResponse() {
        return new RegistrarDepositoResponse();
    }

    /**
     * Create an instance of {@link RegistrarRetiro }
     * 
     */
    public RegistrarRetiro createRegistrarRetiro() {
        return new RegistrarRetiro();
    }

    /**
     * Create an instance of {@link RegistrarRetiroResponse }
     * 
     */
    public RegistrarRetiroResponse createRegistrarRetiroResponse() {
        return new RegistrarRetiroResponse();
    }

    /**
     * Create an instance of {@link RegistrarTransferencia }
     * 
     */
    public RegistrarTransferencia createRegistrarTransferencia() {
        return new RegistrarTransferencia();
    }

    /**
     * Create an instance of {@link RegistrarTransferenciaResponse }
     * 
     */
    public RegistrarTransferenciaResponse createRegistrarTransferenciaResponse() {
        return new RegistrarTransferenciaResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "cuenta", scope = ObtenerPorCuenta.class)
    public JAXBElement<String> createObtenerPorCuentaCuenta(String value) {
        return new JAXBElement<String>(_ObtenerPorCuentaCuenta_QNAME, String.class, ObtenerPorCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimiento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimiento }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ObtenerPorCuentaResult", scope = ObtenerPorCuentaResponse.class)
    public JAXBElement<ArrayOfMovimiento> createObtenerPorCuentaResponseObtenerPorCuentaResult(ArrayOfMovimiento value) {
        return new JAXBElement<ArrayOfMovimiento>(_ObtenerPorCuentaResponseObtenerPorCuentaResult_QNAME, ArrayOfMovimiento.class, ObtenerPorCuentaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "cuenta", scope = RegistrarDeposito.class)
    public JAXBElement<String> createRegistrarDepositoCuenta(String value) {
        return new JAXBElement<String>(_ObtenerPorCuentaCuenta_QNAME, String.class, RegistrarDeposito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RegistrarDepositoResult", scope = RegistrarDepositoResponse.class)
    public JAXBElement<String> createRegistrarDepositoResponseRegistrarDepositoResult(String value) {
        return new JAXBElement<String>(_RegistrarDepositoResponseRegistrarDepositoResult_QNAME, String.class, RegistrarDepositoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "cuenta", scope = RegistrarRetiro.class)
    public JAXBElement<String> createRegistrarRetiroCuenta(String value) {
        return new JAXBElement<String>(_ObtenerPorCuentaCuenta_QNAME, String.class, RegistrarRetiro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RegistrarRetiroResult", scope = RegistrarRetiroResponse.class)
    public JAXBElement<String> createRegistrarRetiroResponseRegistrarRetiroResult(String value) {
        return new JAXBElement<String>(_RegistrarRetiroResponseRegistrarRetiroResult_QNAME, String.class, RegistrarRetiroResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "cuentaOrigen", scope = RegistrarTransferencia.class)
    public JAXBElement<String> createRegistrarTransferenciaCuentaOrigen(String value) {
        return new JAXBElement<String>(_RegistrarTransferenciaCuentaOrigen_QNAME, String.class, RegistrarTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "cuentaDestino", scope = RegistrarTransferencia.class)
    public JAXBElement<String> createRegistrarTransferenciaCuentaDestino(String value) {
        return new JAXBElement<String>(_RegistrarTransferenciaCuentaDestino_QNAME, String.class, RegistrarTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RegistrarTransferenciaResult", scope = RegistrarTransferenciaResponse.class)
    public JAXBElement<String> createRegistrarTransferenciaResponseRegistrarTransferenciaResult(String value) {
        return new JAXBElement<String>(_RegistrarTransferenciaResponseRegistrarTransferenciaResult_QNAME, String.class, RegistrarTransferenciaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = Login.class)
    public JAXBElement<String> createLoginUsername(String value) {
        return new JAXBElement<String>(_LoginUsername_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = Login.class)
    public JAXBElement<String> createLoginPassword(String value) {
        return new JAXBElement<String>(_LoginPassword_QNAME, String.class, Login.class, value);
    }

}
