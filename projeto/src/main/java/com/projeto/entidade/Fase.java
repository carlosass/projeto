package com.projeto.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Fase {

	@Id
	@GeneratedValue(generator = "fase_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "fase_seq", sequenceName = "fase_seq", allocationSize = 1, initialValue = 1)
	private Integer id;

	private String descricao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
