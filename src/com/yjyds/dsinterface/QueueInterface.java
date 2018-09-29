package com.yjyds.dsinterface;

public interface QueueInterface<T> {
	
	/**数据元素进队，放在队列的尾部
	 * @param item 数据元素
	 */
	public  void enQueue(T item);
	
	/**队头数据元素出队
	 * @param item 数据元素
	 * @return 成功返回true；否则返回false
	 */
	public  T deQueue(T item);
	
	/** 获得队列的队头数据元素，但不出队
	 * @return 数据元素，队列为空返回null
	 */
	public T peek();
	
	/** 返回队列的大小
	 * @return  非负整数
	 */
	public int getSize();
	
	/**队列是否为空
	 * @return 空返回true，否则返回false
	 */
	public  boolean isEmpty();
	
	/**队列是否为满
	 * @return  队列为空返回true，不满返回false
	 */
	public boolean  isFull();
	
	/**
	 * 清空队列中的数据元素
	 */
	public void clear();

}
