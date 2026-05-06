package consoleBasedApp;

public class HomeLoan extends Loan {

    void getHomeLoanDocs() {
        System.out.println("Home Loan documents submitted successfully!");
    }

    public static void main(String[] args) {

        System.out.println("Checking HOME LOAN eligibility:");
System.gc();
        HomeLoan hl = new HomeLoan();

        int cibil = hl.getCibilScore();
        int age = hl.getAge();
        double salary = hl.getSalary();

        if (cibil > 750 && age > 21 && salary > 50000) {

            String aadhar = hl.getCustomerAadhar();
            String pan = hl.getPanCardNum();
            String phone = hl.getPhoneNum();
            String address = hl.getAddress();

            System.out.println("\n--- Customer Details ---");
            System.out.println("Aadhar: " + aadhar);
            System.out.println("PAN: " + pan);
            System.out.println("Phone: " + phone);
            System.out.println("Address: " + address);

            hl.getHomeLoanDocs();

            System.out.println("Home Loan Approved!");

        } else {
            System.out.println("Home Loan Rejected!");
        }
    }
}

