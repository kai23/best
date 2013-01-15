package com.ingesup.InterfacesDao;

import java.util.List;

import com.ingesup.greenIT.Agencies;
import com.ingesup.greenIT.Status;

public interface StatusDao extends DAO<Integer, Status> {
	List<Status> findByName(String name);
	
}
