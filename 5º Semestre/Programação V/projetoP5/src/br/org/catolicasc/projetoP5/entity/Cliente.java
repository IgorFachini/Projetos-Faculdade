package br.org.catolicasc.projetoP5.entity;

import javax.persistence.*;


import br.org.catolicasc.projetoP5.interfaces.Bean;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Cliente")
public class Cliente implements Bean {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
