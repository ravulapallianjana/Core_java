package consoleBasedApp;

import java.util.Scanner;

public class EducationalDetails extends BasicDetailsForJob {
	

	static Scanner sc = new Scanner(System.in);
	
	

	static String getQualification() {
		System.out.println("enter your education details:");

		System.out.println("ENTER YOUR DEGREE:");
		String degree = sc.next();

		while (!(degree.equalsIgnoreCase("BTECH") || degree.equalsIgnoreCase("MTECH") || degree.equalsIgnoreCase("MCA")
				|| degree.equalsIgnoreCase("MBA"))) {

			System.out.println("invalid degree, enter again:");
			degree = sc.next();
		}

		System.out.println("ENTER YOUR  BRANCH:");
		String branch = sc.next();

		while (!(branch.equalsIgnoreCase("CSE") || branch.equalsIgnoreCase("ECE") || branch.equalsIgnoreCase("MECH")
				|| branch.equalsIgnoreCase("DIPLOMA"))) {

			System.out.println("invalid branch, enter again:");
			branch = sc.next();
		}

		System.out.println("ENTER YOUR CGPA:");
		double cgpa = sc.nextDouble();

//		String status;
		if (cgpa < 7) {
		System.out.println("not eligible:");
		} else {
			System.out.println("good cgpa:");
		}

		System.out.println("ENTER YOUR PASSED OUT YEAR:");
		int year = sc.nextInt();

		if (year < 2022) {
			System.out.println( "Not eligible (old passed out year");
		}
		
		    System.out.println("Are you Fresher or Experienced?");
		    String exp = sc.next();

		    while (!(exp.equalsIgnoreCase("Fresher") ||
		             exp.equalsIgnoreCase("Experienced"))) {

		        System.out.println("invalid input, enter again:");
		        exp = sc.next();
		    }

		   

		return "DEGREE: " + degree + ", BRANCH: " + branch + ", CGPA: " + cgpa + ", YEAR: " + year + ",exp:"+ exp ;
				
	}
}