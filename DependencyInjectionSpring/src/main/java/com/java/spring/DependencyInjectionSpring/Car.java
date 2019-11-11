package com.java.spring.DependencyInjectionSpring;

public class Car {
  private String carName;
  private int maxSpeed;
  private Tyre tyre;


public void setTyre(Tyre tyre) {
	this.tyre = tyre;
}


public void setCarName(String carName) {
	this.carName = carName;
}


public void setMaxSpeed(int maxSpeed) {
	this.maxSpeed = maxSpeed;
}


public void getCarDetails() {
	
	System.out.println("The Name Of Car is="+carName);
	System.out.println("The Maximum Speed of car is="+maxSpeed);
	tyre.getCarTyre();
}
  
  
}
