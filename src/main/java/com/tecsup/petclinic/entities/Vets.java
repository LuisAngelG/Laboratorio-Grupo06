package com.tecsup.petclinic.entities;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.sql.Date;

@Entity(name = "vets")
@Data
public class Vets {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String first_name;
	private String last_name;
	
	public Vets() {
	}

	public Vets(Integer id, String first_name, String last_name) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;

	}
	
	public Vets(String first_name, String last_name) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
	}

}
