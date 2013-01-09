package com.ingesup.JpaDao;

import java.util.List;

import javax.persistence.Query;

import com.ingesup.InterfacesDao.CategoriesDao;
import com.ingesup.greenIT.Brands;
import com.ingesup.greenIT.Categories;

public class JpaCategoriesDao extends JpaDao<Integer, Categories> implements CategoriesDao {

	@Override
	public List<Categories> findByName(String name) {
		Query q = entityManager.createQuery(
				"SELECT a FROM " + entityClass.getName() + " a WHERE a.name = :name");
		q.setParameter("name", name);
		return (List<Categories>) q.getResultList();
	}

	

}
