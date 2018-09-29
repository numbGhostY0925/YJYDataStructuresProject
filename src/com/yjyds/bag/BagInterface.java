package com.yjyds.bag;

/**
 * �ܳ���CH1-1
 */

/**
 * һ������bag�ӿڵĶ���
 * @author �����ݽṹ����󡷵�����P8
 *@param <T>
 */
public interface BagInterface<T> {
	/**
	 * �õ�һ��bag��Ԫ�ص�����
	 * @return ������ֵ
	 */
	public int getCurrentSize() ;
	
	/**
	 * �鿴bag�Ƿ���
	 * @return �Ƿ������Ĳ���ֵ
	 */
	public boolean isFull();
	
	/**
	 * �鿴bag�Ƿ�Ϊ��
	 * @return �Ƿ�Ϊ�յĲ���ֵ
	 */
	public boolean isEmpty();
	
	/**
	 * ��bag������һ��Ԫ��
	 * @param newEntry  the object to be added as a new entry
	 * @return ���Ԫ���Ƿ�ɹ��Ĳ���ֵ
	 */
	public boolean add(T newEntry);
	
	/**
	 * 
	 * @return
	 */
	public T remove();
	
	
	/**
	 * 
	 * @param anEntry
	 * @return
	 */
	public boolean remove(T anEntry);
		
	/**
	 * ��bag���Ƴ����е�Ԫ��
	 */
	public void clear();
	
	
	/**
	 * ͳ�Ƹ�����anEntryԪ�س��ֵĴ���
	 * @param anEntry
	 * @return
	 */
	public int getFrequencyOf(T anEntry);
	
	
	/**
	 * �����bag���Ƿ���ڸ�����Ԫ��anEntry
	 * @param anEntry
	 * @return
	 */
	public boolean contains(T anEntry);
	
	
	/**
	 * ����һ������bag����Ԫ�صĵ�����
	 * @return һ������bag������Ԫ�ص�����
	 */
	public T[]  toArray();

}
