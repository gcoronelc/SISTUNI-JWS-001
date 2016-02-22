package com.gestorvisitas.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "clienteVO")
public class ClienteVO{
	private String cliRuc;
	private String cliRazonSocial;
	
	public ClienteVO(){
		
	}

	public String getCliRuc() {
		return cliRuc;
	}
	@XmlElement
	public void setCliRuc(String cliRuc) {
		this.cliRuc = cliRuc;
	}

	public String getCliRazonSocial() {
		return cliRazonSocial;
	}
	@XmlElement
	public void setCliRazonSocial(String cliRazonSocial) {
		this.cliRazonSocial = cliRazonSocial;
	}
	
	

	
	
	
}
