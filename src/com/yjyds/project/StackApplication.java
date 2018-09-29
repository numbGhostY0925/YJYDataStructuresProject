package com.yjyds.project;

import com.yjyds.basic.StackLinked;


//栈的运用程序
public class StackApplication {
	//进行数值转换
	public void valuesConversion(int x,int y){
		StackLinked<Integer>   stack=new StackLinked<Integer>();
		System.out.print("数据"+x+"转换为"+y+"进制的结果是：");
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
