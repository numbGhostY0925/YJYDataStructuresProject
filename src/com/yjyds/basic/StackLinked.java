package com.yjyds.basic;

/**
 * �ܳ���CH6-1�����ADTʵ��
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

	/**��һ����Ԫ�����ӵ�ջ��
	 * @param item �µ�Ԫ��	 */
	@Override
	public void push(T item) {
		// �·���һ���½�㣬Ȼ������ջ��Ԫ�أ��½����Ϊջ��Ԫ��
		Node<T> newNode=new Node<T>(item,topNode);
		topNode=newNode;		
	}

	/**ɾ��������ջ��Ԫ��
	 * @return  �˲���ǰջ�շ���null�����򷵻�ջ��Ԫ��
	 */
	@Override
	public T pop() {		
		T  topElement=peek();
		if  (topNode !=null)
			topNode=topNode.getNext();		
		return topElement;
	}

	/**����ջ��Ԫ��
	 * @return ջΪ�շ���null�����򷵻�ջ��Ԫ��
	 */
	@Override
	public T peek() {
		// TODO Auto-generated method stub
		T topElement=null;
		if (topNode!=null)
			topElement=topNode.getElement();
		return topElement;
	}	

	/**���ջ�Ƿ�Ϊ��
	 * @return ջ�շ���true
	 */
	@Override
	public boolean isEmpty() {
		return topNode==null;
	}

	/**ɾ��ջ������Ԫ��	 */
	@Override
	public void clear() {
		topNode=null;		
	}

	/**����ջ��Ԫ�ظ��� 
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
