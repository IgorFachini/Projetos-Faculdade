package br.org.catolicasc.projetoP5.entity;

import javax.persistence.*;

@Entity
@DiscriminatorColumn(name = "ClienteJuridico")
public class ClienteJuridico extends Cliente{
	
	private String CNPJ;

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	
	
	

}
