package com.java.bridgelab.designpattern.behavioral.mediator;

public interface ChatMediator {
	public void sendMessage(String msg, User user);

	void addUser(User user);
}
