package br.com.scr.telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP;
import br.com.scr.dao.GenericDAO;
import br.com.scr.model.Cliente;
import br.com.scr.model.Endereco;
import br.com.scr.model.Pedido;
import br.com.scr.util.ConsultaCorreiosWrapper;
import br.com.scr.util.TabelaModel;

import javax.swing.JSeparator;
import javax.swing.JTable;


/**@author fredye
 * Classe responsavel por desenhar a tela de cadastro de cliente  
 * */
public class CadastrarCliente extends JFrame {


	private static final long serialVersionUID = 1L;

	private JPanel tela;

	JLabel lblNome = new JLabel();
	JLabel lblTelefone = new JLabel();
	JLabel lblEmail = new JLabel();
	JLabel lblCep = new JLabel();
	JLabel lblEndereco = new JLabel();
	JLabel lblComplemento = new JLabel();
	JLabel lblCidade = new JLabel();

	private JTextField txtNome = new JTextField ();
	private JPanel bannerPanel;
	private JTextField txtDDD = new JTextField ();
	private JTextField txtTelefone = new JTextField ();
	private JTextField txtEmail= new JTextField ();
	private JTextField txtCep = new JTextField();
	private JTextField txtEndereco = new JTextField ();

	JButton btnSalvar = new JButton();
	private JButton btnCancelar = new JButton();
	private JTextField txtComplemento = new JTextField ();
	private JTextField txtCidade = new JTextField ();


	
	private Endereco endereco = new Endereco();

	private Cliente cliente = new Cliente();
	private GenericDAO dao = new GenericDAO();

	public static void main(String[] args)  { 

		CadastrarCliente frame = new CadastrarCliente();
		frame.setVisible(true); 
		frame.setResizable(false);
		//frame.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
		frame.setLocationRelativeTo(null);
	}


	/*
	 * Create the frame.
	 */
	public CadastrarCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768 );
		tela = new JPanel();
		tela.setBorder(new EmptyBorder(5, 5, 5, 5));
		//tela.setBackground(new Color(255,255,255));
		setContentPane(tela);



		JPanel bodyBanner = new JPanel();
		//bodyBanner.setBackground(new Color(255,255,255));
		bodyBanner.setBorder(new TitledBorder(null, "Dados Pessoais", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		bannerPanel = new JPanel();

		JPanel ButtonPanel = new JPanel();

		JSeparator separator = new JSeparator();
		GroupLayout gl_tela = new GroupLayout(tela);
		gl_tela.setHorizontalGroup(
				gl_tela.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_tela.createSequentialGroup()
						.addGroup(gl_tela.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_tela.createSequentialGroup()
										.addContainerGap()
										.addComponent(bannerPanel, GroupLayout.DEFAULT_SIZE, 1332, Short.MAX_VALUE))
								.addGroup(gl_tela.createSequentialGroup()
										.addContainerGap()
										.addComponent(bodyBanner, GroupLayout.DEFAULT_SIZE, 1332, Short.MAX_VALUE))
								.addGroup(gl_tela.createSequentialGroup()
										.addGap(58)
										.addComponent(separator, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
										.addGap(265)
										.addComponent(ButtonPanel, GroupLayout.PREFERRED_SIZE, 674, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap())
				);
		gl_tela.setVerticalGroup(
				gl_tela.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tela.createSequentialGroup()
						.addComponent(bannerPanel, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
						.addGap(63)
						.addComponent(bodyBanner, GroupLayout.PREFERRED_SIZE, 324, GroupLayout.PREFERRED_SIZE)
						.addGap(54)
						.addGroup(gl_tela.createParallelGroup(Alignment.LEADING)
								.addComponent(ButtonPanel, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
								.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(80, Short.MAX_VALUE))
				);

		btnSalvar.setText("SALVAR");
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSalvar.setIcon(new ImageIcon("arrow-203-16.png"));

		btnCancelar.setText("CANCELAR");
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancelar.setIcon(new ImageIcon("x-mark-16.png"));

		GroupLayout gl_ButtonPanel = new GroupLayout(ButtonPanel);
		gl_ButtonPanel.setHorizontalGroup(
				gl_ButtonPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ButtonPanel.createSequentialGroup()
						.addGap(244)
						.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
						.addGap(33)
						.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(152, Short.MAX_VALUE))
				);
		gl_ButtonPanel.setVerticalGroup(
				gl_ButtonPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_ButtonPanel.createSequentialGroup()
						.addContainerGap(56, Short.MAX_VALUE)
						.addGroup(gl_ButtonPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnSalvar)
								.addComponent(btnCancelar))
						.addGap(51))
				);
		ButtonPanel.setLayout(gl_ButtonPanel);

		JLabel jLabel = new JLabel();
		jLabel.setIcon(new ImageIcon("add-user-2-32.png"));
		jLabel.setFont(new Font("Calibri", 1, 36));
		jLabel.setForeground(new java.awt.Color(255, 255, 255));
		jLabel.setText("CADASTRAR CLIENTE");

		bannerPanel.setSize(100, 768);
		//bannerPanel.setBackground(new java.awt.Color(46, 204, 113));
		bannerPanel.setBackground(new java.awt.Color(99,130,191));
		bannerPanel.add(jLabel,BorderLayout.NORTH);

		lblNome.setText("NOME:");
		lblNome.setFont(new Font("Dialog", Font.BOLD, 13));

		txtNome = new JTextField();
		txtNome.setColumns(10);

		lblTelefone.setText("TELEFONE:");
		lblTelefone.setFont(new Font("Dialog", Font.BOLD, 13));

		//txtDDD = new JTextField();
		txtDDD.setColumns(10);

		//txtTelefone = new JTextField();
		txtTelefone.setColumns(10);

		lblEmail.setText("E-MAIL:");
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 13));

		//txtEmail = new JTextField();
		txtEmail.setColumns(10);

		lblCep.setText("CEP:");
		lblCep.setFont(new Font("Dialog", Font.BOLD, 13));

		txtCep.setColumns(10);

		lblEndereco.setText("ENDEREÇO:");
		lblEndereco.setFont(new Font("Dialog", Font.BOLD, 13));

		//txtEndereco = new JTextField();
		txtEndereco.setColumns(10);

		lblComplemento.setText("COMPLEMENTO:");
		lblComplemento.setFont(new Font("Dialog", Font.BOLD, 13));

		//txtComplemento = new JTextField();
		txtComplemento.setColumns(10);


		lblCidade.setText("CIDADE:");
		lblCidade.setFont(new Font("Dialog", Font.BOLD, 13));

		//txtCidade = new JTextField();
		txtCidade.setColumns(10);

		GroupLayout gl_bodyBanner = new GroupLayout(bodyBanner);
		gl_bodyBanner.setHorizontalGroup(
				gl_bodyBanner.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_bodyBanner.createSequentialGroup()
						.addGap(114)
						.addGroup(gl_bodyBanner.createParallelGroup(Alignment.LEADING)
								.addComponent(txtCidade, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCidade, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_bodyBanner.createSequentialGroup()
										.addGroup(gl_bodyBanner.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNome)
												.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 508, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 508, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblEndereco, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, 508, GroupLayout.PREFERRED_SIZE)
												.addGroup(Alignment.TRAILING, gl_bodyBanner.createSequentialGroup()
														.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
														.addGap(437)))
										.addGap(145)
										.addGroup(gl_bodyBanner.createParallelGroup(Alignment.LEADING)
												.addComponent(txtComplemento, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblComplemento, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_bodyBanner.createParallelGroup(Alignment.LEADING, false)
														.addComponent(lblCep, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
														.addGroup(gl_bodyBanner.createSequentialGroup()
																.addComponent(txtDDD, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
																.addGap(18)
																.addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
														.addComponent(lblTelefone, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
														.addComponent(txtCep)))))
						.addContainerGap(372, Short.MAX_VALUE))
				);
		gl_bodyBanner.setVerticalGroup(
				gl_bodyBanner.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_bodyBanner.createSequentialGroup()
						.addGroup(gl_bodyBanner.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_bodyBanner.createSequentialGroup()
										.addGap(37)
										.addGroup(gl_bodyBanner.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblTelefone, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNome))
										.addGap(53)
										.addGroup(gl_bodyBanner.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblCep, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_bodyBanner.createSequentialGroup()
										.addContainerGap(62, Short.MAX_VALUE)
										.addGroup(gl_bodyBanner.createParallelGroup(Alignment.BASELINE)
												.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtDDD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(43)))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_bodyBanner.createParallelGroup(Alignment.LEADING)
								.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtCep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_bodyBanner.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_bodyBanner.createSequentialGroup()
										.addComponent(lblEndereco, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_bodyBanner.createSequentialGroup()
										.addComponent(lblComplemento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(txtComplemento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGap(18)
						.addComponent(lblCidade, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(txtCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(42))
				);
		bodyBanner.setLayout(gl_bodyBanner);

		consultarCep(); 
		salvar();
		cancelar();
		tela.setLayout(gl_tela);
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

	private void salvar() {
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoSalvar) {

				if (eventoSalvar.getSource() == btnSalvar) {

					cliente.setNome(txtNome.getText());
					cliente.setTelefone(txtDDD.getText()+"-"+txtTelefone.getText());
					cliente.setEmail(txtEmail.getText()); 
					endereco.setComplemento(txtComplemento.getText());
					cliente.setFkEndereco(endereco);

					Pedido pedido1 = new Pedido("1",cliente);
					Pedido pedido2 = new Pedido("2",cliente);
					Pedido pedido3 = new Pedido("1",cliente);
					
					cliente.getPedidos().add(pedido1);
					cliente.getPedidos().add(pedido2);
					cliente.getPedidos().add(pedido3);
					
					dao.salvar(cliente);

					JOptionPane.showMessageDialog(null, cliente.getNome()+", " + "SALVO COM SUCESSO!"+JOptionPane.INFORMATION_MESSAGE);	 
					try {
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

					JOptionPane.showMessageDialog(null, "CANCELAR CADASTRO!");	 
					//dispose();	
					//new Menu(); 
				}	
			}}); 
	}	
}