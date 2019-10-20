package com.java.brigelab.jdbc.crud.preparedstatement;

import com.java.brigelab.jdbc.crud.preparedstatement.service.CRUDService;
import com.java.brigelab.jdbc.crud.preparedstatement.service.serviceimpl.CRUDServiceImpl;
import com.java.brigelab.jdbc.crud.simplestatement.utility.ScannerUtil;

public class Main {

	public static void main(String[] args) {
		CRUDService obj = new CRUDServiceImpl();
		int choice = 0;
		do {
			System.out.println("Press 1: for create new record");
			System.out.println("Press 2: for update  record");
			System.out.println("Press 3: for delete record");
			System.out.println("Press 4: for read record");
			System.out.println("Press 5: for exit");
			choice = ScannerUtil.inputInt();
			switch (choice) {
			case 1:
				obj.create();
				break;
			case 2:
				obj.update();
				break;
			case 3:
				obj.delete();
				break;
			case 4:
				obj.read();
				break;
			case 5:
				System.out.println("good Bye");
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}

		} while (choice != 5);

	}

}
