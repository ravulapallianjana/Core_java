package consoleBasedApp;

public class PersonalLoan extends Loan {

    void getPersonalLoanDocs() {
        System.out.println("Personal Loan documents submitted successfully!");
    }

    public static void main(String[] args) {

        System.out.println("Checking PERSONAL LOAN eligibility:");

        PersonalLoan pl = new PersonalLoan();

        int cibil = pl.getCibilScore();
        int age = pl.getAge();
        double salary = pl.getSalary();

        if (cibil > 760 && age > 25 && salary > 30000) {

            String aadhar = pl.getCustomerAadhar();
            String pan = pl.getPanCardNum();
            String phone = pl.getPhoneNum();
            String address = pl.getAddress();

            System.out.println("\n--- Customer Details ---");
            System.out.println("Aadhar: " + aadhar);
            System.out.println("PAN: " + pan);
            System.out.println("Phone: " + phone);
            System.out.println("Address: " + address);

            pl.getPersonalLoanDocs();

            System.out.println("Personal Loan Approved!");

        } else {
            System.out.println("Personal Loan Rejected!");
        }
    }
}
