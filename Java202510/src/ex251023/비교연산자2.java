package ex251023;

import java.util.Scanner;

public class 비교연산자2 {

		public static void main(String[] args) {
			
			int numA = 5;
			int numB = 10;


			/* 동등비교 == 두 피연산자의 값이 같은지 검사
			 * 동등비교 != 두 피연산자의 값이 다른지 검사
			 * 크기비교 > or >= or < or <=
			*/			
			System.out.println(numA == numB);
			System.out.println(numA != numB);
			System.out.println(numA > numB);
			System.out.println(numA < numB);
			System.out.println(numA <= numB);

			System.out.println("---------------------");
			String s1 = "korea";
			String s2 = "korea";		
//			System.out.println(s1 == s2);
			System.out.println(s1.equals(s2));
			
			System.out.println("---------------------");

			//Scanner sc = new Scanner(System.in);
			String s3 = new String("korea");
			String s4 = new String("korea");
//			System.out.println(s3 == s4); X
			System.out.println(s3.equals(s4));
			
			System.out.println("========논리연산==============");
			numA = 5;
			numB = 10;
			int numC = 13;
			int numD = 9;
			
			System.out.println(numA < numB);
			System.out.println(numC < numD);
			
			System.out.println("----------AND----------");
			System.out.println( (numA > numB) & (numC < numD) );

			System.out.println("----------OR----------");
			System.out.println( (numA < numB) | (numC < numD) );
			
			System.out.println("---------NOT-----------");
			System.out.println(!(6>4));
			
			System.out.println("-------XOR----------");
			System.out.println(15 ^ 12);

		    //여기까진 다시 봐야 함
		    
			/*
			 * 나이 입력 받아서, 20보다 크면 성년, 아니면 미성년
			 */
			
		    System.out.println("--------여기부터---삼항연산자(조건연산자)--------------");
		    Scanner sc = new Scanner(System.in);
//		    System.out.println("나이 입력>> ");
//		    int age = sc.nextInt();
//		    String state = (age>=20) ? "성년" : "미성년";
//		    System.out.println("당신은" + state);
		 
		    /*
		     * 정수 입력 받아서, 2로 나누어 나머지가 0이면 짝수, 아니면 홀수
		     */
//		    System.out.println("------나머지값---");
//		    int x = sc.nextInt();
//		    int y = 2;
//		    String val = x/y
//		    String val = (val)
		    /*
		    System.out.println("정수 입력>> ");
		    int number = sc.nextInt();
		    
		    String state = (number % 2 == 0 ) ? "짝수" : "홀수";
		    System.out.println(number + "는 " + state + "입니다.");
		    */
		    
		    System.out.println("정수 입력>> ");
		    int number = sc.nextInt();
		    int state = (number % 3 == 0) ? 0 : (number % 3 == 1) ? 1 : 2;
		    System.out.println(number + "를 3으로 나눈 나머지는 " + state + "입니다.");
		    
		    
		    
		    
		    
		}
	}