package ex09_interface;

/*
 * 클래스 상속 vs 인터페이스 구현
 * 
 * 1. 클래스를 상속 받는다.
 *    public class Person { }
 *    public class student extends Person { }
 *    
 * 2. 인터페이스를 구현한다.
 *    public interface Shape { }
 *    public class Rectangle implements Shape { }
 *    
 * 클래스와 인터페이스는 사실상 같은 것(상속받는 것),
 * 말만 다르고(extends 와 implements) 같은 뜻.
 */

public class Rectangle implements Shape {

  private int width;
  private int height;
  
  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }
  
  // 인터페이스를 구현한 클래스는 "반드시" 추상 메소드를 오버라이드 해야 한다.
  @Override
  // int 를 double로 바꾸는 건 자동(promotion)으로 바뀌니 에러안남.
  public double getArea() {
    return width * height;
  }
  
}
