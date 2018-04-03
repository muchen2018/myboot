package com.framework.xx.threadtest.linkedqueue;

public class Queue {

	class Node {

		public Object data;

		public Node next;

		public Node(Object obj) {
			this.data = obj;
		}

	}

	public Node head;

	public Node tail;

	public void add(Node node) {

		if (head == null) {
			head = node;
		} else {
			tail.next = node;
		}
		tail = node;
	}
	
	public Object take() {
		
		if(head == null) {
			System.out.println("empty");
			return null;
		}else {
			Node tmp=head;
			
			head=head.next;
			
			return tmp.data;
		}
	}
	
	public void display() {
		
		Node node=head;
		
		while(node !=null) {
			System.out.println(node.data);
			node=node.next;
		}
	}
	
	public static void main(String [] a) {
		
		Queue q=new Queue();
		
		q.display();
		
		q.add( q.new Node(1));
		q.add(q.new Node(2));
		
		q.display();
		
		q.take();
		
		q.display();
		
		
	}

}
