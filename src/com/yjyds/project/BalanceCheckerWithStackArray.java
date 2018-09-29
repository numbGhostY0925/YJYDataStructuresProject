package com.yjyds.project;

import com.yjyds.basic.StackArray;
import com.yjyds.dsinterface.StackInterface;
public class BalanceCheckerWithStackArray {	
	
	private static boolean isPaired(char open,char close) {
		return (open=='(' && close ==')') ||
				(open=='[' && close ==']') ||
				(open=='{' && close =='}') ;
	}
	
	public static boolean checkBalance(String expression) {
		boolean isBalance= true;		
		int index=0;
		int charCount=expression.length();
		char nextCharacter=' ';		
		StackInterface<Character> openDelimiterStack=new StackArray<Character>(20);		
		for (;isBalance && (index<charCount);index++) {
			nextCharacter=expression.charAt(index);
			switch (nextCharacter){
				case '(' :  case '[' :  case '{' :
					openDelimiterStack.push(nextCharacter);
					break;
				case ')' :  case ']' :  case '}' :
					if (openDelimiterStack.isEmpty())
						isBalance=false;
					else {
						char openDelimiter=openDelimiterStack.pop();
						isBalance=isPaired(openDelimiter, nextCharacter);						
					}		
					break;
					default:break;
			}
		}
		if (!openDelimiterStack.isEmpty()) {
			isBalance=false;
		}		
		return isBalance;
	}
}
