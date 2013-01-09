package com.ingesup.JpaDao;

import java.util.List;

import javax.persistence.Query;

import com.ingesup.InterfacesDao.ModelsDao;
import com.ingesup.greenIT.Categories;
import com.ingesup.greenIT.Models;

public class JpaModelsDao extends JpaDao<Integer, Models> implements ModelsDao {


	@Override
	public List<Models> findByName(String name) {
		Query q = entityManager.createQuery(
				"SELECT a FROM " + entityClass.getName() + " a WHERE a.name = :name");
		q.setParameter("name", name);
		return (List<Models>) q.getResultList();
	}

	

}
