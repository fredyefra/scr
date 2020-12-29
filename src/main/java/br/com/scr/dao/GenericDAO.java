package br.com.scr.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

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
		em.persist(cliente);
		em.getTransaction().commit();
		em.close();

	}

	public void salvar(Pedido pedido) {
		em.getTransaction().begin(); 
		em.persist(pedido);
		em.getTransaction().commit();
		//em.close();

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

	public List<Pedido> findAllPedidos(Long pedido_identificador) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Pedido> cq = cb.createQuery(Pedido.class);
		Root<Pedido> pedido = cq.from(Pedido.class);

		/*
		 * cq.select(pedido).where(cb.equal(pedido.get(Pedido_.cliente),
		 * pedido_identificador));
		 */


		  cq.select(pedido).where(cb.equal(pedido.get("cliente"), pedido_identificador));
		 
		
		TypedQuery<Pedido> query = em.createQuery(cq);

		return query.getResultList();

	}

	public static void main(String[] args) {

		  JPanel middlePanel = new JPanel ();
		  middlePanel.setBorder ( new TitledBorder ( new EtchedBorder (), "Display Area" ) );

		  // create the middle panel components

		  JTextArea display = new JTextArea ( 16, 58 );
		  display.setEditable ( true ); // set textArea non-editable
		  JScrollPane scroll = new JScrollPane ( display );
		  scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );

		  //Add Textarea in to middle panel
		  middlePanel.add ( scroll );

		  // My code
		  JFrame frame = new JFrame ();
		  frame.add ( middlePanel );
		  frame.pack ();
		  frame.setLocationRelativeTo ( null );
		  frame.setVisible ( true );
}
	}