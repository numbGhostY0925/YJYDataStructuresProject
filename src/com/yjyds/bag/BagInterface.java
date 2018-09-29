package com.yjyds.bag;

/**
 * 总程序CH1-1
 */

/**
 * 一个描述bag接口的对象
 * @author 《数据结构与抽象》第三版P8
 *@param <T>
 */
public interface BagInterface<T> {
	/**
	 * 得到一个bag的元素的数量
	 * @return 数量的值
	 */
	public int getCurrentSize() ;
	
	/**
	 * 查看bag是否满
	 * @return 是否已满的布尔值
	 */
	public boolean isFull();
	
	/**
	 * 查看bag是否为空
	 * @return 是否为空的布尔值
	 */
	public boolean isEmpty();
	
	/**
	 * 在bag中增加一个元素
	 * @param newEntry  the object to be added as a new entry
	 * @return 添加元素是否成功的布尔值
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
	 * 从bag中移除所有的元素
	 */
	public void clear();
	
	
	/**
	 * 统计给定的anEntry元素出现的次数
	 * @param anEntry
	 * @return
	 */
	public int getFrequencyOf(T anEntry);
	
	
	/**
	 * 获得在bag中是否存在给定的元素anEntry
	 * @param anEntry
	 * @return
	 */
	public boolean contains(T anEntry);
	
	
	/**
	 * 创建一个包含bag所有元素的的数组
	 * @return 一个包含bag中所有元素的数组
	 */
	public T[]  toArray();

}
