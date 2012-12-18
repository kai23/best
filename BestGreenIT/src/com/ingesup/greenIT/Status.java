package com.ingesup.greenIT;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Status
 *
 */
@Entity

public class Status implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@OneToMany
	@JoinColumn(name="idStatus", referencedColumnName="id")
	private Collection<Orders> order;	
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the order
	 */
	public Collection<Orders> getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(Collection<Orders> order) {
		this.order = order;
	}

	public Status() {
		super();
	}
   
}
