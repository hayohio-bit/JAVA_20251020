package ex01;

public class WhileEx05 {

	public static void main(String[] args) {
		
		/*
		중첩 while문 - 구구단 출력 - 5단까지 출력
		*/
		
		int i=2;
		int j=1;
		
		while(i<=5) {
			j=1;
			System.out.println("--------"+i+"단--------");
			while(j<=9) {
				System.out.println(i + " X " + j + " = " + i*j);
				j++;
			}
			i++;
		}
	}

}
