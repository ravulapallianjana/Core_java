package com.oops1;

public class Encapsulation1 {
	private long contact;
	private String email;
	private String name;
	private final  long passportnum=8174646193l;
	
    void  setcontact(long contact) {
    	this.contact=contact;
		
	}
  long  getcontact(){
    	 return contact;
    	 
     }
  void setemail(String email) {
	  this.email=email;
	  
  }
  String getemail() {
	  return email;
	  
  }
  void setname(String name) {
	  this.name=name;
	  
  }
  String getname() {
	  return name;
  }
  
//  void setpassportnum(String passportnum) {
//	this.passportnum=passportnum;
//  }
  long  getpassportnum() {
	  return passportnum;
  }
}
