package org.tran;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bank_Accounts")
public class Transaction {
	@Id
	@GeneratedValue
	@Column(name = "account_no",nullable = false)
	private long accountNumber;
	@Column(name = "holder_name",nullable = true)
	private String accountHolder;
	@Column(name = "email_id",nullable = true,unique =true)
	private String email;
	@Column(name ="phone_no",nullable = true)
	private String phone;
	@Column(name ="acc_bal",nullable = true)
	private double balance;
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
public Transaction() {
	super();
}
public Transaction(long accountNumber, String accountHolder, String email, String phone, double balance) {
	super();
	this.accountNumber = accountNumber;
	this.accountHolder = accountHolder;
	this.email = email;
	this.phone = phone;
	this.balance = balance;
}

public boolean  deposit(double amount)throws TransactionException{
	if(amount<100 && amount>100000){
		throw new TransactionException("amount is not valid for transaction");
	}
	else {
		balance=amount+this.balance;
		System.out.println(balance);
		return true;
	}
	
}
public boolean  withdraw(double amount) throws TransactionException{
	if(amount<100 && amount>100000){
		throw new TransactionException("amount is not valid for transaction");
	}
	else {
		balance=amount-this.balance;
		System.out.println(balance);
		return true;
	}
}
}

