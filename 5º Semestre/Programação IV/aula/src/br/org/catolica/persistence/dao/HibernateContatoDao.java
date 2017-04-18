package br.org.catolica.persistence.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.org.catolica.entity.Contato;
import br.org.catolica.interfaces.ContatoDAO;
import br.org.catolica.persistence.JpaUtil;

public class HibernateContatoDao implements ContatoDAO {

	private EntityManager em = JpaUtil.createEntityManager();
	
	
	@Override
	public void salva(Contato a) {
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
	}

	@Override
	public List<Contato> lista() {
		return em.
				createQuery("select a from Contato a", Contato.class).getResultList();
	}

	@Override
	public void remove(Contato a) {
		em.getTransaction().begin();
		Contato reference = em.getReference(Contato.class, a.getId());
		em.remove(reference);
		em.getTransaction().commit();
	}

	@Override
	public void atualiza(Contato a) {
		em.getTransaction().begin();
		em.merge(a);
		em.getTransaction().commit();		
	}

	@Override
	public Contato buscaId(Long id) {		
		return em.find(Contato.class, id);
	}
	
	

}
