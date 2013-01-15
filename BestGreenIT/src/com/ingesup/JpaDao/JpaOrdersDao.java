package com.ingesup.JpaDao;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import com.ingesup.InterfacesDao.OrdersDao;
import com.ingesup.greenIT.Cars;
import com.ingesup.greenIT.Orders;

public class JpaOrdersDao extends JpaDao<Integer, Orders> implements OrdersDao {

	@Override
	public List<Orders> findByStartDate(Date startDate) {
		Query q = entityManager.createQuery(
				"SELECT a FROM " + entityClass.getName() + " a WHERE a.startDate = :startDate");
		q.setParameter("startDate", startDate);
		return (List<Orders>) q.getResultList();
	}

	@Override
	public List<Orders> findByEndDate(Date endDate) {
		Query q = entityManager.createQuery(
				"SELECT a FROM " + entityClass.getName() + " a WHERE a.endDate = :endDate");
		q.setParameter("endDate", endDate);
		return (List<Orders>) q.getResultList();
	}

	@Override
	public List<Orders> findByDateBetween(Date startDate, Date endDate) {
		Query q = entityManager.createQuery(
				"SELECT a FROM " + entityClass.getName() + " a WHERE a.startDate >= :startDate AND a.endDate <= :endDate");
		q.setParameter("startDate", startDate);
		q.setParameter("endDate", endDate);
		return (List<Orders>) q.getResultList();
	}

}
