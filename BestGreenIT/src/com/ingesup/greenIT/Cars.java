package com.ingesup.greenIT;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Cars
 *
 */
@Entity

public class Cars implements Serializable {

	
	private Long id;
	private Integer miles;
	private Categories idCategory;
	private Models idModel;
	private Agencies idAgency;
	private static final long serialVersionUID = 1L;

	public Cars() {
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
	public Integer getMiles() {
		return this.miles;
	}

	public void setMiles(Integer miles) {
		this.miles = miles;
	}
   
}
