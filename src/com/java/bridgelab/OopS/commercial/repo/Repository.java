package com.java.bridgelabz.oops.commercial.repo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.java.bridgelabz.oops.commercial.model.Commercial;

public class Repository {

	public void write(String name, String symbol, Double nos, Double price) {
		JSONArray jsonarray = new JSONArray();
		try {
			FileReader fr = new FileReader("Stock.json");
			JSONParser parser = new JSONParser();

			Object object = parser.parse(fr);
			JSONArray jsonarr = (JSONArray) object;
			JSONObject jsonobj;
			for (int i = 0; i < jsonarr.size(); i++) {
				jsonobj = (JSONObject) jsonarr.get(i);
				jsonarray.add(jsonobj);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {

			e.printStackTrace();
		}

		Commercial obj = new Commercial();
		try {
			obj.setName(name);
			obj.setSymbol(symbol);
			obj.setNos(nos);
			obj.setPrice(price);
			FileWriter fw = new FileWriter("Stock.json");
			JSONObject jsonobject = new JSONObject();
			jsonobject.put("name", obj.getName());
			jsonobject.put("symbol", obj.getSymbol());
			jsonobject.put("nos", obj.getNos());
			jsonobject.put("price", obj.getPrice());

			jsonarray.add(jsonobject);

			fw.write(JSONValue.toJSONString(jsonarray));
			fw.flush();
			fw.close();

		} catch (IOException e) {
			System.out.println("File not Found !!!");
		}
	}

	public void update(String name, String symbol, Double nos, Double price) {
		JSONArray jsonarray = new JSONArray();
		try {
			FileReader fr = new FileReader("Stock.json");
			JSONParser parser = new JSONParser();

			Object object = parser.parse(fr);
			JSONArray jsonarr = (JSONArray) object;
			JSONObject jsonobj;
			for (int i = 0; i < jsonarr.size(); i++) {
				jsonobj = (JSONObject) jsonarr.get(i);
				String symbol1 = (String) jsonobj.get("symbol");
				if (!(symbol1.compareToIgnoreCase(symbol) == 0)) {

					jsonarray.add(jsonobj);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {

			e.printStackTrace();
		}

		Commercial obj = new Commercial();
		try {
			obj.setName(name);
			obj.setSymbol(symbol);
			obj.setNos(nos);
			obj.setPrice(price);
			FileWriter fw = new FileWriter("Stock.json");
			JSONObject jsonobject = new JSONObject();
			jsonobject.put("name", obj.getName());
			jsonobject.put("symbol", obj.getSymbol());
			jsonobject.put("nos", obj.getNos());
			jsonobject.put("price", obj.getPrice());

			jsonarray.add(jsonobject);

			fw.write(JSONValue.toJSONString(jsonarray));
			fw.flush();
			fw.close();

		} catch (IOException e) {
			System.out.println("File not Found !!!");
		}
	}

	public void read() {
		try {
			FileReader fr = new FileReader("Stock.json");
			JSONParser parser = new JSONParser();
			Object object = parser.parse(fr);
			JSONArray jsonarray = (JSONArray) object;
			JSONObject jsonobject;
			for (int index = 0; index < jsonarray.size(); index++) {
				jsonobject = (JSONObject) jsonarray.get(index);
				System.out.println("name=" + (String) jsonobject.get("name"));
				System.out.println("symbol=" + (String) jsonobject.get("symbol"));
				System.out.println("number of=" + (Double) jsonobject.get("nos"));
				System.out.println("price of one share=" + (Double) jsonobject.get("price"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {

			e.printStackTrace();
		}
	}

	public void read(String file) {
		try {
			FileReader fr = new FileReader("Stock.json");
			JSONParser parser = new JSONParser();
			Object object = parser.parse(fr);
			JSONArray jsonarray = (JSONArray) object;
			JSONObject jsonobject;
			for (int index = 0; index < jsonarray.size(); index++) {
				jsonobject = (JSONObject) jsonarray.get(index);
				String name = (String) jsonobject.get("name");
				if (name.compareToIgnoreCase(file) == 0) {
					System.out.println("name=" + (String) jsonobject.get("name"));
					System.out.println("symbol=" + (String) jsonobject.get("symbol"));
					System.out.println("number of=" + (Double) jsonobject.get("nos"));
					System.out.println("price of one share=" + (Double) jsonobject.get("price"));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {

			e.printStackTrace();
		}
	}

////read write json file
}
