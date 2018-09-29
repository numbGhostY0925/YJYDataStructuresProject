package com.yjyds.dsinterface;


public interface LinkListInterface<T> {	

	public int  size();	
	
	public boolean isEmpty();
	
	public boolean isFull();	
	
	public int removeSpecElement(T  anItem);
	
	public boolean removeAt(int index);
	
	public int removeElementAll(T  item);
	
	public void clear();
	
	public boolean contains(T item);
	
	/**
	 * @return
	 */
	public T[] toArray();	
		
	public int getFrequencyOf(T item);
	
	public  boolean insert(T item);		
	
	public boolean  insertAt(T item,int index);
	
	public T getAt(int index);
	
	public int indexOf(T item);
	
	public void  display();
}
