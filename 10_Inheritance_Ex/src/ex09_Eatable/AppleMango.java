package ex09_Eatable;

public class AppleMango extends Food implements Eatable {
  
  public AppleMango(String name) {
    super(name);  // 슈퍼 클래스의 생성자 호출 public Food(String name) {} 생성자 호출
  }               // 상속 관계에 있는 자식은 반드시 super() 호출이 필요하다.
  
}
