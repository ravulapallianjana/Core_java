package repo;

public class Testliteralsdemo {

	public static void main(String[] args) {
//decimals
		long a1=1234567890L;
		int a2=1509;
		int a3=12345;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println("************************");
//hexa 
		int a4=0xb12f3;
		int a5=0xe23c45;
		int a6=0xa45d6;
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println("**********************");
//octal
		int b1=0123;
		int b2=023457;
		int b3=0456;
		int b4=01507;
		int b5=0674;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println("**********************");
//binary
		int c1=0b101;
		int c2=0b1001;
		int c3=0b00101;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println("**********************");
//floating
		float f1=123f;
		float f2=123.5f;
		float f3=0x1235f;
//		float f5=0b011.f;
		float f6=012341f;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f6);
		System.out.println("*********************");
		
//		boolean
		boolean bo=true;
		boolean booo=false;
		System.out.println(bo);
		
		System.out.println(booo);
//		char
		char d1='a';
		char d2='d';
		char d3=82;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}

}
