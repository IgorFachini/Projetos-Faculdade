package br.org.catolica.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

	private static EntityManagerFactory emf = 
			Persistence
			.createEntityManagerFactory("default");

	public static EntityManager createEntityManager() {
		return emf.createEntityManager();
	}
	
	public static void main(String[] args) {
		JpaUtil.createEntityManager();
	}
}
