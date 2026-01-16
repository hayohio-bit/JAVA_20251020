package lambda.stream;
import java.util.List;
import java.util.function.Predicate;
public class StreamPractice {

  public static void main(String[] args) {
    
    List<Integer> numbers = List.of(5, 8, 120, 3, 200);
    
    Predicate<Integer> greaterThan100 = n -> n > 100;
    
    numbers.stream()
      .filter(greaterThan100)
      .forEach(System.out::println);
      // .forEach(n -> System.out.println(n));

  }

}
