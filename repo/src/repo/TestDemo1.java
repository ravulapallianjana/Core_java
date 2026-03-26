package repo;

public class TestDemo1 {
	int bookid;
	String title;
	String author;
	 static double price;
	static double discount;

	public static void main(String[] args) {
		TestDemo1 td=new TestDemo1();
		td.bookid=1;
td.title="JAVA";
td.author="SRIKANTH ";
price=200;
discount=0.1;
 double total=price-discount;
 System.out.println("author="+ "ANJANA");
 System.out.println("title="+ "java") ;
System.out.println("total="+(price-discount) );
System.out.println("totalprice="+(price*discount) );

	}
	

}
