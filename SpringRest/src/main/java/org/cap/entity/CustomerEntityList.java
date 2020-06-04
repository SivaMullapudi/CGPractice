package org.cap.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.cap.model.Customer;

@XmlRootElement(name="customers")
public class CustomerEntityList implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private List<Customer> customerList = new ArrayList<Customer>();
	public List<Customer> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
	
	
}
