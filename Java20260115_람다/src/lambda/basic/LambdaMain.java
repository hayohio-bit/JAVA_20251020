package lambda.basic;
import java.util.function.IntBinaryOperator;
import java.util.function.Consumer;

public class LambdaMain {

  public static void main(String[] args) {
    runnableExample();
    operatorExample();
    consumerExample();
  }

  
  // 예제 1. 매개변수/리턴값 없는 람다 (Runnable)
  static void runnableExample() {
    /*
     Runnable : 추상 메서드 run() 하나만 가진 함수형 인터페이스
     
      Runnable = new Runnable() {
        @Override
        public void run() { 
        System.out.println("Hello Lambda"); 
        }
      }
     
     람다식 버전:
     ()     : Runnable.run()은 매개변수가 없으므로 빈 괄호
     ->     : 이 매개변수를 이렇게 실행해 라는 의미의 화살표
     {...}  : 실행할 코드 블록 (실행문이 한 줄이면 {}도 생략 가능)
     */
    
    Runnable r = () -> System.out.println("Runnable");
    
    // Runnable r 은 "함수형 인터페이스 타입 변수"
    // r.run() 호출 시, 위 람다식이 구현한 run() 메서드가 실행됨
    r.run();
  }
  
  
  // 예제 2. int 두개를 받아 int 하나를 반환하는 람다 (IntBinaryOperator)
  static void operatorExample() {
    // IntBinaryOperator : int, int -> int 를 표현하는 함수형 인터페이스
    // (a, b) : int a, int b. 타입은 인터페이스 정보로부터 추론되므로 생략 가능
    // a + b : 리턴식. 식 하나이므로 return 키워드와 {} 생략
    IntBinaryOperator add = (a, b) -> a + b;
    
    // 람다식이 구현한 applyAsInt(3,5)를 호출 -> 3+5 계산
    int result = add.applyAsInt(3,5);
    
    System.out.println("3 + 5 = " + result);
  }
  
  
  // 예제 3. 값을 받아서 소비만 하고 리턴이 없는 람다 (Consumer)
  static void consumerExample() {
    // Consumer<String> : String 하나를 받아서 아무 값도 반환하지 않는 함수형 인터페이스
    // s            : 입력 매개변수(String)
    // System...    : 입력받은 s를  출력하는 동작
    Consumer<String> printer = s -> System.out.println("메시지: " + s);
    
    // accept("Hello") 호출 시, 위 람다가 실행되어 "메시지:Hello" 출력
    printer.accept("Hello");
  }
}
