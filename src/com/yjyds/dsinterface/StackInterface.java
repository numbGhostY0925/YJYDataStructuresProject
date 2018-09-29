package com.yjyds.dsinterface;

/**ADTջ�Ľӿ�
 * @author yangjianyong
 * @param <T>
 */
public interface StackInterface<T> {	
	/**��һ����Ԫ�����ӵ�ջ��
	 * @param item �µ�Ԫ��
	 */
	public void push(T item);
	
	/**ɾ��������ջ��Ԫ��
	 * @return  �˲���ǰջ�շ���null�����򷵻�ջ��Ԫ��
	 */
	public T pop();
	
	/**����ջ��Ԫ��
	 * @return ջΪ�շ���null�����򷵻�ջ��Ԫ��
	 */
	public T  peek();
		
	/**���ջ�Ƿ�Ϊ��
	 * @return ջ�շ���true
	 */
	public boolean isEmpty();		
	
	public boolean isFull();
	
	/**ɾ��ջ������Ԫ��* 	 */
	public void clear();	
	
	/**����ջ��Ԫ�ظ��� 
	 * @return  
	 */
	public int getSize();
}