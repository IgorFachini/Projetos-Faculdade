package br.org.catolica.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Modelo {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	private Marca montadora;

	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Marca getMontadora() {
		return montadora;
	}

	public void setMontadora(Marca montadora) {
		this.montadora = montadora;
	}

}
