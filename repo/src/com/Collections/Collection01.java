package com.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection01 {

	public static void main(String[] args) {

		Collection<String> col = new ArrayList<>();

		col.add("anjana");
		col.add("ajay");
		col.add("nagaraju");
		col.add("naga");
		col.add("narendra");

		Collection<String> co = new ArrayList<>();
		co.add("sri");
		co.add("srikanth");
		co.add("viswa");
		co.add("viswanath");

		Collection<String> all = new ArrayList<>();
		all.addAll(co);
		co.containsAll(co);
		all.addAll(col);
		System.out.println(co + ":" + col);
		co.clear();

		System.out.println(col);
System.out.println(all.contains(co));
		System.out.println(all.containsAll(co));
		System.out.println(col.isEmpty());// false
		System.out.println(co.size());

		Iterator<String> it = col.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
