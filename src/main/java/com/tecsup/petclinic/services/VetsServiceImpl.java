package com.tecsup.petclinic.services;

import java.util.List;
import java.util.Optional;

import com.tecsup.petclinic.entities.Vets;
import com.tecsup.petclinic.exception.VetNotFoundException;
import com.tecsup.petclinic.repositories.VetRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class VetsServiceImpl implements VetsService{

	VetRepository vetsRepository;
	
	public VetsServiceImpl (VetRepository vetsRepository) {
		this.vetsRepository = vetsRepository;
	}

	@Override
	public Vets create(Vets vets) {
		return vetsRepository.save(vets);
	}
	
	//public Vets update(Vets vets) {
	//	return vetsRepository.save(vets);
	//}

	//@Override
	//public void delete(Integer id) throws VetNotFoundException{

	//	Vets vets = findById(id);
	//	vetsRepository.delete(vets);

	//}
	
	//@Override
	//public Vets findById(Integer id) throws VetNotFoundException {

	//	Optional<Vets> vets = vetsRepository.findById(id);

	//	if ( !vets.isPresent())
	//		throw new VetNotFoundException("Record not found...!");
			
	//	return vets.get();
	//}

	//@Override
	//public List<Vets> findByFirstName(String first_name) {

	//	List<Vets> vets = vetsRepository.findByFirstName(first_name);

	//	vets.stream().forEach(pet -> log.info("" + pet));

	//	return vets;
	//}

	//@Override
	//public List<Vets> findById(int id) {

	//	List<Vets> vets = vetsRepository.findById(id);

	//	vets.stream().forEach(vet -> log.info("" + vet));

	//	return vets;
	//}

	//@Override
	//public List<Vets> findAll() {
		//
	//	return vetsRepository.findAll();

	//}
}
