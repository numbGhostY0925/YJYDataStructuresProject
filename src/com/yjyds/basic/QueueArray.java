package com.yjyds.basic;


import com.yjyds.dsinterface.QueueInterface;

public class QueueArray<T> implements QueueInterface<T> { 	
	private T[] queue;
	private int frontIndex;
	private int backIndex;
	private int capacity;
	
	public QueueArray(){
	}
	
	public QueueArray(int capacity) {
		@SuppressWarnings("unchecked")
		T[] tempQueue=(T[])new Object[capacity+1];
		queue=tempQueue;
		frontIndex=0;
		backIndex=capacity;		
	}

	/**数据元素进队，放在队列的尾部
	 * @param item 数据元素
	 */
	@Override
	public void enQueue(T item) {	
			expandSpace();		
			backIndex=(backIndex+1)%queue.length;
			queue[backIndex]=item;		
	}
	
	private void expandSpace(){
		//？？？？
		if (frontIndex==((backIndex+2)%queue.length))
		{
			T[] oldQueue=queue;
			int oldSize=oldQueue.length;
			@SuppressWarnings("unchecked")
			T[] tempQueue=(T[])new Object[2*oldSize];
			queue=tempQueue;
			
			for(int index=0;index<oldSize-1;index++){
				queue[index]=oldQueue[frontIndex];
				frontIndex=(frontIndex+1)%oldSize;				
			}			
			frontIndex=0;
			backIndex=oldSize-2;						
		}
	}
	

	/**队头数据元素出队
	 * @param item 数据元素
	 * @return 成功返回true；否则返回false
	 */
	@Override
	public T deQueue(T item) {
		T front =null;
		if (!isEmpty()){
			front=queue[frontIndex];
			queue[frontIndex]=null;
			frontIndex=(frontIndex+1)%queue.length;			
		}	
		return front;		
	}

	/** 获得队列的队头数据元素，但不出队
	 * @return 数据元素，队列为空返回null
	 */
	@Override
	public T peek() {
		T front =null;
		if (!isEmpty()){
			front=queue[frontIndex];			
		}
		return front;
	}

	@Override
	public int getSize() {
		return backIndex-frontIndex+1;
	}

	@Override
	public boolean isEmpty() {		
		return  frontIndex==(backIndex+1)%queue.length;
	}

	@Override
	public boolean isFull() {		
		return  (capacity>=(backIndex-frontIndex+1));
	}

	@Override
	public void clear() {
		frontIndex=0;
		backIndex=0;
	}

}
