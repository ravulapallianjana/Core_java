package com.java8features;

import java.util.Arrays;
import java.util.List;

//Java-
//1.Create a Student class with the following fields:
//StudentID,StudentName, Marks
//Create a list of 5 students and use the Java Stream API filter()
//method to display the details of students who scored more than 75 marks.
public class UsingStreams {
	int sid;
	String name;
	int marks;

	public UsingStreams(int sid, String name, int marks) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "UsingStreams [sid=" + sid + ", name=" + name + ", marks=" + marks + "]";
	}

	public static void main(String[] args) {

		UsingStreams s1 = new UsingStreams(1, "anjana", 90);
		UsingStreams s2 = new UsingStreams(1, "ajay", 80);
		UsingStreams s3 = new UsingStreams(1, "nagaraju", 95);
		UsingStreams s4 = new UsingStreams(1, "verdhini", 70);
		UsingStreams s5 = new UsingStreams(1, "bhavani", 65);

		List<UsingStreams> l = Arrays.asList(s1, s2, s3, s4, s5);
		l.stream().filter(student -> student.marks > 75).forEach(System.out::println);
	}

}
