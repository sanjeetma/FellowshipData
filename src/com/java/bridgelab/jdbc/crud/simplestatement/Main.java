/**
 * 
 */
package com.java.brigelab.jdbc.crud.simplestatement;

import com.java.brigelab.jdbc.crud.simplestatement.service.CRUDService;
import com.java.brigelab.jdbc.crud.simplestatement.service.serviceimpl.CRUDServiceImpl;
import com.java.brigelab.jdbc.crud.simplestatement.utility.ScannerUtil;

/**
 * @author sanje
 *
 */
public class Main {

	public static void main(String[] args) {
		CRUDService object= new CRUDServiceImpl();
		int choice;
		do {
			System.out.println("Press 1: for create new record");
			System.out.println("Press 2: for update  record");
			System.out.println("Press 3: for delete record");
			System.out.println("Press 4: for read record");
			System.out.println("Press 5: for exit");
			choice = ScannerUtil.inputInt();
			switch (choice) {
			case 1:
				object.create();
				break;
			case 2:
				object.update();
				break;
			case 3:
				object.delete();
				break;
			case 4:
				object.read();
				break;
			case 5:
				System.out.println("good Bye");
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}

			
		}while(choice!=5);

	}

}
