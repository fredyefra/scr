package br.com.scr.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public enum PersistenceManager {
	instance;

	private EntityManagerFactory factory;

	private PersistenceManager() {

		factory  = Persistence.createEntityManagerFactory("scr");
	}

	public EntityManager getEntityManager() {
		return factory.createEntityManager();
	} 
	
	public void close() {
		factory.close();
	}
}