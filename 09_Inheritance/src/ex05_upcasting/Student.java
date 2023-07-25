package ex05_upcasting;

// Student     is a    Person  (is a 상속관계)
// 서브 클래스 is a 슈퍼 클래스(부모)
// super.eat() 같이 메소드들은 다 super로 호출할 수 있다.

public class Student extends Person {

  // Field
  private String school;
  
  // Constructor
    //new Student()
    public Student() {
      // 반드시 슈퍼 클래스의 생성자 호출이 있어야 하기 때문에,
      // 개발자가 슈퍼 클래스의 생성자를 호출하지 않으면 Java가 직접 슈퍼 클래스의 생성자를 호출한다.
      // Java가 호출하는 슈퍼 클래스의 생성자는 "디폴트 생성자"만 가능하다.
      super(); // 개발자가 작성하지 않아도 자동으로 호출되는 슈퍼 클래스의 디폴트 생성자.
  }
  
    // new Student("홍길동", "가산대학교")
    public Student(String name, String school) {
    // new Student("홍길동") 호출을 위한 코드
    super(name);  // <- person의 해당 생성자 호출이 됨.
    this.school = school;
  }

    // Method
    public String getSchool() {
      return school;
    }

    public void setSchool(String school) {
      this.school = school;
    }
    
    @Override
    public void study() {
      System.out.println("공부");
    }
    
    // 오버라이드 : 부모가 가진 메소드를 자식이 한 번 더 만들어서 덮어쓰기 하는 것
    @Override
    public void info() {
      System.out.println("이름: " + getName());
      System.out.println("학교: " + school);
      // 슈퍼클래스에서 가져오니 getName() 적는거고,
      // Student 자신이 가지고 있으니 school 필드값만 바로 적어도 된다.
    }
}
