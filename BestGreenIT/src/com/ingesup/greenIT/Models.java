package com.ingesup.greenIT;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Models
 *
 */
@Entity

public class Models implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="Name")
	private String name;
	
	@OneToMany
	@JoinColumn(name="idModel", referencedColumnName="id")
	private Collection<Cars> cars;	

	public Collection<Cars> getCars() {
		return cars;
	}

	public void setCars(Collection<Cars> cars) {
		this.cars = cars;
	}

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
   
}
