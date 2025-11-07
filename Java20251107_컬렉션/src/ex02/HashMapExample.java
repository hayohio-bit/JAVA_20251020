package ex02;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String args) {

		// 1. HashMap 생성

		// HashMap<KeyType, ValueType> mapName = new HashMap<>();

		HashMap<String, Integer> studentScores = new HashMap<>();

		// 2. 키-값 쌍 추가 (put 메서드)

		System.out.println("--- 요소 추가 ---");

		studentScores.put("Alice", 95);

		studentScores.put("Bob", 88);

		studentScores.put("Charlie", 72);

		System.out.println("초기 HashMap: " + studentScores);

		// 3. 키를 사용하여 값 가져오기 (get 메서드)

		System.out.println("\n--- 값 가져오기 ---");

		int aliceScore = studentScores.get("Alice");

		System.out.println("Alice의 점수: " + aliceScore);

		// 존재하지 않는 키에 접근 시 null 반환

		Integer davidScore = studentScores.get("David");

		System.out.println("David의 점수: " + davidScore); // null

		// 4. 키의 존재 여부 확인 (containsKey 메서드)

		System.out.println("\n--- 키 존재 여부 확인 ---");

		System.out.println("HashMap에 'Bob' 키가 있는가? " + studentScores.containsKey("Bob"));

		System.out.println("HashMap에 'Eve' 키가 있는가? " + studentScores.containsKey("Eve"));

		// 5. 값의 존재 여부 확인 (containsValue 메서드)

		System.out.println("\n--- 값 존재 여부 확인 ---");

		System.out.println("HashMap에 88이라는 값이 있는가? " + studentScores.containsValue(88));

		System.out.println("HashMap에 100이라는 값이 있는가? " + studentScores.containsValue(100));

		// 6. 키-값 쌍 업데이트 (put 메서드는 기존 키가 있으면 값을 덮어씀)

		System.out.println("\n--- 요소 업데이트 ---");

		studentScores.put("Bob", 92); // Bob의 점수를 88에서 92로 변경

		System.out.println("Bob 점수 업데이트 후: " + studentScores);

		// 7. 요소 삭제 (remove 메서드)

		System.out.println("\n--- 요소 삭제 ---");

		studentScores.remove("Charlie");

		System.out.println("Charlie 삭제 후: " + studentScores);

		// 8. HashMap의 크기 확인 (size 메서드)

		System.out.println("\n--- HashMap 크기 ---");

		System.out.println("HashMap의 현재 크기: " + studentScores.size());

		// 9. HashMap이 비어있는지 확인 (isEmpty 메서드)

		System.out.println("\n--- HashMap 비어있음 확인 ---");

		System.out.println("HashMap이 비어있는가? " + studentScores.isEmpty());

		// 10. 모든 키-값 쌍 순회 방법

		System.out.println("\n--- HashMap 순회 ---");

		// EntrySet을 이용한 순회 (가장 일반적이고 효율적)

		for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {

			System.out.println("이름: " + entry.getKey() + ", 점수: " + entry.getValue());

		}

		// KeySet을 이용한 순회 (값만 필요할 때)

		System.out.println("\n--- KeySet을 이용한 순회 ---");

		for (String name : studentScores.keySet()) {

			System.out.println("이름: " + name + ", 점수: " + studentScores.get(name));

		}

		// 11. 모든 요소 제거 (clear 메서드)

		System.out.println("\n--- 모든 요소 제거 ---");

		studentScores.clear();

		System.out.println("모든 요소 제거 후: " + studentScores);

		System.out.println("HashMap이 비어있는가? " + studentScores.isEmpty());

	}

}