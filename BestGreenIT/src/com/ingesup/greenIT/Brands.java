package com.ingesup.greenIT;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Brands
 *
 */
@Entity

public class Brands implements Serializable {

	
	private Long id;
	private String name;
	private static final long serialVersionUID = 1L;

	public Brands() {
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
   
}
