package repo;

public class Constructors1 {
	String bname;
	String aname;
	double price;
	int reyear;
	
	

	public static void main(String[] args) {
		System.out.println("************main method started************");
		Constructors1 c1=new Constructors1 ();
		
		
	
		
		

	}
	
	Constructors1(){
		this("amma dairy");
		System.out.println("*******no arg constructor is called*************");
	}
	Constructors1( String bname){
		this("amma dairy","anjana");
	
		System.out.println("*****one arg constructors is called*****");
		
		
		
		
	}
	Constructors1( String bname,String aname){
		this("amma dairy","anjana",300);
		System.out.println("********* two arg constructors i called************");
	}
	Constructors1( String bname,String aname,double price){
		this("amma dairy","anjana",300,2005);
		System.out.println("****************  three arg constructors is called *******");
		
		
	}
	Constructors1( String bname,String aname,double price,int year){
		System.out.println("***************  four arg constructors is called****************************");
		this("amma dairy,anjana,300,2005");
		this.bname="amma dairy";
		this.aname="anjana";
		this.price=300;
		this.reyear=2005;
		
		
	}
//	void  show() {
//		System.out.println("book name:"+ bname);
//		System.out.println(" author name:"+ aname);
//		System.out.println("cost:"+price);
//		System.out.println("released year:"+reyear);
//		
//		
//	}

}
