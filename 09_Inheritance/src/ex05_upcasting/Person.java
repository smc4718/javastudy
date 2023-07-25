package ex05_upcasting;

public class Person {

  // Field
  private String name;
  
  // Constructor
    // new Person()
  public Person() {
    
  }
  
    // new Person("홍길동")
  public Person(String name) {
    this.name = name;
  }
  
  
  // Method
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void eat() {
    System.out.println("쿰척쿰척");
  }
    
  public void sleep() {
    System.out.println("드르렁");
  }
  
  public void info() {
    System.out.println("이름: " + name);
  }
  
  // 실행이 목적이 아닌 호출이 목적인 메소드(오버라이드용)
  public void study() {
  }
  
  //실행이 목적이 아닌 호출이 목적인 메소드(오버라이드용)
  public void working() {
  }
}
