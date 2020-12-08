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

import br.com.scr.dao.GenericDAO;
import br.com.scr.model.Cliente;
import br.com.scr.util.TabelaModel;
import javax.swing.ListSelectionModel;
import java.awt.ComponentOrientation;


/**@author fredye
 * Classe responsavel por desenhar a tela de fazer pedido  
 * */
public class FazerPedido2 extends JFrame {


	private static final long serialVersionUID = 1L;

	private JPanel tela;

	
	private JPanel bannerPanel;
    private GenericDAO dao = new GenericDAO();
	private JScrollPane scroller; 
    private TabelaModel model;
	JTable table;
    
	/*
	 * Create the frame.
	 */
	public FazerPedido2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768 );
		tela = new JPanel();
		tela.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(tela);

		bannerPanel = new JPanel();
		GroupLayout gl_tela = new GroupLayout(tela);
		gl_tela.setHorizontalGroup(
			gl_tela.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_tela.createSequentialGroup()
					.addContainerGap()
					.addComponent(bannerPanel, GroupLayout.DEFAULT_SIZE, 1332, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_tela.setVerticalGroup(
			gl_tela.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tela.createSequentialGroup()
					.addComponent(bannerPanel, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(653, Short.MAX_VALUE))
		);

		JLabel jLabel = new JLabel();
		jLabel.setIcon(new ImageIcon("add-user-24.png"));
		jLabel.setFont(new Font("Calibri", 1, 36));
		jLabel.setForeground(new java.awt.Color(255, 255, 255));
		jLabel.setText("FAZER PEDIDO");

		bannerPanel.setSize(100, 768);
		bannerPanel.setBackground(new java.awt.Color(46, 204, 113));
		bannerPanel.add(jLabel,BorderLayout.NORTH);

		
		
		List<Cliente> clientes = dao.findAll();
		model = new TabelaModel(clientes);
		table = new JTable(model);	
		table.setModel(model);
		scroller =
				new JScrollPane (table,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
							             ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS); 

		
		
		tela.setLayout(gl_tela);
	}

	
	private void carregarTable() {
       
        
		

		
		
	}

	
	
	public static void main(String[] args)  { 

		FazerPedido2 frame = new FazerPedido2();
		frame.setVisible(true); 
		frame.setResizable(false);
		//frame.add(scroller);
		//frame.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
		frame.setLocationRelativeTo(null);
	}

	
}