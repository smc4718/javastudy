package Person;

public class Person {

  // Field
  private String name;
  private int age;

  // 생성자 없을 때 공백에 Ctrl + Space 하면 빈 생성자 만들기
  // 혹은 Source 메뉴 - Generate Constructor using Fields...
  public Person() {
 }

  public Person(String name, int age) {
    super();   // 자동완성 맡기면 Object 생성자 super로 나옴.
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", age=" + age + "]";
  } 
 
  
  
}
