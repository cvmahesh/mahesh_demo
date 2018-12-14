package com.demo.datastructure;

import java.util.LinkedList;

//https://www.tutorialspoint.com/javaexamples/java_data_structure.htm
//How to get the first and the last element of a linked list ?

public class FirstAndLast {
	
	
	public static void main(String ar[]){
		System.out.println("Start");
		
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("1");
		llist.add("2");
		llist.add("3");
		llist.add("4");
		llist.add("5");
		System.out.println("Start"+llist.getFirst());
		System.out.println("Start"+llist.getLast());
	}
}
