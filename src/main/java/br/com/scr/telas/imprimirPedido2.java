package br.com.scr.telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;

import br.com.scr.dao.GenericDAO;
import br.com.scr.model.Cliente;
import br.com.scr.model.Endereco;
import br.com.scr.model.Pedido;
import br.com.scr.util.ConsultaCorreiosWrapper;

/**
 * @author fredye Classe responsavel por desenhar a tela de fazer pedido
 */
public class imprimirPedido2 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel panel = new JPanel();
	private GenericDAO dao = new GenericDAO();
	
	private JFrame frame = new JFrame();
    private Cliente cliente = new Cliente();
	private Endereco endereco = new Endereco();
	private JScrollPane scroller;

	private  String imprimir;	    
	private Long cliente_pedido;
	
	
	private JTextArea textArea = new JTextArea(10, 20);
	
	public imprimirPedido2(Long cliente_pedido) {

		this.cliente_pedido = cliente_pedido;	

		frame = new JFrame();

		frame.setSize(1366, 780);
	    //header.setBackground(new java.awt.Color(99,130,191));
        
	    DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();   
	    DefaultTableCellRenderer direita = new DefaultTableCellRenderer();   
	      
	    centralizado.setHorizontalAlignment(SwingConstants.CENTER);   
	    direita.setHorizontalAlignment(SwingConstants.RIGHT);
		
		
		JPanel panelBanner = new JPanel();
		panelBanner.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
        //scroller = new JScrollPane(textArea);
		
		
		JLabel jLabel = new JLabel();
		jLabel.setIcon(new ImageIcon("printer-32.png"));
		jLabel.setText("IMPRIMIR PEDIDO 2");
		jLabel.setForeground(Color.WHITE);
		jLabel.setFont(new Font("Dialog", Font.BOLD, 36));
		panelBanner.add(jLabel);
						
						JPanel panelBody = new JPanel();
						
						GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
						groupLayout.setHorizontalGroup(
							groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(12)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(panelBody, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1332, Short.MAX_VALUE)
										.addComponent(panelBanner, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1332, Short.MAX_VALUE))
									.addGap(22))
						);
						groupLayout.setVerticalGroup(
							groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(6)
									.addComponent(panelBanner, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(panelBody, GroupLayout.PREFERRED_SIZE, 554, GroupLayout.PREFERRED_SIZE)
									.addContainerGap(97, Short.MAX_VALUE))
						);
						
						JScrollPane scrollPane = new JScrollPane();
						
						GroupLayout gl_panelBody = new GroupLayout(panelBody);
						gl_panelBody.setHorizontalGroup(
							gl_panelBody.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panelBody.createSequentialGroup()
									.addContainerGap(434, Short.MAX_VALUE)
									.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 489, GroupLayout.PREFERRED_SIZE)
									.addGap(409))
						);
						gl_panelBody.setVerticalGroup(
							gl_panelBody.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelBody.createSequentialGroup()
									.addContainerGap()
									.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 408, GroupLayout.PREFERRED_SIZE)
									.addContainerGap(134, Short.MAX_VALUE))
						);
						//scrollPane.setViewportView(textArea);
						
						textArea.setBackground(new Color(245,245,220));
						scrollPane.setViewportView(textArea);
						textArea.setEditable(false);
						textArea.setWrapStyleWord(true);
						textArea.setLineWrap(true);
						textArea.append(notaFiscal(cliente_pedido));
						
						panelBody.setLayout(gl_panelBody);
						frame.getContentPane().setLayout(groupLayout);


						frame.setVisible(true);
						frame.setLocationRelativeTo(null);
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	                    
						
	}

	private String notaFiscal(Long cliente_pedido) {

		List<Pedido> pedidos = dao.findAllPedidos(cliente_pedido);
		
		String conteudoImprimir = "";
		
		Float total = 0F;
		
		Pedido pedidoAux = null;
		
		for (Pedido pedido : pedidos) {
			   conteudoImprimir += pedido.getQuantidade() + "    "+ 
		                           pedido.getPreco()  + "        "+  
			                       pedido.getMarmita()+ "\n\r";
			   pedidoAux = pedido;
		       total += (pedido.getPreco()*pedido.getQuantidade());  
		       
		}
		  
		  imprimir = "------------------------------------------------------------------------------------------------------------------------\n\r"
		  		+ "CNPJ: 000000000000 COMERCIO DE ALIMENTOS XYZ\n"
		  		+ "ENDEREÇO: QS 09 LOJA 02 LT 3/4  \n"
		  		+ "------------------------------------------------------------------------------------------------------------------------\n\r"
		  		+ "CLIENTE: " + pedidoAux.getFkCliente().getNome()        +"       TELEFONE: " + pedidoAux.getFkCliente().getTelefone() +"\n\n"      
		  		+ "QTD  VALOR  DESCRIÇÃO  "
		  		+ " ------------------------------------------------------------------------------------------------------------------------\r"
		  		+"\r"+conteudoImprimir+"\n"
		  		+ " \r "
		  		+ "_________________________________________________________________________\n"
		  		+ "\nTOTAL DE ITENS:                                                                                     "+pedidos.size() 
		  		+  "\nTOTAL  R$:                                                                                         "+total
		  		+  "\nFORMA DE PAGAMENTO:                                                             "+pedidoAux.getFormaPagamento()
		  		+  "";
		  		
		  
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
		new imprimirPedido2(1L);
	}
}