package com.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collection02 {

	public static void main(String[] args) {
		Collection<String> fruits = new ArrayList<>();
		fruits.add("orange");
		fruits.add("watermelon");
		fruits.add("mango");
		fruits.add("grapes");
		fruits.add("banana");

		Collection<String> veggies = new ArrayList<>();
		veggies.add("potato");
		veggies.add("tomato");
		veggies.add("carrot");
		veggies.add("beetroot");
		veggies.add("cucumber");
		veggies.add("banana");

		fruits.retainAll(veggies);// retainall is using for common value to take from collections
		System.out.println(fruits);

	}

}
