package br.com.scr.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_cliente")
public class Cliente implements EntityBase,  Serializable {

	private static final long serialVersionUID = 1L;
    private Long identificador;
	private String nome;
	private String telefone;
	private String email;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
    
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "identificador", nullable = false)
	public Long getIdentificador() {
		// TODO Auto-generated method stub
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}