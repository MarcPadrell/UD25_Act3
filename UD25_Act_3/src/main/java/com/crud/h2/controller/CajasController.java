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

import com.crud.h2.dto.Cajas;
import com.crud.h2.services.CajasServiceImpl;

@RestController
@RequestMapping("/api")
public class CajasController {

	@Autowired
	CajasServiceImpl cajasServiceImpl;

	@GetMapping("/cajas")
	public List<Cajas> listarCajas() {
		return cajasServiceImpl.listarCajas();
	}

	@PostMapping("/cajas")
	public Cajas salvarCaja(@RequestBody Cajas cajas) {

		return cajasServiceImpl.guardarCaja(cajas);
	}

	@GetMapping("/cajas/{num_referencia}")
	public Cajas cajasXID(@PathVariable(name = "num_referencia") String num_ref) {

		Cajas caja_xid = new Cajas();

		caja_xid = cajasServiceImpl.cajasXID(num_ref);

		System.out.println("Caja XID: " + caja_xid);

		return caja_xid;
	}

	@PutMapping("/cajas/{num_referencia}")
	public Cajas actualizarCajas(@PathVariable(name = "num_referencia") String num_ref, @RequestBody Cajas cajas) {

		Cajas caja_seleccionado = new Cajas();
		Cajas caja_actualizado = new Cajas();

		caja_seleccionado = cajasServiceImpl.cajasXID(num_ref);

		caja_seleccionado.setContenido(cajas.getContenido());
		caja_seleccionado.setValor(cajas.getValor());

		caja_actualizado = cajasServiceImpl.actualizarCajas(caja_seleccionado);

		System.out.println("La caja actualizado es: " + caja_actualizado);

		return caja_actualizado;
	}

	@DeleteMapping("/cajas/{num_referencia}")
	public void eliminarCaja(@PathVariable(name = "num_referencia") String num_ref) {
		cajasServiceImpl.eliminarCajas(num_ref);
	}

}
