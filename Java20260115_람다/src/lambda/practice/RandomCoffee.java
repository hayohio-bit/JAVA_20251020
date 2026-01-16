package lambda.practice;
import java.util.function.Supplier;
/*
 * 랜덤 걸린 사람 커피 쏴라 탕탕
 * Supplier<Integer>: 입력 없고 Integer 반환하는 함수형 인터페이스

 */
public class RandomCoffee {
  
  // 1~13 범위 랜덤 정수 반환
  public static int coffee() {
    return (int)(Math.random() * 13) + 1;
  }
  
  
  public static void main(String[] args) {
    
    // 1. 람다 표현식으로 Supplier 구현
    Supplier<Integer> dice1 = () -> coffee();
    
    System.out.println("람다: " + dice1.get());
    
    
    // 2. 정적 메서드 참조로 Supplier 구현
    Supplier<Integer> dice2 = RandomCoffee::coffee;
    
    System.out.println("메서드 참조: " + dice2.get());
    
  }
  
}