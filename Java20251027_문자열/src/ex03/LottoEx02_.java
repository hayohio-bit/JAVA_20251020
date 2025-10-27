package ex03;

import java.util.Arrays;

public class LottoEx02_ {

	public static void main(String[] args) {

		// 고전적인 Fisher-Yates 셔플 예시
		int[] lotto = new int[45];
		for (int i = 0; i < 45; i++)
		    lotto[i] = i + 1;

		for (int i = 44; i > 0; i--) {
		    int j = (int)(Math.random() * (i + 1));  // 0부터 i까지 랜덤 인덱스
		    int tmp = lotto[i];                       // swap 시작
		    lotto[i] = lotto[j];
		    lotto[j] = tmp;
		}

		// 셔플 완료 후 앞 6개 출력
		for (int i = 0; i < 6; i++)
		    System.out.print(lotto[i] + " ");

	}
}