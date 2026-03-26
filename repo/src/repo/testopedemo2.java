package repo;

public class testopedemo2 {
	static int a=6688;
	 int b;
	 int b1;
	 int b2;
	 int b3;
	 int b4;
	 int b5;
	 int b6;
	 int b7;
	 int b8;
	 int b9;
	 int b10;
	
	 

	public static void main(String[] args) {
		testopedemo2 t1=new testopedemo2();
				
		int a2=a/2000;
		t1.b2=a%2000;
		System.out.println("count thousands="+a2);
		System.out.println((t1.b2));
		
		int a3=t1.b2/500;
		t1.b3=t1.b2%500;
		System.out.println("count thousands="+a3);
		System.out.println((t1.b3));
		
		int a4=t1.b3/200;
		t1.b4=t1.b3%200;
		System.out.println("count thousands="+a4);
		System.out.println((t1.b4));
		
		
		int a5=t1.b4/100;
		t1.b5=t1.b4%100;
		System.out.println("count thousands="+a5);
		System.out.println((t1.b5));
		
		
		int a6=t1.b5/50;
		t1.b6=t1.b5%50;
		System.out.println("count thousands="+a6);
		System.out.println((t1.b6));
		
		
		
		
		int a7=t1.b6/10;
		t1.b7=t1.b6%10;
		System.out.println("count thousands="+a7);
		System.out.println((t1.b7));
		
		
		int a8=t1.b7/5;
		t1.b8=t1.b7%5;
		System.out.println("count thousands="+a8);
		System.out.println((t1.b8));
			
		
		int a9=t1.b8/2;
		t1.b9=t1.b8%2;
		System.out.println("count thousands="+a9);
		System.out.println((t1.b9));
			
		int a10=t1.b9/1;
		t1.b10=t1.b9%1;
		System.out.println("count thousands="+a10);
		System.out.println((t1.b10));
		
		

}
}