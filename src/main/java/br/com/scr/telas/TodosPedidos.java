package br.com.scr.telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

import br.com.scr.dao.GenericDAO;
import br.com.scr.model.Pedido;
import br.com.scr.util.TabelaModelPedido;

/**
 * @author fredye Classe responsavel por desenhar a tela de fazer pedido
 */
public class TodosPedidos extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel panel = new JPanel();
	private GenericDAO dao = new GenericDAO();
	private JScrollPane scroller;
	private TabelaModelPedido model;
	private JTable table;
	private Container tela;
	private JFrame frame = new JFrame();
	
	private Pedido pedido = new Pedido();
	private JButton btnSalvar = new JButton();
	private JButton btnCancelar = new JButton();
	
	public TodosPedidos() {

		List<Pedido> pedidos = new GenericDAO().findAllPedidos();
		model = new TabelaModelPedido(pedidos);
		table = new JTable(model);
		table.setBackground(new Color(255, 255, 255));

		frame = new JFrame();

		panel = new JPanel();
		panel.setBackground(new java.awt.Color(238, 238, 238));
		panel.add(table);

		table.setModel(model);

		frame.setSize(1366, 780);
		panel.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollerTable = new JScrollPane(table, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

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
		jLabel.setText("TODOS PEDIDOS REALIZADOS");
		jLabel.setForeground(Color.WHITE);
		jLabel.setFont(new Font("Dialog", Font.BOLD, 36));
		bannerPanel.add(jLabel);
		
		btnSalvar.setText("STATUS");
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSalvar.setIcon(new ImageIcon("arrow-203-16.png"));
		
		btnCancelar.setText("CANCELAR");
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancelar.setIcon(new ImageIcon("x-mark-16.png"));
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1366, GroupLayout.PREFERRED_SIZE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(bannerPanel, GroupLayout.DEFAULT_SIZE, 1332, Short.MAX_VALUE)
					.addGap(22))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollerTable, GroupLayout.DEFAULT_SIZE, 1332, Short.MAX_VALUE)
					.addGap(22))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(566)
					.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
					.addGap(50)
					.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(491, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(bannerPanel, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addComponent(scrollerTable, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
					.addGap(276)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalvar)
						.addComponent(btnCancelar))
					.addGap(187))
		);
						frame.getContentPane().setLayout(groupLayout);
						tela = frame.getContentPane();
						frame.setVisible(true);
						frame.setLocationRelativeTo(null);
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	selecionarLinha();
    
	}

	private Pedido selecionarLinha() {
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {

				try {
					if (e.getButton() == MouseEvent.BUTTON1 && e.getClickCount() == 1) {
						pedido =  model.getCliente((table.getSelectedRow()));
					    JOptionPane.showMessageDialog(null, pedido.getStatusPedido());
					
					}

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "SELECIONE O PEDIDO PARA CONSULTAR!");
				} 


			}

		});
		return pedido;
	}

	
	public static void main(String[] args) {
		new TodosPedidos();
	}

}