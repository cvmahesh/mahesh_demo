package com.demo.datastructure;

import java.util.LinkedList;

public class SearchInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Start");
		
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("1");
		llist.add("2");
		llist.add("3");
		llist.add("4");
		llist.add("5");
		
		System.out.println(">>"+llist.indexOf("5"));
		System.out.println(">>"+llist.indexOf("1"));//Index starts with zero

	}

}
