
package org.datacontract.schemas._2004._07.ec_edu_monster;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfMovimiento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMovimiento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Movimiento" type="{http://schemas.datacontract.org/2004/07/ec.edu.monster.modelo}Movimiento" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMovimiento", propOrder = {
    "movimiento"
})
public class ArrayOfMovimiento {

    @XmlElement(name = "Movimiento", nillable = true)
    protected List<Movimiento> movimiento;

    /**
     * Gets the value of the movimiento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the movimiento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMovimiento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Movimiento }
     * 
     * 
     */
    public List<Movimiento> getMovimiento() {
        if (movimiento == null) {
            movimiento = new ArrayList<Movimiento>();
        }
        return this.movimiento;
    }

}
