package com.projeto.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class ProjetoFase {

	@Id
	@GeneratedValue(generator = "projetoFase_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "projetoFase_seq", sequenceName = "projetoFase_seq", allocationSize = 1, initialValue = 1)
	private Integer id;

	private String qtdDias;
	
	@OneToOne
	private Fase fase;

	public String getQtdDias() {
		return qtdDias;
	}

	public void setQtdDias(String qtdDias) {
		this.qtdDias = qtdDias;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Fase getFase() {
		return fase;
	}

	public void setFase(Fase fase) {
		this.fase = fase;
	}

}
