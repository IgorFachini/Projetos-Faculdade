package br.org.catolicasc.projetoP5.entity;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import br.org.catolicasc.projetoP5.interfaces.Bean;

@Cacheable
@Entity
public class Endereco implements Bean{
	@Id
	@GeneratedValue
	private Long id;
	
	private String rua;
	
	private String numero;
	
	private String CEP;
	
	@OneToOne()
	private Cidade cidade;
	
	//@OneToMany(mappedBy="endereco", cascade = CascadeType.ALL)
	@OneToMany(cascade = CascadeType.ALL)
	private List<Contato> contatos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	
	
	
}
