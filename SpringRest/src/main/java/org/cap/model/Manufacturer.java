package org.cap.model;

public class Manufacturer {

	private int manufacturerId;
	private String firstName;
	private String lastName;
	private String emailId;
	public int getManufacturerId() {
		return manufacturerId;
	}
	public void setManufacturerId(int manufacturerId) {
		this.manufacturerId = manufacturerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Manufacturer(int manufacturerId, String firstName, String lastName, String emailId) {
		super();
		this.manufacturerId = manufacturerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}
	public Manufacturer() {
		super();
	}
	@Override
	public String toString() {
		return "Manufacturer [manufacturerId=" + manufacturerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailId=" + emailId + "]";
	}
	
	
	
}
