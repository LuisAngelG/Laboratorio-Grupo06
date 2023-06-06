package com.tecsup.petclinic.services;

import java.util.List;

import com.tecsup.petclinic.entities.Vets;
import com.tecsup.petclinic.exception.PetNotFoundException;
import com.tecsup.petclinic.exception.VetNotFoundException;

public interface VetsService {
	
	Vets create(Vets vets);

	Vets update(Vets vets);

	void delete(Integer id) throws VetNotFoundException;

	Vets findById(Integer id) throws VetNotFoundException;

	List<Vets> findByFirstName(String first_name);

	List<Vets> findById(int id);

	List<Vets> findAll();
}
