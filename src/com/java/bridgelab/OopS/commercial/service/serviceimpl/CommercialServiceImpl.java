package com.java.bridgelabz.oops.commercial.service.serviceimpl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.java.bridgelabz.oops.commercial.factorypattern.FactoryPattern;
import com.java.bridgelabz.oops.commercial.repo.LinkedList;
import com.java.bridgelabz.oops.commercial.repo.Repository;
import com.java.bridgelabz.oops.commercial.service.CommercialService;
import com.java.bridgelabz.oops.commercial.util.Utility;

public class CommercialServiceImpl implements CommercialService {

	@Override
	public void stockaccount(String file) {
		Repository object = FactoryPattern.repObject();
		object.read(file);
	}

	@Override
	public double valueOf() {
		Repository object = FactoryPattern.repObject();
		object.read();
		return 0;
	}

	@Override
	public void buy(int amount, String symbol) {
		Repository repoobject = FactoryPattern.repObject();
		try {
			FileReader fr = new FileReader("Stock.json");
			JSONParser parser = new JSONParser();
			Object object = parser.parse(fr);
			JSONArray jsarry = (JSONArray) object;
			JSONObject jsonobject;
			for (int i = 0; i < jsarry.size(); i++) {
				jsonobject = (JSONObject) jsarry.get(i);
				String symbol1 = (String) jsonobject.get("symbol");
				if (symbol1.compareToIgnoreCase(symbol) == 0) {
					String name = (String) jsonobject.get("name");
					double nos = (Double) jsonobject.get("nos");
					double price = (Double) jsonobject.get("price");
					double total = nos + amount;
					repoobject.update(name, symbol1, total, price);
				}
			}
		} catch (IOException e) {

			System.out.println("File Not Found...!!");
		} catch (ParseException e) {
			System.out.println("Not able to Parse...Might be File Not Available");
		}
	}

	@Override
	public void sell(int amount, String symbol) {
		Repository repoobject = FactoryPattern.repObject();
		try {
			FileReader fr = new FileReader("Stock.json");
			JSONParser parser = new JSONParser();
			Object object = parser.parse(fr);
			JSONArray jsarry = (JSONArray) object;
			JSONObject jsonobject;
			for (int i = 0; i < jsarry.size(); i++) {
				jsonobject = (JSONObject) jsarry.get(i);
				String symbol1 = (String) jsonobject.get("symbol");
				if (symbol1.compareToIgnoreCase(symbol) == 0) {
					String name = (String) jsonobject.get("name");
					double nos = (Double) jsonobject.get("nos");
					double price = (Double) jsonobject.get("price");
					double total = nos - amount;
					repoobject.update(name, symbol1, total, price);
				}
			}
		} catch (IOException e) {

			System.out.println("File Not Found...!!");
		} catch (ParseException e) {
			System.out.println("Not able to Parse...Might be File Not Available");
		}

	}

	@Override
	public void save(String filename) {
		Repository object = FactoryPattern.repObject();
		System.out.println("Enter symbol of Company");
		String symbol = Utility.inputString();
		System.out.println("Enter number of share of Your Company");
		double nos = Utility.inputDouble();
		System.out.println("Enter price of share");
		double price = Utility.inputDouble();

		object.write(filename, symbol, nos, price);
		System.out.println("Added Succesfully");

	}

	@Override
	public void printReport() {
          
	}
///abstract method implements
}
