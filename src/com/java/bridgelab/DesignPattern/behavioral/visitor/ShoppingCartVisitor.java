package com.java.bridgelab.designpattern.behavioral.visitor;

public interface ShoppingCartVisitor {
   int visit(Book book);
   int visit(Fruit fruit);
}
