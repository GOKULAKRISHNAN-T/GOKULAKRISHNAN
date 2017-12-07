package org.em;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.em.address.Address;



@Entity
public class Empl {
	@Embedded
	private Address homeAddress;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "doorNumber", column = @Column(name = "Door_Number")),
		@AttributeOverride(name = "street", column = @Column(name = "Street")),
		@AttributeOverride(name = "city", column = @Column(name = "City")),
		@AttributeOverride(name = "state", column = @Column(name = "State")),
		@AttributeOverride(name = "pinCode", column = @Column(name = "Pin_Code"))
		
	})
	private Address companyAddress;
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(Address companyAddress) {
		this.companyAddress = companyAddress;
	}
	@Id
	private int emp_id;
	private double salary;
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Empl() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Empl(int emp_id, double salary) {
		super();
		this.emp_id = emp_id;
		this.salary = salary;
	}
}
