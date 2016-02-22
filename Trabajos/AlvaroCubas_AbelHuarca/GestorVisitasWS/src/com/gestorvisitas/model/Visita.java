package com.gestorvisitas.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "visita")
public class Visita extends VisitaKey implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer visEstado;

    private Integer proCodigo;

    private Integer usuCodigo;

    private Integer areCodigo;

    private Integer motCodigo;

    private Integer tipCodigo;

    private Integer visNoVisita;

    private Integer visNumeroLineas;

    private Double visMontoAproximado;

    private String visLatitud;

    private String visLongitud;

    private String visComResponsable;

    private String visComDescripcion;

    private String visContacto;

    private Date visFecInicio;

    private Date visFecFinalizacion;

    private Date visComFecComprometida;

    private Date visFecAlta;

    private Date visFecBaja;

    private Date visFecModificacion;

    private Integer visUsuAlta;

    private Integer visUsuBaja;

    private Integer visUsuModificacion;

    private Integer carCodigo;
    

    public Integer getVisEstado() {
        return visEstado;
    }
    @XmlElement
    public void setVisEstado(Integer visEstado) {
        this.visEstado = visEstado;
    }

    public Integer getProCodigo() {
        return proCodigo;
    }
    @XmlElement
    public void setProCodigo(Integer proCodigo) {
        this.proCodigo = proCodigo;
    }

    public Integer getUsuCodigo() {
        return usuCodigo;
    }
    @XmlElement
    public void setUsuCodigo(Integer usuCodigo) {
        this.usuCodigo = usuCodigo;
    }

    public Integer getAreCodigo() {
        return areCodigo;
    }
    @XmlElement
    public void setAreCodigo(Integer areCodigo) {
        this.areCodigo = areCodigo;
    }

    public Integer getMotCodigo() {
        return motCodigo;
    }
    @XmlElement
    public void setMotCodigo(Integer motCodigo) {
        this.motCodigo = motCodigo;
    }

    public Integer getTipCodigo() {
        return tipCodigo;
    }
    @XmlElement
    public void setTipCodigo(Integer tipCodigo) {
        this.tipCodigo = tipCodigo;
    }

    public Integer getVisNoVisita() {
        return visNoVisita;
    }
    @XmlElement
    public void setVisNoVisita(Integer visNoVisita) {
        this.visNoVisita = visNoVisita;
    }

    public Integer getVisNumeroLineas() {
        return visNumeroLineas;
    }
    @XmlElement
    public void setVisNumeroLineas(Integer visNumeroLineas) {
        this.visNumeroLineas = visNumeroLineas;
    }

    public Double getVisMontoAproximado() {
        return visMontoAproximado;
    }
    @XmlElement
    public void setVisMontoAproximado(Double visMontoAproximado) {
        this.visMontoAproximado = visMontoAproximado;
    }

    public String getVisLatitud() {
        return visLatitud;
    }
    @XmlElement
    public void setVisLatitud(String visLatitud) {
        this.visLatitud = visLatitud;
    }

    public String getVisLongitud() {
        return visLongitud;
    }
    @XmlElement
    public void setVisLongitud(String visLongitud) {
        this.visLongitud = visLongitud;
    }

    public String getVisComResponsable() {
        return visComResponsable;
    }
    @XmlElement
    public void setVisComResponsable(String visComResponsable) {
        this.visComResponsable = visComResponsable;
    }

    public String getVisComDescripcion() {
        return visComDescripcion;
    }
    @XmlElement
    public void setVisComDescripcion(String visComDescripcion) {
        this.visComDescripcion = visComDescripcion;
    }

    public String getVisContacto() {
        return visContacto;
    }
    @XmlElement
    public void setVisContacto(String visContacto) {
        this.visContacto = visContacto;
    }

    public Date getVisFecInicio() {
        return visFecInicio;
    }
    @XmlElement
    public void setVisFecInicio(Date visFecInicio) {
        this.visFecInicio = visFecInicio;
    }

    public Date getVisFecFinalizacion() {
        return visFecFinalizacion;
    }
    @XmlElement
    public void setVisFecFinalizacion(Date visFecFinalizacion) {
        this.visFecFinalizacion = visFecFinalizacion;
    }

    public Date getVisComFecComprometida() {
        return visComFecComprometida;
    }
    @XmlElement
    public void setVisComFecComprometida(Date visComFecComprometida) {
        this.visComFecComprometida = visComFecComprometida;
    }

    public Date getVisFecAlta() {
        return visFecAlta;
    }
    @XmlElement
    public void setVisFecAlta(Date visFecAlta) {
        this.visFecAlta = visFecAlta;
    }

    public Date getVisFecBaja() {
        return visFecBaja;
    }
    @XmlElement
    public void setVisFecBaja(Date visFecBaja) {
        this.visFecBaja = visFecBaja;
    }

    public Date getVisFecModificacion() {
        return visFecModificacion;
    }
    @XmlElement
    public void setVisFecModificacion(Date visFecModificacion) {
        this.visFecModificacion = visFecModificacion;
    }

    public Integer getVisUsuAlta() {
        return visUsuAlta;
    }
    @XmlElement
    public void setVisUsuAlta(Integer visUsuAlta) {
        this.visUsuAlta = visUsuAlta;
    }

    public Integer getVisUsuBaja() {
        return visUsuBaja;
    }
    @XmlElement
    public void setVisUsuBaja(Integer visUsuBaja) {
        this.visUsuBaja = visUsuBaja;
    }

    public Integer getVisUsuModificacion() {
        return visUsuModificacion;
    }
    @XmlElement
    public void setVisUsuModificacion(Integer visUsuModificacion) {
        this.visUsuModificacion = visUsuModificacion;
    }

    public Integer getCarCodigo() {
        return carCodigo;
    }
    @XmlElement
    public void setCarCodigo(Integer carCodigo) {
        this.carCodigo = carCodigo;
    }
	@Override
	public String toString() {
		return "Visita [visEstado=" + visEstado + ", proCodigo=" + proCodigo
				+ ", usuCodigo=" + usuCodigo + ", areCodigo=" + areCodigo
				+ ", motCodigo=" + motCodigo + ", tipCodigo=" + tipCodigo
				+ ", visNoVisita=" + visNoVisita + ", visNumeroLineas="
				+ visNumeroLineas + ", visMontoAproximado="
				+ visMontoAproximado + ", visLatitud=" + visLatitud
				+ ", visLongitud=" + visLongitud + ", visComResponsable="
				+ visComResponsable + ", visComDescripcion="
				+ visComDescripcion + ", visContacto=" + visContacto
				+ ", visFecInicio=" + visFecInicio + ", visFecFinalizacion="
				+ visFecFinalizacion + ", visComFecComprometida="
				+ visComFecComprometida + ", visFecAlta=" + visFecAlta
				+ ", visFecBaja=" + visFecBaja + ", visFecModificacion="
				+ visFecModificacion + ", visUsuAlta=" + visUsuAlta
				+ ", visUsuBaja=" + visUsuBaja + ", visUsuModificacion="
				+ visUsuModificacion + ", carCodigo=" + carCodigo + "]";
	}
	

    
    
    
}