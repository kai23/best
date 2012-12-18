package com.ingesup.greenIT;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Models
 *
 */
@Entity

public class Models implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private Brands idBrand;
	private static final long serialVersionUID = 1L;

	public Models() {
		super();
	}   

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
	public Brands getIdBrand() {
		return this.idBrand;
	}

	public void setIdBrand(Brands idBrand) {
		this.idBrand = idBrand;
	}
   
}
