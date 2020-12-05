package br.com.scr.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.scr.model.Cliente;
import br.com.scr.util.PersistenceManager;

public class GenericDAO  {

	  private EntityManager manager;
	  private EntityManagerFactory factory;
	  
	  public GenericDAO() {
		  factory = Persistence.createEntityManagerFactory("scr");
		  manager = PersistenceManager.instance.getEntityManager();
      }
	  
	 public void salvar(Cliente cliente) {
		  manager.getTransaction().begin(); 
		  manager.persist(cliente);
		  manager.getTransaction().commit();
		  manager.close();
		 
	}

}