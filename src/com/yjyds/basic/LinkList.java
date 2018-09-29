package com.yjyds.basic;

import com.yjyds.dsinterface.LinkListInterface;

public class LinkList<T> implements LinkListInterface<T> {
	private   Node<T>   headNode;
	private  int linkListSize;	
	public Node<T> getHeadNode() {
		return headNode;
	}
	public void setHeadNode(Node<T> headNode) {
		this.headNode = headNode;
	}
	public int getLinkListSize() {
		return linkListSize;
	}
	public void setLinkListSize(int linkListSize) {
		this.linkListSize = linkListSize;
	}		
	
	public LinkList() {
		headNode=new Node<T>();
		headNode.setElement(null);
		headNode.setNext(null);
	}	
	
	@Override
	public int size() {
		int currentsize=0;		
		Node<T>  newNode=new  Node<T>();		
		newNode=this.headNode;
		while (newNode!=null)
		{
			currentsize++;
			newNode=newNode.getNext();
		}		
		return currentsize;
	}
	

	
	@Override
	public boolean isEmpty() {
		if (this.headNode.getNext()==null){
			return true;
		}
		else{
			return false;
		}		
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}	

	/**��Ԫ��item�������ӱ�ı�β
	 * @param item  ��������Ԫ��item
	 * @return ����ɹ�����true
	 */
	@Override
	public boolean insert(T item) {
		//�����µ����ӱ���
		Node<T>  newNode=new  Node<T>(item,null);		
		//��������ͷ���
		Node<T> pointNode=headNode;
		//�ҵ����һ�����
		while (pointNode.getNext()!=null){
			pointNode=pointNode.getNext();
		}		
		//���½��������ӱ���
		pointNode.setNext(newNode);
		//�������ӱ�Ľ������
		this.linkListSize++;
		return true;
	}	

	/**������Ԫ��item���뵽����ĵ�index��λ��
	 * @param item ���������Ԫ��
	 * @param index �����λ��
	 * @return ����ɹ�����true������ʧ�ܷ���false
	 */
	@Override
	public boolean  insertAt(T item, int index) {				
		Node<T> pointNode=headNode;
		int  currentindex=0;
		
		while (pointNode!=null){
			if (currentindex==index-1){
				break;
			}
			pointNode=pointNode.getNext();
			currentindex++;
		}		
		if  (currentindex==index-1){
			Node<T> newNode=new Node<T>(item,null);
			newNode.setNext(pointNode.getNext());
			pointNode.setNext(newNode);
			this.linkListSize++;			
			return true;			
		}else{
			return false;
		}
	}	
	
	/**	
	 * @return 
	 */
	@Override
	public int removeSpecElement(T anItem) {
		Node<T>  pointNode=headNode;
		Node<T>  deleteNode=headNode.getNext();
		int num=0;		
		while (deleteNode !=null){
			if (deleteNode.getElement().equals(anItem)){
				pointNode.setNext(deleteNode.getNext());
				deleteNode=deleteNode.getNext();
				this.linkListSize--;
				num++;
			}
			pointNode=deleteNode;
			deleteNode=deleteNode.getNext();
		}		
		return num;
	}

	/**	
	 * @return 
	 */
	@Override
	public boolean removeAt(int index) {
		if (index<1 || index>linkListSize){
			System.out.println("���������ֵ����");
			return false;
		}else{
			int flag=1;
			Node<T>  pointNode=headNode;
			Node<T>  deleteNode=headNode.getNext();
			while ((deleteNode !=null) &&(index>flag)){
				pointNode=deleteNode;
				deleteNode=deleteNode.getNext();
				flag++;
			}
			if (index==flag){
				pointNode.setNext(deleteNode.getNext());
				this.linkListSize--;
				return true;
			}else{
				System.out.println(pointNode+"||"+deleteNode+"||"+flag);
				System.out.println("ɾ��ʧ�ܣ������б���");
				return false;				
			}			
		}		
	}

	/**	
	 * @return 
	 */
	@Override
	public int removeElementAll(T item) {
		Node<T>  pointNode=headNode;
		Node<T>  deleteNode=headNode.getNext();
		int num=0;		
		while (deleteNode !=null){
			if (deleteNode.getElement().equals(item)){
				pointNode.setNext(deleteNode.getNext());
				deleteNode=deleteNode.getNext();
				this.linkListSize--;
				num++;
			}
			pointNode=deleteNode;
			deleteNode=deleteNode.getNext();
		}		
		return num;
	}

	/**	
	 * @return 
	 */
	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	/**	��ѯ����item�Ƿ����
	 * @return 
	 */
	@Override
	public boolean contains(T item) {
		boolean  found=false;
		Node<T>   currentNode=headNode.getNext();
		while (!found && (currentNode!=null)){
			if (item.equals(currentNode.getElement()))
				found=true;
			else
				currentNode=currentNode.getNext();
		}
		return found; 
	}

	/**	
	 * @return 
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T[] toArray() {
		T[]  linklistArray=(T[])new Object[linkListSize];
		int index=0;
		Node<T>  currentNode=headNode.getNext();		
		while ((index<linkListSize) && (currentNode!=null)){
			linklistArray[index]=currentNode.getElement();
			index++;
			currentNode=currentNode.getNext();
		}
		return linklistArray;
	}

	/**����item�����������г��ֵĴ���
	 * @return 
	 */
	@Override
	public int getFrequencyOf(T item) {
		int counter=0;
		Node<T> currentNode=headNode.getNext();
		while (currentNode!=null){
			if (item.equals(currentNode.getElement()))
				counter++;			
			currentNode=currentNode.getNext();
		}
		// TODO Auto-generated method stub
		return counter;
	}	

	/**�������λ��index�ϵ�����Ԫ��
	 * @return 
	 */
	@Override
	public T getAt(int index) {
		if (index<1 || index>linkListSize){
			System.out.println("���������ֵ����");
			return null;
		}else{			
			Node<T> currentNode=headNode.getNext();
			int counter=1;
			while ((currentNode!=null) && (counter<index)){
				currentNode=currentNode.getNext();
				counter++;
			}			
			if  (counter==index){
				return currentNode.getElement();				
			}else{
				return null;
			}			
		}		
	}

	/**�������λ��index�ϵ�����Ԫ��
	 * @return  ��ѯ�������������ڵ�λ��ֵ��û�в鵽����0
	 */
	@Override
	public int indexOf(T item) {
		int counter =0;
		Node<T> currentNode=headNode.getNext();
		while ((currentNode!=null) && (!item.equals(currentNode.getElement()))){
			currentNode=currentNode.getNext();
			counter++;			
		}
		if (currentNode!=null){
			return counter;			
		}else{
			return 0;			
		}		
	}
	
	@Override
	public void display() {
		Node<T>  pointNode=headNode.getNext();
		System.out.println("�����������Ϣ���£�----------");
		while (pointNode!=null){
			System.out.println(pointNode+"~"+pointNode.getElement()+"||"+pointNode.getNext());
			pointNode=pointNode.getNext();			
		}
		System.out.println("�����������Ϣ������,����"+linkListSize+"������Ԫ��");	
	}

}
