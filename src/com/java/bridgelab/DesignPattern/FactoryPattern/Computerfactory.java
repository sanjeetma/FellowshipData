package com.java.bridgelab.DesignPattern.FactoryPattern;

public class Computerfactory {
	public static Computerfactory cop=new Computerfactory();
	    
	private Computerfactory() {}
	
	public static Computerfactory getObject() {
		return cop;
	}
	
        public static Computer getComputer(String type,String ram,String hdd,String cpu) {
        	if("PC".equalsIgnoreCase(type)) 
        		
        		return new PC(ram, hdd, cpu);
        	
    		else if("Server".equalsIgnoreCase(type)) 
    			
    			return new Server(ram, hdd, cpu);
    		
    		return null;
        }
}
