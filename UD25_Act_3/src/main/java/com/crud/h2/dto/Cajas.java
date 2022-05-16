package com.crud.h2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cajas") // en caso que la tabla sea diferente
public class Cajas {

	// Atributos de entidad cliente
	@Id
	@Column(name = "num_referencia") // no hace falta si se llama igual
	private String num_referencia;
	
	@Column(name = "contenido") // no hace falta si se llama igual
	private String contenido;
	
	@Column(name = "valor") // no hace falta si se llama igual
	private int valor;

	@ManyToOne
	@JoinColumn(name = "cod_almacen")
	private Almacenes almacenes;

	public Cajas() {

	}

	public Cajas(String num_referencia, String contenido, int valor) {
		this.num_referencia = num_referencia;
		this.contenido = contenido;
		this.valor = valor;
	}

	public String getNum_referencia() {
		return num_referencia;
	}

	public void setNum_referencia(String num_referencia) {
		this.num_referencia = num_referencia;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Almacenes getAlmacenes() {
		return almacenes;
	}

	public void setAlmacenes(Almacenes almacenes) {
		this.almacenes = almacenes;
	}

	@Override
	public String toString() {
		return "Cajas [num_referencia=" + num_referencia + ", contenido=" + contenido + ", valor=" + valor
				+ ", almacenes=" + almacenes + "]";
	}

}