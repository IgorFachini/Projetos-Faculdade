package br.org.catolicasc.projetoP5.test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.org.catolicasc.projetoP5.dao.*;
import br.org.catolicasc.projetoP5.entity.*;
import br.org.catolicasc.projetoP5.interfaces.Dao;
import br.org.catolicasc.projetoP5.persistence.JpaUtil;
import junit.framework.Assert;

public class AllTest {
	private MarcaDao marcaDao = new MarcaDao();
	private AutomovelDao automovelDao = new AutomovelDao();
	private GrupoDao grupoDao = new GrupoDao();
	private ContatoDao contatoDao = new ContatoDao();
	private ModeloDao modeloDao = new ModeloDao();
	private CidadeDao cidadeDao = new CidadeDao();
	private EnderecoDao enderecoDao = new EnderecoDao();
	private ClienteJuridicoDao clienteJuridico = new ClienteJuridicoDao();
	private ClienteFisicoDao clienteFisico = new ClienteFisicoDao();
	private ProdutoDao produtoDao = new ProdutoDao();
	private ItemPedidoDao itemPedidoDao = new ItemPedidoDao();
	private PedidoDao pedidoDao = new PedidoDao();
	private List<Contato> contatos;
	private List<ItemPedido> pedidos;
	
	@Test
	public void insertTest(){
		Cidade cidade = new Cidade();
		cidade.setNome("Creteriosa");
		salvaComitaTesta(cidadeDao, cidade);
		
		
		Endereco endereco = new Endereco();
		endereco.setCEP("9999-9999");
		endereco.setRua("Cratera 99");
		endereco.setNumero("999");
		endereco.setCidade(cidade);
		salvaComitaTesta(enderecoDao, endereco);
		
		
		//ContatoDao insert Test
		Contato contato = new Contato();
		contato.setNome("Gato Lunar");
		contato.setEmail("gatoLunar@Lunar.lua.et");
		contato.setDataNascimento(new Date(0));
		contato.setEndereco(endereco);
		salvaComitaTesta(contatoDao, contato);
		
		//GrupoDao insert Test
		Grupo grupo = new Grupo();
		grupo.setDescricao("Lunares");
		contatos = new ArrayList<>();
		contatos.add(contato);
		grupo.setContatos(contatos);
		salvaComitaTesta(grupoDao, grupo);
		
		//ClienteJuridicoDao insert Test
		ClienteJuridico clienteRico = new ClienteJuridico();
		clienteRico.setNome("Gato Lunar Rico");
		clienteRico.setCNPJ("9999999");
		salvaComitaTesta(clienteJuridico, clienteRico);
		
		//ClienteJuridicoDao insert Test
		ClienteFisico clientePobre = new ClienteFisico();
		clientePobre.setNome("Gato Lunar Pobre");
		clientePobre.setCPF("6666666");
		salvaComitaTesta(clienteFisico, clientePobre);
		
		//ItemPeido Pedidoinsert Test
		Produto naveCara = new Produto();
		naveCara.setNome("Cruzador");
		naveCara.setDescricao("Nave de batalha com HyperDrive");
		naveCara.setPreco(987654321.123456789);
		salvaComitaTesta(produtoDao, naveCara);
		Produto naveBarata = new Produto();
		naveBarata.setNome("Caranca Espacial");
		naveBarata.setDescricao("Nave de madeira com propulsor a helice");
		naveBarata.setPreco(2.0);
		salvaComitaTesta(produtoDao, naveBarata);
		
		ItemPedido pedidoCaro = new ItemPedido();
		pedidoCaro.setProduto(naveCara);
		salvaComitaTesta(itemPedidoDao, pedidoCaro);
		ItemPedido pedidoBarato = new ItemPedido();
		pedidoBarato.setProduto(naveBarata);
		salvaComitaTesta(itemPedidoDao, pedidoBarato);
		
		
		Pedido pedidoComum = new Pedido();
		pedidoComum.setClienteFisico(clientePobre);
		pedidos = new ArrayList<>();
		pedidos.add(pedidoBarato);
		pedidoComum.setPedidos(pedidos);
		salvaComitaTesta(pedidoDao, pedidoComum);
		
		Pedido pedidoVIP = new Pedido();
		pedidoVIP.setClienteJuridico(clienteRico);
		pedidos = new ArrayList<>();
		pedidos.add(pedidoCaro);
		pedidoVIP.setPedidos(pedidos);
		salvaComitaTesta(pedidoDao, pedidoVIP);
		
		
		
		
		
		//MarcaDao insert Test
		Marca marca = new Marca();
		marca.setNome("Fiat");
		Modelo modelo = new Modelo();
		modelo.setNome("Palio");
		modelo.setMontadora(marca);
		marca.addModelo(modelo);	
		salvaComitaTesta(marcaDao, marca);
		
		//=======================================
		listaContato();
		listaGrupo();
		listaCliente();
		listaPedido();
		//listaMarcaModelo();
		
		
		
	}
	
	public <T> void salvaComitaTesta(Dao<T> dao,T classe){
		JpaUtil.getEntityManager().getTransaction().begin();
		dao.salva(classe);
		JpaUtil.getEntityManager().getTransaction().commit();
		Assert.assertFalse(dao.listaTodos().isEmpty());
	}
	
	public void editTest(){
		
		
	}
	
	public void removeTest(){
		
	}

	private void listaMarcaModelo() {
		System.out.println("listaMarcaModelo");
		for (Marca mar : this.marcaDao.listaTodos()) {
			System.out.println("======================");
			System.out.println(mar.getNome());
			for (Modelo mod : mar.getModelos()) {
				System.out.println(mod.getNome());
			}
		}
		System.out.println("----------------------");
	}
	
	private void listaContato(){
		System.out.println("listaContato");
		for(Contato con : this.contatoDao.listaTodos()){
			System.out.println("======================");
			System.out.println("Nome:" + con.getNome());
			System.out.println("Cidade: " + con.getEndereco().getCidade().getNome());
			System.out.println("Endereco - CEP: " + con.getEndereco().getCEP());
			System.out.println("Rua: " + con.getEndereco().getRua());
			System.out.println("Numero: " + con.getEndereco().getNumero());
			
		}
		System.out.println("----------------------");
	}
	
	private void listaGrupo(){
		System.out.println("AllTest.listaGrupo()");
		for(Grupo gru : this.grupoDao.listaTodos()){
			System.out.println("======================");
			System.out.println("Nome: " + gru.getDescricao());
			System.out.println("Integrantes:");
			for(Contato con: gru.getContatos()){
				System.out.println(con.getNome());
			}
		}
		System.out.println("----------------------");
	}
	
	private void listaCliente(){
		System.out.println("AllTest.listaCliente()");
		System.out.println("Juridicos");
		for(ClienteJuridico cj : this.clienteJuridico.listaTodos()){
			System.out.println("======================");
			System.out.println("Nome: " + cj.getNome());
			System.out.println("CNPJ: " + cj.getCNPJ());
		}
		System.out.println("=-=-=-=-=-=-=-=-=");
		System.out.println("Fisicos");
		for(ClienteFisico cf : this.clienteFisico.listaTodos()){
			System.out.println("======================");
			System.out.println("Nome: " + cf.getNome());
			System.out.println("CPF: " + cf.getCPF());
		}
		System.out.println("----------------------");
	}
	
	public void listaPedido(){
		System.out.println("AllTest.listaPedido()");
		for(Pedido ped : this.pedidoDao.listaTodos()){
			System.out.println("======================");
			if(ped.getClienteFisico() != null){
				System.out.println("Cliente: " + ped.getClienteFisico().getNome());
			}else{
				System.out.println("Cliente: " + ped.getClienteJuridico().getNome());
			}
			
			
			
			System.out.println("-Pedidos-");
			for(ItemPedido itp: ped.getPedidos()){
				System.out.println("Nome: " + itp.getProduto().getNome());
				System.out.println("Descrição: " + itp.getProduto().getDescricao());
				System.out.println("Preco: R$:" + itp.getProduto().getPreco());
			}
		}
		System.out.println("----------------------");
	}
	
}
