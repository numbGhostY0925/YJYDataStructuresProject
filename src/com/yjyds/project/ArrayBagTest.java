package com.yjyds.project;

import com.yjyds.bag.ArrayBag;
import com.yjyds.bag.BagInterface;

/**
 * �ܳ���CH2-2
 * @author Administrator
 *
 */

public class ArrayBagTest {

	public static void main(String[] args) {
		BagInterface<String> aBag=new ArrayBag<String>() ;
		
		testIsFull(aBag, false);
		
		String[] contentOfBag= {"A","B","C","D","E","F","G","H","I","J"};
		testAdd(aBag,contentOfBag);
		testIsFull(aBag, false);
		
		String[] contentOfBag1= {"O","P","Q","R","S","T","U","V","W","XJ"};
		testAdd(aBag,contentOfBag1);
		testIsFull(aBag, false);
		
		
	}
	
	private static void displayBag(BagInterface<String> aBag) {
		System.out.println("");
		Object[]  bagArray=aBag.toArray();
		for(int index=0;index<bagArray.length;index++) {
			System.out.print(bagArray[index]+"    ");
		}
		System.out.println();
	}
	
	/**
	 * ����һ�����ӣ���һ���ַ�������
	 * @param aBag
	 * @param content
	 */
	private static void testAdd(BagInterface<String> aBag,String[] content) {
		System.out.println("adding to the bag");
		for (int index=0;index<content.length;index++) {
			aBag.add(content[index]);			
		}		
		displayBag(aBag);
	}
	
	/**
	 * ���յ�ʵ����һ�����Ӻ�һ������ֵ
	 * @param aBag
	 * @param correctResult
	 */
	private static void testIsFull(BagInterface<String> aBag,boolean correctResult) {
		System.out.println("�����ж��Ƿ����ķ���");
		if (correctResult) {
			System.out.println("is  a full bag");			
		}else {
			System.out.println("not a full bag");				
		}
		
		if (correctResult && aBag.isFull()) {
			System.out.println("full :OK");		
			
		}else if (correctResult) {
			System.out.println("not full,but it is full:ERROR");					
		}else if(!correctResult && aBag.isFull()) {
			System.out.println(" full,but it is not full:ERROR");
		}else {
			System.out.println("not full,OK");
		}		
	}
	
	
	
	
	
	
	
	

}
