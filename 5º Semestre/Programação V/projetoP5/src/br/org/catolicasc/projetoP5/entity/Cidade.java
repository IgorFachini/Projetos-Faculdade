package br.org.catolicasc.projetoP5.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.org.catolicasc.projetoP5.interfaces.Bean;

@Entity
public class Cidade implements Bean{
	
	@Id
	@GeneratedValue
	private Long id;
	
	//@OneToMany(mappedBy="endereco", cascade = CascadeType.ALL)
	@OneToMany(cascade = CascadeType.ALL)
	private List<Endereco> enderecos;
	
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
	public List<Endereco> getEnderecos() {
		return enderecos;
	}
	public void setEndereco(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	
	
}
