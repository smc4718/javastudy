package ex07_object;

public class MainWrapper {

  public static void ex01() {
    
    // Object 타입으로 모든 객체를 저장할 수 있다.
    // Object 타입으로 저장한 객체를 사용할 때는 캐스팅 해야 한다.
    
  }
  
  public static void ex02() {
    
    // 동일한 객체 2개
    Person p1 = new Person("홍길동", 20);
    Person p2 = new Person("홍길동", 20);
    
    // 동일한 객체인지 판단
    boolean same = p1.equals(p2);
    // p1 과 p2 는 주소가 다른, 서로 다른 객체이다.
    // equals(); 는 주소 번지 수가 다르니, 다른 객체라고 출력된다.
 // equals 를 오버라이드 해서 주소값말고 주소 안에 있는 실제 값을 비교할 수 있도록 해주면 된다.  
    
    // 결과 확인
    System.out.println(same ? "동일한 객체" : "다른 객체");
    
  }
  
  public static void ex03() {
    
    Person p = new Person("홍길동", 20);
    
    System.out.println(p);  // 객체 p는 p.toString()이 자동 호출되서 사용된다.
    System.out.println(p.toString());
    
  }
  
  public static void main(String[] args) {
    
    Object obj = new Person();
    ((Person) obj).setName("홍길동");
    ((Person) obj).setAge(20);
    System.out.println(((Person) obj).getName());
    System.out.println(((Person) obj).getAge());
   
    //ex01();
   //ex02();
    ex03();
  }
  // 위와 같이 다운캐스팅으로 바꿔 사용 가능.
  
}
