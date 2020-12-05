package br.com.scr.telas;

import javax.persistence.EntityManager;

import br.com.scr.model.Cliente;
import br.com.scr.util.PersistenceManager;

public class Banco {

	
	  public static void main(String[] args) {
	 
	  Cliente cliente = new Cliente(); cliente.setNome("Diego Maradona");
	  
	  //EntityManagerFactory factory = Persistence.createEntityManagerFactory("scr");
	  EntityManager manager = PersistenceManager.instance.getEntityManager();
	  
	  manager.getTransaction().begin(); 
	  manager.persist(cliente);
	  manager.getTransaction().commit();
	  
	  System.out.println("ID do Cliente: " + cliente.getIdentificador());
	  
	  manager.close();
	  
	  //PersitenceManager.instance.close();
	  
	  }
	 
}
