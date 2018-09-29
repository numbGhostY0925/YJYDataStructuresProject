package com.yjyds.dsinterface;

public interface QueueInterface<T> {
	
	/**����Ԫ�ؽ��ӣ����ڶ��е�β��
	 * @param item ����Ԫ��
	 */
	public  void enQueue(T item);
	
	/**��ͷ����Ԫ�س���
	 * @param item ����Ԫ��
	 * @return �ɹ�����true�����򷵻�false
	 */
	public  T deQueue(T item);
	
	/** ��ö��еĶ�ͷ����Ԫ�أ���������
	 * @return ����Ԫ�أ�����Ϊ�շ���null
	 */
	public T peek();
	
	/** ���ض��еĴ�С
	 * @return  �Ǹ�����
	 */
	public int getSize();
	
	/**�����Ƿ�Ϊ��
	 * @return �շ���true�����򷵻�false
	 */
	public  boolean isEmpty();
	
	/**�����Ƿ�Ϊ��
	 * @return  ����Ϊ�շ���true����������false
	 */
	public boolean  isFull();
	
	/**
	 * ��ն����е�����Ԫ��
	 */
	public void clear();

}
