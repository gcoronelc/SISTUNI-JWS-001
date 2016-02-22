package com.gestorvisitas.model;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "rol")
public class Rol {
    private Integer rolCodigo;

    private Integer rolEstado;

    private String rolNombre;

    private String rolDescripcion;

    private Date rolFecAlta;

    private Date rolFecBaja;

    private Date rolFecModificacion;

    private Integer rolUsuAlta;

    private Integer rolUsuBaja;

    private Integer rolUsuModificacion;

    public Integer getRolCodigo() {
        return rolCodigo;
    }
    @XmlElement
    public void setRolCodigo(Integer rolCodigo) {
        this.rolCodigo = rolCodigo;
    }

    public Integer getRolEstado() {
        return rolEstado;
    }
    @XmlElement
    public void setRolEstado(Integer rolEstado) {
        this.rolEstado = rolEstado;
    }

    public String getRolNombre() {
        return rolNombre;
    }
    @XmlElement
    public void setRolNombre(String rolNombre) {
        this.rolNombre = rolNombre;
    }

    public String getRolDescripcion() {
        return rolDescripcion;
    }
    @XmlElement
    public void setRolDescripcion(String rolDescripcion) {
        this.rolDescripcion = rolDescripcion;
    }

    public Date getRolFecAlta() {
        return rolFecAlta;
    }
    @XmlElement
    public void setRolFecAlta(Date rolFecAlta) {
        this.rolFecAlta = rolFecAlta;
    }

    public Date getRolFecBaja() {
        return rolFecBaja;
    }
    @XmlElement
    public void setRolFecBaja(Date rolFecBaja) {
        this.rolFecBaja = rolFecBaja;
    }

    public Date getRolFecModificacion() {
        return rolFecModificacion;
    }
    @XmlElement
    public void setRolFecModificacion(Date rolFecModificacion) {
        this.rolFecModificacion = rolFecModificacion;
    }

    public Integer getRolUsuAlta() {
        return rolUsuAlta;
    }
    @XmlElement
    public void setRolUsuAlta(Integer rolUsuAlta) {
        this.rolUsuAlta = rolUsuAlta;
    }

    public Integer getRolUsuBaja() {
        return rolUsuBaja;
    }
    @XmlElement
    public void setRolUsuBaja(Integer rolUsuBaja) {
        this.rolUsuBaja = rolUsuBaja;
    }

    public Integer getRolUsuModificacion() {
        return rolUsuModificacion;
    }
    @XmlElement
    public void setRolUsuModificacion(Integer rolUsuModificacion) {
        this.rolUsuModificacion = rolUsuModificacion;
    }
}