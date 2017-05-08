package br.org.catolicasc.projetoP5.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.org.catolicasc.projetoP5.interfaces.Bean;

@Cacheable
@Entity
public class Marca implements Bean {

	@Id
	@GeneratedValue
	private Long id;

	private String nome;

	@OneToMany(mappedBy="montadora", cascade = CascadeType.ALL)
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

	public List<Modelo> getModelos() {
		return modelos;
	}

	public void setModelos(List<Modelo> modelos) {
		this.modelos = modelos;
	}
	
	public void addModelo(Modelo modelo){
		if (this.modelos == null) {
			this.modelos = new ArrayList<Modelo>();
		}
		this.modelos.add(modelo);
	}

}
