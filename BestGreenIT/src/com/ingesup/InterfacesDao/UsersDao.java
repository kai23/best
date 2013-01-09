package com.ingesup.InterfacesDao;

import java.util.Date;
import java.util.List;

import com.ingesup.greenIT.Adresses;
import com.ingesup.greenIT.Orders;
import com.ingesup.greenIT.Rights;
import com.ingesup.greenIT.Users;

public interface UsersDao extends DAO<Integer, Users> {
	
	List<Users> findByName(String name);
	List<Users> findBySurname(String surname);
	List<Users> findByPassword(String password);
	List<Users> findByEmail(String email);
	List<Users> findByState(boolean state);
	List<Users> findBybirthDate(Date birthDate);
	List<Users> findByDriveLicenceNumber(String driveLicenceNumber);
}
