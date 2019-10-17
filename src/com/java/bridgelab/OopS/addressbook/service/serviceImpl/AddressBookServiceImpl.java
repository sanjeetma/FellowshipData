package com.java.bridgelabz.oops.addressbook.service.serviceImpl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.java.bridgelabz.oops.addressbook.factory.Factory;
import com.java.bridgelabz.oops.addressbook.repository.Repository;

import com.java.bridgelabz.oops.addressbook.service.AddressBookService;
import com.java.bridgelabz.oops.addressbook.utility.Util;

public class AddressBookServiceImpl implements AddressBookService {

	@Override
	public void add() {
		Repository obj = Factory.getRepoObject();
		System.out.println("Enter your name");
		String name = Util.inputString();
		System.out.println("Enter your city");
		String city = Util.inputString();
		System.out.println("Enter your zip");
		String zip = Util.inputString();
		System.out.println("Enter your mobile");
		String mobile = Util.inputString();
		obj.write(name, city, zip, mobile);
		System.out.println("added Succesfully");

	}

	@Override
	public void update() {
		Repository obj = Factory.getRepoObject();
		JSONArray JSONarry = new JSONArray();
		System.out.println("Enter your name");
		String name = Util.inputString();
		obj.update(name);
		System.out.println("Updated Succesfully");

	}

	@Override
	public void delete() {
		JSONArray JSONarry = new JSONArray();
		System.out.println("Enter your name to delete");
		String name = Util.inputString();
		try {
			FileReader fr = new FileReader("Address.json");
			JSONParser parser = new JSONParser();
			Object ob = parser.parse(fr);
			JSONArray jsonarray = (JSONArray) ob;
			JSONObject jsonobject;
			for (int i = 0; i < jsonarray.size(); i++) {
				jsonobject = (JSONObject) jsonarray.get(i);
				String name1 = (String) jsonobject.get("name");
				if ((name1.compareToIgnoreCase(name) != 0)) {
					JSONarry.add(jsonobject);
				}
			}

			FileWriter fw = new FileWriter("Address.json");
			fw.write(JSONValue.toJSONString(JSONarry));
			fw.flush();
			fw.close();
			System.out.println("deleted Succesfully");

		} catch (IOException e) {

			System.out.println("File not found !!");
		} catch (ParseException e) {

			System.out.println("Not able to Parse....might be file not available");
		}
	}

	@Override
	public void search() {
		Repository obj = Factory.getRepoObject();
		System.out.println("Enter you name to search");
		String name = Util.inputString();
		obj.read(name);

	}

	@Override
	public void show() {
		Repository obj = Factory.getRepoObject();
		obj.read();

	}

}
