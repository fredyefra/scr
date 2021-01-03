package br.com.scr.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="tb_pedido")
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long pedido_identificador;
	private String marmita;
	private Cliente fkCliente = new Cliente();

	public Pedido() {

	}

	public Pedido(String marmita, Cliente fkCliente) {
		this.marmita = marmita;
		this.fkCliente = fkCliente;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pedido_identificador", nullable = false)
	public Long getPedido_identificador() {
		return pedido_identificador;
	}

	public void setPedido_identificador(Long pedido_identificador) {
		this.pedido_identificador = pedido_identificador;
	}

	@Column(name="marmita")
	public String getMarmita() {
		return marmita;
	}

	public void setMarmita(String marmita) {
		this.marmita = marmita;
	}


	@ManyToOne
	@JoinColumn(name = "fkCliente", nullable = false)
	public Cliente getFkCliente() {
		return fkCliente;
	}

	public void setFkCliente(Cliente fkCliente) {
		this.fkCliente = fkCliente;
	}

	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pedido_identificador == null) ? 0 : pedido_identificador.hashCode());
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return pedido_identificador != null && pedido_identificador.equals(other.getPedido_identificador());
	}

	@Override
	public String toString() {
		return "**** IDENTIFICADOR WEB SERVICE **** " + this + pedido_identificador;
	}

}