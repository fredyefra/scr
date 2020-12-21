package br.com.scr.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_cliente")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long cliente_identificador;
	private String nome;
	private String telefone;
	private String email;
	private Endereco fkEndereco = new Endereco();
	private Set<Pedido> pedidos = new HashSet();
    //List<Pedido> pedidos = new ArrayList<Pedido>();

	public Cliente() {

	}

	public Cliente(Endereco fkEndereco) {
		this.fkEndereco = fkEndereco;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cliente_identificador", nullable = false)
	public Long getCliente_identificador() {
		return cliente_identificador;
	}

	public void setCliente_identificador(Long cliente_identificador) {
		this.cliente_identificador = cliente_identificador;
	}

	@Column(name="nome")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name="telefone")
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Column(name="email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fkEndereco") 
	public Endereco getFkEndereco() { 
		return fkEndereco; 
	}

	public void setFkEndereco(Endereco fkEndereco) { 
		this.fkEndereco = fkEndereco; 
	}

	
	
	/*
	 * @OneToMany (cascade = CascadeType.ALL,orphanRemoval = true)
	 * 
	 * @JoinColumn(name="fkPedidos") public List<Pedido> getPedidos() { return
	 * pedidos; }
	 * 
	 * public void setPedidos(List<Pedido> pedidos) { this.pedidos = pedidos; }
	 */
	
	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY, cascade = CascadeType.ALL) 
	public Set<Pedido> getPedidos() { return pedidos; }

	public void setPedidos(Set<Pedido> pedidos) { 
		this.pedidos = pedidos; }

	@Override
	public String toString() {
		return nome;
	}

}