package com.java.bridgelabz.oops.commercial.factorypattern;

import com.java.bridgelabz.oops.commercial.repo.Repository;
import com.java.bridgelabz.oops.commercial.service.CommercialService;
import com.java.bridgelabz.oops.commercial.service.serviceimpl.CommercialServiceImpl;

public class FactoryPattern {
	public static CommercialService getObject() {
		return new CommercialServiceImpl();
	}
	
	public static Repository repObject() {
		return new Repository();
	}
}
