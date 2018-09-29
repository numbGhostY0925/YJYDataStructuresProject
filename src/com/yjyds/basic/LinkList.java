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

	/**将元素item插入链接表的表尾
	 * @param item  插入数据元素item
	 * @return 插入成功返回true
	 */
	@Override
	public boolean insert(T item) {
		//生成新的链接表结点
		Node<T>  newNode=new  Node<T>(item,null);		
		//获得链表的头结点
		Node<T> pointNode=headNode;
		//找到最后一个结点
		while (pointNode.getNext()!=null){
			pointNode=pointNode.getNext();
		}		
		//将新结点接入链接表中
		pointNode.setNext(newNode);
		//更新链接表的结点数量
		this.linkListSize++;
		return true;
	}	

	/**将数据元素item插入到链表的第index号位置
	 * @param item 插入的数据元素
	 * @param index 插入的位置
	 * @return 插入成功返回true，插入失败返回false
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
			System.out.println("输入的索引值错误");
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
				System.out.println("删除失败，超过列表长度");
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

	/**	查询数据item是否存在
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

	/**计算item数据在链表中出现的次数
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

	/**获得索引位置index上的数据元素
	 * @return 
	 */
	@Override
	public T getAt(int index) {
		if (index<1 || index>linkListSize){
			System.out.println("输入的索引值错误");
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

	/**获得索引位置index上的数据元素
	 * @return  查询到返回数据所在的位置值，没有查到返回0
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
		System.out.println("链表的数据信息如下：----------");
		while (pointNode!=null){
			System.out.println(pointNode+"~"+pointNode.getElement()+"||"+pointNode.getNext());
			pointNode=pointNode.getNext();			
		}
		System.out.println("链表的数据信息输出完毕,共有"+linkListSize+"个数据元素");	
	}

}
