package com.oops1.Abstraction;



 interface in1{
	void method1();
	void method2();
}
interface in2{
	void method2();
	void method3();
	
}
interface in3 extends in1,in2{
	
	
}
 class inter implements in3{
	 



public void method1() {
	System.out.println("method1 called");
	
}


public void method2() {
	System.out.println("method2 called");
	
}


public void method3() {
	System.out.println("method3 called");
	
}
}
 public class EX_MultipleInheritance_Interface {

		public static void main(String[] args) {
			
			in3 i1=new inter();
			i1.method1();
			i1.method2();
			i1.method3();
		}
	}
