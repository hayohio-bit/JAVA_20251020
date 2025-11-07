package ex01;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListEx01 {

	public static void main(String[] args) {

		// int -> Integer
		LinkedList<Integer> list = new LinkedList();

		list.add(5); // new Integer(5) 5 --> new Integer(5); -> wrapped
		list.add(new Integer(4));
		list.add(2);
		list.add(new Integer(0));
		list.add(1);
		list.add(new Integer(3));

		System.out.println(list);
		System.out.println(list.subList(1, 4)); // 배열[1]~[4]까지

		LinkedList<Integer> list2 = new LinkedList<Integer>(list.subList(1, 4));
		System.out.println(list2);

		Collections.sort(list);
		System.out.println(list);

		System.out.println(list.get((3)));
		System.out.println(list.get((2)));

		int num = list.get(2);

		LinkedList<String> list3 = new LinkedList<String>();
		list3.add("kor");
		list3.add("eng");
		list3.add("math");

		String str = list3.get(2);

	}

}
