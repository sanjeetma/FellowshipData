package com.java.bridgelabz.oops.commercial.repo;
class Node{
	String symbol;
	double price;
	double nos;
	Node next;
	
	
	 Node(String symbol,double price,double nos){
		 this.symbol=symbol;
		 this.price=price;
		 this.nos=nos;
	 }
}
public class LinkedList {
    Node start;
    int size=0;
    
   public   void addAtFirst(String symbol,double price,double nos) {
    	Node node=new Node(symbol,price,nos);
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
}
