package com.ingesup.InterfacesDao;

import java.util.List;

import com.ingesup.greenIT.Brands;
import com.ingesup.greenIT.Models;

public interface ModelsDao extends DAO<Integer, Models> {
	
	List<Models> findByName(String name);
}
