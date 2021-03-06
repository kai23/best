package com.ingesup.greenIT;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Adresses
 *
 */
@Entity
public class Adresses implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="Number")
	private int number;
	
	@Column(name="Street")
	private String street;
	
	@Column(name="StreetNext")
	private String streetNext;
	
	@Column(name="ZipCode")
	private int zipCode;
	
	@Column(name="City")
	private String city;
	
	@Column(name="Country")
	private String country;
	
	@OneToMany
	@JoinColumn(name="idAdress", referencedColumnName="id")
	private Collection<Agencies> agency;	
	
	@OneToMany
	@JoinColumn(name="idAdress", referencedColumnName="id")
	private Collection<Users> user;

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
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
		
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the streetNext
	 */
	public String getStreetNext() {
		return streetNext;
	}

	/**
	 * @param streetNext the streetNext to set
	 */
	public void setStreetNext(String streetNext) {
		this.streetNext = streetNext;
	}

	/**
	 * @return the zipCode
	 */
	public int getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	public Collection<Agencies> getAgency() {
		return agency;
	}

	public void setAgency(Collection<Agencies> agency) {
		this.agency = agency;
	}

	public Collection<Users> getUser() {
		return user;
	}

	public void setUser(Collection<Users> user) {
		this.user = user;
	}

	public Adresses() {
		super();
	}
   
}
