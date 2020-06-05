package org.cap.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.cap.model.Customer;

@XmlRootElement(name="customers")
@XmlAccessorType(XmlAccessType.FIELD)
public class CustomerEntityList implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(name="customer")
	private List<Customer> customerList = new ArrayList<Customer>();
	
	
	public CustomerEntityList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerEntityList(List<Customer> customerList) {
		super();
		this.customerList = customerList;
	}
	public List<Customer> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
	
	
}
