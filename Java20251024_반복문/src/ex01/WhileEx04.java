package ex01;

public class WhileEx04 {

	public static void main(String[] args) {
		
		/*
		1~100까지 짝수 합
		*/
		
		int sum=0;
		int i=0;
		
		while(i<100) {
		
			if(i % 2 == 0)
				sum += i;
			i++;
		}
		
		System.out.println("합 : " + sum);
		
	}

}
