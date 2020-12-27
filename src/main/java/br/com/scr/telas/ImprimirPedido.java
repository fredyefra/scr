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
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.JobName;
import javax.print.attribute.standard.MediaSize;
import javax.print.attribute.standard.MediaSizeName;
import javax.print.attribute.standard.OrientationRequested;
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
public class ImprimirPedido extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel panel = new JPanel();
	private GenericDAO dao = new GenericDAO();
	private JScrollPane scroller;
	private TabelaModel model;
	private Container tela;
	private JFrame frame = new JFrame();
    
   
	
	protected Cliente cliente = new Cliente();
	protected  FileInputStream stream;
	protected InputStreamReader reader;
    protected BufferedReader br;
	protected String linha;
	protected JComboBox comboBox = new JComboBox();
	//protected private GenericDAO dao = new GenericDAO();
	
	public ImprimirPedido() throws IOException {

		List<Cliente> clientes = new GenericDAO().findAll();
		model = new TabelaModel(clientes);

		frame = new JFrame();

		frame.setSize(1366, 780);
	    //header.setBackground(new java.awt.Color(99,130,191));
        
	    DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();   
	    DefaultTableCellRenderer direita = new DefaultTableCellRenderer();   
	      
	    centralizado.setHorizontalAlignment(SwingConstants.CENTER);   
	    direita.setHorizontalAlignment(SwingConstants.RIGHT);
		
		
		JPanel bannerPanel = new JPanel();
		bannerPanel.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		
		JLabel jLabel = new JLabel();
		jLabel.setIcon(new ImageIcon("restaurant-3-32.png"));
		jLabel.setText("IMPRIMIR PEDIDO");
		jLabel.setForeground(Color.WHITE);
		jLabel.setFont(new Font("Dialog", Font.BOLD, 36));
		bannerPanel.add(jLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "CARD\u00C1PIO", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, null, new Color(51, 51, 51)));
		
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(bannerPanel, GroupLayout.DEFAULT_SIZE, 1332, Short.MAX_VALUE)
					.addGap(22))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(22))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(6)
					.addComponent(bannerPanel, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addGap(199)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
					.addGap(271))
		);
		
		JSlider slider = new JSlider();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1322, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 176, Short.MAX_VALUE)
		);
		panel_1.setLayout(gl_panel_1);

						frame.getContentPane().setLayout(groupLayout);

						tela = frame.getContentPane();


						frame.setVisible(true);
						frame.setLocationRelativeTo(null);
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	
	}


	private void nota(Long num) {

		//List<Pedido> pedidos = dao.findAllPedidos(2L);
		
		String imprimir= "";
		
		/*
		 * for (int i = 0; i < pedidos.size(); i++) { imprimir +=
		 * pedidos.get(i).getPedido_identificador() + " " +
		 * pedidos.get(i).getObservacao() + " " + pedidos.get(i).getCliente().getNome();
		 * 
		 * 
		 * }
		 */
		  
		  
		  System.out.println(imprimir);
		 
	}

	
	public void imprimir(String nota) {
	 try {
		InputStream stream = new ByteArrayInputStream(nota.getBytes());
	    DocFlavor docFlavor = DocFlavor.INPUT_STREAM.AUTOSENSE;
	    SimpleDoc simpleDoc = new SimpleDoc(stream, docFlavor, null);
	    PrintService impressora = PrintServiceLookup.lookupDefaultPrintService();
	    PrintRequestAttributeSet printRequestAttributes = new HashPrintRequestAttributeSet();
	    printRequestAttributes.add(new JobName("IMPRESSÃO", null));
	    printRequestAttributes.add(OrientationRequested.PORTRAIT);
	    printRequestAttributes.add(MediaSizeName.ISO_A4);
	    
	    DocPrintJob printJob = impressora.createPrintJob(); 
	 
	    try {
	    	printJob.print(simpleDoc, (PrintRequestAttributeSet) printRequestAttributes);
	    }   
	        catch (PrintException p) {
		    JOptionPane.showMessageDialog(null, "ERRO IMPRESSÃO"+p);
	    }	
	    
	    stream.close();
	    
	    }   catch (Exception e) {
			// TODO: handle exception
		}
	    
	}
	

	
	
	
	
	public static void main(String[] args) throws IOException {
		
		GenericDAO dao = new GenericDAO();
		
		//List<Pedido> pedidos = dao.findAllPedidos(2L);
		
		
		new ImprimirPedido().nota(2L);
	
	
	}
}