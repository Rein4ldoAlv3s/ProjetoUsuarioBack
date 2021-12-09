package com.reinaldo.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	public String nomeCompleto;
	@Column(unique = true)
	public String cpf;
	public String cep;
	public String logradouro;
	public String complemento;
	@JsonFormat(pattern="yyyy-MM-dd")
	public Date dataNasc;
	public String email;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	public LocalDateTime dataCad;
    
	public Usuario() {
		super();
	}

	public Usuario(Long id, String nomeCompleto, String cpf, String cep, String logradouro, String complemento,
			Date dataNasc, String email, LocalDateTime dataCad) {
		super();
		this.id = id;
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.dataNasc = dataNasc;
		this.email = email;
		this.dataCad = dataCad;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getDataCad() {
		return dataCad;
	}

	public void setDataCad(LocalDateTime dataCad) {
		this.dataCad = dataCad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nomeCompleto=" + nomeCompleto + ", cpf=" + cpf + ", cep=" + cep
				+ ", logradouro=" + logradouro + ", complemento=" + complemento + ", dataNasc=" + dataNasc + ", email="
				+ email + ", dataCad=" + dataCad + "]";
	}
    
    
    
	
	
}

