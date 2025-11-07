package ______;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionInterfaceDemo {
	public static void main(String[] args) {
		// Collection 인터페이스를 구현하는 ArrayList 생성
		Collection<String> coll = new ArrayList<>();

		// 요소 추가
		coll.add("Apple");
		coll.add("Banana");
		coll.add("Cherry");

		// 요소 개수 확인
		System.out.println("요소 개수: " + coll.size());

		// 특정 값 포함 여부
		System.out.println("'Banana' 포함? " + coll.contains("Banana"));

		// 요소 삭제
		coll.remove("Apple");

		// 반복자(Iterator)로 전체 요소 순회
		Iterator<String> it = coll.iterator();
		System.out.print("요소 전체 출력: ");
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();

		// 모두 삭제
		coll.clear();
		System.out.println("비우기" + coll.isEmpty());
	}

}
