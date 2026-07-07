package com.Collections;

import java.util.HashMap;
import java.util.Map;

public class Mapdemo01 {

	public static void main(String[] args) {
	Map<String , String > m=new HashMap<>();
	m.put("ap", "andrapradesh");
	m.put("TS", "TELANGANA STATE");
	m.put("tg", "telangana");
	
	System.out.println(m);
	m.put("uk", "utterkhand");
	System.out.println(m);
	

	}

}
