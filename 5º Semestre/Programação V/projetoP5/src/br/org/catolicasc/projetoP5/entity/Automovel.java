package br.org.catolicasc.projetoP5.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.sun.istack.internal.NotNull;

import br.org.catolicasc.projetoP5.interfaces.Bean;

@Entity
public class Automovel implements Bean {

	@Id
	@GeneratedValue
	private Long id;

	private Integer anoFabricacao;

	@ManyToOne
	private Modelo modelo;
	
	
	@ManyToOne
	private Cor cor;

	private Integer anoModelo;

	@NotNull
	private String observacoes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public Integer getAnoModelo() {
		return anoModelo;
	}

}