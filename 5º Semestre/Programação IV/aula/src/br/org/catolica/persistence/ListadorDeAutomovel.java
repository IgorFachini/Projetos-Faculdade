package br.org.catolica.persistence;

import java.util.List;

import br.org.catolica.entity.Automovel;
import br.org.catolica.persistence.dao.AutomovelDAO;
import br.org.catolica.persistence.dao.HibernateAutomovelDao;

public class ListadorDeAutomovel {

	public static void main(String[] args) {
		
		AutomovelDAO automovelDao = new HibernateAutomovelDao();
		List<Automovel> autos = automovelDao.lista();
		for (Automovel automovel : autos) {
			System.out.println("ID do automovel: " + automovel.getId());
		}
	}
}
