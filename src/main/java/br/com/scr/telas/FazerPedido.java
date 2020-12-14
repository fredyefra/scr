package br.com.scr.telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
	JFrame frame = new JFrame();


	
	protected  FileInputStream stream;
	protected InputStreamReader reader;
    BufferedReader br;
	protected String linha;
	protected JComboBox comboBox = new JComboBox();
	
	public FazerPedido() throws IOException {

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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "CARD\u00C1PIO", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, null, new Color(51, 51, 51)));
		
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
					.addComponent(scroller, GroupLayout.DEFAULT_SIZE, 1332, Short.MAX_VALUE)
					.addGap(22))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 1332, Short.MAX_VALUE)
					.addGap(22))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(bannerPanel, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addComponent(scroller, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
					.addGap(271))
		);
		
		JPanel panel_2 = new JPanel();
		
		JPanel panel_2_1 = new JPanel();
		
		JCheckBox chckbxMacarro = new JCheckBox("MACARRÃO");
		
		JCheckBox chckbxBatata = new JCheckBox("BATATA FRITA");
		
		JCheckBox chckbxFeijoada_1_1 = new JCheckBox("VINAGRETE");
		
		JCheckBox chckbxSalada_1_1 = new JCheckBox("MAIONESE");
		
		JCheckBox chckbxSalpico = new JCheckBox("SALPICÃO");
		GroupLayout gl_panel_2_1 = new GroupLayout(panel_2_1);
		gl_panel_2_1.setHorizontalGroup(
			gl_panel_2_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 237, Short.MAX_VALUE)
				.addGroup(gl_panel_2_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxMacarro)
						.addComponent(chckbxBatata)
						.addComponent(chckbxFeijoada_1_1)
						.addComponent(chckbxSalada_1_1)
						.addComponent(chckbxSalpico))
					.addContainerGap(141, Short.MAX_VALUE))
		);
		gl_panel_2_1.setVerticalGroup(
			gl_panel_2_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 153, Short.MAX_VALUE)
				.addGroup(gl_panel_2_1.createSequentialGroup()
					.addGap(23)
					.addComponent(chckbxMacarro)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxBatata)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxFeijoada_1_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxSalada_1_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxSalpico)
					.addContainerGap(15, Short.MAX_VALUE))
		);
		panel_2_1.setLayout(gl_panel_2_1);
		
		JPanel panel_2_1_1 = new JPanel();
		
		comboBox = new JComboBox();
		//comboBox.setModel(new DefaultComboBoxModel(new String[] {"FRANGO FRITO","BIFE ACEBOLADO"}));
		GroupLayout gl_panel_2_1_1 = new GroupLayout(panel_2_1_1);
		gl_panel_2_1_1.setHorizontalGroup(
			gl_panel_2_1_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2_1_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboBox, 0, 151, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_2_1_1.setVerticalGroup(
			gl_panel_2_1_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_1_1.createSequentialGroup()
					.addGap(28)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(94, Short.MAX_VALUE))
		);
		panel_2_1_1.setLayout(gl_panel_2_1_1);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(30)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(panel_2_1, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_2_1_1, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(724, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel_2_1_1, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel_2_1, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
								.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
							.addGap(23))))
		);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("ARROZ");
		
		JCheckBox chckbxFeijo = new JCheckBox("FEIJÃO");
		
		JCheckBox chckbxFeijoada_1 = new JCheckBox("FEIJOADA");
		
		JCheckBox chckbxSalada_1 = new JCheckBox("SALADA");
		
		JCheckBox chckbxFarofa = new JCheckBox("FAROFA");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxNewCheckBox)
						.addComponent(chckbxFeijo)
						.addComponent(chckbxFeijoada_1)
						.addComponent(chckbxSalada_1)
						.addComponent(chckbxFarofa))
					.addContainerGap(100, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(23)
					.addComponent(chckbxNewCheckBox)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxFeijo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxFeijoada_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxSalada_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxFarofa)
					.addContainerGap(28, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		panel_1.setLayout(gl_panel_1);

						frame.getContentPane().setLayout(groupLayout);


						tela = frame.getContentPane();


						frame.setVisible(true);
						frame.setLocationRelativeTo(null);
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	readText();
						
	}

	
	private  String readText() throws IOException {
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

	
	
	
	public static void main(String[] args) throws IOException {
		new FazerPedido();
	}
}