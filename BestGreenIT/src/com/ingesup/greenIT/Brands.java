package com.ingesup.greenIT;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Brands
 *
 */
@Entity

public class Brands implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany
	@JoinColumn(name="idModel", referencedColumnName="id")
	private Collection<Models> models;	
	
	@Column(name="Label")
	private String name;
	
	public Collection<Models> getModels() {
		return models;
	}

	public void setModels(Collection<Models> models) {
		this.models = models;
	}

	public Brands() {
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
