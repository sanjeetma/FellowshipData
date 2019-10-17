package com.java.bridgelabz.oops.clinique.factory;

import com.java.bridgelabz.oops.clinique.repository.Repository;
import com.java.bridgelabz.oops.clinique.service.CliniqueService;
import com.java.bridgelabz.oops.clinique.service.serviceImpl.CliniqueServiceImpl;

public class Factory {
	public static CliniqueService getObject() {
		return new CliniqueServiceImpl();
	}

	public static Repository getRepoObject() {
		return new Repository();
	}
}
