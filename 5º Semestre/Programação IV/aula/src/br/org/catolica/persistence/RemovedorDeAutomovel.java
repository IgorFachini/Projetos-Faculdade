package br.org.catolica.persistence;

import br.org.catolica.entity.Automovel;
import br.org.catolica.persistence.dao.AutomovelDAO;
import br.org.catolica.persistence.dao.HibernateAutomovelDao;


public class RemovedorDeAutomovel {

	public static void main(String[] args) {
		AutomovelDAO automovelDao = new HibernateAutomovelDao();

		Automovel auto = new Automovel();
		auto.setId(1L);
		automovelDao.remove(auto);
	}
}
