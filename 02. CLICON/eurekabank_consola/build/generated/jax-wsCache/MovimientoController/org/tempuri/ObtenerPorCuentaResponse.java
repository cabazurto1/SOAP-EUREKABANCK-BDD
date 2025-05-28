
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ec_edu_monster.ArrayOfMovimiento;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObtenerPorCuentaResult" type="{http://schemas.datacontract.org/2004/07/ec.edu.monster.modelo}ArrayOfMovimiento" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "obtenerPorCuentaResult"
})
@XmlRootElement(name = "ObtenerPorCuentaResponse")
public class ObtenerPorCuentaResponse {

    @XmlElementRef(name = "ObtenerPorCuentaResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMovimiento> obtenerPorCuentaResult;

    /**
     * Obtiene el valor de la propiedad obtenerPorCuentaResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMovimiento }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMovimiento> getObtenerPorCuentaResult() {
        return obtenerPorCuentaResult;
    }

    /**
     * Define el valor de la propiedad obtenerPorCuentaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMovimiento }{@code >}
     *     
     */
    public void setObtenerPorCuentaResult(JAXBElement<ArrayOfMovimiento> value) {
        this.obtenerPorCuentaResult = value;
    }

}
