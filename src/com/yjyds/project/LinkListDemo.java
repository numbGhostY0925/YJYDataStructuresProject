package com.yjyds.project;

import com.yjyds.basic.LinkList;
import com.yjyds.dsinterface.LinkListInterface;


public class LinkListDemo {

	public static void main(String[] args) {
		System.out.println("����һ���յ���������");
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
		System.out.println("׼��ɾ������----------------");
		int num=myLinkList.removeSpecElement("AS");
		System.out.println("ɾ������"+num+"��");
		System.out.println("---------------------------------------------");
		
		System.out.println("׼��ɾ��index����----------------");
		boolean  flag=myLinkList.removeAt(5);
		if (flag){
			System.out.println("ɾ���ɹ�");
		}else{
			System.out.println("ɾ��ʧ��");
		}		
		System.out.println("---------------------------------------------");
		
		System.out.println("��������Ԫ��----------------");
		boolean  flag1=myLinkList.contains("cd");
		if (flag1){
			System.out.println("Ԫ���ҵ�");
		}else{
			System.out.println("Ԫ��û���ҵ�");
		}	
		System.out.println("---------------------------------------------");
		
		myLinkList.removeAt(1);
		myLinkList.display();	
		
		System.out.println("��������Ԫ��----------------");
		int num1=myLinkList.indexOf("hy");
		System.out.println("Ԫ���ҵ���"+num1+"λ��");
		System.out.println("---------------------------------------------");
		
		
		LinkListInterface<String>   myLinkList2=new LinkList<String>();
		if (myLinkList2.isEmpty()){
			System.out.println("���������һ���ձ�");			
		}else{
			System.out.println("���������һ���ձ�");		
		}
	}

}
