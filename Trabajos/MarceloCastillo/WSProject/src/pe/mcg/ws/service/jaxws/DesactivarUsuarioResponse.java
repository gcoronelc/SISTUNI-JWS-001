
package pe.mcg.ws.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.18
 * Sun Feb 21 11:12:27 COT 2016
 * Generated source version: 2.7.18
 */

@XmlRootElement(name = "desactivarUsuarioResponse", namespace = "service.ws.mcg.pe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "desactivarUsuarioResponse", namespace = "service.ws.mcg.pe")

public class DesactivarUsuarioResponse {

    @XmlElement(name = "return")
    private boolean _return;

    public boolean getReturn() {
        return this._return;
    }

    public void setReturn(boolean new_return)  {
        this._return = new_return;
    }

}

