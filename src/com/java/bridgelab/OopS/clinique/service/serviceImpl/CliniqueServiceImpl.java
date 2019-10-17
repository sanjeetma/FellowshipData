package com.java.bridgelabz.oops.clinique.service.serviceImpl;

import com.java.bridgelabz.oops.clinique.Utility.Util;
import com.java.bridgelabz.oops.clinique.factory.Factory;
import com.java.bridgelabz.oops.clinique.repository.Repository;
import com.java.bridgelabz.oops.clinique.service.CliniqueService;

public class CliniqueServiceImpl implements CliniqueService {

	@Override
	public void doctorDetails() {
		Repository repo = Factory.getRepoObject();
		System.out.println("Enter name");
		String name = Util.inputString();
		System.out.println("Enter id");
		String id = Util.inputString();
		System.out.println("Enter Speciality");
		String speciality = Util.inputString();
		System.out.println("Enter timing");
		String timining = Util.inputString();
		repo.writeDoctors(name, id, speciality, timining);
		System.out.println("Added Succesfully");

	}

	@Override
	public void patientDetails() {
		Repository repo = Factory.getRepoObject();
		System.out.println("Enter Patient Name");
		String name = Util.inputString();
		System.out.println("Enter id of Patient");
		String id = Util.inputString();
		System.out.println("Enter age of Patient");
		String age = Util.inputString();
		System.out.println("Enter mobile number of patient");
		String mobile = Util.inputString();
		if (Util.verifyMobile(mobile)) {
			repo.writePatient(name, id, age, mobile);
		} else {
			System.out.println("wrong mobile number");
		}

	}

	@Override
	public void takeAppointment() {
		Repository repo = Factory.getRepoObject();
		System.out.println("Our avilable doctors are");
		repo.readDoctors();
		System.out.println("Enter id of patient");
		String id = Util.inputString();
		System.out.println("Enter doctor name");
		String docname = Util.inputString();
		System.out.println("Enter patient name");
		String pname = Util.inputString();
		System.out.println("Enter Timining");
		String time = Util.inputString();
		System.out.println("Enter date of Appointment");
		String date = Util.inputString();
		repo.writeAppointment(id, docname, pname, time, date);
		System.out.println("you have succesfully taken appointment with doctor" + docname);

	}

	@Override
	public void appointmentDetails() {
		Repository repo = Factory.getRepoObject();
		repo.readAppointment();

	}

	@Override
	public void readDoctorDetails() {
		Repository repo = Factory.getRepoObject();
		repo.readDoctors();
		
	}

	@Override
	public void readPatientDetails() {
		Repository repo = Factory.getRepoObject();
		repo.readPatient();
		
	}

}
