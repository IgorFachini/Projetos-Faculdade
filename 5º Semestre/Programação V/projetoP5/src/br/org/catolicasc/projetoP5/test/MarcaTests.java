package br.org.catolicasc.projetoP5.test;

import junit.framework.*;

import org.junit.Test;

import com.sun.org.glassfish.external.statistics.Statistic;

import br.org.catolicasc.projetoP5.dao.MarcaDao;
import br.org.catolicasc.projetoP5.entity.Marca;
import br.org.catolicasc.projetoP5.entity.Modelo;
import br.org.catolicasc.projetoP5.persistence.JpaUtil;

public class MarcaTests {
	
	private MarcaDao marcaDao = new MarcaDao();
	
	@Test
	public void insertTest(){
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
		
		
		listaMarcaModelo();
		
		
		
	}

	private void listaMarcaModelo() {
		for (Marca mar : this.marcaDao.listaTodos()) {
			System.out.println(mar.getNome());
			for (Modelo mod : mar.getModelos()) {
				System.out.println(mod.getNome());
			}
		}
	}

}
