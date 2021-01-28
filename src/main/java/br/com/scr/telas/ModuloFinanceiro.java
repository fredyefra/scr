package br.com.scr.telas;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableCellRenderer;

import br.com.scr.dao.GenericDAO;
import br.com.scr.model.Cliente;
import br.com.scr.util.TabelaModelCliente;

/**
 * @author fredye Classe responsavel por desenhar a tela de fazer pedido testando MATOS
 */
public class ModuloFinanceiro extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel panel = new JPanel();
	private GenericDAO dao = new GenericDAO();
	private TabelaModelCliente model;
	private Container tela;
	private JFrame frame = new JFrame();
   
	protected Cliente cliente = new Cliente();
	protected  FileInputStream stream;
	protected InputStreamReader reader;
    protected BufferedReader br;
	protected String linha;
	protected JComboBox comboBox = new JComboBox();
	protected JScrollPane scroller;
	
	private JMenuBar menuBar1 = new JMenuBar();
	private JMenu JModuloCliente = new JMenu();
	private JMenuItem jMenuItemCadastrarCliente = new JMenuItem();
	
	private JMenuBar menuBar2 = new JMenuBar();
	private JMenu JModuloPedido = new JMenu();
	private JMenuItem jMenuItemFazerpedido = new JMenuItem();
	private final JMenuItem jMenuItemPedidosRealizados = new JMenuItem("Pedidos Realizados");
	
	public ModuloFinanceiro() {

		List<Cliente> clientes = new GenericDAO().findAll();
		model = new TabelaModelCliente(clientes);

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
		jLabel.setIcon(new ImageIcon("us-dollar-32.png"));
		jLabel.setText("CONTROLE FINANCEIRO");
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
						
						JTextArea textArea = new JTextArea(10, 20);
						textArea.setBackground(new Color(245,245,220));
						scrollPane.setViewportView(textArea);
						textArea.setWrapStyleWord(true);
						textArea.setLineWrap(true);
						panel_1.setLayout(gl_panel_1);
						frame.getContentPane().setLayout(groupLayout);


						frame.setVisible(true);
						frame.setLocationRelativeTo(null);
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						
						
						frame.setJMenuBar(menuBar1);
						
						JModuloCliente.setText("MÓDULO CLIENTE");
						menuBar1.add(JModuloCliente);
						//jMenuItemCadastrarCliente.setIcon(new ImageIcon(ModuloFinanceiro.class.getResource("/br/com/scr/icones/add-user-16.png")));
						
						jMenuItemCadastrarCliente.setText("Cadastrar Cliente");
						JModuloCliente.add(jMenuItemCadastrarCliente);
						
						menuBar1.add(menuBar2);
						
						JModuloPedido.setText("MÓDULO PEDIDO");
						menuBar2.add(JModuloPedido);
						//jMenuItemFazerpedido.setIcon(new ImageIcon(ModuloFinanceiro.class.getResource("/br/com/scr/icones/restaurant-3-16(2).png")));
						
						jMenuItemFazerpedido.setText("Fazer Pedido");
						JModuloPedido.add(jMenuItemFazerpedido);
						//jMenuItemPedidosRealizados.setIcon(new ImageIcon(ModuloFinanceiro.class.getResource("/br/com/scr/icones/list-ingredients-16.png")));
						
						JModuloPedido.add(jMenuItemPedidosRealizados);
	                    
						eventoCadastrarCliente();
						eventoFazerPedido();
	}

	private void eventoCadastrarCliente() {

		jMenuItemCadastrarCliente.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evento) {

				if (evento.getSource() == jMenuItemCadastrarCliente) {
                    
					try {
						frame.dispose();
						new CadastrarCliente();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}	
			}
		});
	}
	
	private void eventoFazerPedido() {

		jMenuItemFazerpedido.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evento) {

				if (evento.getSource() == jMenuItemFazerpedido) {

					try {
						frame.dispose();
						new FazerPedido();
					} catch (IOException e) {
						e.printStackTrace();
					}

				}	
			}
		});
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
		
		new ModuloFinanceiro();
	
	}
}