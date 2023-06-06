package com.tecsup.petclinic.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tecsup.petclinic.entities.Vets;

@Repository
public interface VetRepository extends CrudRepository<Vets, Integer> {

	
	List<Vets> findByFirstName(String first_name);

	List<Vets> findById(int id);

	@Override
	List<Vets> findAll();

	
}
