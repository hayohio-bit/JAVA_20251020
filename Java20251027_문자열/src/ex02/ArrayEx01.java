package ex02;
/*
 * 정수 배열 5개 생성 후
 * 각 배열 초기화 이후, 각 배열 합을 구해서 출력
 */

public class ArrayEx01 {

	public static void main(String[] args) {

		int[] numArr = new int[5];
		
		numArr[0] = 90;
		numArr[1] = 80;
		numArr[2] = 70;
		numArr[3] = 60;
		numArr[4] = 50;
		
		int sum1=0;
		
		sum1 = numArr[0]+numArr[1]+numArr[2]+numArr[3]+numArr[4];
		
		System.out.println(sum1);
		
		int sum2=0;
	
		for(int i=0; i<5; i++)
			sum2 += numArr[i];
		System.out.println("총합 : " + sum2);
	}

	int sum1=0;
	

}
