package com.ingesup.InterfacesDao;

import java.util.List;

import com.ingesup.greenIT.Agencies;
import com.ingesup.greenIT.Rights;

public interface RightsDao extends DAO<Integer, Rights> {
	List<Rights> findByName(String name);
	
}
