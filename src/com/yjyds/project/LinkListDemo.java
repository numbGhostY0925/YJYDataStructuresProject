package com.yjyds.project;

import com.yjyds.basic.LinkList;
import com.yjyds.dsinterface.LinkListInterface;


public class LinkListDemo {

	public static void main(String[] args) {
		System.out.println("创建一个空的链表容器");
		LinkListInterface<String>   myLinkList=new LinkList<String>();
		myLinkList.insert("AS");
		myLinkList.insert("bf");
		myLinkList.insert("AS");
		myLinkList.insert("324");
		myLinkList.insert("das");
		myLinkList.insert("AS");
		myLinkList.insert("uytu");
		myLinkList.insert("eeqw");
		myLinkList.insert("423");		
		myLinkList.insert("cd");
		myLinkList.insertAt("bg",3);
		myLinkList.insert("hy");
		myLinkList.insert("ju");
		myLinkList.insert("de3");
		myLinkList.insert("ju7");		
		myLinkList.display();	
		
		System.out.println("---------------------------------------------");
		System.out.println("准备删除数据----------------");
		int num=myLinkList.removeSpecElement("AS");
		System.out.println("删除数据"+num+"次");
		System.out.println("---------------------------------------------");
		
		System.out.println("准备删除index数据----------------");
		boolean  flag=myLinkList.removeAt(5);
		if (flag){
			System.out.println("删除成功");
		}else{
			System.out.println("删除失败");
		}		
		System.out.println("---------------------------------------------");
		
		System.out.println("查找数据元素----------------");
		boolean  flag1=myLinkList.contains("cd");
		if (flag1){
			System.out.println("元素找到");
		}else{
			System.out.println("元素没有找到");
		}	
		System.out.println("---------------------------------------------");
		
		myLinkList.removeAt(1);
		myLinkList.display();	
		
		System.out.println("查找数据元素----------------");
		int num1=myLinkList.indexOf("hy");
		System.out.println("元素找到在"+num1+"位置");
		System.out.println("---------------------------------------------");
		
		
		LinkListInterface<String>   myLinkList2=new LinkList<String>();
		if (myLinkList2.isEmpty()){
			System.out.println("这个链表是一个空表");			
		}else{
			System.out.println("这个链表不是一个空表");		
		}
	}

}
