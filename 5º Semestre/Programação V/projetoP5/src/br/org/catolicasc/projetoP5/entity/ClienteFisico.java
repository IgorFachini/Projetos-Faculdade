package br.org.catolicasc.projetoP5.entity;

import javax.persistence.*;

@Entity
@DiscriminatorColumn(name = "ClienteFisico")
public class ClienteFisico extends Cliente{
	
	private String CPF;
	
	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

}
