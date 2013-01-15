package com.ingesup.JpaDao;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ingesup.InterfacesDao.DAO;

public class JpaDao<K, E> implements DAO<K, E> {

	protected Class<E> entityClass;
	@PersistenceContext
	protected EntityManager entityManager;
	@SuppressWarnings("unchecked")
	public JpaDao() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Best");
		this.entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();		
		this.entityClass = (Class<E>) genericSuperclass.getActualTypeArguments()[1];
		
	}
	public void persist(E entity) { 
		entityManager.persist(entity);
		entityManager.getTransaction().commit();
		}
	public void remove(E entity) { entityManager.remove(entity); }
	public E findById(K id) { return entityManager.find(entityClass, id); }
	
	@SuppressWarnings("unchecked")
	public List<E> findAll() {
		Query q = entityManager.createQuery(
				"SELECT a FROM " + entityClass.getName() + " a");
		return (List<E>) q.getResultList();
	}

}
