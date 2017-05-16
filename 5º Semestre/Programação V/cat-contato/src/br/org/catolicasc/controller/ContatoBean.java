package br.org.catolicasc.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.org.catolicasc.dao.ContatoDao;
import br.org.catolicasc.entity.Contato;

@ManagedBean
public class ContatoBean {

	private Contato contato = new Contato();
	private ContatoDao contatoDao = new ContatoDao();

	public List<Contato> getContatos() {
		return this.contatoDao.listaTodos();
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public String salva() {
		this.contatoDao.salva(this.contato);
		this.contato = new Contato();
		return "listaContatos.xhtml?faces-redirect=true";
	}

	public void exclui(Contato contato) {
		this.contatoDao.remove(contato);
	}

	public String edita(Contato contato) {
		this.contato = contato;
		return "cadastraContatos.xhtml";

	}

}
