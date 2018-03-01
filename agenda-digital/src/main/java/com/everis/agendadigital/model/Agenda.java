package com.everis.agendadigital.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.NumberFormat;

@Entity
public class Agenda {
	
	@Id      //tipo IDENTITY deixa o banco de dados tomar conta de como será gerado o id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long codigo;
	private String nome;
	private String email;
	
	@Enumerated(EnumType.STRING)
	private Estados estado;
	
	private String cidade; 
	private String cep; 
	private String bairro;
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	@Enumerated(EnumType.STRING)
	private TipoLogradouro tipoLogradouro;
	
	private String logradouro;
	private String complemento;
	private int numero;
	private String telefone;
	
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public Estados getEstado() {
		return estado;
	}
	public String getCidade() {
		return cidade;
	}
	public String getCep() {
		return cep;
	}
	public String getBairro() {
		return bairro;
	}
	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public int getNumero() {
		return numero;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setEstado(Estados estado) {
		this.estado = estado;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Agenda other = (Agenda) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
}
