package br.com.scr.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import br.com.scr.model.Cliente;
import br.com.scr.model.Pedido;
import br.com.scr.util.PersistenceManager;

public class GenericDAO  {

	private EntityManager em;
	private EntityManagerFactory emf;

	public GenericDAO() {
		emf = Persistence.createEntityManagerFactory("scr");
		em = PersistenceManager.instance.getEntityManager();
	}

	public void salvar(Cliente cliente) {
		em.getTransaction().begin(); 
		em.merge(cliente);
		em.getTransaction().commit();
		em.close();
	}

	public void salvar(Pedido pedido) {
		em.getTransaction().begin(); 
		em.persist(pedido);
		em.getTransaction().commit();
		em.close();
	}

	public List<Cliente> findAll() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Cliente> cq = cb.createQuery(Cliente.class);
		Root<Cliente> root = cq.from(Cliente.class);
		cq.select(root);
		TypedQuery<Cliente> query = em.createQuery(cq);

		return query.getResultList();
	}

	public Cliente find (Long pk) {

		Cliente	cliente = em.find(Cliente.class, pk);
		em.getTransaction().begin();
		em.getTransaction().commit();
		//em.close();

		return cliente;
	}

	public List<Pedido> findAllPedidos(Long cliente_pedido) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Pedido> cq = cb.createQuery(Pedido.class);
		Root<Pedido> pedido = cq.from(Pedido.class);

		cq.select(pedido).where(cb.equal(pedido.get("fkCliente"), cliente_pedido));
		TypedQuery<Pedido> query = em.createQuery(cq);

		return query.getResultList();
    }

	public List<Pedido> findAllPedidos() {
		//em.getTransaction().begin();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Pedido> cq = cb.createQuery(Pedido.class);
		Root<Pedido> pedido = cq.from(Pedido.class);
		cq.select(pedido);
		TypedQuery<Pedido> query = em.createQuery(cq);

		return query.getResultList();
    }

    public List<String> verificarNome() {
	
    	CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Cliente> cliente = cq.from(Cliente.class);
		
		cq.select(cliente.<String>get("nome"));
		TypedQuery<String> query = em.createQuery(cq);
		
		//List<String> nome = (List<String>) typedQuery.getResultList();

		
		return query.getResultList();
	}

	
	
	public static void main(String[] args) {

		 List<String> findAllPedidos = new GenericDAO().verificarNome();
         
		 for (String pedido : findAllPedidos) {
			 System.out.println(pedido);	
		 }
		 
		 
		 
	
	}
	}