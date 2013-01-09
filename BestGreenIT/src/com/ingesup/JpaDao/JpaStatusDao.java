package com.ingesup.JpaDao;

import java.util.List;

import javax.persistence.Query;

import com.ingesup.InterfacesDao.StatusDao;
import com.ingesup.greenIT.Rights;
import com.ingesup.greenIT.Status;

public class JpaStatusDao extends JpaDao<Integer, Status> implements StatusDao {

	@Override
	public List<Status> findByName(String name) {
		Query q = entityManager.createQuery(
				"SELECT a FROM " + entityClass.getName() + " a WHERE a.name = :name");
		q.setParameter("name", name);
		return (List<Status>) q.getResultList();
	}

	

}
