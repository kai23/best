package com.ingesup.greenIT;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Agencies
 *
 */
@Entity

public class Agencies implements Serializable {

	
	private Long id;
	private String name;
	private Adresses idAdress;
	private static final long serialVersionUID = 1L;

	public Agencies() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public Adresses getIdAdress() {
		return this.idAdress;
	}

	public void setIdAdress(Adresses idAdress) {
		this.idAdress = idAdress;
	}
   
}
