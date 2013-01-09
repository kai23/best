package com.ingesup.InterfacesDao;

import java.util.List;

import com.ingesup.greenIT.Categories;

public interface CategoriesDao extends DAO<Integer, Categories> {
	List<Categories> findByName(String name);
}
