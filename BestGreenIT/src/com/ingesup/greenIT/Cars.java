package com.ingesup.greenIT;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Cars
 *
 */
@Entity

public class Cars implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="Miles")
	private Integer miles;

	@OneToMany
	@JoinColumn(name="idCar", referencedColumnName="id")
	private Collection<Orders> order;	
	
	public Cars() {
		super();
	}  
	
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

	public Collection<Orders> getOrder() {
		return order;
	}

	public void setOrder(Collection<Orders> order) {
		this.order = order;
	}
   
}
