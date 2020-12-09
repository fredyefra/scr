package br.com.scr.telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

import br.com.scr.dao.GenericDAO;
import br.com.scr.model.Cliente;
import br.com.scr.util.TabelaModel;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 * @author fredye Classe responsavel por desenhar a tela de fazer pedido
 */
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
		table.setBackground(new Color(255, 255, 255));

		frame = new JFrame();
		// tela = frame.getContentPane();

		panel = new JPanel();
		panel.setBackground(new java.awt.Color(238, 238, 238));
		panel.add(table);

		table.setModel(model);

		frame.setSize(1366, 780);
		panel.setLayout(new BorderLayout(0, 0));

		JScrollPane scroller = new JScrollPane(table, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

		// scroller.setViewportView(table);

		JTableHeader header = table.getTableHeader();
	    header.setBackground(new java.awt.Color(99,130,191));
        
	    DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();   
	    DefaultTableCellRenderer direita = new DefaultTableCellRenderer();   
	      
	    centralizado.setHorizontalAlignment(SwingConstants.CENTER);   
	    direita.setHorizontalAlignment(SwingConstants.RIGHT);
		
	    
	    table.getColumnModel().getColumn(0).setCellRenderer(centralizado);   
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setMinWidth(200);
        
		table.getColumnModel().getColumn(1).setCellRenderer(centralizado);   
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setMinWidth(100);
		
		table.getColumnModel().getColumn(2).setCellRenderer(centralizado);   
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setMinWidth(100);
		
		
		//table.getColumnModel().getColumn(3).setCellRenderer(centralizado);   
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setMinWidth(250);
		
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(4).setMinWidth(100);
		
		JPanel bannerPanel = new JPanel();
		bannerPanel.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		
		JLabel jLabel = new JLabel();
		jLabel.setIcon(new ImageIcon("restaurant-3-32.png"));
		jLabel.setText("FAZER PEDIDO");
		jLabel.setForeground(Color.WHITE);
		jLabel.setFont(new Font("Dialog", Font.BOLD, 36));
		bannerPanel.add(jLabel);
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1366, GroupLayout.PREFERRED_SIZE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(scroller, Alignment.LEADING)
						.addComponent(bannerPanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1332, Short.MAX_VALUE)))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(bannerPanel, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addGap(72)
					.addComponent(scroller, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
					.addGap(447))
		);

						frame.getContentPane().setLayout(groupLayout);


						tela = frame.getContentPane();


						frame.setVisible(true);
						frame.setLocationRelativeTo(null);
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new FazerPedido();
	}
}