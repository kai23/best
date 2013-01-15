package com.ingesup.JpaDao;

import java.util.List;

import javax.persistence.Query;

import com.ingesup.InterfacesDao.RightsDao;
import com.ingesup.greenIT.Cars;
import com.ingesup.greenIT.Rights;

public class JpaRightsDao extends JpaDao<Integer, Rights> implements RightsDao {

	@Override
	public List<Rights> findByName(String name) {
		Query q = entityManager.createQuery(
				"SELECT a FROM " + entityClass.getName() + " a WHERE a.name = :name");
		q.setParameter("name", name);
		return (List<Rights>) q.getResultList();
	}

	

}
