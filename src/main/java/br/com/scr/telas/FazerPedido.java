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
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JTextArea;
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
import javax.swing.JSplitPane;

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
	protected JComboBox comboBox = new JComboBox();
	protected JTextArea txt = new JTextArea();
	protected JButton btnSalvar = new JButton("SALVAR");
	//protected private GenericDAO dao = new GenericDAO();
	
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
		
		JPanel panelCadarpio = new JPanel();
		panelCadarpio.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "CARD\u00C1PIO", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, null, new Color(51, 51, 51)));
		
		
		
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
					.addGap(449)
					.addComponent(btnSalvar)
					.addContainerGap(800, Short.MAX_VALUE))
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
					.addComponent(panelCadarpio, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
					.addGap(59)
					.addComponent(btnSalvar)
					.addGap(187))
		);
		
		JPanel panel_2_1_1 = new JPanel();
		
		comboBox = new JComboBox();
		
		JSlider slider = new JSlider();
		slider = new JSlider(0, 200, 0);
        slider.setMinorTickSpacing(5);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        //slider.setOrientation(SwingConstants.VERTICAL);
        slider.setPaintTicks(true);
        //add(slider, BorderLayout.CENTER);
		
		
		GroupLayout gl_panel_2_1_1 = new GroupLayout(panel_2_1_1);
		gl_panel_2_1_1.setHorizontalGroup(
			gl_panel_2_1_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2_1_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2_1_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(slider, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
						.addComponent(comboBox, Alignment.LEADING, 0, 211, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_2_1_1.setVerticalGroup(
			gl_panel_2_1_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_1_1.createSequentialGroup()
					.addGap(28)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(49)
					.addComponent(slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(29, Short.MAX_VALUE))
		);
		panel_2_1_1.setLayout(gl_panel_2_1_1);
		
		JPanel panel_2 = new JPanel();
		GroupLayout gl_panelCadarpio = new GroupLayout(panelCadarpio);
		gl_panelCadarpio.setHorizontalGroup(
			gl_panelCadarpio.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCadarpio.createSequentialGroup()
					.addGap(24)
					.addComponent(panel_2_1_1, GroupLayout.PREFERRED_SIZE, 389, GroupLayout.PREFERRED_SIZE)
					.addGap(41)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panelCadarpio.setVerticalGroup(
			gl_panelCadarpio.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCadarpio.createSequentialGroup()
					.addGroup(gl_panelCadarpio.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_2_1_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 146, Short.MAX_VALUE))
					.addContainerGap(30, Short.MAX_VALUE))
		);
		
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(txt, GroupLayout.PREFERRED_SIZE, 750, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(94, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(txt, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_2.setLayout(gl_panel_2);
		panelCadarpio.setLayout(gl_panelCadarpio);

						frame.getContentPane().setLayout(groupLayout);

						tela = frame.getContentPane();


						frame.setVisible(true);
						frame.setLocationRelativeTo(null);
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	carregarCardapio();
	selecionarLinha();
    salvar();
	
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
						txt.append("nome:" +cliente.getNome()+"\n");
				   }
				   
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "SELECIONE O CLIENTE PARA FAZER O PEDIDO!"+JOptionPane.ERROR_MESSAGE);
			} 
					
				
			}

		});
		return cliente;
	}

	private  String carregarCardapio() throws IOException {
		stream = new FileInputStream("/opt/cardapio.txt");
		reader = new InputStreamReader(stream);
		br = new BufferedReader(reader);  
		linha = br.readLine();

		comboBox.removeAllItems();

		while(linha != null){
			comboBox.addItem(linha);
			linha = br.readLine();
		}

		br.close();
		return linha;
	}

	
	private void salvar() {
		    btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoSalvar) {
			cliente = selecionarLinha();
				//List<Pedido> pedidos = new ArrayList<Pedido>();
			Pedido pedido = new Pedido();	
			
			
			
			try {
				if (eventoSalvar.getSource() == btnSalvar) {
				    Cliente cliente2	=    dao.find(cliente.getCliente_identificador());
				    pedido.setMarmita(comboBox.getSelectedItem().toString());
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


	
	
	
	
	
	
	
	
	
	/*
	 * public static void main(String[] args) throws IOException { new
	 * FazerPedido(); }
	 */
}