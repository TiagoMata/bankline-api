package com.dio.santander.banklineapi.model;

import java.sql.Date;
import java.time.LocalDateTime;

public class Movimentacao {
	//Atributos da classe movimentação >>>>  ID, DataHora, descricao e valor
	
	private Integer id;
	private LocalDateTime dataHORA;
	private Integer descricao;
	private double valor;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getDate() {
		return dataHORA;
	}
	public void setdataHora(LocalDateTime dataHora) {
		this.dataHORA = dataHora;
	}
	public Integer getDescricao() {
		return descricao;
	}
	public void setdescricao(Integer descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setvalor(Double valor) {
		this.valor = valor;
	}
}
