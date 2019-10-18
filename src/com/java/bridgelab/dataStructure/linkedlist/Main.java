package com.java.bridgelabz.datastructure.linkedlist;

public class Main {

	public static void main(String[] args) {
		LinkedListGen <Integer>object=new LinkedListGen<Integer>();
		LinkedListGen<String>obj=new LinkedListGen<String>();
		object.addAtFirst(20);
		object.addAtFirst(30);
		object.addAtFirst(40);
		object.addAtFirst(50);
		obj.addAtFirst("sanjeet");
		object.display();
		obj.display();
		

	}

}
