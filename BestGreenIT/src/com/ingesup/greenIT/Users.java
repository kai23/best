package com.ingesup.greenIT;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Users
 *
 */
@Entity

public class Users implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String surname;
	private String email;
	private String password;
	private boolean state;
	private Rights idRight;
	private Date birthDate;
	private Adresses idAdress;
	private String driveLicenceNumber;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	
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
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the state
	 */
	public boolean getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(boolean state) {
		this.state = state;
	}

	/**
	 * @return the idRight
	 */
	public Rights getIdRight() {
		return idRight;
	}

	/**
	 * @param idRight the idRight to set
	 */
	public void setIdRight(Rights idRight) {
		this.idRight = idRight;
	}

	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return the idAdress
	 */
	public Adresses getIdAdress() {
		return idAdress;
	}

	/**
	 * @param idAdress the idAdress to set
	 */
	public void setIdAdress(Adresses idAdress) {
		this.idAdress = idAdress;
	}

	/**
	 * @return the driveLicenceNumber
	 */
	public String getDriveLicenceNumber() {
		return driveLicenceNumber;
	}

	/**
	 * @param driveLicenceNumber the driveLicenceNumber to set
	 */
	public void setDriveLicenceNumber(String driveLicenceNumber) {
		this.driveLicenceNumber = driveLicenceNumber;
	}

	public Users() {
		super();
	}
   
}
