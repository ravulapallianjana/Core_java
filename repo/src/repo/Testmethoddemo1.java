package repo;

public class Testmethoddemo1 {

	public static void main(String[] args) {
		Testmethoddemo1 t2=new Testmethoddemo1 ();
		

		t2.addition(5,5);


	}
   void addition( int a,int b) {
	System.out.println("in addition ("+a+")("+b+"):");
	int result1=a+b;
	System.out.println(result1);
	subtraction(80,result1);
	
}
   void subtraction( int c,int d) {
		System.out.println("in sub ("+c+")("+d+"):");
		int result2=c-d;
		System.out.println(result2);
		multiplication(20,result2);

		  }
		 static void  multiplication( int e,int f) {
		System.out.println("in mul ("+e+")("+f+"):");
		int result3=e*f;
		System.out.println(result3);
		divison(15,result3);
	
	}
   static void  divison( double g,float h) {
		System.out.println("in div ("+g+")("+h+"):");
		double  result4=g/h;
		System.out.println(result4);
	
	}
}
