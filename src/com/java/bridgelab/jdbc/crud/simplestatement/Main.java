/**
 * 
 */
package com.java.brigelab.jdbc.crud.simplestatement;

import com.java.brigelab.jdbc.crud.simplestatement.service.CRUDService;
import com.java.brigelab.jdbc.crud.simplestatement.service.serviceimpl.CRUDServiceImpl;

/**
 * @author sanje
 *
 */
public class Main {

	public static void main(String[] args) {
		CRUDService object= new CRUDServiceImpl();
		object.read();
		//object.update();
		object.create();

	}

}
