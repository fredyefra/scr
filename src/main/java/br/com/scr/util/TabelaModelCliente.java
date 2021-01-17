package br.com.scr.util;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.AbstractTableModel;

import br.com.scr.dao.GenericDAO;
import br.com.scr.model.Cliente;

public class TabelaModelCliente extends AbstractTableModel {


	private static final long serialVersionUID = 1L;
	private GenericDAO dao;
	private final String [] nomeColunas = {"NOME","TELEFONE","E-MAIL","ENDERECO", "COMPLEMENTO"};

	private List<Cliente> clientes;
    private Cliente cliente = new Cliente();

	public TabelaModelCliente(List<Cliente> clientesParam) {
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

		Cliente clienteSelecionado = clientes.get(linha);
		Object valueObject = null;
		switch(coluna){
		//case 0: valueObject = usuarioSelecionado.getIdentificador(); break;
		case 0: valueObject = clienteSelecionado.getNome(); break;
		case 1 : valueObject = clienteSelecionado.getTelefone(); break;
		case 2 : valueObject = clienteSelecionado.getEmail(); break;
		case 3 : valueObject = clienteSelecionado.getFkEndereco().getEndereco();break;
		case 4 : valueObject = clienteSelecionado.getFkEndereco().getComplemento();break;
		default: System.err.println("Índice inválido para propriedade do bean Usuario.class");
		}			

		return valueObject;
	}

	public Cliente getCliente(int linha) {

		cliente.setCliente_identificador(clientes.get(linha).getCliente_identificador());
		cliente.setNome(clientes.get(linha).getNome());
        cliente.setTelefone(clientes.get(linha).getTelefone());
		cliente.setEmail(clientes.get(linha).getEmail());
        cliente.setFkEndereco(clientes.get(linha).getFkEndereco());
		
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

	@Override
	public String getColumnName(int column) {
		return nomeColunas[column];
	}

	public static void main(String[] args) {

		List<Cliente> clientes = new GenericDAO().findAll();

		TabelaModelCliente model = new TabelaModelCliente(clientes);
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