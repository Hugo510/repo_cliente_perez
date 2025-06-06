
package perez_recu;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para masa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="masa">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="densidad" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="volumen" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "masa", propOrder = {
    "densidad",
    "volumen"
})
public class Masa {

    protected double densidad;
    protected double volumen;

    /**
     * Obtiene el valor de la propiedad densidad.
     * 
     */
    public double getDensidad() {
        return densidad;
    }

    /**
     * Define el valor de la propiedad densidad.
     * 
     */
    public void setDensidad(double value) {
        this.densidad = value;
    }

    /**
     * Obtiene el valor de la propiedad volumen.
     * 
     */
    public double getVolumen() {
        return volumen;
    }

    /**
     * Define el valor de la propiedad volumen.
     * 
     */
    public void setVolumen(double value) {
        this.volumen = value;
    }

}
