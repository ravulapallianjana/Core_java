package consoleBasedApp;

class Device {
	static String brand;
	static Double power;

	public Device(String brand, Double power) {
		super();
		this.brand = brand;
		this.power = power;
	}

	void showdetails() {
		System.err.println("BRAND:" + brand);
		System.err.println("POWER:" + power);

	}
}

//------------------------------
class laptop extends Device {

	public laptop(String brand) {
		super(brand, power);

	}

	void openlid() {
		System.out.println("you are getting laptop");

	}
}

//	===============================================
class smartphone extends Device {

	public smartphone(String brand, Double power) {
		super(brand, power);

	}

	void makecall() {
		System.out.println("your are getting smart phone:");
	}

//	----------------------------------------
	public class mainclass {

		public static void main(String[] args) {
			laptop l = new laptop("hp, 100.00");
			l.openlid();
			l.showdetails();
			
			smartphone s=new smartphone("vivo",90.0);
			s.makecall();
			l.showdetails();
			
			

		}
	}
}
