package com.java.bridgelab.DesignPattern.FactoryPattern;

public class Server extends Computer {
String ram;
String hdd;
String cpu;
  public Server(String ram,String hdd,String cpu) {
	  this.ram=ram;
	  this.hdd=hdd;
	  this.cpu=cpu;
  }
@Override
public String getRam() {
	// TODO Auto-generated method stub
	return this.ram;
}
@Override
public String getHdd() {
	// TODO Auto-generated method stub
	return this.hdd;
}
@Override
public String getCpu() {
	// TODO Auto-generated method stub
	return this.cpu;
}
  
  
}
