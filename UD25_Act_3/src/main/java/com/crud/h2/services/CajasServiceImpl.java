package com.crud.h2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.ICajasDAO;
import com.crud.h2.dto.Cajas;

@Service
public class CajasServiceImpl implements ICajasService{
	
	@Autowired
	ICajasDAO iCajasDAO;

	@Override
	public List<Cajas> listarCajas() {
		// TODO Auto-generated method stub
		return iCajasDAO.findAll();
	}

	@Override
	public Cajas guardarCaja(Cajas cajas) {
		// TODO Auto-generated method stub
		return iCajasDAO.save(cajas);
	}

	@Override
	public Cajas cajasXID(String num_ref) {
		// TODO Auto-generated method stub
		return iCajasDAO.findById(num_ref).get();
	}

	@Override
	public Cajas actualizarCajas(Cajas cajas) {
		// TODO Auto-generated method stub
		return iCajasDAO.save(cajas);
	}

	@Override
	public void eliminarCajas(String num_ref) {
		// TODO Auto-generated method stub
		iCajasDAO.deleteById(num_ref);
	}

}
