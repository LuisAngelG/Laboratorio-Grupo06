package com.tecsup.petclinic.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tecsup.petclinic.entities.Vets;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class VetsTest {
	
	@Autowired
	private VetsService vetsService;
	@Test
	 public void testCreateVets() {

        String FIRST_NAME = "Luis";
        String LAST_NAME = "Gastelu";

        Vets vets = new Vets(FIRST_NAME, LAST_NAME);

        Vets vetsCreated = this.vetsService.create(vets);

        log.info("VETS CREATED :" + vetsCreated);

        assertNotNull(vets.getId());
        assertEquals(FIRST_NAME, vets.getFirstName());
        assertEquals(LAST_NAME, vets.getLastName());

    }
	
}
