package org.cap.dao;

import java.util.List;

import org.cap.entity.CustomerEntityList;
import org.cap.model.Customer;
import org.springframework.stereotype.Repository;

@Repository("customerDao")

public class CustomerDaoImpl<T> {
	public CustomerEntityList getCustomers()
	{
		CustomerEntityList cList = new CustomerEntityList();
		cList.getCustomerList().add(new Customer(1223, "Sachin"));
		cList.getCustomerList().add(new Customer(1224, "Dravid"));
		return cList;
	}
	

}
