package org.basicpgm;

import java.util.Enumeration;
import java.util.Vector;

public class EnumConcept {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(30);
		v.add(50);
		v.add(10);
		v.add(90);
		v.add(40);
		
		
		Enumeration e = v.elements();// hasMoreElement(), nextElement()
		
		while (e.hasMoreElements()) {
			Object x = (Object) e.nextElement();
			System.out.println(x);
		}
		

	}

}
