package ex01;

public class DoWhileEx01 {

	public static void main(String[] args) {

		int sum=0;
		int i=0;
		
		do {
			i++;
			sum += i;
			//i++; 위치에 따라 최종값이 달라짐
		}while(i<5);
			
		System.out.println("총합 : " + sum);
	}

}

// do while은 조건이 거짓이어도 일단 실행