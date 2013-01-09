package com.ingesup.InterfacesDao;

import java.util.List;

import com.ingesup.greenIT.Agencies;
import com.ingesup.greenIT.Cars;
import com.ingesup.greenIT.Categories;
import com.ingesup.greenIT.Models;

public interface CarsDao extends DAO<Integer, Cars> {
	
	List<Cars> findByMiles(Integer miles);
	List<Cars> findByMilesBetween(Integer begin, Integer end);
	
	
}
