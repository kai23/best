package com.ingesup.greenIT;

import java.io.Serializable;
import java.lang.Long;
import java.util.Formatter$DateTime;
import javax.persistence.*;

import org.eclipse.persistence.jpa.jpql.parser.DateTime;

/**
 * Entity implementation class for Entity: History
 *
 */
@Entity

public class Orders implements Serializable {

	
	private Long id;
	private Users idUser;
	private DateTime startDate;
	private DateTime endDate;
	private Cars idCar;
	private static final long serialVersionUID = 1L;

	public Orders() {
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
	public Users getIdUser() {
		return this.idUser;
	}

	public void setIdUser(Users idUser) {
		this.idUser = idUser;
	}   
	public DateTime getStartDate() {
		return this.startDate;
	}

	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}   
	public DateTime getEndDate() {
		return this.endDate;
	}

	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}   
	public Cars getIdCar() {
		return this.idCar;
	}

	public void setIdCar(Cars idCar) {
		this.idCar = idCar;
	}
   
}
