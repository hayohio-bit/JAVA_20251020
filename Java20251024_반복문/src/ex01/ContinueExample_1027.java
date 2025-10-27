package ex01;

/*
 * 1~10까지 홀수 합 구하기
 * 	단, continue 사용
 */

public class ContinueExample_1027 {

	public static void main(String[] args) {

		int sum=0;
		
		for(int i=1; i<=10; i++) {
			/*if(i%2 == 1)
				sum +=i;
			*/
			
			if(i%2 == 0)
				continue;
			sum += i;	//sum = sum +i;
		}
		System.out.println(sum);
		
	}

}
