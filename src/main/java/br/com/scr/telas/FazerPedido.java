package br.com.scr.telas;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import org.jboss.jandex.Main;

import br.com.scr.dao.GenericDAO;
import br.com.scr.model.Cliente;
import br.com.scr.util.TabelaModel;
import javax.swing.ListSelectionModel;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Color;
import java.awt.FlowLayout;


/**@author fredye
 * Classe responsavel por desenhar a tela de fazer pedido  
 * */
public class FazerPedido extends JFrame {


	private static final long serialVersionUID = 1L;

	private JPanel panel = new JPanel();
    private GenericDAO dao = new GenericDAO();
	private JScrollPane scroller; 
    private TabelaModel model;
	private JTable table;
	private Container tela;
	JFrame frame = new JFrame();
	
	public FazerPedido() {
		
        List<Cliente> clientes = new GenericDAO().findAll();
        model = new TabelaModel(clientes);
        table = new JTable(model);
        
        frame = new JFrame();
		tela = frame.getContentPane();
        
		panel = new JPanel();
		panel.setBackground(Color.BLUE);
        panel.add(table);
		
        tela.add(panel,BorderLayout.NORTH);
			
        table.setModel(model);
		
		frame.setSize(800, 600);
		
		JScrollPane scroller =
				new JScrollPane (table,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
							             ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS); 
		frame.add(scroller);
		frame.setVisible(true); 
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}

}