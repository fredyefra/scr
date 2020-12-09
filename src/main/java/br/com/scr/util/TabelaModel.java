package br.com.scr.util;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.AbstractTableModel;

import br.com.scr.dao.GenericDAO;
import br.com.scr.model.Cliente;

public class TabelaModel extends AbstractTableModel {


	private static final long serialVersionUID = 1L;
	private GenericDAO dao;
	private final String [] nomeColunas = {"NOME","TELEFONE","E-MAIL","ENDERECO", "COMPLEMENTO"};

	private List<Cliente> clientes;


	public TabelaModel(List<Cliente> clientesParam) {
		//this.fireTableDataChanged();
		clientes = clientesParam;	 
	}

	@Override
	public int getRowCount() {
		return clientes.size();
	}

	@Override
	public int getColumnCount() {
		return  nomeColunas.length;	
	}



	@Override
	public Object getValueAt(int linha, int coluna) {
		// TODO Auto-generated method stub

		    Cliente usuarioSelecionado = clientes.get(linha);
	        Object valueObject = null;
	        switch(coluna){
	            //case 0: valueObject = usuarioSelecionado.getIdentificador(); break;
	            case 0: valueObject = usuarioSelecionado.getNome(); break;
	            case 1 : valueObject = usuarioSelecionado.getTelefone(); break;
	            case 2 : valueObject = usuarioSelecionado.getEmail(); break;
	            case 3 : valueObject = usuarioSelecionado.getFkEndereco().getEndereco();break;
	            case 4 : valueObject = usuarioSelecionado.getFkEndereco().getComplemento();break;
	            default: System.err.println("Índice inválido para propriedade do bean Usuario.class");
	        }			
		
		return valueObject;
	}

	public Cliente getCliente(int linha) {

		Cliente cliente = new Cliente();

		cliente.setNome(clientes.get(linha).getNome());

		return cliente;

	}


	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
		case 0: 
			return String.class;

		case 1: 
			return String.class;	

		case 2: 
			return String.class;	

		case 3: 
			return String.class;	
	
		case 4: 
			return String.class;	
		}
	
		return null;
	
	}

	public Cliente addRow() {
		clientes.addAll(new GenericDAO().findAll());
	     for (Cliente cliente : clientes) {
			cliente.getIdentificador();
		    cliente.getNome();
	     }
	return clientes.get(0);
	}
	

	@Override
	public String getColumnName(int column) {
		return nomeColunas[column];
	}


	public static void main(String[] args) {

		List<Cliente> clientes = new GenericDAO().findAll();
		
		TabelaModel model = new TabelaModel(clientes);
		JTable table = new JTable(model);	
		JFrame frame = new JFrame();

		table.setModel(model);
		
		frame.setSize(800, 600);
		
		JScrollPane scroller =
				new JScrollPane (table,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
							             ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS); 
		frame.add(scroller);
		frame.setVisible(true); 
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}