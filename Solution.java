package org.excep.main;

public class Solution {
	private static int divide(int n1, int n2) {
		if (n2==0){
			throw new NumberFormatException("n2 =0");
		}
		else{
			System.out.println("value is"+n1/n2);
		}
		return 0;
	}
	public static void main(String[] args){
	 int n1=5;
	 int n2 =0;
	 int n3 = divide(n1,n2);
	
}

	
}