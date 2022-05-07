package com.dio.santander.banklineapi.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "tab_movimentacao")
public class Movimentacao {
	//Atributos da classe movimentação >>>>  ID, DataHora, descricao e valor
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "data_hora")
	private LocalDateTime dataHora;
	
	private String descricao;
	
	private double valor;
	
	@Enumerated(EnumType.STRING)
	private MovimentacaoTipo tipo;
	
	@Column(name = "id_conta")
	private Integer idConta;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getDate() {
		return dataHora;
	}
	public void setdataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setdescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setvalor(Double valor) {
		this.valor = valor;
	}
	public Integer getIdConta() {
		return idConta;
	}
	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}
}
