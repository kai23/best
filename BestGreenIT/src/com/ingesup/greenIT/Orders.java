package com.ingesup.greenIT;

import java.io.Serializable;
import java.lang.Long;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: History
 *
 */
@Entity
public class Orders implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Temporal(TemporalType.DATE)
	@Column(name="StartDate")
	private Date startDate;
	@Temporal(TemporalType.DATE)
	@Column(name="EndDate")
	private Date endDate;
	
	@OneToMany
	@JoinColumn(name="idOrder", referencedColumnName="id")
	private Collection<Users> user;	
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}     
	
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}  
	
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}   
	
	/**
	 * @return the user
	 */
	public Collection<Users> getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(Collection<Users> user) {
		this.user = user;
	}

	public Orders() {
		super();
	}   
   
}
