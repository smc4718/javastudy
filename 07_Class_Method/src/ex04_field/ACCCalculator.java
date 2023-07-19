package ex04_field;

/**
 * 
 * 사칙연산 결과를 저장할 수 있는 계산기 
 * 
 * @author  홍길동
 * @since   2023.07.19
 * @version 1.0.0
 * 
 */

public class ACCCalculator {

  /*
   * 필드(field)
   * 1. 객체가 가질 수 있는 값을 저장할 변수이다.
   * 2. 클래스에서 선언한다.(메소드에서 선언 x )
   * 3. 필드는 자동으로 초기화된다.(0, 0.0, false, null)  //모든 참조 타입은 값이 없을 때 'null'이라고 한다.
   * 4. 정보 은닉을 위해서 private 처리한다.
   */
  
  /**
   * 이 필드는 AccCalculator의 사칙연산 결과를<br>저장할 수 있는 필드이다.
   */                                      // <br> : 줄바꿈
  private double value;   // 초기화 0.0
  //선언한 위치가 클래스라서 field 이다.
  
  /**
   * 
   * 필드 value에 파라미터 a를 더하는 메소드 
   * 
   * @param a 실수
   */
  public void addition(double a) {
    value += a;
    System.out.println("+" + a + "=" + value);
  }
  
  /**
   * 
   * 필드 value에서 파라미터 a를 빼는 메소드 
   * 
   * @param a 실수
   */
  public void substraction(double a) {
    value -= a;
    System.out.println("-" + a + "=" + value);
  }
  
  /**
   * 
   * 필드 value에 파라미터 a를 곱하는 메소드 
   * 
   * @param a 실수
   */
  public void multiplication(double a) {
    value *= a;
    System.out.println("*" + a + "=" + value);
  }
  
  /**
   * 
   * 필드 value를 파라미터 a로 나누는 메소드 
   * 
   * @param a 실수
   */
  public void division(double a) {
    value /= a;
    System.out.println("/" + a + "=" + value);
  }

  /**
   * 필드 value를 출력하는 메소드
   */
  public void showValue() {
    System.out.println(value);
  }
 }

















