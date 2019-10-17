package com.java.bridgelabz.oops.addressbook.repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.java.bridgelabz.oops.addressbook.factory.Factory;
import com.java.bridgelabz.oops.addressbook.model.AddressBook;
import com.java.bridgelabz.oops.addressbook.utility.Util;

public class Repository {

	public void write(String name, String city, String zip, String mobile) {
		AddressBook addressobject = new AddressBook();
		JSONArray jsonarray = new JSONArray();
		try {
			FileReader fr = new FileReader("Address.json");
			JSONParser parser = new JSONParser();

			Object object = parser.parse(fr);
			JSONArray jsonarr = (JSONArray) object;
			JSONObject jsonobj;
			for (int i = 0; i < jsonarr.size(); i++) {
				jsonobj = (JSONObject) jsonarr.get(i);
				jsonarray.add(jsonobj);
			}

		} catch (IOException e) {
			System.out.println("File not available");
		} catch (ParseException e) {

			System.out.println("File not available");
		}

		try {
			addressobject.setName(name);
			addressobject.setCity(city);
			addressobject.setZip(zip);
			addressobject.setMobile(mobile);
			FileWriter fw = new FileWriter("Address.json");
			JSONObject jsonobject = new JSONObject();
			jsonobject.put("name", addressobject.getName());
			jsonobject.put("city", addressobject.getCity());
			jsonobject.put("zip", addressobject.getZip());
			jsonobject.put("mobile", addressobject.getMobile());

			jsonarray.add(jsonobject);

			fw.write(JSONValue.toJSONString(jsonarray));
			fw.flush();
			fw.close();

		} catch (IOException e) {
			System.out.println("File not Found !!!");
		}
	}

	public void update(String name) {
		JSONArray JSONarry = new JSONArray();
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
			System.out.println("Enter your all details to update");
			System.out.println("Enter your name");
			String updatename = Util.inputString();
			System.out.println("Enter your city");
			String updatecity = Util.inputString();
			System.out.println("Enter your zip");
			String updatezip = Util.inputString();
			System.out.println("Enter your mobile number");
			String updatemobile = Util.inputString();

			JSONObject obj = new JSONObject();
			obj.put("name", updatename);
			obj.put("city", updatecity);
			obj.put("zip", updatezip);
			obj.put("mobile", updatemobile);
			JSONarry.add(obj);

			FileWriter fw = new FileWriter("Address.json");
			fw.write(JSONValue.toJSONString(JSONarry));
			fw.flush();
			fw.close();

		} catch (IOException e) {

			System.out.println("File not available");
		} catch (ParseException e) {

			System.out.println("File not available");
		}

	}

	public void read() {
		try {
			FileReader fr = new FileReader("Address.json");
			JSONParser parser = new JSONParser();
			Object object = parser.parse(fr);
			JSONArray jsonarray = (JSONArray) object;
			JSONObject jsonobject;
			System.out.println("name" + "     " + "city" + "      " + "zip" + "     " + "mobile");
			for (int i = 0; i < jsonarray.size(); i++) {
				jsonobject = (JSONObject) jsonarray.get(i);
				System.out.print(jsonobject.get("name") + " ");
				System.out.print(jsonobject.get("city") + " ");
				System.out.print(jsonobject.get("zip") + " ");
				System.out.print(jsonobject.get("mobile") + " ");
				System.out.println();
			}
		} catch (IOException e) {
			System.out.println("File not available");
		} catch (ParseException e) {
			System.out.println("no file available");
		}
	}

	public void read(String name) {
		try {
			FileReader fr = new FileReader("Address.json");
			JSONParser parser = new JSONParser();
			Object object = parser.parse(fr);
			JSONArray jsonarray = (JSONArray) object;
			JSONObject jsonobject;
			for (int i = 0; i < jsonarray.size(); i++) {
				jsonobject = (JSONObject) jsonarray.get(i);
				String name1 = (String) jsonobject.get("name");
				if (name.compareToIgnoreCase(name1) == 0) {
					System.out.println("name=" + jsonobject.get("name"));
					System.out.println("city=" + jsonobject.get("city"));
					System.out.println("zip=" + jsonobject.get("zip"));
					System.out.println("mobile=" + jsonobject.get("mobile"));
				}
			}
		} catch (IOException e) {
			System.out.println("File not available");
		} catch (ParseException e) {
			System.out.println("File not available");
		}
	}

}
