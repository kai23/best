package com.ingesup.JpaDao;

import java.util.List;

import javax.persistence.Query;

import com.ingesup.InterfacesDao.AdressesDao;
import com.ingesup.greenIT.Adresses;

public class JpaAdressesDao extends JpaDao<Integer, Adresses> implements AdressesDao {

	@Override
	public List<Adresses> findByZipCode(Integer zipCode) {
		Query q = entityManager.createQuery(
				"SELECT a FROM " + entityClass.getName() + " a WHERE a.zipCode = :zipCode");
		q.setParameter("zipCode", zipCode);
		return (List<Adresses>) q.getResultList();
	}

	@Override
	public List<Adresses> findByCountry(String country) {
		Query q = entityManager.createQuery(
				"SELECT a FROM " + entityClass.getName() + " a WHERE a.country = :country");
		q.setParameter("country", country);
		return (List<Adresses>) q.getResultList();
	}

	@Override
	public List<Adresses> findByCity(String city) {
		Query q = entityManager.createQuery(
				"SELECT a FROM " + entityClass.getName() + " a WHERE a.city = :city");
		q.setParameter("city", city);
		return (List<Adresses>) q.getResultList();
	}

	

}
