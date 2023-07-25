package ex04_Chair;

public class Chair {

  // Person, Student, Alba 객체를 모두 저장할 수 있다. (upCasting)
  private Person person; // 의자에 앉은 사람 한 명.
  
  // Constructor
  // 디폴트 생성자 사용.
  
  // Method
  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  // 메인메서드의 chair.setPerson(new Student("홍길동", "가산대학교") 가 
  // 이 생성자의 setPerson(Person person) 으로 전달 된다.
  }
  
  
  
}
