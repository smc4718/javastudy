package ex08_abstract;

public class MainWrapper {

  public static void main(String[] args) {
    
    // 추상 클래스 Person은 객체를 생성할 수 없다.
    // Person p1 = new Person();  --> 불가능함.
    p1.eat();
    p1.sleep();
    
    Person p2 = new Student();
    p2.eat();
    p2.sleep();
    // study 메소드를 만들었지만, Person타입이기에 Person메소드만 호출 가능.
    // Person 에 빈 study 메소드를 만들어줘서 오버라이드 함.
  }

}
