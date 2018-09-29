package com.yjyds.basic;

/**
 * 总程序CH6-1链表的ADT实现
 */
import com.yjyds.dsinterface.StackInterface;

public class StackLinked<T> implements StackInterface<T> {
	private Node<T>  topNode;	

	public Node<T> getTopNode() {
		return topNode;
	}

	public void setTopNode(Node<T> topNode) {
		this.topNode = topNode;
	}

	public StackLinked() {
		topNode=null;
	}	

	/**将一个新元素增加到栈顶
	 * @param item 新的元素	 */
	@Override
	public void push(T item) {
		// 新分配一个新结点，然后引用栈顶元素，新结点作为栈顶元素
		Node<T> newNode=new Node<T>(item,topNode);
		topNode=newNode;		
	}

	/**删除并返回栈顶元素
	 * @return  此操作前栈空返回null，否则返回栈顶元素
	 */
	@Override
	public T pop() {		
		T  topElement=peek();
		if  (topNode !=null)
			topNode=topNode.getNext();		
		return topElement;
	}

	/**检索栈顶元素
	 * @return 栈为空返回null，否则返回栈顶元素
	 */
	@Override
	public T peek() {
		// TODO Auto-generated method stub
		T topElement=null;
		if (topNode!=null)
			topElement=topNode.getElement();
		return topElement;
	}	

	/**检查栈是否为空
	 * @return 栈空返回true
	 */
	@Override
	public boolean isEmpty() {
		return topNode==null;
	}

	/**删除栈中所有元素	 */
	@Override
	public void clear() {
		topNode=null;		
	}

	/**返回栈的元素个数 
	 * @return  
	 */
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

}
