package ex03;

import java.util.Arrays;

public class LottoEx01_ {

	public static void main(String[] args) {

		int[] lotto = new int[6];                   // 로또 번호 6개를 담을 int형 배열(크기 6) 선언, 생성
		int i = 0;                                  // 배열의 인덱스를 나타낼 변수 i를 0으로 초기화

		while (i < lotto.length) {                    // 배열 길이(6)보다 인덱스 i가 작을 때 반복
		    int num = (int)(Math.random() * 45) + 1; // 1~45 중 랜덤한 정수를 num에 저장 (Math.random은 0.0~1.0 사이의 실수, 45 곱하면 0~44, +1 하면 1~45)
		    
		    boolean duplicate = false;               // 중복 검사용 논리변수, 처음엔 중복X로(false) 세팅
		    for (int j = 0; j < i; j++) {             // 이미 뽑힌 번호들과 비교 (0~i-1번까지 확인)
		        if (lotto[j] == num) {                // 만약 이전에 뽑은 번호와 같으면
		            duplicate = true;                // 중복 발생
		            break;                           // 더 이상 확인 불필요, 반복문 종료
		        }
		    }
		    
		    if (!duplicate) {                         // 중복이 아니면 (= 새로운 번호면)
		        lotto[i] = num;                      // 배열의 i번째 칸에 그 번호 저장
		        i++;                                 // 인덱스 증가, 다음 칸에 저장 준비
		    }
		}

		java.util.Arrays.sort(lotto);                // 로또 번호를 오름차순 정렬 (예쁘게 출력하려고)

		System.out.print("로또 번호: ");              
		for (int n : lotto) {                         // 향상된 for문으로 배열의 각 값(n)을 순회
		    System.out.print(n + " ");               // 한 줄에 번호들을 공백으로 구분해 출력
		}
		System.out.println();                        // 출력 마무리 (줄바꿈)

}
}