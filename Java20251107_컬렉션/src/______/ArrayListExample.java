package ______;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		// ArrayList 생성 (제네릭 타입 String)
		ArrayList<String> list = new ArrayList<>();

		// 요소 추가
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");

		// 인덱스로 요소 접근 및 출력
		System.out.println("첫 번째 요소: " + list.get(0));

		// 요소 수정
		list.set(1, "Blueberry");

		// 전체 출력 (for문 이용)
		System.out.println("전체 요소 출력:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// 특정 요소 삭제
		list.remove("Apple"); // 값으로 삭제
		list.remove(0); // 인덱스로 삭제

		// 최종 출력
		System.out.println("삭제 후 요소들:");
		for (String fruit : list) {
			System.out.println(fruit);
		}
	}
}