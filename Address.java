package org.em;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String doorNumber;
	private String street;
	private String city;
	private String state;
	private int pinCode;
	public String getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public Address(String doorNumber, String street, String city, String state, int pinCode) {
		super();
		this.doorNumber = doorNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}
	public Address() {
		super();
	
	}
}
