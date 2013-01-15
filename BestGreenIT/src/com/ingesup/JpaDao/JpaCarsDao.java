package com.ingesup.JpaDao;

import java.util.List;

import javax.persistence.Query;

import com.ingesup.InterfacesDao.CarsDao;
import com.ingesup.greenIT.Cars;
import com.ingesup.greenIT.Models;

public class JpaCarsDao extends JpaDao<Integer, Cars> implements CarsDao {


	@Override
	public List<Cars> findByMiles(Integer miles) {
		Query q = entityManager.createQuery(
				"SELECT a FROM " + entityClass.getName() + " a WHERE a.miles = :miles");
		q.setParameter("miles", miles);
		return (List<Cars>) q.getResultList();
	}

	@Override
	public List<Cars> findByMilesBetween(Integer begin, Integer end) {
		Query q = entityManager.createQuery(
				"SELECT a FROM " + entityClass.getName() + " a WHERE a.miles >= :start_miles AND a.miles <= :end_miles");
		q.setParameter("start_miles", begin);
		q.setParameter("end_miles", end);
		return (List<Cars>) q.getResultList();
	}
}
