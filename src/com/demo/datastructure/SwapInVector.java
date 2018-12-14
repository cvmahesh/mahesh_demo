package com.demo.datastructure;

import java.util.Collections;
import java.util.Vector;

//How to swap two elements in a vector ?
public class SwapInVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> vector = new Vector<String> ();
		vector.add("first");
		vector.add("second");
		vector.add("third");
		vector.add("fourth");
		System.out.println("Vector"+vector);
		Collections.swap(vector, 0, 3);
		System.out.println("Vector"+vector);
	}
}
