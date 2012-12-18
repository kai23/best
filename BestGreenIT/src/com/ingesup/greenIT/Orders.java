package com.ingesup.greenIT;

import java.io.Serializable;
import java.lang.Long;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: History
 *
 */
@Entity
public class Orders implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Users idUser;
	private Date startDate;
	private Date endDate;
	private Cars idCar;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public Users getIdUser() {
		return this.idUser;
	}

	public void setIdUser(Users idUser) {
		this.idUser = idUser;
	}   
	
	@Temporal(TemporalType.DATE)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}  
	
	@Temporal(TemporalType.DATE)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}   
	public Cars getIdCar() {
		return this.idCar;
	}

	public void setIdCar(Cars idCar) {
		this.idCar = idCar;
	}
	
	public Orders() {
		super();
	}   
   
}
