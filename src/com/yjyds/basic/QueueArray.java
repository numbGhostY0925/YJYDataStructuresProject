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

	/**����Ԫ�ؽ��ӣ����ڶ��е�β��
	 * @param item ����Ԫ��
	 */
	@Override
	public void enQueue(T item) {	
			expandSpace();		
			backIndex=(backIndex+1)%queue.length;
			queue[backIndex]=item;		
	}
	
	private void expandSpace(){
		//��������
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
	

	/**��ͷ����Ԫ�س���
	 * @param item ����Ԫ��
	 * @return �ɹ�����true�����򷵻�false
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

	/** ��ö��еĶ�ͷ����Ԫ�أ���������
	 * @return ����Ԫ�أ�����Ϊ�շ���null
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
