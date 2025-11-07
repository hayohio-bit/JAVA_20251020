package ex02;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public static void main(String[] args) {

		// 1. HashSet 생성

		HashSet<String> fruits = new HashSet<>();

		// 2. 요소 추가

		System.out.println("--- 요소 추가 ---");

		fruits.add("Apple");

		System.out.println("Apple 추가 후: " + fruits);

		fruits.add("Banana");

		System.out.println("Banana 추가 후: " + fruits);

		fruits.add("Orange");

		System.out.println("Orange 추가 후: " + fruits);

		// 3. 중복 요소 추가 시도 (HashSet은 중복을 허용하지 않음)

		boolean addedAppleAgain = fruits.add("Apple");

		System.out.println("\"Apple\" 다시 추가 시도 (성공 여부): " + addedAppleAgain);

		System.out.println("중복 추가 시도 후: " + fruits);

		// 4. 요소 존재 여부 확인

		System.out.println("\n--- 요소 존재 여부 확인 ---");

		System.out.println("fruits에 \"Banana\"가 포함되어 있는가? " + fruits.contains("Banana"));

		System.out.println("fruits에 \"Grape\"가 포함되어 있는가? " + fruits.contains("Grape"));

		// 5. 요소 삭제

		System.out.println("\n--- 요소 삭제 ---");

		fruits.remove("Banana");

		System.out.println("Banana 삭제 후: " + fruits);

		// 6. HashSet 크기 확인

		System.out.println("\n--- HashSet 크기 확인 ---");

		System.out.println("현재 fruits의 크기: " + fruits.size());

		// 7. 모든 요소 제거

		System.out.println("\n--- 모든 요소 제거 ---");

		fruits.clear();

		System.out.println("모든 요소 제거 후: " + fruits);

		// 8. HashSet이 비어있는지 확인

		System.out.println("fruits가 비어있는가? " + fruits.isEmpty());

		// 9. NULL 요소 추가

		System.out.println("\n--- NULL 요소 추가 ---");

		HashSet<String> items = new HashSet<>();

		items.add("Item1");

		items.add(null);

		items.add("Item2");

		System.out.println("NULL 포함 items: " + items);

		// 10. Iterator를 이용한 요소 순회

		System.out.println("\n--- Iterator를 이용한 요소 순회 ---");

		items.remove(null);

		items.add("ThirdItem");

		Iterator<String> iterator = items.iterator();

		while (iterator.hasNext()) {

			String item = iterator.next();

			System.out.println("현재 요소: " + item);

		}

		// 11. for-each 루프를 이용한 요소 순회

		System.out.println("\n--- for-each 루프를 이용한 요소 순회 ---");

		for (String item : items) {

			System.out.println("현재 요소: " + item);

		}

	}
}
