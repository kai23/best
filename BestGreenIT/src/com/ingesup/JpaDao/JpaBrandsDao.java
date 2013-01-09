package com.ingesup.JpaDao;

import java.util.List;

import javax.persistence.Query;

import com.ingesup.InterfacesDao.BrandsDao;
import com.ingesup.greenIT.Agencies;
import com.ingesup.greenIT.Brands;

public class JpaBrandsDao extends JpaDao<Integer, Brands> implements BrandsDao {

	@Override
	public List<Brands> findByName(String name) {
		Query q = entityManager.createQuery(
				"SELECT a FROM " + entityClass.getName() + " a WHERE a.name = :name");
		q.setParameter("name", name);
		return (List<Brands>) q.getResultList();
	}

	

}
