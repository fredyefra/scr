package br.com.scr.telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

import br.com.scr.dao.GenericDAO;
import br.com.scr.model.Cliente;
import br.com.scr.model.Pedido;
import br.com.scr.util.TabelaModel;

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
	private JFrame frame = new JFrame();
	
	protected Cliente cliente = new Cliente();
	protected  FileInputStream stream;
	protected InputStreamReader reader;
    protected BufferedReader br;
	protected String linha;
	private JComboBox comboBox = new JComboBox();
	private JComboBox comboBoxFormaPagamento = new JComboBox();
	private JButton btnSalvar = new JButton();
	private JButton btnCancelar = new JButton();
	private JTextField txtMarmita;
	
	private final Integer  quantidade [] ={1,2,3,4,5,6,7,8,9,10};
	private final String   formaPagamento [] ={"DINHEIRO","CARTÃO"};
	
	private JTextField txtPreco;
	
	public FazerPedido() throws IOException {

		List<Cliente> clientes = new GenericDAO().findAll();
		model = new TabelaModel(clientes);
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
		jLabel.setText("FAZER PEDIDO");
		jLabel.setForeground(Color.WHITE);
		jLabel.setFont(new Font("Dialog", Font.BOLD, 36));
		bannerPanel.add(jLabel);
		
		JPanel panelCadarpio = new JPanel();
		panelCadarpio.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "CARD\u00C1PIO", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, null, new Color(51, 51, 51)));
		
		btnSalvar.setText("SALVAR");
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
					.addContainerGap()
					.addComponent(panelCadarpio, GroupLayout.DEFAULT_SIZE, 1332, Short.MAX_VALUE)
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
					.addGap(18)
					.addComponent(panelCadarpio, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalvar)
						.addComponent(btnCancelar))
					.addGap(187))
		);
		
		
		
		comboBox = new JComboBox(quantidade);
		
		JLabel lblMarmita = new JLabel("MARMITA");
		
		txtMarmita = new JTextField();
		txtMarmita.setColumns(10);
		
		JLabel lblQtd = new JLabel("QUANTIDADE");
		
		JLabel lblPreco = new JLabel("PREÇO");
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		
		JLabel lblFormaDePagamento = new JLabel("FORMA DE PAGAMENTO");
		
		comboBoxFormaPagamento = new JComboBox(formaPagamento);
		
		GroupLayout gl_panelCadarpio = new GroupLayout(panelCadarpio);
		gl_panelCadarpio.setHorizontalGroup(
			gl_panelCadarpio.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCadarpio.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelCadarpio.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCadarpio.createParallelGroup(Alignment.LEADING, false)
							.addComponent(comboBox, 0, 365, Short.MAX_VALUE)
							.addComponent(lblMarmita)
							.addComponent(txtMarmita))
						.addComponent(lblQtd))
					.addGap(247)
					.addGroup(gl_panelCadarpio.createParallelGroup(Alignment.LEADING)
						.addComponent(txtPreco, GroupLayout.PREFERRED_SIZE, 365, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPreco, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxFormaPagamento, GroupLayout.PREFERRED_SIZE, 365, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFormaDePagamento))
					.addContainerGap(333, Short.MAX_VALUE))
		);
		gl_panelCadarpio.setVerticalGroup(
			gl_panelCadarpio.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCadarpio.createSequentialGroup()
					.addGap(38)
					.addGroup(gl_panelCadarpio.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMarmita)
						.addComponent(lblPreco))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelCadarpio.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCadarpio.createSequentialGroup()
							.addComponent(txtMarmita, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblQtd)
							.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(69, Short.MAX_VALUE))
						.addGroup(gl_panelCadarpio.createSequentialGroup()
							.addComponent(txtPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(24)
							.addComponent(lblFormaDePagamento)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(comboBoxFormaPagamento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		panelCadarpio.setLayout(gl_panelCadarpio);

						frame.getContentPane().setLayout(groupLayout);

						tela = frame.getContentPane();


						frame.setVisible(true);
						frame.setLocationRelativeTo(null);
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//carregarCardapio();
	selecionarLinha();
    salvar();
	cancelar();
	}


	/*
	 * private void extracted() { table.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mousePressed(MouseEvent e) { if (e.getButton() ==
	 * MouseEvent.BUTTON1 && e.getClickCount() == 1) { String nome = (String)
	 * table.getValueAt(table.getSelectedRow(),0); String telefone = (String)
	 * table.getValueAt(table.getSelectedRow(),1); System.out.println(nome +
	 * telefone); } }
	 * 
	 * }); }
	 */

	private Cliente selecionarLinha() {
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
			   try {
				   if (e.getButton() == MouseEvent.BUTTON1 && e.getClickCount() == 2) {
						 cliente =  model.getCliente((table.getSelectedRow()));
						 //txt.append("nome:" +cliente.getNome()+"\n");
				   }
				   
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "SELECIONE O CLIENTE PARA FAZER O PEDIDO!"+JOptionPane.ERROR_MESSAGE);
			} 
					
				
			}

		});
		return cliente;
	}

	/*
	 * private String carregarCardapio() throws IOException { stream = new
	 * FileInputStream("/opt/cardapio.txt"); reader = new InputStreamReader(stream);
	 * br = new BufferedReader(reader); linha = br.readLine();
	 * 
	 * comboBox.removeAllItems();
	 * 
	 * while(linha != null){ comboBox.addItem(linha); linha = br.readLine(); }
	 * 
	 * br.close(); return linha; }
	 */
	
	private void salvar() {
		    btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoSalvar) {
			
			cliente = selecionarLinha();
			Pedido pedido = new Pedido();	
			
			try {
				if (eventoSalvar.getSource() == btnSalvar) {
				    Cliente cliente2	=    dao.find(cliente.getCliente_identificador());
				    pedido.setMarmita(txtMarmita.getText());
				    pedido.setQuantidade((Integer) comboBox.getSelectedItem());
				    pedido.setPreco(Float.parseFloat(txtPreco.getText()));
				    pedido.setFormaPagamento(comboBoxFormaPagamento.getSelectedItem().toString());
				    cliente2.getPedidos().add(pedido);
				    pedido.setFkCliente(cliente2);
				    
				    dao.salvar(pedido);
				}
			} catch (Exception e) {
				
				JOptionPane.showMessageDialog(null, "SELECIONE O CLIENTE PARA FAZER O PEDIDO!"+JOptionPane.ERROR_MESSAGE);
			    
			}
			
			finally {
			     	
			}
			
		}}); 
	}	

	private void cancelar() {
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoCancelar) {

				if (eventoCancelar.getSource() == btnCancelar) {
                   
					JOptionPane.showMessageDialog(null, "CANCELAR PEDIDO ?");	 
					frame.dispose();
			    	new ModuloFinanceiro();
            		
				}	
			}}); 
	}


}