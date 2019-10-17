package com.java.bridgelabz.oops.addressbook.factory;

import com.java.bridgelabz.oops.addressbook.repository.Repository;
import com.java.bridgelabz.oops.addressbook.service.AddressBookService;
import com.java.bridgelabz.oops.addressbook.service.serviceImpl.AddressBookServiceImpl;

public class Factory {
	public static AddressBookService getObject() {
		return new AddressBookServiceImpl();
	}

	public static Repository getRepoObject() {
		return new Repository();
	}
}
