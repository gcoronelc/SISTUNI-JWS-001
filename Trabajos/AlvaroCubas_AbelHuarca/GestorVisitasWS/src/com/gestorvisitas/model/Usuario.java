package com.gestorvisitas.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "usuario")
public class Usuario {
    private Integer usuCodigo;

    private Integer rolCodigo;

    private Integer usuJefeCodigo;

    private Integer usuEstado;

    private String usuNombre;

    private String usuCorreo;

    private String usuPassword;

    private Date usuFecAlta;

    private Date usuFecBaja;

    private Date usuFecModificacion;

    private Integer usuUsuBaja;

    private Integer usuUsuAlta;

    private Integer usuUsuModificacion;

    public Integer getUsuCodigo() {
        return usuCodigo;
    }
    @XmlElement
    public void setUsuCodigo(Integer usuCodigo) {
        this.usuCodigo = usuCodigo;
    }

    public Integer getRolCodigo() {
        return rolCodigo;
    }
    @XmlElement
    public void setRolCodigo(Integer rolCodigo) {
        this.rolCodigo = rolCodigo;
    }

    public Integer getUsuJefeCodigo() {
        return usuJefeCodigo;
    }
    @XmlElement
    public void setUsuJefeCodigo(Integer usuJefeCodigo) {
        this.usuJefeCodigo = usuJefeCodigo;
    }

    public Integer getUsuEstado() {
        return usuEstado;
    }
    @XmlElement
    public void setUsuEstado(Integer usuEstado) {
        this.usuEstado = usuEstado;
    }


    public String getUsuNombre() {
        return usuNombre;
    }
    @XmlElement
    public void setUsuNombre(String usuNombre) {
        this.usuNombre = usuNombre;
    }

    public String getUsuCorreo() {
        return usuCorreo;
    }
    @XmlElement
    public void setUsuCorreo(String usuCorreo) {
        this.usuCorreo = usuCorreo;
    }

    public String getUsuPassword() {
        return usuPassword;
    }
    @XmlElement
    public void setUsuPassword(String usuPassword) {
        this.usuPassword = usuPassword;
    }

    public Date getUsuFecAlta() {
        return usuFecAlta;
    }
    @XmlElement
    public void setUsuFecAlta(Date usuFecAlta) {
        this.usuFecAlta = usuFecAlta;
    }

    public Date getUsuFecBaja() {
        return usuFecBaja;
    }
    @XmlElement
    public void setUsuFecBaja(Date usuFecBaja) {
        this.usuFecBaja = usuFecBaja;
    }

    public Date getUsuFecModificacion() {
        return usuFecModificacion;
    }
    @XmlElement
    public void setUsuFecModificacion(Date usuFecModificacion) {
        this.usuFecModificacion = usuFecModificacion;
    }

    public Integer getUsuUsuBaja() {
        return usuUsuBaja;
    }
    @XmlElement
    public void setUsuUsuBaja(Integer usuUsuBaja) {
        this.usuUsuBaja = usuUsuBaja;
    }

    public Integer getUsuUsuAlta() {
        return usuUsuAlta;
    }
    @XmlElement
    public void setUsuUsuAlta(Integer usuUsuAlta) {
        this.usuUsuAlta = usuUsuAlta;
    }

    public Integer getUsuUsuModificacion() {
        return usuUsuModificacion;
    }
    @XmlElement
    public void setUsuUsuModificacion(Integer usuUsuModificacion) {
        this.usuUsuModificacion = usuUsuModificacion;
    }
}