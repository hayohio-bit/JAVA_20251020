package ex01;

public class WhileEx01 {

	public static void main(String[] args) {

		int sum=0;
		int i=0;
		
		
		/*
		for(i=0; i<=5; i++) {
			sum += i;	//sum = sum + i
		}
		*/
		
		while(i<5) {
			i++;
			sum += i;
			//i++;
		}
			
		System.out.println("총합 : " + sum);
	}

}
