package com.java.bridgelabz.oops.commercial;

import com.java.bridgelabz.oops.commercial.factorypattern.FactoryPattern;
import com.java.bridgelabz.oops.commercial.service.CommercialService;
import com.java.bridgelabz.oops.commercial.util.Utility;

public class CommercialMain {

	public static void main(String[] args) {
		CommercialService object = FactoryPattern.getObject();
		int choice;
          do {
          System.out.println("press 1:to check all company value");
          System.out.println("press 2:to check individual company value");
          System.out.println("press 3:to buy company Share");
          System.out.println("press 4:to sell comapany share");
          System.out.println("press 5:to add new company details");
          System.out.println("press 6:exit");
           choice=Utility.inputInt();
          switch(choice) {
          case 1:
        	object.valueOf();
        	  break;
          case 2:
        	  System.out.println("Enter comapny name");
        	  String file=Utility.inputString();
        	  object.stockaccount(file);
        	  break;
          case 3:
        	  System.out.println("Enter Company symbol");
        	  String symbol=Utility.inputString();
        	  System.out.println("Enter amount of share");
        	  int nos=Utility.inputInt();
        	  object.buy(nos, symbol);
        	  break;
          case 4:
        	  System.out.println("enter company name");
              String name=Utility.inputString();
              System.out.println("enter nos");
              int amount=Utility.inputInt();
              object.sell(amount, name);
              break;
          case 5:
        	  System.out.println("Enter company name");
        	  String companyname=Utility.inputString();
        	  object.save(companyname);
        	  break;
           default:
        	  System.out.println("good bye");
        	  break;
          }
          }while(choice!=6);
          
        
	}

}
