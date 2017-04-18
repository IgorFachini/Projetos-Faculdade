package br.org.catolica.testes;

import java.util.Date;
import java.util.List;

import br.org.catolica.entity.Contato;
import br.org.catolica.interfaces.ContatoDAO;
import br.org.catolica.persistence.dao.HibernateContatoDao;

public class ContatoTeste {
	ContatoDAO ContatoDao = new HibernateContatoDao();
	
	
	public static void main(String[] args) {
		
		
	}
	
	public void persiteAutomovel(){
		Contato auto = new Contato();
		
		
		ContatoDao.salva(auto);
	}
	
	public void listarAutomovel(){
		
		List<Contato> autos = ContatoDao.lista();
		for (Contato Contato : autos) {
			System.out.println("ID do Contato: " + Contato.getId());
		}
	}
	
	
			

}
