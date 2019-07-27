package org.lkg.ds;

public class LinkedListImplementation {
	
	static LinkedList l = new LinkedList();  // Create the linked list class object.
	
	static class Node{
		int data;
		Node next;
		Node(int givenData){
			this.data = givenData;
		}
	}
	
	static class LinkedList{
		
		Node head;
		LinkedList(){
			head = null;
		}
		
		
		void print(Node h) {
			Node temp = h;
			while(temp!=null) {
				System.out.print(temp.data+"-->");
				temp = temp.next;
			}
			System.out.print("null\n");
		}
		
		Node insertAtBegining(Node h,int data) {
			Node temp = new Node(data);   // make a new node with given data
			temp.next = h;  // point the new node to current head.
			h = temp;      // change the head to new node , as new node is the begining of new linked list.
			return h;
		}
	
		void insertAfterNode(Node prevNode,int data) {
			
			/* 1. Check if the given Node is null */
		    if (prevNode == null) 
		    { 
		        System.out.println("The given previous node cannot be null"); 
		        return; 
		    } 
			
			Node temp = new Node(data);   // make a new node with given data
			
			temp.next = prevNode.next;  // change the next pointer of the newly created node(temp) to the next of the previous node
			
			prevNode.next = temp;      // the next pointer of the previous node to point to the newly created node.
			
		}
		
		
		void insertNodeAtEnd(Node headNode,int data) {
			
			/* 4. If the Linked List is empty, then make the 
	           new node as head */
		    if (headNode == null) 
		    { 
		    	headNode = new Node(data); 
		        return; 
		    } 
		    
		    Node temp = new Node(data);   // make a new node with given data
		    
		    /* 4. This new node is going to be the last node, so 
	         make next of it as null */
		    temp.next = null; 
		    Node last = headNode;
			while(last.next!=null) {
				
				last = last.next;
			}
		
			last.next = temp;  // change the next pointer of the last point to newly created node i.e temp	
		
			
		}
		
		
	}
	

	public static void main(String[] args) {
		
		
		//Creating the random node and link them to create a linked list.
		Node A = new Node(5);
		Node B = new Node(6);
		Node C = new Node(7);
		A.next = B;
		B.next = C;
		
		l.head = A;  // Linked list with head A is created.
		System.out.println("Printing List\n");
		l.print(l.head);
		
		System.out.println("\nInserting the given data at the Begining of Linked List\n");
		l.head = l.insertAtBegining(l.head,1);
		l.print(l.head);
			
		System.out.println("\nInserting the given data at the After the given node in the  Linked List\n");
		l.insertAfterNode(B,4);
		l.print(l.head);
		
		System.out.println("\nInserting the given data at the End of the Linked List\n");
		l.insertNodeAtEnd(l.head,10);
		l.print(l.head);
		
	}

}
