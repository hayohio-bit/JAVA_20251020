package lambda.basic;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaPractice {

  public static void main(String[] args) {
    plusExample();
    predicateExample();
    streamExample();
    streamExampleNoLambda();
    streamLambda();
  }
  
  // Function: 정수에 3 더하기
  static void plusExample() {
    Function<Integer, Integer> plus = a -> a + 3;
    int result = plus.apply(3);
    System.out.println("plusExample: " + result);
  }

  
  // Predicate : 10보다 작은지 검사
  static void predicateExample() {
    Predicate<Integer> lessThan10  = x -> x < 10;
    boolean result = lessThan10.test(17);
    System.out.println("predicateExample :" + result);
  }
  
  
  // Stream + 람다 : 10보다 작은 숫자만 출력
  static void streamExample() {
    
    List<Integer> numbers = List.of(5, 8, 12, 3, 20);

    Predicate<Integer> lessThan10 = x -> x < 10;
     
    numbers.stream()
      .filter(lessThan10)
      .forEach(x -> System.out.println("streamExample: " + x));
  }
  
  
  // No Steam
  static void streamExampleNoLambda() {
    List<Integer> numbers = List.of(5, 8, 12, 3, 20);
    
    for (int n : numbers) {
      if(n < 10) {
        System.out.println("streamExampleNoLambda: " + n);
      }
    }
  }
  
  
  // Stream : isGreaterThan
  static void streamLambda() {
    Random random = new Random();
    List<Integer> numbers = IntStream.range(0,10)
        .map(i -> (int)(Math.random() * 100))
        .boxed()
        .collect(Collectors.toList());
    
    Predicate<Integer> isGreaterThan30 = n -> n >= 30;
    
    System.out.println("Random numbers: " + numbers);
    
    numbers.stream()
      .filter(isGreaterThan30)
      .forEach(n -> System.out.println("streamLambda: " + n));
  }
  
}
