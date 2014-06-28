package com.projeto.entidade;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;

@Entity
public class Projeto {

   @Id
   @GeneratedValue(generator="projeto_seq", strategy=GenerationType.SEQUENCE)
   @SequenceGenerator(name="projeto_seq", sequenceName="projeto_seq", allocationSize=1, initialValue=1)
   private Integer id;
   
   private String id2;
   
   private String descricao;
   
	@Temporal(TemporalType.DATE)
	private Date dataInicio = new Date();
	
	@Temporal(TemporalType.DATE)
	private Date dataCriacao = new Date();
	
	@SuppressWarnings("deprecation")
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "projeto_id")
	@Cascade(value = org.hibernate.annotations.CascadeType.DELETE_ORPHAN)
	private Set<ProjetoFase> lstProjetoFase = new HashSet<ProjetoFase>();

	public String getId2() {
		return id2;
	}

	public void setId2(String id2) {
		this.id2 = id2;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Set<ProjetoFase> getLstProjetoFase() {
		return lstProjetoFase;
	}

	public void setLstProjetoFase(Set<ProjetoFase> lstProjetoFase) {
		this.lstProjetoFase = lstProjetoFase;
	}
	

  
   

}
