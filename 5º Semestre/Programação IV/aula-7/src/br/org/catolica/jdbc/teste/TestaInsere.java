package br.org.catolica.jdbc.teste;

import java.util.Calendar;

import br.org.catolica.bean.Contato;
import br.org.catolica.dao.ContatoDao;

public class TestaInsere {

	public static void main(String[] args) {

		Contato contato = new Contato();
		contato.setNome("Leonardo2");
		contato.setEmail("leonardo2.vitazik@catolica.com.br");
		contato.setEndereco("Marechal Deodoro 12345");
		contato.setDataNascimento(Calendar.getInstance());
		ContatoDao dao = new ContatoDao();
		dao.adiciona(contato);
		System.out.println("Gravado!");
	}
}
