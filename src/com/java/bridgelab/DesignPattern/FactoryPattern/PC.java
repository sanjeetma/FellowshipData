package com.java.bridgelab.DesignPattern.FactoryPattern;

public class PC extends Computer {
                 private String ram;
                 private String cpu;
                 private String hdd;
           public PC(String ram,String hdd,String cpu) {
        	   this.ram=ram;
        	   this.cpu=cpu;
        	   this.hdd=hdd;
           }
	@Override
	public String getRam() {
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
