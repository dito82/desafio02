package com.devsuperior.desafio02.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_bloco")
public class Bloco implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Instant inicio;
	private Instant fim;

	public Bloco() {
	}

	public Bloco(Integer id, Instant inicio, Instant fim) {
		super();
		this.id = id;
		this.inicio = inicio;
		this.fim = fim;
	}

	public Integer getId() {
		return id;
	}

	public Instant getInicio() {
		return inicio;
	}

	public Instant getFim() {
		return fim;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setInicio(Instant inicio) {
		this.inicio = inicio;
	}

	public void setFim(Instant fim) {
		this.fim = fim;
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
		Bloco other = (Bloco) obj;
		return Objects.equals(id, other.id);
	}

}