package br.com.scr.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_cliente")
public class Cliente implements EntityBase,  Serializable {

	private static final long serialVersionUID = 1L;
	private Long identificador;
	private String nome;
	private String telefone;
	private String email;
	private Endereco fkEndereco = new Endereco();

	public Cliente() {

	}

	public Cliente(Endereco fkEndereco) {
		this.fkEndereco = fkEndereco;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "identificador", nullable = false)
	public Long getIdentificador() {
		return identificador;
	}	

	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
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
	@JoinColumn(name="fkEndereco") public Endereco getFkEndereco() { 
		return fkEndereco; 
	}

	public void setFkEndereco(Endereco fkEndereco) { 
		this.fkEndereco = fkEndereco; 
	}

	/*public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}*/

	@Override
	public String toString() {
		return nome;
	}

}