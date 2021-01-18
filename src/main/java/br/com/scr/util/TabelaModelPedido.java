package br.com.scr.util;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.AbstractTableModel;

import br.com.scr.dao.GenericDAO;
import br.com.scr.model.Cliente;
import br.com.scr.model.Pedido;

public class TabelaModelPedido extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	
	private final String [] nomeColunas = {"NOME","TELEFONE","ENDEREÇO","MARMITA", "STATUS"};
	private List<Pedido> pedidos;
	private Pedido pedido = new Pedido();

	public TabelaModelPedido(List<Pedido> pedidosParam) {
		pedidos = pedidosParam;	 
	}

	@Override
	public int getRowCount() {
		return pedidos.size();
	}

	@Override
	public int getColumnCount() {
		return  nomeColunas.length;	
	}

	@Override
	public Object getValueAt(int linha, int coluna) {
		// TODO Auto-generated method stub

		Pedido pedidoSelecionado = pedidos.get(linha);
		Object valueObject = null;
		switch(coluna){
		//case 0: valueObject = usuarioSelecionado.getIdentificador(); break;
		case 0: valueObject = pedidoSelecionado.getFkCliente().getNome(); break;
		case 1 : valueObject = pedidoSelecionado.getFkCliente().getTelefone(); break;
		case 2 : valueObject = pedidoSelecionado.getFkCliente().getFkEndereco().getEndereco(); break;
		case 3 : valueObject = pedidoSelecionado.getMarmita();break;
		case 4 : valueObject = pedidoSelecionado.getStatusPedido();break;
		default: System.err.println("Índice inválido para propriedade do bean Usuario.class");
		}			

		return valueObject;
	}

	public Pedido getCliente(int linha) {

		pedido.setPedido_identificador(pedidos.get(linha).getPedido_identificador());
        pedido.getFkCliente().setNome(pedidos.get(linha).getFkCliente().getNome());
        pedido.getFkCliente().setTelefone(pedidos.get(linha).getFkCliente().getTelefone());
        pedido.getFkCliente().getFkEndereco().setEndereco(pedidos.get(linha).getFkCliente().getFkEndereco().getEndereco()+ 
        		pedidos.get(linha).getFkCliente().getFkEndereco().getComplemento());
        pedido.setMarmita(pedidos.get(linha).getMarmita());
        pedido.setStatusPedido(pedidos.get(linha).getStatusPedido());
        return pedido;

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

		List<Pedido> pedidos = new GenericDAO().findAllPedidos(1L);

		TabelaModelPedido model = new TabelaModelPedido(pedidos);
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