package ex01;

/*
 * 1~10까지 홀수 합 구하기
 * 	단, continue 사용
 */

public class ContinueExample2_1027 {

	public static void main(String[] args) {

		int sum=0;
		int i=0;
		
		while(i<10) {
			i++;
			
			if(i%2 == 0)
				continue;
			sum += i;	//sum = sum +i;
		}
		System.out.println(sum);
		
	}

}
