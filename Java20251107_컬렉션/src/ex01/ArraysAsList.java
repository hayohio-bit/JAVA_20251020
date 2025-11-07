package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

	public static void main(String[] args) {

		int[] iArr = new int[5]; // 초기화 방법 1
		iArr[0] = 10;
		iArr[1] = 20;
		iArr[2] = 30;
		iArr[3] = 40;
		iArr[4] = 50;
		System.out.println(iArr);
		System.out.println(Arrays.toString(iArr));
		System.out.println("----------------------");

		int[] iArr2 = { 10, 20, 30, 40, 50 }; // 초기화 방법 2 (1보다 쉽게 초기화가능)
		System.out.println(iArr2);
		System.out.println(Arrays.toString(iArr2));
		System.out.println("----------------------");

		// ArrayList는 객체 생성과 동시에 초기화 불가
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(50);
		System.out.println(list);
		System.out.println("--------------------------------");

		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
		System.out.println("list1 : " + list);
		System.out.println("--------------------------------");

		// 리스트 객체 생성하면서 초기화 가능
		// 단, 수정 불가
		List<Integer> list2 = Arrays.asList(10, 20, 30, 40, 50);
		System.out.println(list2);

		list2 = new ArrayList<>(list2);
		list2.add(60);
		list2.remove(2);
		System.out.println(list2);
		System.out.println("----------------------");

		List<Person> person = new ArrayList<Person>(Arrays.asList(new Person(), new Person(), new Person()));
		System.out.println(person);

		List<Person> p2 = new ArrayList<Person>();
		p2.add(new Person());
		p2.add(new Person());
		p2.add(new Person());
		p2.toArray();
		p2.getFirst();

	}

}

class Person {
}