package ex03_Bus;

// 학생은 사람이다. ( Student is a Person )
// 필드가 없는데 생성자가 필요한 경우는 상속관계 밖에 없다.
public class Student extends Person {
  
  // < 상속관계 생성자 자동완성 >
  //Source 메뉴 - Generate Constructors from Superclass... 선택.
  // new Student("홍길동")
  public Student(String name) {
    super(name);
  }

}
