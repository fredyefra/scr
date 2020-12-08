package br.com.scr.util;

import java.io.Serializable;
import java.rmi.RemoteException;

import br.com.correios.bsb.sigep.master.bean.cliente.AtendeClienteProxy;
import br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP;
import br.com.correios.bsb.sigep.master.bean.cliente.SQLException;
import br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException;
import br.com.scr.model.Endereco;

/**@author fredye
 * Classe responsavel por receber endereco via WS dos correios  
 * */
public class ConsultaCorreiosWrapper implements Serializable {

	private static final long serialVersionUID = 1L;
	private static Endereco endereco = new Endereco();
	private EnderecoERP enderecoERP;

	public ConsultaCorreiosWrapper() {
	}

	public Endereco cepCorreios(String cep) {

		try {
			enderecoERP = new AtendeClienteProxy().consultaCEP(cep);
            endereco.setCep(enderecoERP.getCep());
			endereco.setEndereco(enderecoERP.getEnd());
			endereco.setCidade(enderecoERP.getBairro() + " - " + enderecoERP.getCidade());	  

		}   
		catch (SigepClienteException e) {
			System.out.println("CEP NAO LOCALIZADO!");
			e.printStackTrace();
		}

		catch (SQLException e) {
			System.out.println("Base de Dados Insdiponível, tente mais tarde!");
			e.printStackTrace(); }

		catch (RemoteException e) {
			System.out.println("Web Service Insdiponível, tente mais tarde!");
			e.printStackTrace();
		}
		return endereco;
	}


	/*
	 * public static void main(String[] args) throws
	 * br.com.correios.bsb.sigep.master.bean.cliente.SQLException,
	 * SigepClienteException, RemoteException {
	 * 
	 * System.out.println(new ConsultaCorreiosWrapper().cepCorreios("72600300"));
	 * 
	 * System.out.println(endereco.getCep()+ "--" +endereco.getEndereco()+ "--" +
	 * endereco.getCidade() );
	 * 
	 * 
	 * }
	 */
}