package br.org.catolica.persistence;

import java.util.Date;
import java.util.List;

import br.org.catolica.entity.Automovel;
import br.org.catolica.interfaces.AutomovelDAO;
import br.org.catolica.persistence.dao.HibernateAutomovelDao;

public class ListadorDeAutomovel {

	public static void main(String[] args) {
		
		AutomovelDAO automovelDao = new HibernateAutomovelDao();
		Automovel auto = new Automovel();
		auto.setAnoFabricacao(2015);
		auto.setAnoModelo(2015);
		auto.setMarca("Audi");
		auto.setModelo("A3 Sedan");
		auto.setDescricao("bata");
		auto.setDataCadastro(new Date());
		
		
		automovelDao.salva(auto);
		
		List<Automovel> autos = automovelDao.lista();
		for (Automovel automovel : autos) {
			System.out.println("ID do automovel: " + automovel.getId());
		}
	}
}
