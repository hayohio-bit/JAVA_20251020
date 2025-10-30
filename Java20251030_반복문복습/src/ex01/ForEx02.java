package ex01;

public class ForEx02 {

	public static void main(String[] args) {

		/*
		 * 2~5단까지 구구단 출력
		 */

		for(int i=2; i<=5; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
			System.out.println("------------------------");
		}
			
		
	}

}