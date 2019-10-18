package com.java.bridgelabz.datastructure.linkedlist;

class Node<T> {
	T data;
	Node next;

	public Node(T data) {
		this.data = data;
	}
}

public class LinkedListGen<T> {
	Node start;
	int size = 0;
	void addAtFirst(T data){
		Node node=new Node( data);
		if(start==null) {
			start=node;
			size++;
		}
		else {
			node.next=start;
			start=node;
			size++;
		}
	}
	void display() {
		Node temp=start;
		for(int i=0;i<size;i++) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
