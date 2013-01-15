package com.ingesup.InterfacesDao;

import java.util.List;

public interface DAO<K, E> {
	void persist(E entity);
	void remove(E entity);
	E findById(K id);
	List<E> findAll();
}
