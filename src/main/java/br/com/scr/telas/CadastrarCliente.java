package br.com.scr.telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

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
import br.com.scr.util.ConsultaCorreiosWrapper;

/**
 * @author fredye Classe responsavel por desenhar a tela de fazer pedido
 */
public class CadastrarCliente extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel panel = new JPanel();
	private GenericDAO dao = new GenericDAO();
	//private TabelaModel model;
	//private Container tela;
	private JFrame frame = new JFrame();
    private Cliente cliente = new Cliente();
	private Endereco endereco = new Endereco();
	private  FileInputStream stream;
	private InputStreamReader reader;
    private BufferedReader br;
	private String linha;
	private JComboBox comboBox = new JComboBox();
	private JScrollPane scroller;
	private JTextField txtNome;
	private JTextField txtDDD;
	private JTextField txtEmail;
	private JTextField txtCep;
	private JTextField txtEndereco;
	private JTextField txtComplemento;
	private JTextField txtCidade;
	
	private JButton btnSalvar = new JButton();
	private JButton btnCancelar = new JButton();
	private JTextField txtTelefone;
	
	public CadastrarCliente() throws IOException {


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
		jLabel.setIcon(new ImageIcon("add-user-2-32.png"));
		jLabel.setText("CADASTRAR CLIENTE 2");
		jLabel.setForeground(Color.WHITE);
		jLabel.setFont(new Font("Dialog", Font.BOLD, 36));
		panelBanner.add(jLabel);
		
		JPanel panelBody = new JPanel();
		panelBody.setBorder(new TitledBorder(null, "DADOS PESSOAIS", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		//panel_1.setBackground(new Color(245,245,220));
		

						//tela = frame.getContentPane();
						
						JPanel panelButton = new JPanel();
						
						GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
						groupLayout.setHorizontalGroup(
							groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(12)
									.addComponent(panelBanner, GroupLayout.DEFAULT_SIZE, 1332, Short.MAX_VALUE)
									.addGap(22))
								.addGroup(groupLayout.createSequentialGroup()
									.addContainerGap(52, Short.MAX_VALUE)
									.addComponent(panelBody, GroupLayout.PREFERRED_SIZE, 1258, GroupLayout.PREFERRED_SIZE)
									.addGap(56))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(318)
									.addComponent(panelButton, GroupLayout.PREFERRED_SIZE, 687, GroupLayout.PREFERRED_SIZE)
									.addContainerGap(361, Short.MAX_VALUE))
						);
						groupLayout.setVerticalGroup(
							groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(6)
									.addComponent(panelBanner, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(panelBody, GroupLayout.PREFERRED_SIZE, 429, GroupLayout.PREFERRED_SIZE)
									.addGap(29)
									.addComponent(panelButton, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
									.addContainerGap(34, Short.MAX_VALUE))
						);
						
						btnSalvar.setText("SALVAR");
						btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 12));
						btnSalvar.setIcon(new ImageIcon("arrow-203-16.png"));

						btnCancelar.setText("CANCELAR");
						btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 12));
						btnCancelar.setIcon(new ImageIcon("x-mark-16.png"));

						
						GroupLayout gl_panelButton = new GroupLayout(panelButton);
						gl_panelButton.setHorizontalGroup(
							gl_panelButton.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelButton.createSequentialGroup()
									.addGap(211)
									.addComponent(btnSalvar)
									.addGap(106)
									.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
									.addContainerGap(158, Short.MAX_VALUE))
						);
						gl_panelButton.setVerticalGroup(
							gl_panelButton.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelButton.createSequentialGroup()
									.addGap(64)
									.addGroup(gl_panelButton.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnSalvar)
										.addComponent(btnCancelar))
									.addContainerGap(70, Short.MAX_VALUE))
						);
						panelButton.setLayout(gl_panelButton);
						
						JLabel lblNome = new JLabel("NOME:");
						
						txtNome = new JTextField();
						txtNome.setColumns(10);
						
						JLabel lblTelefone = new JLabel("TELEFONE:");
						
						txtDDD = new JTextField();
						txtDDD.setColumns(10);
						
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
						
						txtTelefone = new JTextField();
						txtTelefone.setColumns(10);
						GroupLayout gl_panelBody = new GroupLayout(panelBody);
						gl_panelBody.setHorizontalGroup(
							gl_panelBody.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelBody.createSequentialGroup()
									.addGap(134)
									.addGroup(gl_panelBody.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panelBody.createSequentialGroup()
											.addComponent(txtCidade, GroupLayout.PREFERRED_SIZE, 362, GroupLayout.PREFERRED_SIZE)
											.addContainerGap())
										.addGroup(gl_panelBody.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_panelBody.createSequentialGroup()
												.addComponent(lblCidade)
												.addContainerGap())
											.addGroup(gl_panelBody.createSequentialGroup()
												.addGroup(gl_panelBody.createParallelGroup(Alignment.LEADING)
													.addGroup(gl_panelBody.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_panelBody.createParallelGroup(Alignment.LEADING)
															.addGroup(gl_panelBody.createSequentialGroup()
																.addGroup(gl_panelBody.createParallelGroup(Alignment.LEADING)
																	.addComponent(lblNome)
																	.addComponent(txtNome, GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
																	.addComponent(txtEmail, GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE))
																.addGap(95))
															.addGroup(gl_panelBody.createSequentialGroup()
																.addComponent(lblEmail)
																.addGap(627)))
														.addGroup(gl_panelBody.createSequentialGroup()
															.addComponent(lblEndereo)
															.addGap(600)))
													.addGroup(gl_panelBody.createSequentialGroup()
														.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, 583, GroupLayout.PREFERRED_SIZE)
														.addGap(95)))
												.addGroup(gl_panelBody.createParallelGroup(Alignment.LEADING, false)
													.addComponent(lblComplemento)
													.addComponent(lblCep)
													.addComponent(lblTelefone)
													.addGroup(gl_panelBody.createSequentialGroup()
														.addComponent(txtDDD, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE))
													.addComponent(txtCep)
													.addComponent(txtComplemento))
												.addGap(302)))))
						);
						gl_panelBody.setVerticalGroup(
							gl_panelBody.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelBody.createSequentialGroup()
									.addGap(66)
									.addGroup(gl_panelBody.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNome)
										.addComponent(lblTelefone))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panelBody.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panelBody.createSequentialGroup()
											.addGroup(gl_panelBody.createParallelGroup(Alignment.LEADING)
												.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtDDD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGap(29)
											.addGroup(gl_panelBody.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblEmail)
												.addComponent(lblCep)))
										.addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panelBody.createParallelGroup(Alignment.LEADING)
										.addComponent(txtCep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(28)
									.addGroup(gl_panelBody.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblEndereo)
										.addComponent(lblComplemento))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panelBody.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panelBody.createSequentialGroup()
											.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(35)
											.addComponent(lblCidade)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addComponent(txtComplemento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(89))
						);
						panelBody.setLayout(gl_panelBody);
						frame.getContentPane().setLayout(groupLayout);


						frame.setVisible(true);
						frame.setLocationRelativeTo(null);
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	                    
						consultarCep();
                        salvar();						
						cancelar();
	}

	private void salvar() {
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoSalvar) {

				if (eventoSalvar.getSource() == btnSalvar) {

					cliente.setNome(txtNome.getText());
					cliente.setTelefone(txtDDD.getText()+"-"+txtTelefone.getText());
					cliente.setEmail(txtEmail.getText()); 
					endereco.setComplemento(txtComplemento.getText());
					cliente.setFkEndereco(endereco);
					
					dao.salvar(cliente);

					JOptionPane.showMessageDialog(null, cliente.getNome()+", " + "SALVO COM SUCESSO!"+JOptionPane.INFORMATION_MESSAGE);	 
					try {
						frame.dispose();
						new FazerPedido();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
					dispose();
				}	
			}}); 
	}	

	private void cancelar() {
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoCancelar) {

				if (eventoCancelar.getSource() == btnCancelar) {
					frame.dispose();
			    	new ModuloFinanceiro(); 
				}	
			}}); 
	}
	
	private void consultarCep() {
		txtCep.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void removeUpdate(DocumentEvent arg0) {
				warn();
			}

			@Override
			public void insertUpdate(DocumentEvent arg0) {
				warn();
			}

			@Override
			public void changedUpdate(DocumentEvent arg0) {
				warn();
			}

			public void warn() {
				if (txtCep.getText().length() == 8) {
					ConsultaCorreiosWrapper consultaCorreios = new ConsultaCorreiosWrapper();
					endereco = consultaCorreios.cepCorreios(txtCep.getText());
					txtEndereco.setText(endereco.getEndereco());
					txtComplemento.setText(endereco.getComplemento());
					txtCidade.setText(endereco.getCidade());
				}
			}

		});
	}

}