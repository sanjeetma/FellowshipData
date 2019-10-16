package com.java.bridgelab.OopS;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class Inventory1 {
	
	
	@SuppressWarnings("unchecked")
	static void writeFile() throws IOException {
		JSONObject jso=new JSONObject(); 
		JSONObject jsonob=new JSONObject();
		JSONArray arr=new JSONArray();
		jsonob.put("Name","Basmati");
		jsonob.put("Weight","50");
		jsonob.put("Price","2000");
		arr.add(jsonob);
		jso.put("Rice",arr);
		
		JSONObject js=new JSONObject();
		js.put("Name","mong");
		js.put("Weigth","10");
		js.put("price","1000");
		arr.add(js);
		jso.put("pulse",arr);
		
		
		JSONObject js1=new JSONObject();
		js1.put("Name","Ashirvad");
		js1.put("price",30);
		js1.put("weight","110");
		arr.add(js1);
		jso.put("wheat","js1");
		FileWriter fl=new FileWriter("check1.json");
		fl.write(JSONValue.toJSONString(jso));
		fl.flush();
		fl.close();
	}
	
	static void readFile() throws IOException, ParseException {
	FileReader fr=new FileReader("check1.json");
	JSONParser parser=new JSONParser();
	Object ob=parser.parse(fr);
	JSONObject jsob=(JSONObject)ob;
	JSONArray jarr=(JSONArray)jsob.get("Rice");
	@SuppressWarnings("rawtypes")
	Iterator iterator = jarr.iterator();
    while (iterator.hasNext()) {
       System.out.println(iterator.next().toString());
	
	}
	}

	public static void main(String[] args) throws IOException, ParseException {
		Scanner sc=new Scanner(System.in);
		writeFile();
		readFile();
	}

}
