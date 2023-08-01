package ex02_finally;

import java.util.Scanner;

public class MaiinWrapper {
  
  // finally 블록
  // 1. try-catch문의 마지막 블록으로 추가할 수 있다. (생략 가능)
  // 2. 예외 발생 여부와 상관 없이 "항상 마지막"에 실행된다.

  public static void main(String[] args) {
    
    // 나이를 입력 받아서 "주류 구매 가능", "주류 구매 불가능" 출력하기
    // 예외 처리
    
    // try 블록과 finally 블록에서 모두 사용할 수 있도록 scope 조정.
    Scanner sc = null;   // 선언과 생성만 위 아래로 분리.
                         // 객체들의 초기값은 null.
  try {
    sc = new Scanner(System.in);
    System.out.println("몇 살이세요?");
    int age = sc.nextInt();   // 정수 입력 받는 것 : nextInt()
    System.out.println(age >= 20 ? "주류 구매 가능" : "주류 구매 불가능");

  } catch(Exception e) {
    System.out.println("잘 모르겠어요.");
  } finally {
    sc.close();
    }
    // finally는 주로 자원 반납용으로 사용한다.
    // close 는 항상 finally에 써준다.
    // scope : 범위 / sc가 선언된 스코프는 try 블록이다. try 블록을 벗어나면 사용 못함.
    // 선언한 곳 { } 에서만 사용할 수 있다.
    
  } 

}
