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
import javax.swing.JTextField;

/**
 * @author fredye Classe responsavel por desenhar a tela de fazer pedido
 */
public class CadastrarCliente2 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel panel = new JPanel();
	private GenericDAO dao = new GenericDAO();
	private TabelaModel model;
	private Container tela;
	private JFrame frame = new JFrame();
    
   
	
	protected Cliente cliente = new Cliente();
	protected  FileInputStream stream;
	protected InputStreamReader reader;
    protected BufferedReader br;
	protected String linha;
	protected JComboBox comboBox = new JComboBox();
	protected JScrollPane scroller;
	private JTextField txtNome;
	private JTextField txtDDD;
	private JTextField textField;
	private JTextField txtEmail;
	private JTextField txtCep;
	private JTextField txtEndereco;
	private JTextField txtComplemento;
	private JTextField txtCidade;
	
	public CadastrarCliente2() throws IOException {

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
		jLabel.setText("CADASTRAR CLIENTE 2");
		jLabel.setForeground(Color.WHITE);
		jLabel.setFont(new Font("Dialog", Font.BOLD, 36));
		bannerPanel.add(jLabel);
		
		JPanel bodyBanner = new JPanel();
		bodyBanner.setBorder(new TitledBorder(null, "DADOS PESSOAIS", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		//panel_1.setBackground(new Color(245,245,220));
		

						tela = frame.getContentPane();
						GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
						groupLayout.setHorizontalGroup(
							groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(12)
									.addComponent(bannerPanel, GroupLayout.DEFAULT_SIZE, 1332, Short.MAX_VALUE)
									.addGap(22))
								.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
									.addGap(52)
									.addComponent(bodyBanner, GroupLayout.PREFERRED_SIZE, 1265, GroupLayout.PREFERRED_SIZE)
									.addContainerGap(83, Short.MAX_VALUE))
						);
						groupLayout.setVerticalGroup(
							groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(6)
									.addComponent(bannerPanel, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(bodyBanner, GroupLayout.PREFERRED_SIZE, 429, GroupLayout.PREFERRED_SIZE)
									.addContainerGap(222, Short.MAX_VALUE))
						);
						
						JLabel lblNome = new JLabel("NOME:");
						
						txtNome = new JTextField();
						txtNome.setColumns(10);
						
						JLabel lblTelefone = new JLabel("TELEFONE:");
						
						txtDDD = new JTextField();
						txtDDD.setColumns(10);
						
						textField = new JTextField();
						textField.setColumns(10);
						
						JLabel lblEmail = new JLabel("E-MAIL:");
						
						txtEmail = new JTextField();
						txtEmail.setColumns(10);
						
						JLabel lblCep = new JLabel("CEP:");
						
						txtCep = new JTextField();
						txtCep.setColumns(10);
						
						JLabel lblEndereo = new JLabel("ENDEREÇO:");
						
						txtEndereco = new JTextField();
						txtEndereco.setColumns(10);
						
						JLabel lblComplemento = new JLabel("COMPLEMENTO:");
						
						txtComplemento = new JTextField();
						txtComplemento.setColumns(10);
						
						JLabel lblCidade = new JLabel("CIDADE:");
						
						txtCidade = new JTextField();
						txtCidade.setColumns(10);
						GroupLayout gl_bodyBanner = new GroupLayout(bodyBanner);
						gl_bodyBanner.setHorizontalGroup(
							gl_bodyBanner.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_bodyBanner.createSequentialGroup()
									.addGap(134)
									.addGroup(gl_bodyBanner.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_bodyBanner.createSequentialGroup()
											.addComponent(txtCidade, GroupLayout.PREFERRED_SIZE, 362, GroupLayout.PREFERRED_SIZE)
											.addContainerGap())
										.addGroup(gl_bodyBanner.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_bodyBanner.createSequentialGroup()
												.addComponent(lblCidade)
												.addContainerGap())
											.addGroup(gl_bodyBanner.createSequentialGroup()
												.addGroup(gl_bodyBanner.createParallelGroup(Alignment.LEADING)
													.addGroup(gl_bodyBanner.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_bodyBanner.createParallelGroup(Alignment.LEADING)
															.addGroup(gl_bodyBanner.createSequentialGroup()
																.addGroup(gl_bodyBanner.createParallelGroup(Alignment.LEADING)
																	.addComponent(lblNome)
																	.addComponent(txtNome, GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
																	.addComponent(txtEmail, GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE))
																.addGap(95))
															.addGroup(gl_bodyBanner.createSequentialGroup()
																.addComponent(lblEmail)
																.addGap(627)))
														.addGroup(gl_bodyBanner.createSequentialGroup()
															.addComponent(lblEndereo)
															.addGap(600)))
													.addGroup(gl_bodyBanner.createSequentialGroup()
														.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, 583, GroupLayout.PREFERRED_SIZE)
														.addGap(95)))
												.addGroup(gl_bodyBanner.createParallelGroup(Alignment.LEADING)
													.addComponent(txtComplemento, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblComplemento)
													.addGroup(gl_bodyBanner.createParallelGroup(Alignment.LEADING, false)
														.addComponent(lblCep)
														.addComponent(lblTelefone)
														.addGroup(gl_bodyBanner.createSequentialGroup()
															.addComponent(txtDDD, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(ComponentPlacement.UNRELATED)
															.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
														.addComponent(txtCep)))
												.addGap(348)))))
						);
						gl_bodyBanner.setVerticalGroup(
							gl_bodyBanner.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_bodyBanner.createSequentialGroup()
									.addGap(66)
									.addGroup(gl_bodyBanner.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNome)
										.addComponent(lblTelefone))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_bodyBanner.createParallelGroup(Alignment.LEADING)
										.addComponent(txtNome)
										.addComponent(txtDDD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(29)
									.addGroup(gl_bodyBanner.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblEmail)
										.addComponent(lblCep))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_bodyBanner.createParallelGroup(Alignment.LEADING)
										.addComponent(txtCep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(28)
									.addGroup(gl_bodyBanner.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblEndereo)
										.addComponent(lblComplemento))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_bodyBanner.createParallelGroup(Alignment.LEADING)
										.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtComplemento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(35)
									.addComponent(lblCidade)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(89))
						);
						bodyBanner.setLayout(gl_bodyBanner);
						frame.getContentPane().setLayout(groupLayout);


						frame.setVisible(true);
						frame.setLocationRelativeTo(null);
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	                    //frame.add(scroller);
	
	
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
		
		
		new CadastrarCliente2().nota(2L);
	
	
	}
}