package consoleBasedApp;

public class JobPortalRegistation extends EducationalDetails {

	public static void main(String[] args) {
		String bd = getBasicDetails();
		String ed = getQualification();

		System.out.println(bd);
		System.out.println(ed);
		System.out.println("ALL DETAILS ARE ELIGIBLE FOR REGISTRATION:");
	}

}
