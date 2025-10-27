package ex02;
/*
 * 정수 배열 5개 생성 후
 * 각 배열 초기화 이후, 각 배열 합을 구해서 출력
 * 
 * --배열 복사
 */

import java.util.Arrays;

public class ArrayEx04 {

	public static void main(String[] args) {

		int[] numArr = {90,80,70,60,50};
		
		System.out.println("Old numArr 길이 : " + numArr.length);
		System.out.println(Arrays.toString(numArr));
	

		//배열을 10개로 확장
		int[] temp = new int[10];
		for(int i=0; i<numArr.length; i++) {
			temp[i] = numArr[i];
		}
		
		numArr = temp;
		
		System.out.println("New numArr 길이 : " + numArr.length);
		
		System.out.println(Arrays.toString(numArr));
		
	}
	

}
