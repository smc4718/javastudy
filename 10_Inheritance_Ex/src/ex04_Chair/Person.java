package ex04_Chair;

public class Person {

  // Field
  private String name;
  
  // Constructor
  public Person() {}

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
  
  public void info() {
    System.out.println("이름: " + name);
  }
  
}
