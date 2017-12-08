package org.tran;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException,TransactionException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Transaction trans = new Transaction();
		System.out.println("enter the amount");
		double amount = Double.valueOf(bf.readLine());
		System.out.println("enter 1 for withdrawal and 2 for deposit");
		int t = Integer.valueOf(bf.readLine());
		switch (t) {
		case 1:
			try {
				 boolean a=trans.deposit(amount);
			} catch (Exception m) {
				System.out.println("amount is beyond the limits");
			}

			break;
		case 2:
			try {
				 boolean a=trans.withdraw(amount);
			} catch (Exception m) {
				System.out.println("amount is beyond the limits");
			}

			break;
		}
	}
}
