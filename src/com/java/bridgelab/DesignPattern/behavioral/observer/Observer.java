package com.java.bridgelab.designpattern.behavioral.observer;

public interface Observer {
	
	public void update();

	// attach with subject to observe

	public void setSubject(Subject sub);
}
