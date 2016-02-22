package com.gestorvisitas.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "tipo")
public class Tipo {
    private Integer tipCodigo;

    private Integer mtiCodigo;

    private Integer tipEstado;

    private String tipNombre;

    private String tipDescripcion;

    private Date tipFecAlta;

    private Date tipFecBaja;

    private Date tipFecModificacion;

    private Integer tipUsuAlta;

    private Integer tipUsuBaja;

    private Integer tipUsuModificacion;

    public Integer getTipCodigo() {
        return tipCodigo;
    }
    @XmlElement
    public void setTipCodigo(Integer tipCodigo) {
        this.tipCodigo = tipCodigo;
    }

    public Integer getMtiCodigo() {
        return mtiCodigo;
    }
    @XmlElement
    public void setMtiCodigo(Integer mtiCodigo) {
        this.mtiCodigo = mtiCodigo;
    }

    public Integer getTipEstado() {
        return tipEstado;
    }
    @XmlElement
    public void setTipEstado(Integer tipEstado) {
        this.tipEstado = tipEstado;
    }

    public String getTipNombre() {
        return tipNombre;
    }
    @XmlElement
    public void setTipNombre(String tipNombre) {
        this.tipNombre = tipNombre;
    }

    public String getTipDescripcion() {
        return tipDescripcion;
    }
    @XmlElement
    public void setTipDescripcion(String tipDescripcion) {
        this.tipDescripcion = tipDescripcion;
    }

    public Date getTipFecAlta() {
        return tipFecAlta;
    }
    @XmlElement
    public void setTipFecAlta(Date tipFecAlta) {
        this.tipFecAlta = tipFecAlta;
    }

    public Date getTipFecBaja() {
        return tipFecBaja;
    }
    @XmlElement
    public void setTipFecBaja(Date tipFecBaja) {
        this.tipFecBaja = tipFecBaja;
    }

    public Date getTipFecModificacion() {
        return tipFecModificacion;
    }
    @XmlElement
    public void setTipFecModificacion(Date tipFecModificacion) {
        this.tipFecModificacion = tipFecModificacion;
    }

    public Integer getTipUsuAlta() {
        return tipUsuAlta;
    }
    @XmlElement
    public void setTipUsuAlta(Integer tipUsuAlta) {
        this.tipUsuAlta = tipUsuAlta;
    }

    public Integer getTipUsuBaja() {
        return tipUsuBaja;
    }
    @XmlElement
    public void setTipUsuBaja(Integer tipUsuBaja) {
        this.tipUsuBaja = tipUsuBaja;
    }

    public Integer getTipUsuModificacion() {
        return tipUsuModificacion;
    }
    @XmlElement
    public void setTipUsuModificacion(Integer tipUsuModificacion) {
        this.tipUsuModificacion = tipUsuModificacion;
    }
}