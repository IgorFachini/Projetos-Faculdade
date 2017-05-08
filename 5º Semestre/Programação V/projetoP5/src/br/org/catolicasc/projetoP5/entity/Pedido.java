package br.org.catolicasc.projetoP5.entity;


import java.util.List;

import javax.persistence.*;

import br.org.catolicasc.projetoP5.interfaces.Bean;

@Entity
public class Pedido implements Bean{
	@Id @GeneratedValue
	private Long id;
	
	@OneToOne
	private ClienteFisico clienteFisico;
	
	@OneToOne
	private ClienteJuridico clienteJuridico;

	@OneToMany(cascade = CascadeType.ALL)
	private List<ItemPedido> pedidos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ClienteFisico getClienteFisico() {
		return clienteFisico;
	}

	public void setClienteFisico(ClienteFisico clienteFisico) {
		this.clienteFisico = clienteFisico;
	}

	public ClienteJuridico getClienteJuridico() {
		return clienteJuridico;
	}

	public void setClienteJuridico(ClienteJuridico clienteJuridico) {
		this.clienteJuridico = clienteJuridico;
	}

	public List<ItemPedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<ItemPedido> pedidos) {
		this.pedidos = pedidos;
	}

	
}
