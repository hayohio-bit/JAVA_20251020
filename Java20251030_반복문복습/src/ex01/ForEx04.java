package ex01;

public class ForEx04 {

	public static void main(String[] args) {

		int i=0;
		int sum=0;
		//1~100 홀수 합계
		
		for(i=1; i<=100; i++) {
			
			if(i%2 == 1)
			sum += i;
			
		}
			//System.out.println(sum);
			System.out.printf("sum = %d\n",sum);
	}
}
