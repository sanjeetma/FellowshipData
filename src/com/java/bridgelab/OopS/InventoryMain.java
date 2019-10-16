package com.java.bridgelab.OopS;


import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

@SuppressWarnings("unused")
public class InventoryMain {
	@SuppressWarnings("unchecked")
	public static void insert(String str, int n) throws FileNotFoundException {
		JSONArray array = new JSONArray();
		JSONObject obj = new JSONObject();
		for (int i = 0; i < n; i++) {
			obj.put("Grain", str);
			@SuppressWarnings("rawtypes")
			Map details = new LinkedHashMap();
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the invertory Grain Name");
			String name = sc.next();
			details.put("NAME", name);
			System.out.println("enter the invertory Grain Weight");
			double weight = sc.nextDouble();
			details.put("WEIGHT", weight);
			System.out.println("enter the invertory Grain price");
			double price = sc.nextDouble();
			details.put("PRICE", price);
			obj.put("Details", details);
			array.add(obj);
		}
		PrintWriter pw = new PrintWriter("Inventory.json");
		pw.write(array.toJSONString());
		pw.flush();
		pw.close();
	}

	@SuppressWarnings("rawtypes")
	public static void read() throws FileNotFoundException, IOException, ParseException {
		Object ob = new JSONParser().parse(new FileReader("Inventory.json"));
		JSONArray array = new JSONArray();
		array = (JSONArray) ob;
		JSONObject jo;
		for (int i = 0; i < array.size(); i++) {
			jo = new JSONObject();
			jo = (JSONObject) array.get(i);
			System.out.println("Invertory:" + jo.get("Grain"));
			Map detail = (Map) jo.get("Details");
			@SuppressWarnings("unchecked")
			Iterator<Map.Entry> itr = detail.entrySet().iterator();
			double w = 0;
			double p = 0;
			double total = 0;
			while (itr.hasNext()) {
				Map.Entry pair = itr.next();
				System.out.println(pair.getKey() + ":" + pair.getValue());
				if ("WEIGHT".equalsIgnoreCase((String) pair.getKey())) {
					
					w = (Double) pair.getValue();
				}
				if ("PRICE".equalsIgnoreCase((String) pair.getKey())) {
					p = (Double) pair.getValue();
				}
				System.out.println("check the the invertory" + w * p + " ");
			}
			total = total + (int) (w * p);
			System.out.println(total);
		}

	}

	public static void main(String args[]) throws IOException, ParseException {
		Scanner sc = new Scanner(System.in);
		read();
		System.out.println("inserting the data");
		int trams = sc.nextInt();
		int option = sc.nextInt();
		String Grain[] = { "rice", "pules", "Wheats" };
		switch (option) {
		case 0:
			insert(Grain[option], trams);
			break;
		case 1:
			insert(Grain[option], trams);
			break;
		case 2:
			insert(Grain[option], trams);
			break;
		default:
			System.out.println("completed the data");
		}
		System.out.println("completed the data");
		read();

	}
}
