package com.java.bridgelab.OopS;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class AddressBook {
	String name;
	String home;
	String Zip;
	String mobile;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	

	public String getZip() {
		return Zip;
	}

	public void setZip(String zip) {
		Zip = zip;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



	Scanner sc=new Scanner(System.in);
    void choose() throws IOException, ParseException {
    	 System.out.println("select your option Below");
    	 System.out.println("Enter 1 to add new address");
    	 System.out.println("Enter 2 to delete address");
    	 System.out.println("Enter 3 to update address");
    	 System.out.println("Enter 4 to search address");
    	 int choice=sc.nextInt();
    	 switch(choice) {
    	 case 1:
    		  add();
    		 break;
    	 case 2:
    		 delete();
    		 break;
    	 case 3:
    		 update();
    		 break;
    	 case 4:
    		 search();
    		 break;
        default:
        	System.out.println("Invalid Choice");
    		 
    	 
    	 }
    	 
    	 
     }
     //###########################################
     //for adding new address
     
     void add() throws IOException {
    	 System.out.println("Enter your name");
    	 String name=sc.next();
    	 setName(name);
    	 System.out.println("Enter home town name");
    	 String home=sc.next();
    	 setHome(home);
    	 System.out.println("Enter town zip code name");
    	 String zip=sc.next();
    	 setZip(zip);
    	 System.out.println("Enter mobile number");
    	 String mobile=sc.next(); 
    	 if(mobileValidation(mobile)) {
    	 JSONObject obj=new JSONObject();
    	 obj.put("name", getName());
    	 obj.put("home", getHome());
    	 obj.put("zip", getZip());
    	 obj.put("mobile", getMobile());
    	 FileWriter fl=new FileWriter(name+".json");
    	 System.out.println("Added Succesfully");
    	 fl.write(JSONValue.toJSONString(obj));
    	 fl.flush();
    	 fl.close();
    	 sc.close();
     }
    	 else {
    		 System.out.println("sorry....Invalid mobile Number");
    	 }
     }
     ///############################################
     //for delete the address
     
     void delete() {
    	System.out.println("enter your name");
    	String name=sc.next();
    	File file=new File(name+".json");
    	 if(file.delete()) {
    		 System.out.println("SuccesFully deleted");
    	 }
    	 else {
    		 System.out.println("file not found");
    		 
    	 }
    	 
     }
     //################################################
     //update addressBook
     
     void update() throws IOException {
    	 System.out.println("Enter your name to update");
    	 String name=sc.next();
    	 File file=new File(name+".json");
    	 if(file.delete()) {
    		 System.out.println("enter your details to update");
    		 
    		 add();
    		 System.out.println("updated Succesfully");
    	 }
    	 else {
    		 System.out.println("file not found");
    		 
    	 }
    	 
     }
     //####################################
     //search address
     
     void search() throws IOException, ParseException {
    	 System.out.println("Enter your name");
    	 String name=sc.next();
    	 File file =new File(name+".json");
    	 if(file.exists()) {
    		 FileReader fl=new FileReader(name+".json");
    		 JSONParser parser=new JSONParser();
    		 Object ob=parser.parse(fl);
    		 JSONObject obj=(JSONObject)ob;
    		 String name1=(String)obj.get("name");
    		 String home=(String)obj.get("home");
    		 String zip=(String)obj.get("zip");
    		 String mobile=(String)obj.get("mobile");
    		 System.out.println("your name is:"+"  "+name1);
    		 System.out.println("your home is:"+" "+home);
    		 System.out.println("your zip is:"+" "+zip);
    		 System.out.println("your mobile number is:"+"  "+mobile);
    		 System.out.println("see you soon");
    		 
    	 }
    	 else {
    		 System.out.println("oops....File not Found");
    	 }
     }
     
     boolean mobileValidation(String str) 
     {
    	 boolean bool=false;
    	 Pattern p=Pattern.compile("[7-9][0-9]{9}");
    	 Matcher m=p.matcher(str);
    	 if(m.find()) {
    		 setMobile(str);
    		 bool=true;
    	 }
    	 else {
    		 System.out.println("not applicable");
    	 }
    	 return bool;
     }
     
}