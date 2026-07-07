package repo;

public class CountObj {
	static int count = 0;

	CountObj() {
		count++;
	}

	public static void main(String[] args) {
		CountObj t = new CountObj();
		CountObj t1 = new CountObj();

		t = null;
		t1 = null;

		new CountObj();
		System.out.println(count);
	}

}
