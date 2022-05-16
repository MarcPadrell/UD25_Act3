package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Almacenes;
import com.crud.h2.services.AlmacenesServiceImpl;

@RestController
@RequestMapping("/api")
public class AlmacenesController {
	
	@Autowired
	AlmacenesServiceImpl almacenesServideImpl;

	@GetMapping("/almacenes")
	public List<Almacenes> listarAlmacenes() {
		return almacenesServideImpl.listarAlmacenes();
	}

	@PostMapping("/almacenes")
	public Almacenes salvarAlmacenes(@RequestBody Almacenes almacenes) {

		return almacenesServideImpl.guardarAlmacen(almacenes);
	}

	@GetMapping("/almacenes/{id}")
	public Almacenes almacenXID(@PathVariable(name = "id") Long id) {

		Almacenes almacen_xid = new Almacenes();

		almacen_xid = almacenesServideImpl.almacenXID(id);

		System.out.println("Almacenes XID: " + almacen_xid);

		return almacen_xid;
	}

	@PutMapping("/almacenes/{id}")
	public Almacenes actualizarAlmacenes(@PathVariable(name = "id") Long id, @RequestBody Almacenes almacenes) {

		Almacenes almacen_seleccionado = new Almacenes();
		Almacenes almacen_actualizado = new Almacenes();

		almacen_seleccionado = almacenesServideImpl.almacenXID(id);

		almacen_seleccionado.setLugar(almacenes.getLugar());
		almacen_seleccionado.setCapacidad(almacenes.getCapacidad());

		almacen_actualizado = almacenesServideImpl.actualizarAlmacenes(almacen_seleccionado);

		System.out.println("El Almacenes actualizado es: " + almacen_actualizado);

		return almacen_actualizado;
	}

	@DeleteMapping("/almacenes/{id}")
	public void eleiminarAlmacenes(@PathVariable(name = "id") Long id) {
		almacenesServideImpl.eliminarAlmacen(id);
	}

}
