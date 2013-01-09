package com.ingesup.InterfacesDao;


import java.util.List;

import com.ingesup.greenIT.Adresses;
import com.ingesup.greenIT.Agencies;

public interface AgenciesDao extends DAO<Integer, Agencies> {
	
	List<Agencies> findByName(String name);
}
