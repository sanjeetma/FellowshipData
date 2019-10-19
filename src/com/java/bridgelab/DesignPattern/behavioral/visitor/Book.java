package com.java.bridgelab.designpattern.behavioral.visitor;

public class Book implements ItemElement {
	
	private int price;
	private String isbnNumber;

	public Book(int price,String isbnNumber){
		this.price=price;
		this.isbnNumber=isbnNumber;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String getIsbnNumber() {
		return this.isbnNumber;
	}
	
	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}
