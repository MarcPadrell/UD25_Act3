package com.crud.h2.services;

import java.util.List;

import com.crud.h2.dto.Almacenes;

public interface IAlmacenesService {
	
	// Metodos del CRUD
		public List<Almacenes> listarAlmacenes(); // Listar All

		public Almacenes guardarAlmacen(Almacenes almacenes); // Guarda un Departamentos CREATE

		public Almacenes almacenXID(Long id); // Leer datos de un Departamentos READ

		public Almacenes actualizarAlmacenes(Almacenes almacenes); // Actualiza datos del Departamentos UPDATE

		public void eliminarAlmacen(Long id);// Elimina el Departamento DELETE

}
