package com.spring.iocdemo;

public class Bus implements Vehicle{

	@Override
	public void move() {
	System.out.println("i am going to mumbai by bus");
		
	}

	@Override
	public void speed() {
	System.out.println("my speed is 70 km/hr in bus");
		
	}

}
