package ex02;
/*
 * 정수 배열 5개 생성 후
 * 각 배열 초기화 이후, 각 배열 합을 구해서 출력
 */

public class ArrayEx02 {

	public static void main(String[] args) {

		int[] numArr = {90,80,70,60,50};
		//int[] Array = new int[5];
		
		int sum=0;
							
		for(int i=0; i<5; i++)
			sum += numArr[i];
		
		System.out.println("총합 : " + sum);
	}
	

}
