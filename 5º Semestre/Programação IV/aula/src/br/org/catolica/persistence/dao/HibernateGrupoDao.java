package br.org.catolica.persistence.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.org.catolica.entity.Grupo;
import br.org.catolica.interfaces.GrupoDAO;
import br.org.catolica.persistence.JpaUtil;

public class HibernateGrupoDao implements GrupoDAO {

	private EntityManager em = JpaUtil.createEntityManager();
	
	
	@Override
	public void salva(Grupo a) {
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
	}

	@Override
	public List<Grupo> lista() {
		return em.
				createQuery("select a from Grupo a", Grupo.class).getResultList();
	}

	@Override
	public void remove(Grupo a) {
		em.getTransaction().begin();
		Grupo reference = em.getReference(Grupo.class, a.getId());
		em.remove(reference);
		em.getTransaction().commit();
	}

	@Override
	public void atualiza(Grupo a) {
		em.getTransaction().begin();
		em.merge(a);
		em.getTransaction().commit();		
	}

	@Override
	public Grupo buscaId(Long id) {		
		return em.find(Grupo.class, id);
	}
	
	

}
