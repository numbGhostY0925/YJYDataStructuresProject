package com.yjyds.basic;

/**
 * 栈的数组的ADT实现
 */
import java.util.Arrays;
import com.yjyds.dsinterface.StackInterface;

public class StackArray<T> implements StackInterface<T> {
	private int topIndex;
	private int capacity;
	private T[] stack;
	
	public StackArray() {		
	}

	public StackArray(int capacity) {
		@SuppressWarnings("unchecked")
		T[] tempStack=(T[])new Object[capacity];
		stack=tempStack;
		topIndex=-1;
	}
	
	private void ensureCapacity(){
		if (topIndex==stack.length-1){
			capacity=2*stack.length;
			stack=Arrays.copyOf(stack, capacity);
		}			
	}
	
	@Override
	public void push(T item) {
		ensureCapacity();
		topIndex++;
		stack[topIndex]=item;
	}

	@Override
	public T pop() {
		T top=null;
		if (!isEmpty()){
			top=stack[topIndex];
			stack[topIndex]=null;
			topIndex--;
		}
		return top;
	}

	@Override
	public T peek() {
		T top=null;
		if (!isEmpty()){
			top=stack[topIndex];
		}
		return top;
	}

	@Override
	public boolean isEmpty() {
		return  topIndex<0;
	}

	@Override
	public void clear() {
		topIndex=-1;
	}

	@Override
	public int getSize() {
		int arraysize=0;
		while (stack[arraysize]!=null){
			arraysize++;
		}		
		return arraysize;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return  topIndex==capacity;
	}

}
