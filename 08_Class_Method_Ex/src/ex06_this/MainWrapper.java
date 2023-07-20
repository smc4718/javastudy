package ex06_this;

public class MainWrapper {

  public static void main(String[] args) {
    
    // ChainCalculator 객체 선언 & 생성
    ChainCalculator myCalc = new ChainCalculator();
    
    // 객체 자체는 참조값이다.
    System.out.println(myCalc);
    
    // 출력시 => ex06_this.ChainCalculator@6f2b958e  ( 6f2b958e 가 this 이다.)
    
    // myCalc 객체가 호출한 printThis 메소드이기 때문에,
    // 여기서 확인된 this 값은 myCalc 객체의 참조값과 같다.
    //myCalc.printThis();
    // myCalc 가 this 인 것.
    // this는 ChainCalculator클래스 안에서만 쓸 수 있기에 this라고 부르고,
    // 메인메소드에서는 ChainCalculator클래스가 아니기에 myCalc로 써준다.
 
    // addition 메소드의 체이닝
    // 더하기
    // myCalc.addition(3).addition(2); // myCalc.addition(3) 실행 후 myCalc.addition(2)를 실행한다.
    // addition 메소드를 실행하면 myCalc 를 반환한다.
    
    // 빼기
    // myCalc.substraction(2).substraction(1);
    System.out.println("-------------------");
    // 곱하기
    // myCalc.multiplication(9).multiplication(9);
    System.out.println("-------------------");
    
    // 나누기
    // myCalc.division(4).division(2);
  
    // myCalc 메소드 체이닝
    myCalc.on().addition(3).substraction(2).multiplication(5).division(2).done();
    //0.0+3.0-2.0*5.0/2.0-=2.5
   
  
  }

}
