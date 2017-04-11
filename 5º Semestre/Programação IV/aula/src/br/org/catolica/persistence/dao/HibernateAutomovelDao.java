package br.org.catolica.persistence.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.org.catolica.entity.Automovel;
import br.org.catolica.persistence.JpaUtil;

public class HibernateAutomovelDao implements AutomovelDAO {

	private EntityManager em = JpaUtil.createEntityManager();
	
	
	@Override
	public void salva(Automovel a) {
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
	}

	@Override
	public List<Automovel> lista() {
		return em.
				createQuery("select a from Automovel a", Automovel.class).getResultList();
	}

	@Override
	public void remove(Automovel a) {
		em.getTransaction().begin();
		Automovel reference = em.getReference(Automovel.class, a.getId());
		em.remove(reference);
		em.getTransaction().commit();
	}

	@Override
	public void atualiza(Automovel a) {
		em.getTransaction().begin();
		em.merge(a);
		em.getTransaction().commit();		
	}

	@Override
	public Automovel buscaId(Long id) {		
		return em.find(Automovel.class, id);
	}
	
	

}
