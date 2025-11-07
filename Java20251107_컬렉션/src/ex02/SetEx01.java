package ex02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx01 {

	public static void main(String[] args) {

		Set set = new HashSet();

		set.add("kor");
		set.add("eng");
		set.add("eng");
		set.add("math");
		set.add("1");
		set.add("1");
		set.add("1");
		set.add(new Person("홍길동"));
		set.add(new Person("홍길동"));
		set.add(new Person("박길동"));

		System.out.println(set);

		for (Object obj : set)
			System.out.println(obj);
		System.out.println("----------------------");
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}