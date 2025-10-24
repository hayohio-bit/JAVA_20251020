package ex01;

public class ForEx02 {

	public static void main(String[] args) {

		int sum1=0;
		
		/*
		 * 1~100까지 짝수 합
		 * for(초기값 ; 조건 ; 증가값)
		 */
		
		for(int i=0; i<=100; i += 2) {
			sum1 += i;
			System.out.println("합계 누적 : " + sum1);

		}
					
		int sum2=0;
		
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0)
				sum2 += i;
		}
			System.out.println("1부터 100까지 짝수의 합 : " + sum2);
	
		int sum3=0;
		int i1=1;
			
		for( ; i1<=100; i1++ ) {
			if(i1 % 2 == 0)
			sum3 += i1++;
		}
		System.out.println(" 합 : " + sum3);
		
		int sum4=0;
		int i2=1;
			
		for( ; i2<=100; ) {
			sum4 += i2++;
		}
		System.out.println(" 합 : " + sum4);
		
		//2부터 100까지 2씩 건너뛰기 때문에(i += 2) 한 번도 홀수를 검사하지 않아 가장 효율적
		
		int sum5 = 0;
		for (int i3 = 2; i3 <= 100; i3 += 2) { // 2씩 증가 → 짝수만 반복
		    sum5 += i3;
		}
		System.out.println(sum5);
		}

	}




