package com.yjyds.bag;


/**
 * ×Ü³ÌÐòCH2-1
 * @author Administrator
 *
 * @param <T>
 */

public class ArrayBag<T> implements BagInterface<T> {
	private final T[] bag;
	private static final int DEFAULT_CAPACITY=12;
	private int numberOfEntries;	

	public ArrayBag(int capacity) {
		numberOfEntries=0;
		@SuppressWarnings("unchecked")
		T[]  tempBag=(T[]) new Object[capacity];
		bag=tempBag;
	}

	public ArrayBag() {
		this(DEFAULT_CAPACITY);
	}

	@Override
	public int getCurrentSize() {		
		return numberOfEntries;
	}

	@Override
	public boolean isFull() {		
		return numberOfEntries==bag.length;
	}

	@Override
	public boolean isEmpty() {
		return numberOfEntries==0;
	}

	@Override
	public boolean add(T newEntry) {
		boolean  result=true;
		if (isFull()) {
			result=false;
		}
		else {
			bag[numberOfEntries]=newEntry;
			numberOfEntries++;			
		}
		return result;
	}
	
	
	/**
	 * 
	 */
	@Override
	public T remove() {
		T result =null;
		if (numberOfEntries>0) {
			numberOfEntries--;
			result=bag[numberOfEntries];
			bag[numberOfEntries]=null;
		}
		return result;
	}
	
	private int getIndexOf(T anEntry) {
		int where=-1;
		boolean found=false;
		for(int index=0;!found && (index <numberOfEntries);index++) {
			if (anEntry.equals(bag[index])) {
				found=true;
				where =index;
			}
		}		
		return where;
	}
	
	private T removeEntry(int givenIndex) {
		T result=null;
		if (!isEmpty() && (givenIndex >=0)) {
			result=bag[givenIndex];
			numberOfEntries--;
			bag[givenIndex]=bag[numberOfEntries];
			bag[numberOfEntries]=null;
		}
		return result;
	}

	@Override
	public boolean remove(T anEntry) {
		int index=getIndexOf(anEntry);
		T result=removeEntry(index);		
		//T result=removeEntry(numberOfEntries-1);
		return anEntry.equals(result);
	}

	@Override
	public void clear() {
		while (!isEmpty()) {
			remove();
		}
		//numberOfEntries=0;
	}

	@Override
	public int getFrequencyOf(T anEntry) {
		int counter=0;
		for (int index=0;index<numberOfEntries;index++) {
			if (anEntry.equals(bag[index])) {
				counter++;
			}
		}		
		return counter;
	}

	@Override
	public boolean contains(T anEntry) {
		boolean found=false;
		for (int index=0;!found && (index<numberOfEntries);index++) {
			if (anEntry.equals(bag[index])) {
				found=true;
			}
		}		
		return found;
		//return getFrequencyOf(anEntry) >0
	}

	@Override
	public T[] toArray() {
		@SuppressWarnings("unchecked")
		T[] result=(T[]) new Object[numberOfEntries];
		for (int index=0;index<numberOfEntries;index++) {
			result[index]=bag[index];
		}
		return result;
	}
}
