package ex03;

import java.util.Arrays;

public class LottoEx02 {

	public static void main(String[] args) {

		/*
		 * 로또 프로그램
		 * 배열 : 6칸짜리 int 배열
		 * 로또는 1~45 랜덤하게 저장
		 * 단, 중복 불가
		 */
		
		int[] lotto = new int[45];
		
		for(int i=0; i<45; i++)
			lotto[i] = i+1;
		
		
	//▼ 자리를 바꾸는 방식으로 중복 없이 결과값 생성
		//for(int i=0; i<100; i++) {	//100회 반복하며 배열 내 번호 섞기 작업 수행
		for(int i=0; i<6; i++) {	//6회만 섞기
			
			int index = (int)(Math.random()*45); //index 0~44까지이므로 +1 하지 않음
			
			//int tmp = lotto[i%6]; //현재 자리(i % 6 위치)의 값을 임시 변수에 저장 (0~5 사이로 반복)
			int tmp = lotto[i];
			
			//lotto[i%6] = lotto[index];
			lotto[i] = lotto[index];
			
			
			lotto[index] = tmp;	//임시 저장한 값(tmp)을 랜덤 인덱스 자리로 옮겨 교환
		}
		
		for (int i=0; i<6; i++)	//앞에서부터 6개 값만 출력
			System.out.print(lotto[i] + " ");
		
	}
}