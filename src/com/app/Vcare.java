package com.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Vcare {
	
	public static void main (String args[])
	{
		
		int choice=0;
		ArrayList<PatientSearch> patientList = new ArrayList<PatientSearch>();
		System.out.println("Press 1 to add patient Details");
	    Scanner sc = new Scanner(System.in);
	    choice = sc.nextInt();
	    switch (choice)
	    {
	    case 1:     
	    {   
	    PatientSearch p = new PatientSearch ("Ram",1000,"Male","Dasharatha",9989858397l);
        PatientSearch p1 = new PatientSearch ("Laxman",1001,"Male","Dasharatha",9989858398l);
        PatientSearch p2 = new PatientSearch ("Bharath",1002,"Male","Dasharatha",9989858399l);
        PatientSearch p3 = new PatientSearch ("Sri",1003,"Male","Naresh",9989858311l);
        PatientSearch p4 = new PatientSearch ("Rajesh",1004,"Male","Sanketh",9989858123l);
        PatientSearch p5= new PatientSearch ("Seetha",1005,"FeMale","Janaka",9989854565l);
        patientList.add(p);
        patientList.add(p1);
        patientList.add(p2);
        patientList.add(p3);
        patientList.add(p4);
        patientList.add(p5);
         System.out.println(patientList);
	    }
	}
 }
}
