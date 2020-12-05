package br.com.scr.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@XmlRootElement
@Entity
@Table(name="tb_endereco")
public class Endereco implements EntityBase, Serializable {

	private static final long serialVersionUID = 1L;

	private Long identificador;
	private String cep;
	private String endereco;
	private String complemento;
	private String cidade;

	public Endereco() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "identificador", nullable = false)
	@Override
	public Long getIdentificador() {
		return identificador;
	}	

	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
	}

   @Column(name = "cep", nullable = true)
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

   @Column(name = "endereco", nullable = true)
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Column(name = "cidade", nullable = true)	
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Column(name = "complemento", nullable = true)
	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identificador == null) ? 0 : identificador.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (identificador == null) {
			if (other.identificador != null)
				return false;
		} else if (!identificador.equals(other.identificador))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "**** IDENTIFICADOR ENDERECO MODEL **** ";
	}
}