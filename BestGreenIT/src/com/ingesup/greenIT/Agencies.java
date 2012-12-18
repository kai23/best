package com.ingesup.greenIT;

import java.io.Serializable;
import java.lang.String;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Agencies
 *
 */
@Entity

public class Agencies implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="Name")
	private String name;
	
	@OneToMany
	@JoinColumn(name="idAgency", referencedColumnName="id")
	private Collection<Cars> cars;	
	
	
	private static final long serialVersionUID = 1L;

	public Agencies() {
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

	public Collection<Cars> getCars() {
		return cars;
	}

	public void setCars(Collection<Cars> cars) {
		this.cars = cars;
	}   
   
}
