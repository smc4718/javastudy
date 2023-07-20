package ex06_this;

/*
 * this  (현재 객체)
 * 1. 필드나 메소드를 호출하는 객체의 참조값이다.
 * 2. 클래스 내부에서만 사용할 수 있는 키워드이다.
 */

/**
 * <p>메소드를 연속해서 호출할 수 있는 메소드 체이닝(method chainig)이 가능한 계산기</p>
 * <p>사칙연산 메소드를 연속해서 호출할 수 있다.</p>
 * @author  GD
 * @since   2023.07.20
 * @version 1.0
 */
public class ChainCalculator {
  
  /**
   * 필드 value는 사칙연산의 결과를 저장하고 있다.
   */
  private double value;
  
  public void printThis() {
    System.out.println("현재 객체(printThis 메소드를 호출한 객체)의 참조값: " + this);
  }
  
  // Setter (value 값을 바꿀 수 있는 Setter를 만든다.)
  // 원래는 param이 아니라 value가 받으면 변수이름도 value로 같게 짓는다.
  public void setValue(double value) { 
    this.value = value;   // value을 value에 전달.
  // 필드와 파라미터 이름이 동일해도 this. 를 통해 객체와 파라미터를 구분할 수 있다.
  }
  
  // Getter
  public double getValue() {
    return value;
  }
  
  public ChainCalculator addition(double a) {
    value += a;
    System.out.print("+" + a);
    return this;
  }
  
  public ChainCalculator substraction(double a) {
    value -= a;
    System.out.print("-" + a);
    return this;
  }
  
  public ChainCalculator multiplication(double a) {
    value *= a;
    System.out.print("*" + a);
    return this;
  }
  
  public ChainCalculator division(double a) {
    value /= a;
    System.out.print("/" + a);
    return this;
  }
  
  public ChainCalculator on() {
    System.out.print(value);
    return this;
  }
  
  public void done() {
    System.out.println("=" + value);
  }
  
 
  
  
  
  
  
  
  
}
