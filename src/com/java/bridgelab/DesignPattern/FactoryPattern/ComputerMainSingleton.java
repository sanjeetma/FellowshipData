package com.java.bridgelab.DesignPattern.FactoryPattern;

public class ComputerMainSingleton {

	public static void main(String[] args) {
		System.out.println("using  Singleton Class");
		System.out.println("###########################################");
		System.out.println();
		Computerfactory obj=Computerfactory.getObject();
		Computer pc=obj.getComputer("PC","8","16", "2.5Ghz");
		Computer server =obj.getComputer("Server", "16", "1000GB", "3.5GHz");
		System.out.println(pc);
		System.out.println(server);
	}

}
