package com.java.bridgelabz.oops.clinique;

import com.java.bridgelabz.oops.clinique.Utility.Util;
import com.java.bridgelabz.oops.clinique.factory.Factory;
import com.java.bridgelabz.oops.clinique.service.CliniqueService;

public class Clinique {

	public static void main(String[] args) {
		CliniqueService clinique=Factory.getObject();
		int choice;
		
		do {
			System.out.println();
			System.out.println("Press 1: to add doctor details");
			System.out.println("Press 2: to add Patient details");
			System.out.println("Press 3: to take Appointment ");
			System.out.println("Press 4: to see doctor details");
			System.out.println("Press 5: to see patient details");
			System.out.println("Press 6: to see appointment details");
			System.out.println("Press 7: to Exit");
			choice =Util.inputInt();
			switch(choice) {
			case 1:
				clinique.doctorDetails();
				break;
			case 2:
				clinique.patientDetails();
				break;
			case 3:
				clinique.takeAppointment();
				break;
			case 4:
				clinique.readDoctorDetails();
				break;
			case 5:
				clinique.readPatientDetails();
				break;
			case 6:
				clinique.appointmentDetails();
				break;
			default:
				System.out.println("good bye");
				break;
			}
				
			
		}while(choice!=7);
		

	}

}
