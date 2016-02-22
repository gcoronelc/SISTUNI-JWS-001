package com.gestorvisitas.model;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "mtipo")
public class Mtipo {
    private Integer mtiCodigo;

    private Integer mtiEstado;

    private String mtiNombre;

    private String mtiDescripcion;

    private Date mtiFecAlta;

    private Date mtiFecBaja;

    private Date mtiFecModificacion;

    private Integer mtiUsuAlta;

    private Integer mtiUsuBaja;

    private Integer mtiUsuModificacion;

    public Integer getMtiCodigo() {
        return mtiCodigo;
    }
    @XmlElement
    public void setMtiCodigo(Integer mtiCodigo) {
        this.mtiCodigo = mtiCodigo;
    }

    public Integer getMtiEstado() {
        return mtiEstado;
    }
    @XmlElement
    public void setMtiEstado(Integer mtiEstado) {
        this.mtiEstado = mtiEstado;
    }

    public String getMtiNombre() {
        return mtiNombre;
    }
    @XmlElement
    public void setMtiNombre(String mtiNombre) {
        this.mtiNombre = mtiNombre;
    }

    public String getMtiDescripcion() {
        return mtiDescripcion;
    }
    @XmlElement
    public void setMtiDescripcion(String mtiDescripcion) {
        this.mtiDescripcion = mtiDescripcion;
    }

    public Date getMtiFecAlta() {
        return mtiFecAlta;
    }
    @XmlElement
    public void setMtiFecAlta(Date mtiFecAlta) {
        this.mtiFecAlta = mtiFecAlta;
    }

    public Date getMtiFecBaja() {
        return mtiFecBaja;
    }
    @XmlElement
    public void setMtiFecBaja(Date mtiFecBaja) {
        this.mtiFecBaja = mtiFecBaja;
    }

    public Date getMtiFecModificacion() {
        return mtiFecModificacion;
    }
    @XmlElement
    public void setMtiFecModificacion(Date mtiFecModificacion) {
        this.mtiFecModificacion = mtiFecModificacion;
    }

    public Integer getMtiUsuAlta() {
        return mtiUsuAlta;
    }
    @XmlElement
    public void setMtiUsuAlta(Integer mtiUsuAlta) {
        this.mtiUsuAlta = mtiUsuAlta;
    }

    public Integer getMtiUsuBaja() {
        return mtiUsuBaja;
    }
    @XmlElement
    public void setMtiUsuBaja(Integer mtiUsuBaja) {
        this.mtiUsuBaja = mtiUsuBaja;
    }

    public Integer getMtiUsuModificacion() {
        return mtiUsuModificacion;
    }
    @XmlElement
    public void setMtiUsuModificacion(Integer mtiUsuModificacion) {
        this.mtiUsuModificacion = mtiUsuModificacion;
    }
}