package br.com.scr.painel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClientesBanner extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel;
	
	/**
	 * Create the panel.
	 */
	public ClientesBanner() {
        setBackground(new Color(46, 204, 113));
		add(desenharBanner());
    }

	private JLabel desenharBanner() {
		jLabel = new JLabel();
		jLabel.setIcon(new ImageIcon("add-user-24.png"));
		jLabel.setFont(new Font("Calibri", 1, 36));
		jLabel.setForeground(new java.awt.Color(255, 255, 255));
		jLabel.setText("Cadastrar Cliente");
		jLabel.setIconTextGap(20);
		return jLabel;
	}
}