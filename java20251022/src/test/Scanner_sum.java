package test;

import java.util.Scanner; // Scanner 클래스 불러오기

public class Scanner_sum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // 입력 도구 생성
    int x, y, sum;

    System.out.print("첫번째 숫자를 입력하시오: ");
    x = input.nextInt(); // 숫자 입력 받기

    System.out.print("두번째 숫자를 입력하시오: ");
    y = input.nextInt();

    sum = x + y; // 덧셈
    System.out.println("합계는: " + sum);
    input.close();
  }
}

