package org.lkg.ds;

// Implementation of Stack using Array.

public class StackArray implements Stack{

	public static final int CAPACITY = 1024;  //Default capacity of the stack;

	private int N;  		// Max capacity of the Stack.
	private Object S[];		// S is the array , that holds elements of the stack
	private int t=-1;	    // Top element of the stack.

	public StackArray() {
		this(CAPACITY);
	}

	public StackArray(int cap) {
		this.N= cap;
		S = new Object[N];
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return t+1;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (t<0);
	}

	@Override
	public Object top() throws StackEmptyException {
		if(isEmpty()) {
			 throw new StackEmptyException("Stack Underflow - Stack is Empty");

		}
		return S[t];
	}


	public void push(Object element) throws StackFullException {
		// TODO Auto-generated method stub
		 if(size() == N) {
			 throw new StackFullException("Stack Overflow - Stack is full");

		 }
		 S[++t] = element;
	}

	public Object pop() throws StackEmptyException {

		if(isEmpty()) {
			 throw new StackEmptyException("Stack Underflow - Stack is Empty");

		}
		Object pop = S[t];
		S[t--] = null;
		return pop;
	}

}
