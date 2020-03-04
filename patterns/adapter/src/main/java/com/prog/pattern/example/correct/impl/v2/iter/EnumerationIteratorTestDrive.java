package com.prog.pattern.example.correct.impl.v2.iter;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationIteratorTestDrive {
	public static void main (String args[]) {
		Vector<String> v = new Vector<String>(Arrays.asList(args));
		Iterator<?> iterator = new EnumerationIterator(v.elements());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
