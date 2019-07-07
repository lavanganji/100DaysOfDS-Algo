package org.lkg.ds;

public interface Stack {
	//accecssor Methods
	public int size();
	public boolean isEmpty();
	public Object top() throws StackEmptyException;

	//update methods
	public void push(Object element) throws StackFullException;
	public Object pop() throws StackEmptyException;


}
