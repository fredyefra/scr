package br.com.scr.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	private String observacao;
	private Cliente cliente = new Cliente();

	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public Pedido(String observacao, Cliente cliente) {
		this.observacao = observacao;
		//this.cliente = cliente;
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

	@Column(name="observacao")
	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	  @ManyToOne
	  @JoinColumn(name = "cliente_identificador", nullable = false)
	  public Cliente getCliente() { return cliente; }
	  
	  public void setCliente(Cliente cliente) { this.cliente = cliente; }
	 

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