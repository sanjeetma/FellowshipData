package com.java.bridgelabz.oops.clinique.repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.java.bridgelabz.oops.clinique.model.Appointment;
import com.java.bridgelabz.oops.clinique.model.Doctor;
import com.java.bridgelabz.oops.clinique.model.Patient;

public class Repository {
	public void writeDoctors(String name, String id, String speciality, String timining) {
		JSONArray jsonarray = new JSONArray();
		try {
			FileReader fr = new FileReader("doc.json");
			JSONParser parser = new JSONParser();
			Object object = parser.parse(fr);
			JSONArray jsonarry = (JSONArray) object;
			JSONObject jsonobj;
			for (int i = 0; i < jsonarray.size(); i++) {
				jsonobj = (JSONObject) jsonarray.get(i);
				jsonarray.add(jsonobj);
				
			}
		} catch (FileNotFoundException e) {

			System.out.println("file not Found");
			
		} catch (IOException e) {

			System.out.println("file not found");
		} catch (ParseException e) {
			System.out.println("cant parse");
		}
		try {
			Doctor doctor = new Doctor();

			doctor.setName(name);
			doctor.setId(id);
			doctor.setSpeciality(speciality);
			doctor.setTimining(timining);

			FileWriter fw = new FileWriter("Doctor.json");
			JSONObject jsonobject = new JSONObject();
			jsonobject.put("name", doctor.getName());
			jsonobject.put("id", doctor.getId());
			jsonobject.put("speciality", doctor.getSpeciality());
			jsonobject.put("timining", doctor.getTimining());

			jsonarray.add(jsonobject);

			fw.write(JSONValue.toJSONString(jsonarray));
			fw.flush();
			fw.close();
		} catch (IOException e) {
			System.out.println("File Not Found");
		}

	}

	public void readDoctors() {

		try {
			FileReader fr = new FileReader("Doctor.json");
			JSONParser parser = new JSONParser();
			try {
				Object object = parser.parse(fr);
				JSONArray jsonarray = (JSONArray) object;
				JSONObject jsonobject;
				System.out.println("id" + "     " + "name" + "      " + "speciality" + "      " + "Timing");
				for (int i = 0; i < jsonarray.size(); i++) {
					jsonobject = (JSONObject) jsonarray.get(i);
					System.out.print(jsonobject.get("id") + "   ");
					System.out.print(jsonobject.get("name") + "   ");
					System.out.print(jsonobject.get("speciality") + "   ");
					System.out.print(jsonobject.get("timining") + "   ");
					System.out.println();
				}

			} catch (IOException e) {

				System.out.println("file not found");
			} catch (ParseException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			System.out.println("file not found");
		}

	}

	public void writePatient(String name, String id, String age, String mobile) {
		JSONArray jsonarray = new JSONArray();
		try {
			FileReader fr = new FileReader("Patient.json");
			JSONParser parser = new JSONParser();
			Object object = parser.parse(fr);
			JSONArray jsonarry = (JSONArray) object;
			JSONObject jsonobj;
			for (int i = 0; i < jsonarray.size(); i++) {
				jsonobj = (JSONObject) jsonarray.get(i);
				jsonarray.add(jsonobj);
			}
		} catch (FileNotFoundException e1) {

			System.out.println("file not found");
		} catch (IOException e) {

			System.out.println("file not found");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Patient patient = new Patient();
		patient.setName(name);
		patient.setId(id);
		patient.setAge(age);
		patient.setMobile(mobile);

		JSONObject jsonobject = new JSONObject();
		jsonobject.put("name", patient.getName());
		jsonobject.put("id", patient.getId());
		jsonobject.put("age", patient.getAge());
		jsonobject.put("mobile", patient.getMobile());
		jsonarray.add(jsonobject);

		try {
			FileWriter fw = new FileWriter("Patient.json");
			fw.write(JSONValue.toJSONString(jsonarray));
			fw.flush();
			fw.close();
		} catch (IOException e) {
			System.out.println("File Not Found");
		}

	}

	public void readPatient() {
		try {
			FileReader fr = new FileReader("Patient.json");
			JSONParser parser = new JSONParser();
			try {
				Object object = parser.parse(fr);
				JSONArray jsonarray = (JSONArray) object;
				JSONObject jsonobject;
				System.out.println("name" + "  " + "id" + "   " + "age" + "   " + "mobile");
				for (int i = 0; i < jsonarray.size(); i++) {
					jsonobject = (JSONObject) jsonarray.get(i);
					System.out.print(jsonobject.get("name") + "   ");
					System.out.print(jsonobject.get("id") + "   ");
					System.out.print(jsonobject.get("age") + "   ");
					System.out.print(jsonobject.get("mobile") + "   ");
					System.out.println();
				}

			} catch (IOException e) {
				System.out.println("file not found");
			} catch (ParseException e) {

				System.out.println("file not found");
			}
		} catch (FileNotFoundException e) {

			System.out.println("file not found");
		}

	}

	public void writeAppointment(String id, String docname, String pname, String time, String date) {
		JSONArray jsonarray = new JSONArray();
		try {
			FileReader fr = new FileReader("Appointment.json");
			JSONParser parser = new JSONParser();
			Object object = parser.parse(fr);
			JSONArray jsonarry = (JSONArray) object;
			JSONObject jsonobj;
			for (int i = 0; i < jsonarray.size(); i++) {
				jsonobj = (JSONObject) jsonarray.get(i);
				jsonarray.add(jsonobj);
			}
		} catch (FileNotFoundException e1) {

			System.out.println("file not found");
		} catch (IOException e) {

			System.out.println("file not found");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Appointment appointment = new Appointment();
		appointment.setId(id);
		appointment.setDocname(docname);
		appointment.setPname(pname);
		appointment.setTime(time);
		appointment.setDate(date);

		JSONObject jsonobject = new JSONObject();
		jsonobject.put("id", appointment.getId());
		jsonobject.put("docname", appointment.getDocname());
		jsonobject.put("pname", appointment.getPname());
		jsonobject.put("time", appointment.getTime());
		jsonobject.put("date", appointment.getDate());
		jsonarray.add(jsonobject);

		try {
			FileWriter fw = new FileWriter("Appointment.json");
			fw.write(JSONValue.toJSONString(jsonarray));
			fw.flush();
			fw.close();
		} catch (IOException e) {
			System.out.println("File Not Found");
		}

	}

	public void readAppointment() {
		try {
			FileReader fr = new FileReader("Appointment.json");
			JSONParser parser = new JSONParser();
			try {
				Object object = parser.parse(fr);
				JSONArray jsonarray = (JSONArray) object;
				JSONObject jsonobject;
				System.out
						.println("id" + "  " + "docname" + "   " + "pname" + "   " + "    " + "time" + "   " + "date");
				for (int i = 0; i < jsonarray.size(); i++) {
					jsonobject = (JSONObject) jsonarray.get(i);
					System.out.print(jsonobject.get("id") + "   ");
					System.out.print(jsonobject.get("docname") + "    ");
					System.out.print(jsonobject.get("pname") + "    ");
					System.out.print(jsonobject.get("time") + "    ");
					System.out.print(jsonobject.get("date") + "    ");
					System.out.println();
				}

			} catch (IOException e) {

				System.out.println("file not found");
			} catch (ParseException e) {

				System.out.println("file not found");
			}
		} catch (FileNotFoundException e) {

			System.out.println("file not found");
		}
	}
}
