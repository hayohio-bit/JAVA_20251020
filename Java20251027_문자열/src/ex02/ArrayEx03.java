package ex02;
/*
 * 정수 배열 5개 생성 후
 * 각 배열 초기화 이후, 각 배열 합을 구해서 출력
 */

public class ArrayEx03 {

	public static void main(String[] args) {

		int[] numArr = {90,80,70,60,50};
		
		int sum=0;
		
		System.out.println(numArr.length);
		
		for(int i=0; i<numArr.length; i++)
		sum += numArr[i];
		
		System.out.println("총합 : " + sum);
	}
	

}
