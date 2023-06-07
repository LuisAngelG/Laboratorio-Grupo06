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
	@Column(name = "first_name") 
	private String firstName;
	@Column(name = "last_name") 
	private String lastName;
	
	public Vets() {
	}

	public Vets(Integer id, String first_name, String last_name) {
		super();
		this.id = id;
		this.firstName = first_name;
		this.lastName = last_name;

	}
	
	public Vets(String first_name, String last_name) {
		super();
		this.firstName = first_name;
		this.lastName = last_name;
	}

}
