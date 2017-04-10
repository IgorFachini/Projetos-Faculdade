package br.org.catolica.persistence;

import br.org.catolica.entity.Automovel;
import br.org.catolica.persistence.dao.AutomovelDAO;
import br.org.catolica.persistence.dao.HibernateAutomovelDao;


public class AtualizadorDeAutomovel {

	public static void main(String[] args) {
		
		AutomovelDAO automovelDao = new HibernateAutomovelDao();
		Automovel auto = automovelDao.buscaId(1L);
		auto.setModelo("A3 Sedan SL");
		automovelDao.atualiza(auto);
	}
}
