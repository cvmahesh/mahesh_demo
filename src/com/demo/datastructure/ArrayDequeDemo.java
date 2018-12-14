/**
 * 
 */
package com.demo.datastructure;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;

/**
 * @author kavitha
 *
 */
public class ArrayDequeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
		arrayDeque.addFirst("first");
		arrayDeque.addFirst("second");
		arrayDeque.addFirst("third");
		arrayDeque.addFirst("fourth");
		arrayDeque.addFirst("fifth");
		System.out.println("arrayDeque--->"+arrayDeque);
		System.out.println("pollLast--->"+arrayDeque.pollLast());
		System.out.println("arrayDeque--->"+arrayDeque);
		System.out.println("peekLast--->"+arrayDeque.peekLast());
		System.out.println("arrayDeque--->"+arrayDeque);
		Queue<String> queue= Collections.asLifoQueue(arrayDeque);
		System.out.println("queue--->"+queue);
	}

}
