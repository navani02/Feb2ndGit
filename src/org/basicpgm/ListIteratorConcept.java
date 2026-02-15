package org.basicpgm;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorConcept {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();

		v.add(30);
		v.add(50);
		v.add(10);
		v.add(90);
		v.add(40);

		ListIterator<Integer> li = v.listIterator();
		System.out.println("Forward Direction");

		while (li.hasNext()) {
			Integer value = li.next();
			if (value == 50) {
				li.remove(); //removed the value 50
			}
			System.out.println(value);

		}
		System.out.println("\nBackward Direction");
		while (li.hasPrevious()) {
			Integer reverse = li.previous();
			System.out.println(reverse);//removed and print the value
		}
		

	}

}
