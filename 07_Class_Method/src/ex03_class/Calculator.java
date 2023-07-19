package ex03_class;

// ★자바 클래스마다 문서를 만들어 두면, 선배들이 좋아한다.
// 적는 이유는 나와 남들에게 보여주기 위함. 
// '자바독(자바 도큐먼트 = 자바 문서)'이라고 함
// 만드는 방법은 ' /** ' 를 적는다.

 /*
/**
 *  (클래스 설명)
 * 
 * 
 * @author(저자)     홍길동(이름)
 * @since(만든 날짜) 2023.07.19
 * @version 1.0.0 (버젼)
 *
 */

/**
 * 
 * 덧셈, 뺄셈, 곱셈, 나눗셈 기능을 제공하는 계산기 클래스
 * 
 * @author  홍길동
 * @since   2023.07.19
 * @version 1.0.0
 *
 */

public class Calculator {
  
// 메소드 자바독 만들기 : ' /** '
 /*
  /**
   * 
   * (메소드 설명)
   * 
   * @param a 설명
   * @param b 설명
   * @return 설명
   */ 

  /**
   * 
   * 실수 2개를 전달 받아서 그 합을 반환하는 메소드
   * 
   * @param a 실수
   * @param b 실수
   * @return 파라미터 2개의 덧셈 결과
   */
  public double addition(double a, double b) {
    return a + b;
  }
  
  /**
   * 
   * 실수 2개를 전달 받아서 그 뺄셈을 반환하는 메소드
   * 
   * @param a 실수
   * @param b 실수
   * @return 파라미터 2개의 뺄셈 결과
   */
  public double subtraction(double a, double b) {
    return a - b;
  }
  
  /**
   * 
   * 실수 2개를 전달 받아서 그 곱셈을 반환하는 메소드
   * 
   * @param a 실수
   * @param b 실수
   * @return 파라미터 2개의 곱셈 결과
   */
  public double multiplication(double a, double b) {
    return a * b;
  }
  
  /**
   * 
   * 실수 2개를 전달 받아서 그 나눗셈을 반환하는 메소드
   * 
   * @param a 실수
   * @param b 실수
   * @return 파라미터 2개의 나눗셈 결과
   */
  public double division(double a, double b) {
    return a / b;
  
  }
  
  
}
// [ 정리 ]

// 우리가 만든 계산기는 실제 계산기가 아니라
// 계산기의 설계도를 만든 것이다.
// 설계도 만으로는 실제 계산이 안 된다.
// 설계도는 실행해도 아무 일도 일어나지 않는다.
// 실제로 만져서 사용할 수 있는 건 '객체'이다.
// 이제 설계도를 보고 계산기를 만들어야 하는데,
// 이것을 클래스(설계도)를 보고 객체(실물)를 만든다고 한다.
// ex) 붕어빵틀(클래스) , 붕어빵(객체)

// 클래스 안에 있는 메소드를 호출하고 싶으면,
// 클래스를 먼저 객체로 만들고 
// 그 객체를 이용해서 메소드를 호출한다.













