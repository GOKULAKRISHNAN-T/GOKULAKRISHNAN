package org.em;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Empl empl = new Empl();
		Address homeAddress = new Address();
		Address companyAddress = new Address();
		empl.setEmp_id(1);
		empl.setSalary(5000);
		
		session.close();
		sf.close();
	}

}
