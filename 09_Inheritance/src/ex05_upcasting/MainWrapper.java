package ex05_upcasting;

public class MainWrapper {

  /*
   * upcasting
   * 1. 서브 클래스 객체를 슈퍼 클래스 타입으로 저장할 수 있다.
   * 2. 강제로 캐스팅(형변환)할 필요가 없다. 자동으로 변환된다.
   * 3. 장점
   *    1) 슈퍼 클래스 타입으로 모든 서브 클래스 객체를 저장할 수 있다.
   *    2) 서로 다른 타입의 객체를 하나의 타입으로 관리할 수 있다.
   *    단점
   *    1) 슈퍼 클래스 타입으로 저장하기 때문에 슈퍼 클래스의 메소드만 호출할 수 있다.
   *      (서브 클래스가 가지고 있는 메소드는 호출이 안 된다는 뜻).
   *    2) 이 단점을 해결하기 위해서 메소드 오버라이드(Method Override)를 이용할 수 있다.
   *    
   */
  
  public static void main(String[] args) {
    
    Student s1 = new Student();
    s1.setName("홍길동");
    s1.setSchool("가산대학교");
    s1.eat();
    s1.sleep();
    s1.study();
    
    System.out.println(s1.getName());
    System.out.println(s1.getSchool());
    s1.info();
    
    // set을 쓰지 않고 생성자 객체에 바로 저장.
    Student s2 = new Student("홍길동", "가산대학교");
    s2.eat();
    s2.sleep();
    s2.study();
    System.out.println(s2.getName());
    System.out.println(s2.getSchool());
    
    // upcasting (자식 객체를 부모 타입으로 저장시키는 것)
    Person p1 = new Student("고길동", "강원대학교");
    Person p2 = new Alba("홍길동", "가산대학교", "투썸");
    //자식들을 모두 부모인 Person타입으로 관리 가능하다.(여러 객체를 관리하기 편해지는 장점.)
    
    p1.eat();
    p1.sleep();
    p1.study();
 // eat 과 sleep 은 슈퍼 클래스에 있는 메소드여서 호출가능.
 // study 는 슈퍼 클래스 메소드가 아니기 때문에 호출 불가능.
 // 호출은 Person에서 하지만 실제 실행은 Student에서 실행됨.
    
    p2.eat();
    p2.sleep();
    p2.study();
    p2.working();
 // working 도 Person에 빈메소드로 만들어줌(오버라이드)
 // 호출은 Person에서 하지만 실제 실행은 Alba에서 실행됨.
  }
}
