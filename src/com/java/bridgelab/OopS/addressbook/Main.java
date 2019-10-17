package com.java.bridgelabz.oops.addressbook;

import com.java.bridgelabz.oops.addressbook.factory.Factory;
import com.java.bridgelabz.oops.addressbook.service.AddressBookService;
import com.java.bridgelabz.oops.addressbook.utility.Util;

public class Main {

	public static void main(String[] args) {
		AddressBookService object = Factory.getObject();

		int choice;
		do {
			System.out.println("Press 1: to add");
			System.out.println("Press 2: to delete");
			System.out.println("Press 3: to update");
			System.out.println("Press 4: to search");
			System.out.println("Press 5: to show all adresses");
			System.out.println("Press 6: to exit");
			choice = Util.inputInt();
			switch (choice) {
			case 1:
				object.add();
				break;
			case 2:
				object.delete();
				break;
			case 3:
				object.update();
				break;
			case 4:
				object.search();
				break;
			case 5:
				object.show();
				break;
			default:
				System.out.println("Good Bye");
				break;

			}
		} while (choice != 6);

	}

}
