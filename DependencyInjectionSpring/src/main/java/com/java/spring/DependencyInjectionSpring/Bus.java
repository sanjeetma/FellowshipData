package com.java.spring.DependencyInjectionSpring;

public class Bus {
	
	private String busName;
	private int maxSpeed;
	private Tyre tyre;
	
	
	
	public Bus(String busName, int maxSpeed, Tyre tyre) {
		super();
		this.busName = busName;
		this.maxSpeed = maxSpeed;
		this.tyre = tyre;
	}



	public void getBustDetails() {
		System.out.println("The Name Of Bus is="+busName);
		System.out.println("The Maximum Speed Of Bus is="+maxSpeed);
		tyre.getBusTyre();
	}

}
