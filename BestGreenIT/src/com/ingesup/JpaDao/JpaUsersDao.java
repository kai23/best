package com.ingesup.JpaDao;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import com.ingesup.InterfacesDao.UsersDao;
import com.ingesup.greenIT.Rights;
import com.ingesup.greenIT.Users;

public class JpaUsersDao extends JpaDao<Integer, Users> implements UsersDao {


	@Override
	public List<Users> findByName(String name) {
		Query q = entityManager.createQuery(
				"SELECT a FROM " + entityClass.getName() + " a WHERE a.name = :name");
		q.setParameter("name", name);
		return (List<Users>) q.getResultList();
	}

	@Override
	public List<Users> findBySurname(String surname) {
		Query q = entityManager.createQuery(
				"SELECT a FROM " + entityClass.getName() + " a WHERE a.surname = :surname");
		q.setParameter("surname", surname);
		return (List<Users>) q.getResultList();
	}

	@Override
	public List<Users> findByPassword(String password) {
		Query q = entityManager.createQuery(
				"SELECT a FROM " + entityClass.getName() + " a WHERE a.password = :password");
		q.setParameter("password", password);
		return (List<Users>) q.getResultList();
	}

	@Override
	public List<Users> findByEmail(String email) {
		Query q = entityManager.createQuery(
				"SELECT a FROM " + entityClass.getName() + " a WHERE a.email = :email");
		q.setParameter("email", email);
		return (List<Users>) q.getResultList();
	}

	@Override
	public List<Users> findByState(boolean state) {
		Query q = entityManager.createQuery(
				"SELECT a FROM " + entityClass.getName() + " a WHERE a.state = :state");
		q.setParameter("state", state);
		return (List<Users>) q.getResultList();
	}

	@Override
	public List<Users> findBybirthDate(Date birthDate) {
		Query q = entityManager.createQuery(
				"SELECT a FROM " + entityClass.getName() + " a WHERE a.birthDate = :birthDate");
		q.setParameter("birthDate", birthDate);
		return (List<Users>) q.getResultList();
	}

	@Override
	public List<Users> findByDriveLicenceNumber(String driveLicenceNumber) {
		Query q = entityManager.createQuery(
				"SELECT a FROM " + entityClass.getName() + " a WHERE a.driveLicenceNumber = :driveLicenceNumber");
		q.setParameter("birthDate", driveLicenceNumber);
		return (List<Users>) q.getResultList();
	}

	

}
