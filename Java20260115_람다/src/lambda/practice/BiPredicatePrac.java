package lambda.practice;
import java.util.function.BiPredicate;

/*
   어떤 시스템에서 사용자가 입력한 아이디와 비밀번호가
   이미 등록된 정보와 일치하는지 검사하려고 한다.
   이 검사를 BiPredicate<String, String> 로 구현하시오.
   String savedId = "admin";
   String savedPw = "1234";
 */


public class BiPredicatePrac {

  public static void main(String[] args) {
    loginCheck();
  }
  
  static void loginCheck() {
    String savedId = "admin";
    String savedPw = "1234";
    
    /* ▼ 내 풀이
    BiPredicate<String, String> loginCheck = 
        (id, pw) -> (id.equals(savedId))&(pw.equals(savedPw));
    boolean result = loginCheck.test("admin", "1234");
    System.out.println(result);
  }
    비트 연산자 & 사용으로 short-circuit 평가 안 됨
      // 기존 (&) - pw 비교도 무조건 실행
      (id.equals(savedId)) & (pw.equals(savedPw))  // ID 불일치해도 PW 검사
      
      // 개선 (&&) - ID 불일치 시 PW 검사 생략
      savedId.equals(inputId) && savedPw.equals(inputPw)  // 효율적
      
      
    equals() 누락으로 null 안전성이 떨어짐
      // 안전: null이 아닌 쪽에서 equals 호출
      savedId.equals(inputId)     // savedId가 null이 아니면 안전
      
      // 위험: inputId가 null이면 예외 발생
      inputId.equals(savedId)     // NullPointerException 위험

  */

    BiPredicate<String, String> loginChecker = 
        (inputId, inputPw) -> savedId.equals(inputId) && savedPw.equals(inputPw);
        
    // 테스트 케이스들
    System.out.println(loginChecker.test("admin", "1234"));
    System.out.println(loginChecker.test("adming", "wrong"));
    System.out.println(loginChecker.test("wrong", "1234"));
    System.out.println(loginChecker.test(null, null));
  }
  
}
