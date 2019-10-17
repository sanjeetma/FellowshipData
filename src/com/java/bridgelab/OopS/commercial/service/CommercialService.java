package com.java.bridgelabz.oops.commercial.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

public interface CommercialService {
//interface....abstract method
	void stockaccount(String file);

	double valueOf();

	void buy(int amount, String symbol);

	void sell(int amount, String symbol);

	void save(String filename);

	void printReport();

}
