package com.yjyds.project;

import com.yjyds.basic.StackLinked;


//ջ�����ó���
public class StackApplication {
	//������ֵת��
	public void valuesConversion(int x,int y){
		StackLinked<Integer>   stack=new StackLinked<Integer>();
		System.out.print("����"+x+"ת��Ϊ"+y+"���ƵĽ���ǣ�");
		while (x>0){
			stack.push(x % y);
			x=x/y;			
		}			
		while (!stack.isEmpty()){
			System.out.print((Integer)stack.peek());
			stack.pop();			
		}		
	}
}
