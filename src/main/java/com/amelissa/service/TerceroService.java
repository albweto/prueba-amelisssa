package com.amelissa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amelissa.model.terceros;
import com.amelissa.repository.TerceroRepository;
@Service
public class TerceroService implements ITercerosService {
	
	@Autowired
	private TerceroRepository repositorio;

	@Override
	public List<terceros> getAll() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Optional<terceros> getTerceroById(long id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id);
	}

	@Override
	public void updateTerceros(terceros ter) {
		// TODO Auto-generated method stub
		repositorio.save(ter);
	}

	@Override
	public void addTerceros(String name, int documento, String direction) {
		// TODO Auto-generated method stub
		repositorio.save(new terceros(name,documento,direction));
	}

	@Override
	public void deleteTercero(long id) {
		// TODO Auto-generated method stub
		Optional<terceros> terceros = repositorio.findById(id);
		if(terceros.isPresent()) {
			repositorio.deleteById(id);
		}
		
	}

	@Override
	public void saveTercero(terceros ter) {
		// TODO Auto-generated method stub
		repositorio.save(ter);
	}

}
