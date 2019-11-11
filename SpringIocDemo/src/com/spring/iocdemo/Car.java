package com.spring.iocdemo;

public class Car implements Vehicle{

	@Override
	public void move() {
		System.out.println("i am moving by car");
		
	}

	@Override
	public void speed() {
		System.out.println("my speed is 100 km/hr in car");
		
	}

}
