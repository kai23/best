package com.ingesup.JpaDao;

import java.util.List;

import javax.persistence.Query;

import com.ingesup.InterfacesDao.AgenciesDao;
import com.ingesup.greenIT.Adresses;
import com.ingesup.greenIT.Agencies;

public class JpaAgenciesDao extends JpaDao<Integer, Agencies> implements AgenciesDao {

	@Override
	public List<Agencies> findByName(String name) {
		Query q = entityManager.createQuery(
				"SELECT a FROM " + entityClass.getName() + " a WHERE a.name = :name");
		q.setParameter("name", name);
		return (List<Agencies>) q.getResultList();
	}

	

}
