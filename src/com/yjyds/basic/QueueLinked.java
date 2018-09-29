package com.yjyds.basic;


import com.yjyds.dsinterface.QueueInterface;

public class QueueLinked<T> implements QueueInterface<T> {
	private Node<T>  firstNode;
	private Node<T>  lastNode;	

	public QueueLinked() {
		firstNode=null;
		lastNode=null;
	}

	@Override
	public void enQueue(T item) {
		Node<T> newNode=new Node<T>(item,null);
		if (isEmpty()){
			firstNode=newNode;
		}else{
			lastNode.setNext(newNode);
		}
		lastNode=newNode;	
	}

	@Override
	public T deQueue(T item) {
		T front=null;
		if(!isEmpty()){
			front=firstNode.getElement();
			firstNode=firstNode.getNext();			
			if (firstNode==null)
				lastNode=null;
		}
		return front;
	}

	@Override
	public T peek() {
		T front=null;
		if(!isEmpty()){
			front=firstNode.getElement();
		}
		return front;
	}

	@Override
	public int getSize() {
		int queueNumber=0;
		Node<T>  newNode=firstNode;
		while( newNode!=null && newNode !=lastNode){
			queueNumber++;
			newNode=newNode.getNext();			
		}
		return queueNumber;
	}

	@Override
	public boolean isEmpty() {
		return  (firstNode==null) && (lastNode==null);
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		firstNode=null;
		lastNode=null;
	}
}
