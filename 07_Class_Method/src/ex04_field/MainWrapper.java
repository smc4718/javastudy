package ex04_field;

public class MainWrapper {
  
  //모든 객체가 가지는 고유의 값은 field 에 저장한다.
  //그래서 강의에서 field는 '속성' 이라함.

  public static void main(String[] args) {
    
    // AccCalculator 객체의 선언 & 생성
    ACCCalculator myAcc = new ACCCalculator();
    
    // value 확인   - 초기값
    myAcc.showValue();
    
    // 사칙연산
    myAcc.addition(3);        // +3
    myAcc.substraction(2);    // -2
    myAcc.multiplication(3);  // *3
    myAcc.division(2);        // 1.5
    
    // value 확인  - 결과값
    myAcc.showValue();

  }

}
