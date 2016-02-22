package com.gestorvisitas.model;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "cliente")
public class Cliente {
    private String cliRuc;

    private Integer cliEstado;

    private String cliRazonSocial;

    private String cliGerenteGeneral;

    private String cliGerenteCuenta;

    private String cliSectorComercial;

    private String cliLiderVenta;

    private String cliDireccion;

    private String cliTelefono;

    private String cliCorreo;

    private Date cliFecAlta;

    private Date cliFecBaja;

    private Date cliFecModificacion;

    private Integer cliUsuAlta;

    private Integer cliUsuBaja;

    private Integer cliUsuModificacion;

    private String cliNombreComercial;

    private String cliGrupo;

    private String cliDireccionComercial;

    public String getCliRuc() {
        return cliRuc;
    }
    @XmlElement
    public void setCliRuc(String cliRuc) {
        this.cliRuc = cliRuc;
    }

    public Integer getCliEstado() {
        return cliEstado;
    }
    @XmlElement
    public void setCliEstado(Integer cliEstado) {
        this.cliEstado = cliEstado;
    }

    public String getCliRazonSocial() {
        return cliRazonSocial;
    }
    @XmlElement
    public void setCliRazonSocial(String cliRazonSocial) {
        this.cliRazonSocial = cliRazonSocial;
    }

    public String getCliGerenteGeneral() {
        return cliGerenteGeneral;
    }
    @XmlElement
    public void setCliGerenteGeneral(String cliGerenteGeneral) {
        this.cliGerenteGeneral = cliGerenteGeneral;
    }

    public String getCliGerenteCuenta() {
        return cliGerenteCuenta;
    }
    @XmlElement
    public void setCliGerenteCuenta(String cliGerenteCuenta) {
        this.cliGerenteCuenta = cliGerenteCuenta;
    }

    public String getCliSectorComercial() {
        return cliSectorComercial;
    }
    @XmlElement
    public void setCliSectorComercial(String cliSectorComercial) {
        this.cliSectorComercial = cliSectorComercial;
    }

    public String getCliLiderVenta() {
        return cliLiderVenta;
    }
    @XmlElement
    public void setCliLiderVenta(String cliLiderVenta) {
        this.cliLiderVenta = cliLiderVenta;
    }

    public String getCliDireccion() {
        return cliDireccion;
    }
    @XmlElement
    public void setCliDireccion(String cliDireccion) {
        this.cliDireccion = cliDireccion;
    }

    public String getCliTelefono() {
        return cliTelefono;
    }
    @XmlElement
    public void setCliTelefono(String cliTelefono) {
        this.cliTelefono = cliTelefono;
    }

    public String getCliCorreo() {
        return cliCorreo;
    }
    @XmlElement
    public void setCliCorreo(String cliCorreo) {
        this.cliCorreo = cliCorreo;
    }

    public Date getCliFecAlta() {
        return cliFecAlta;
    }
    @XmlElement
    public void setCliFecAlta(Date cliFecAlta) {
        this.cliFecAlta = cliFecAlta;
    }

    public Date getCliFecBaja() {
        return cliFecBaja;
    }
    @XmlElement
    public void setCliFecBaja(Date cliFecBaja) {
        this.cliFecBaja = cliFecBaja;
    }

    public Date getCliFecModificacion() {
        return cliFecModificacion;
    }
    @XmlElement
    public void setCliFecModificacion(Date cliFecModificacion) {
        this.cliFecModificacion = cliFecModificacion;
    }

    public Integer getCliUsuAlta() {
        return cliUsuAlta;
    }
    @XmlElement
    public void setCliUsuAlta(Integer cliUsuAlta) {
        this.cliUsuAlta = cliUsuAlta;
    }

    public Integer getCliUsuBaja() {
        return cliUsuBaja;
    }
    @XmlElement
    public void setCliUsuBaja(Integer cliUsuBaja) {
        this.cliUsuBaja = cliUsuBaja;
    }

    public Integer getCliUsuModificacion() {
        return cliUsuModificacion;
    }
    @XmlElement
    public void setCliUsuModificacion(Integer cliUsuModificacion) {
        this.cliUsuModificacion = cliUsuModificacion;
    }

    public String getCliNombreComercial() {
        return cliNombreComercial;
    }
    @XmlElement
    public void setCliNombreComercial(String cliNombreComercial) {
        this.cliNombreComercial = cliNombreComercial;
    }

    public String getCliGrupo() {
        return cliGrupo;
    }
    @XmlElement
    public void setCliGrupo(String cliGrupo) {
        this.cliGrupo = cliGrupo;
    }

    public String getCliDireccionComercial() {
        return cliDireccionComercial;
    }
    @XmlElement
    public void setCliDireccionComercial(String cliDireccionComercial) {
        this.cliDireccionComercial = cliDireccionComercial;
    }
	@Override
	public String toString() {
		return "Cliente [cliRuc=" + cliRuc + ", cliEstado=" + cliEstado
				+ ", cliRazonSocial=" + cliRazonSocial + ", cliGerenteGeneral="
				+ cliGerenteGeneral + ", cliGerenteCuenta=" + cliGerenteCuenta
				+ ", cliSectorComercial=" + cliSectorComercial
				+ ", cliLiderVenta=" + cliLiderVenta + ", cliDireccion="
				+ cliDireccion + ", cliTelefono=" + cliTelefono
				+ ", cliCorreo=" + cliCorreo + ", cliFecAlta=" + cliFecAlta
				+ ", cliFecBaja=" + cliFecBaja + ", cliFecModificacion="
				+ cliFecModificacion + ", cliUsuAlta=" + cliUsuAlta
				+ ", cliUsuBaja=" + cliUsuBaja + ", cliUsuModificacion="
				+ cliUsuModificacion + ", cliNombreComercial="
				+ cliNombreComercial + ", cliGrupo=" + cliGrupo
				+ ", cliDireccionComercial=" + cliDireccionComercial + "]";
	}
    
    
    
}