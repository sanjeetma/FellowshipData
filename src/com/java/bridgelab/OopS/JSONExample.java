package com.java.bridgelab.OopS;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ParseException {
		JSONObject jsob=new JSONObject();
		jsob.put("name","ram");
		jsob.put("father","Dasrath");
		jsob.put("wife","sita");
		//String  jsonText=JSONValue.toJSONString(jsob);
		
		JSONArray arr=new JSONArray();
		arr.add("city:bengalorer");
		arr.add("phone:123456");
		jsob.put("adress",arr);
		String  jsonText=JSONValue.toJSONString(jsob);
      FileWriter fl=new FileWriter("check.json");
      fl.write(jsonText);
      fl.flush();
      fl.close();
      
      
     FileReader fr=new FileReader("check.json");
     JSONParser parser=new JSONParser();
     Object parseObject=parser.parse(fr);
     JSONObject jsonobject=(JSONObject)parseObject;
     String str=(String) jsonobject.get("name");
     String str1=(String) jsonobject.get("father");
     String str2=(String) jsonobject.get("wife");
      System.out.println(str+" "+str1+" "+str2);
      JSONArray jsarr=(JSONArray)jsonobject.get("adress");
      Iterator iterator = jsarr.iterator();
	    while (iterator.hasNext()) {
	       System.out.println(iterator.next());
	    }
	    
	}
	}



