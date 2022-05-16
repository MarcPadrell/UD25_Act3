package com.crud.h2.services;

import java.util.List;

import com.crud.h2.dto.Cajas;

public interface ICajasService {

	// Metodos del CRUD
	public List<Cajas> listarCajas(); // Listar All

	public Cajas guardarCaja(Cajas cajas); // Guarda un video CREATE

	public Cajas cajasXID(String num_ref); // Leer datos de un video READ

	public Cajas actualizarCajas(Cajas cajas); // Actualiza datos del video UPDATE

	public void eliminarCajas(String num_ref);// Elimina el video DELETE

}
