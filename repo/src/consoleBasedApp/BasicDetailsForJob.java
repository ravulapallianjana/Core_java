 package consoleBasedApp;

import java.util.Scanner;

public class BasicDetailsForJob {

    static Scanner sc = new Scanner(System.in);
//   String details="";
    static String getBasicDetails() {

        System.out.println("enter your name:");
        String name = sc.next();

        System.out.println("enter your mobile number:");
        String phone = sc.next();
        while (!phone.matches("[6-9]\\d{9}")) {
            System.out.println("invalid mobile, enter again:");
            phone = sc.next();
        }
      
            System.out.println("enter your age:");
            int age = sc.nextInt();

            while (age < 18) {
                System.out.println("You must be 18+ to register. Enter valid age:");
                age = sc.nextInt();
            }

         
        

        System.out.println("enter your email:");
        String email = sc.next();
        while (!email.endsWith("@gmail.com")) {
            System.out.println("invalid email, enter again:");
            email = sc.next();
        }

        System.out.println("enter 12 digit Aadhar num:");
        String aadhar = sc.next();
        System.out.println(aadhar.matches("\\d{12}")) ;
          
        

        System.out.println("enter your pan num:");
        String pan = sc.next();
        while (!pan.matches("[A-Z]{5}[0-9]{4}[A-Z]")) {
            System.out.println("invalid pan, enter again:");
            pan = sc.next();
        }

        String details = "NAME: " + name +
                ", PHONE: " + phone +
                ", EMAIL: " + email +
                ", AADHAR: " + aadhar +
                ", PAN: " + pan+
                ",AGE:"+age;
        return details;
    }
//    public static void main(String[] args) {
//    	getBasicDetails();
//	}
}