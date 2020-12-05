package br.com.scr.painel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class ClientesForm extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtNome;
	private JTextField txtTelefone;
	private JTextField txtDDD;
	private JTextField textEmail;
	private JTextField textCep;
	private JTextField txtEndereco;
	private JTextField txtLote;
	private JButton btnSalvar;
	private JButton btnCancelar = new JButton();

	/**
	 * Create the panel.
	 */
	private void initComponents() {
		
	}
	
	public ClientesForm() {
        
		setBorder(new TitledBorder(new LineBorder(null), "Dados Pessoais", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setBackground(new Color(236, 240, 241));
		
		
		JLabel lblNome = new JLabel("NOME:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtNome = new JTextField();
		txtNome.setColumns(20);
		
		JLabel lblEmail = new JLabel("E-MAIL:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblTelefone = new JLabel("TELEFONE:");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		
		txtDDD = new JTextField();
		txtDDD.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCep.setVerticalAlignment(SwingConstants.BOTTOM);
		lblCep.setHorizontalAlignment(SwingConstants.CENTER);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		
		textCep = new JTextField();
		textCep.setColumns(10);
		
		JLabel lblEndereco = new JLabel("ENDERE\u00C7O:");
		lblEndereco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		
		JLabel lblLote = new JLabel("Lote");
		lblLote.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtLote = new JTextField();
		txtLote.setColumns(10);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSalvar.setIcon(new ImageIcon("arrow-203-16.png"));
		
		btnCancelar = new JButton("Canelar");
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancelar.setIcon(new ImageIcon("x-mark-16.png"));
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(244)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTelefone)
								.addComponent(lblCep, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblLote, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtLote, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 669, GroupLayout.PREFERRED_SIZE)
									.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
											.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
													.addGroup(groupLayout.createSequentialGroup()
														.addComponent(txtDDD, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
													.addComponent(textCep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGap(194)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
													.addComponent(lblEndereco, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(lblEmail, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)))
											.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(txtEndereco, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
											.addComponent(textEmail))))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(484)
							.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(84, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(111)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(38)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTelefone)
						.addComponent(txtDDD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail)
						.addComponent(textEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(48)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textCep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCep)
								.addComponent(lblEndereco)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(42)
							.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtLote, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLote))
					.addGap(89)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addGap(76))
		);
		cancelarCatalogo();
		setLayout(groupLayout);	
	
	
	}    


	private void cancelarCatalogo() {
		 
	     btnCancelar.addActionListener(new ActionListener() {
		
		 public void actionPerformed(ActionEvent eventoCancelar) {
		
		  if (eventoCancelar.getSource() == btnCancelar) {

				 
		   //dispose();	
		   //new Menu(); 
		   
		  }	
	  }}); 
	 }	



}