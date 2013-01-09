package com.ingesup.InterfacesDao;

import java.util.Date;
import java.util.List;

import com.ingesup.greenIT.Orders;
import com.ingesup.greenIT.Status;

public interface OrdersDao extends DAO<Integer, Orders> {
	List<Orders> findByStartDate(Date startDate);
	List<Orders> findByEndDate(Date endDate);
	List<Orders> findByDateBetween(Date startDate, Date endDate);
	
}
