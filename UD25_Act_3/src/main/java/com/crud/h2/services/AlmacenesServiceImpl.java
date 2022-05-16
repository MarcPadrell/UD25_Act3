package com.crud.h2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IAlmacenesDAO;
import com.crud.h2.dto.Almacenes;

@Service
public class AlmacenesServiceImpl implements IAlmacenesService{
	
	@Autowired
	IAlmacenesDAO iAlmacenesDAO;

	@Override
	public List<Almacenes> listarAlmacenes() {
		// TODO Auto-generated method stub
		return iAlmacenesDAO.findAll();
	}

	@Override
	public Almacenes guardarAlmacen(Almacenes almacenes) {
		// TODO Auto-generated method stub
		return iAlmacenesDAO.save(almacenes);
	}

	@Override
	public Almacenes almacenXID(Long id) {
		// TODO Auto-generated method stub
		return iAlmacenesDAO.findById(id).get();
	}

	@Override
	public Almacenes actualizarAlmacenes(Almacenes almacenes) {
		// TODO Auto-generated method stub
		return iAlmacenesDAO.save(almacenes);
	}

	@Override
	public void eliminarAlmacen(Long id) {
		// TODO Auto-generated method stub
		iAlmacenesDAO.deleteById(id);
	}

}
