package com.ingesup.greenIT;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Collection;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Rights
 *
 */
@Entity
public class Rights implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;   
	
	@Column(name="Label")
	private String name;
	
	@OneToMany
	@JoinColumn(name="idRight", referencedColumnName="id")
	private Collection<Users> user;	

	public Rights() {
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
