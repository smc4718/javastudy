package ex03_class;

public class MainWrapper {

  public static void main(String[] args) {
    
    // Calculator 객체 만들기
    
    // Calculator 객체 선언
    // 클래스의 이름이 객체의 타입이다.
    //  타입  객체이름
    Calculator myCalc;
    
    // Calculator 객체 생성
    myCalc = new Calculator();
    // ↑ 이것이 손으로 만질 수 있는 실제 계산기.
    
    
    // 계산하고자 하는 실수 2개 준비
    double a = 1.5;
    double b = 1.2;

    // 덧셈, 뺄셈, 곱셈, 나눗셈 메소드 호출
    System.out.println(myCalc.addition(a, b));
    System.out.println(myCalc.subtraction(a, b));
    System.out.println(myCalc.multiplication(a, b));
    System.out.println(myCalc.division(a, b));
// 자동 완성에 보면 Calculator(내가 만든 클래스(설계도) 이름) 라고 적혀있는 것들이 내가 만든 기능들. 
    
  }

}
