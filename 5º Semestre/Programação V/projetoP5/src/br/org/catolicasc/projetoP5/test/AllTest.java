package br.org.catolicasc.projetoP5.test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.org.catolicasc.projetoP5.dao.*;
import br.org.catolicasc.projetoP5.entity.*;

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
	private List<Contato> contatos;
	
	@Test
	public void insertTest(){
		JpaUtil.getEntityManager().getTransaction().begin();
		Cidade cidade = new Cidade();
		cidade.setNome("Creteriosa");
		
		this.cidadeDao.salva(cidade);
		JpaUtil.getEntityManager().getTransaction().commit();
		Assert.assertFalse(cidadeDao.listaTodos().isEmpty());
		
		
		JpaUtil.getEntityManager().getTransaction().begin();
		Endereco endereco = new Endereco();
		endereco.setCEP("9999-9999");
		endereco.setRua("Cratera 99");
		endereco.setNumero("999");
		endereco.setCidade(cidade);
		
		this.enderecoDao.salva(endereco);
		JpaUtil.getEntityManager().getTransaction().commit();
		Assert.assertFalse(enderecoDao.listaTodos().isEmpty());
		
		
		//ContatoDao insert Test
		JpaUtil.getEntityManager().getTransaction().begin();
		Contato contato = new Contato();
		contato.setNome("Gato Lunar");
		contato.setEmail("gatoLunar@Lunar.lua.et");
		contato.setDataNascimento(new Date(0));
		contato.setEndereco(endereco);
		
		
		this.contatoDao.salva(contato);
		JpaUtil.getEntityManager().getTransaction().commit();
		Assert.assertFalse(contatoDao.listaTodos().isEmpty());
		
		
		
		//GrupoDao insert Test
		JpaUtil.getEntityManager().getTransaction().begin();
		Grupo grupo = new Grupo();
		grupo.setDescricao("Lunares");
		contatos = new ArrayList<>();
		contatos.add(contato);
		grupo.setContatos(contatos);
		
		this.grupoDao.salva(grupo);
		JpaUtil.getEntityManager().getTransaction().commit();
		Assert.assertFalse(grupoDao.listaTodos().isEmpty());
		
		
		//ClienteJuridicoDao insert Test
		JpaUtil.getEntityManager().getTransaction().begin();
		ClienteJuridico clienteRico = new ClienteJuridico();
		clienteRico.setNome("Gato Lunar Rico");
		clienteRico.setCNPJ("9999999");
		
		this.clienteJuridico.salva(clienteRico);
		JpaUtil.getEntityManager().getTransaction().commit();
		Assert.assertFalse(clienteJuridico.listaTodos().isEmpty());
		
		//ClienteJuridicoDao insert Test
		JpaUtil.getEntityManager().getTransaction().begin();
		ClienteFisico clientePobre = new ClienteFisico();
		clientePobre.setNome("Gato Lunar Pobre");
		clientePobre.setCPF("6666666");
				
		this.clienteFisico.salva(clientePobre);
		JpaUtil.getEntityManager().getTransaction().commit();
		Assert.assertFalse(clienteFisico.listaTodos().isEmpty());
		
		
		
		
		//MarcaDao insert Test
		JpaUtil.getEntityManager().getTransaction().begin();
		Marca marca = new Marca();
		marca.setNome("Fiat");
		
		Modelo modelo = new Modelo();
		modelo.setNome("Palio");
		modelo.setMontadora(marca);
		marca.addModelo(modelo);
		
		this.marcaDao.salva(marca);
		
		
		JpaUtil.getEntityManager().getTransaction().commit();
		Assert.assertFalse(marcaDao.listaTodos().isEmpty());
		
		listaContato();
		listaGrupo();
		listaCliente();
		listaMarcaModelo();
		
		
		
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
	
}
