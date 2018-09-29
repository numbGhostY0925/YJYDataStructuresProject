package com.yjyds.dsinterface;

/**ADT栈的接口
 * @author yangjianyong
 * @param <T>
 */
public interface StackInterface<T> {	
	/**将一个新元素增加到栈顶
	 * @param item 新的元素
	 */
	public void push(T item);
	
	/**删除并返回栈顶元素
	 * @return  此操作前栈空返回null，否则返回栈顶元素
	 */
	public T pop();
	
	/**检索栈顶元素
	 * @return 栈为空返回null，否则返回栈顶元素
	 */
	public T  peek();
		
	/**检查栈是否为空
	 * @return 栈空返回true
	 */
	public boolean isEmpty();		
	
	public boolean isFull();
	
	/**删除栈中所有元素* 	 */
	public void clear();	
	
	/**返回栈的元素个数 
	 * @return  
	 */
	public int getSize();
}