package org.basicpgm;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class IteratorConcept {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();

		v.add(30);
		v.add(50);
		v.add(10);
		v.add(90);
		v.add(40);

		Iterator<Integer> i = v.iterator();

		while (i.hasNext()) {
			Integer value = (Integer) i.next();
			if (value == 50) {
				i.remove();
			}
			System.out.println(value);

		}
		System.out.println("\nAfter Iteration");
		for (Integer x : v) {
			System.out.println(x);
		}

	}
}
