package br.org.catolica.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Marca {

	@Id
	@GeneratedValue
	private Long id;

	private String nome;

	@OneToOne(cascade = CascadeType.ALL)
	private DetalheMarca detalhe;

	@OneToMany(mappedBy="montadora")
	private List<Modelo> modelos;

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

	public DetalheMarca getDetalhe() {
		return detalhe;
	}

	public void setDetalhe(DetalheMarca detalhe) {
		this.detalhe = detalhe;
		detalhe.setMarca(this);
	}

	public List<Modelo> getModelos() {
		return modelos;
	}

	public void setModelos(List<Modelo> modelos) {
		this.modelos = modelos;
	}

}
