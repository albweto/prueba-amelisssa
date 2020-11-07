package com.amelissa.service;

import java.util.List;
import java.util.Optional;

import com.amelissa.model.terceros;
public interface ITercerosService {

	List<terceros> getAll();
	Optional <terceros> getTerceroById(long id);
	void updateTerceros(terceros ter);
	void addTerceros(String name, int documento, String direction);
	void deleteTercero(long id);
	void saveTercero(terceros ter);
	

	
}
