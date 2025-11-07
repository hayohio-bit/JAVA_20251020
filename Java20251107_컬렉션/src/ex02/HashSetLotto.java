package ex02;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetLotto {

	public static void main(String[] args) {
		Set set = new HashSet(); // 중복 없는 값을 저장할 HashSet 생성

		for (int i = 0; set.size() < 6; i++) { // set의 크기가 6개 미만일때만 반복
			int num = (int) (Math.random() * 45) + 1; // 1~45 난수 생성
			set.add(new Integer(num)); // 생성한 난수를 Integer로 감싸서 Set에 추가
		}

		// Set(중복 없는 6개 숫자)을 정렬하려면 리스트가 필요하므로 LinkedList로 반환
		List list = new LinkedList(set);
		// LinkedList (Collection c)
		Collections.sort(list); // List를 오름차순으로 정렬
		// Collections.sort(List list)
		System.out.println(list);
	}

}

// HashSet을 사용하므로 중복된 난수는 자동으로 거절됨
// 최종 출력 전에는 정렬을 위해 리스트로 변환함
