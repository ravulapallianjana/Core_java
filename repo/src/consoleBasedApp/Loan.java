package consoleBasedApp;

import java.util.Scanner;

public class Loan {

    static Scanner sc = new Scanner(System.in);


    static String getPhoneNum() {
        System.out.println("Enter your phone number:");
        String phone = sc.next();

        if (!phone.matches("[6-9]\\d{9}")) {
            System.out.println("Invalid phone number!");
            return getPhoneNum(); 
        }
        return phone;
    }

  
    static String getPanCardNum() {
        System.out.println("Enter your PAN number:");
        String pan = sc.next();

        if (!pan.matches("[A-Z]{5}[0-9]{4}[A-Z]")) {
            System.out.println("Invalid PAN number!");
            return getPanCardNum();
        }
        return pan;
    }

  
    static String getCustomerAadhar() {
        System.out.println("Enter your 12 digit Aadhar number:");
        String aadhar = sc.next();

        if (!aadhar.matches("\\d{12}")) {
            System.out.println("Invalid Aadhar number!");
            return getCustomerAadhar();
        }
        return aadhar;
    }

    static double getSalary() {
        System.out.println("Enter your salary:");
        return sc.nextDouble();
    }

    static int getAge() {
        System.out.println("Enter your age:");
        return sc.nextInt();
    }

    static int getCibilScore() {
        System.out.println("Enter your CIBIL score:");
        return sc.nextInt();
    }

    static String getAddress() {
        sc.nextLine(); 

        System.out.println("Enter your flat number:");
        String flat = sc.nextLine();

        System.out.println("Enter your plot number:");
        String plot = sc.nextLine();

        System.out.println("Enter your city:");
        String city = sc.nextLine();

        System.out.println("Enter your pin:");
        String pin = sc.nextLine();

        return "Flat: " + flat + ", Plot: " + plot +
               ", City: " + city + ", Pin: " + pin;
    }
}