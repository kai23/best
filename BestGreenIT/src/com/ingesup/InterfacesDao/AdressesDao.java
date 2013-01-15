package com.ingesup.InterfacesDao;

import java.util.List;
import com.ingesup.greenIT.Adresses;

public interface AdressesDao extends DAO<Integer, Adresses> {
	List<Adresses> findByZipCode(Integer zipCode);
	List<Adresses> findByCountry(String country);
	List<Adresses> findByCity(String city);	
}
