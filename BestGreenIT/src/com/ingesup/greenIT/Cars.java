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

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer miles;
	private Categories idCategory;
	private Models idModel;
	private Agencies idAgency;
	private static final long serialVersionUID = 1L;

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
	
	public Categories getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Categories idCategory) {
		this.idCategory = idCategory;
	}

	public Models getIdModel() {
		return idModel;
	}

	public void setIdModel(Models idModel) {
		this.idModel = idModel;
	}

	public Agencies getIdAgency() {
		return idAgency;
	}

	public void setIdAgency(Agencies idAgency) {
		this.idAgency = idAgency;
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
   
}
