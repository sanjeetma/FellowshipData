package com.java.bridgelab.DesignPattern.FactoryPattern;

public class ComputerMain {

	public static void main(String[] args) {
		System.out.println("using without Singleton Class");
		System.out.println("###########################################");
		System.out.println();
		Computer pc=Computerfactory.getComputer("PC","8","16", "2.5Ghz");
		Computer server =Computerfactory.getComputer("Server", "16", "1000GB", "3.5GHz");
		System.out.println(pc);
		System.out.println(server);
	}

}
