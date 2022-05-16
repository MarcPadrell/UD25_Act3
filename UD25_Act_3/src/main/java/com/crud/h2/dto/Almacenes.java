package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "almacenes") // en caso que la tabla sea diferente
public class Almacenes {

	// Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "lugar") // no hace falta si se llama igual
	private String lugar;
	@Column(name = "capacidad") // no hace falta si se llama igual
	private int capacidad;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Cajas> cajas;

	public Almacenes() {
		
	}
	
	public Almacenes(Long codigo, String lugar, int presupuesto) {
		this.id = codigo;
		this.lugar = lugar;
		this.capacidad = presupuesto;
	}

	public Long getCodigo() {
		return id;
	}

	public void setCodigo(Long codigo) {
		this.id = codigo;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int presupuesto) {
		this.capacidad = presupuesto;
	}

	public void setCajas(List<Cajas> cajas) {
		this.cajas = cajas;
	}
	
	/**
	 * @return the video
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Cajas")
	public List<Cajas> getCajas() {
		return cajas;
	}

	@Override
	public String toString() {
		return "Almacenes [codigo=" + id + ", lugar=" + lugar + ", presupuesto=" + capacidad + ", cajas=" + cajas
				+ "]";
	}
	
}
