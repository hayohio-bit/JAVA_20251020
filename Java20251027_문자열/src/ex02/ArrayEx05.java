package ex02;
/*
 * 정수 배열 5개 생성 후
 * 각 배열 초기화 이후, 각 배열 합을 구해서 출력
 * 
 * --배열 복사
 */

import java.util.Arrays;

public class ArrayEx05 {

	public static void main(String[] args) {

		int[] numArr = {90,80,70,60,50};
		
		System.out.println("Old numArr 길이 : " + numArr.length);
		System.out.println(Arrays.toString(numArr));
	
		//새 배열 생성	
		int[] temp = new int[10];
		System.arraycopy(numArr, 0, temp, 2, numArr.length);
		//arraycopy(원본 배열, 원본 배열 복사 시작 인덱스, 새 배열, 새 배열 붙여넣기 시작 인덱스, 복사 항목 수)
		
		numArr = temp;
		
		System.out.println("New numArr 길이 : " + numArr.length);
		
		System.out.println(Arrays.toString(numArr));
		
	}
	

}
