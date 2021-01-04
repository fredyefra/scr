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
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.border.BevelBorder;

/**
 * @author fredye Classe responsavel por desenhar a tela de fazer pedido
 */
public class ImprimirPedido extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel panel = new JPanel();
	private GenericDAO dao = new GenericDAO();
	private TabelaModel model;
	private Container tela;
	private JFrame frame = new JFrame();
    
    protected  String imprimir;
	
	protected Cliente cliente = new Cliente();
	protected  FileInputStream stream;
	protected InputStreamReader reader;
    protected BufferedReader br;
	protected String linha;
	protected JComboBox comboBox = new JComboBox();
	protected JScrollPane scroller;
	
	private JTextArea textArea = new JTextArea(10, 20);
	
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
        //scroller = new JScrollPane(textArea);
		
		
		JLabel jLabel = new JLabel();
		jLabel.setIcon(new ImageIcon("printer-32.png"));
		jLabel.setText("IMPRIMIR PEDIDO");
		jLabel.setForeground(Color.WHITE);
		jLabel.setFont(new Font("Dialog", Font.BOLD, 36));
		bannerPanel.add(jLabel);
		
		JPanel panel_1 = new JPanel();
		//panel_1.setBackground(new Color(245,245,220));
		

						tela = frame.getContentPane();
						GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
						groupLayout.setHorizontalGroup(
							groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(12)
											.addComponent(bannerPanel, GroupLayout.PREFERRED_SIZE, 1332, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(297)
											.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
											.addGap(161)))
									.addGap(22))
						);
						groupLayout.setVerticalGroup(
							groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(6)
									.addComponent(bannerPanel, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 429, GroupLayout.PREFERRED_SIZE)
									.addContainerGap(222, Short.MAX_VALUE))
						);
						
						JScrollPane scrollPane = new JScrollPane();
						scrollPane.setViewportBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
						GroupLayout gl_panel_1 = new GroupLayout(panel_1);
						gl_panel_1.setHorizontalGroup(
							gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(197)
									.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
									.addGap(199))
						);
						gl_panel_1.setVerticalGroup(
							gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addContainerGap()
									.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 354, GroupLayout.PREFERRED_SIZE)
									.addContainerGap(63, Short.MAX_VALUE))
						);
						
						
						textArea.setBackground(new Color(245,245,220));
						scrollPane.setViewportView(textArea);
						textArea.setEditable(false);
						textArea.setWrapStyleWord(true);
						textArea.setLineWrap(true);
						textArea.append(nota(1L));
						//textArea.setFont(new Font("Arial Black", Font.BOLD, 12));
						
						panel_1.setLayout(gl_panel_1);
						frame.getContentPane().setLayout(groupLayout);


						frame.setVisible(true);
						frame.setLocationRelativeTo(null);
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	                    
	
	
	}


	private String nota(Long num) {

		List<Pedido> pedidos = dao.findAllPedidos(1L);
		
		String conteudoImprimir = "";
		
		Float total = 0F;
		
		Pedido pedido2 = null;
		
		for (Pedido pedido : pedidos) {
			   conteudoImprimir += pedido.getPedido_identificador() + "    "+ 
		                           pedido.getPreco()  + "     "+  
			                       pedido.getMarmita()+ "\n\r";
			   pedido2 = pedido;
		       total += pedido.getPreco();  
		       
		}
		  
		  
		  
		  
		  imprimir = "------------------------------------------------------------------------------------------------------------------------\n\r"
		  		+ "CNPJ: 000000000000 COMERCIO DE ALIMENTOS XYZ\n"
		  		+ "ENDEREÇO: QS 09 LOJA 02 LT 3/4  \n"
		  		+ "------------------------------------------------------------------------------------------------------------------------\n\r"
		  		+ "CLIENTE: " + pedido2.getFkCliente().getNome()        +"       TELEFONE: " + pedido2.getFkCliente().getTelefone() +"\n\n"      
		  		+ "QTD  VALOR  DESCRIÇÃO "
		  		+ " ------------------------------------------------------------------------------------------------------------------------\r"
		  		+"\r"+conteudoImprimir+"\n"
		  		+ " \r "
		  		+ "_________________________________________________________________________\n"
		  		+ "\nTOTAL DE ITENS:                                                                                   "+ pedidos.size() + "  \n"
		  		+  "TOTAL  R$:                                                                                         "+ total
		  		+  "\nFORMA DE PAGAMENTO:                                                                              DINHEIRO";
		  		
		  
		  
		//System.out.println(imprimir); 
	    return imprimir;
	}

	
	private void imprimir1(String nota) {
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
		
		
		new ImprimirPedido().nota(1L);
	
	
	}
}