package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Vets;
import com.tecsup.petclinic.exception.VetNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tecsup.petclinic.entities.Vets;

@SpringBootTest
@Slf4j
public class VetsTest {

	private VetsService vetsService;
	@Test
	 public void testCreateVets() {

        String FIRST_NAME = "Luis";
        String LAST_NAME = "Gastelu";

        Vets vets = new Vets(FIRST_NAME, LAST_NAME);

        Vets vetsCreated = this.vetsService.create(vets);

        log.info("VETS CREATED :" + vetsCreated);

        assetNotNull(vets.getid());
        assertEquals(FIRST_NAME, vets.getfirst_name());
        assertEquals(LAST_NAME, vets.getlast_name());

    }
	
}
