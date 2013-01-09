package com.ingesup.InterfacesDao;

import java.util.List;

import com.ingesup.greenIT.Brands;

public interface BrandsDao extends DAO<Integer, Brands> {
	List<Brands> findByName(String name);
	
}
