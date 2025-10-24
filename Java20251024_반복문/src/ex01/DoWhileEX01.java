package ex01;

public class DoWhileEX01 {

	public static void main(String[] args) {

		/* 
		 * 1~5까지 합 구하기
		 */
		
		int sum=10;
		int i=0;
		
		do {
			i++;
			sum += i;

		}while(i<5);

		System.out.println("합 : " + sum);	
			
	}

}