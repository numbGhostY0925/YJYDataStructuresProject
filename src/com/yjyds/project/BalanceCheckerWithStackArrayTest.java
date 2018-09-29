package com.yjyds.project;

public class BalanceCheckerWithStackArrayTest {

	public static void main(String[] args) {
		String expression="a{b[c(d+e)/2-f]-1}";		
		
		
		boolean isBoolean=BalanceCheckerWithStackArray.checkBalance(expression);
		if (isBoolean) {
			System.out.println(expression+"是平衡");			
		}else {
			System.out.println(expression+"不是平衡的");	
		}

	}

}
