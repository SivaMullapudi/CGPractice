package org.cap.dao;

import java.util.List;

import org.cap.entity.CustomerEntityList;
import org.cap.model.Customer;

public interface ICustomerDao {
	public CustomerEntityList getCustomers();
}
