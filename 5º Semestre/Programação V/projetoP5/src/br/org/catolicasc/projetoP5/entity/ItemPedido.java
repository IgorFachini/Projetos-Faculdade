package br.org.catolicasc.projetoP5.entity;


import javax.persistence.*;

import br.org.catolicasc.projetoP5.interfaces.Bean;

@Entity
public class ItemPedido implements Bean{
	@Id @GeneratedValue
	private Long id;
	
	@OneToOne
	private Produto produto;

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
