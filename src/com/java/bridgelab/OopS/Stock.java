package com.java.bridgelab.OopS;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Stock {
	
	static void  write() throws IOException {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter company name");
	    String company=sc.nextLine();
	    System.out.println("enter price");
	    int price=sc.nextInt();
	    System.out.println("enter nuber of share");
	    int nos=sc.nextInt();
		JSONObject js=new JSONObject();
		JSONObject js1=new JSONObject();
		JSONArray arr=new JSONArray();
		js.put("name",company);
		js.put("price",price);
		js.put("nos",nos);
		arr.add(js);
		js1.put("details",arr);
		FileWriter fl=new FileWriter("stock.json");
		fl.write(JSONValue.toJSONString(js1));
		fl.flush();
		fl.close();
	}
	static void read() throws IOException, ParseException {
		FileReader fl=new FileReader("stock.json");
		JSONParser parser=new JSONParser();
		Object obj=parser.parse(fl);
		JSONObject ob3=(JSONObject)obj;
		JSONArray jsarr=(JSONArray)ob3.get("details");
		System.out.println(jsarr.get(0));
		Iterator iterator= jsarr.iterator();
		 while (iterator.hasNext()) {
		       System.out.println(iterator.next().toString());
		       
		    }
	}
	
	
	public static void main(String[] args) throws IOException, ParseException {
		write();
		read();
	}

}
