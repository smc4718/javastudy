package ex04_Chair;

public class MainWrapper {

  public static void main(String[] args) {
    
    Chair chair1 = new Chair();
    chair1.setPerson(new Student("홍길동", "가산대학교"));
    chair1.getPerson().info();  // 이름, 학교 출력
    // Person 에는 Student, Alba가 다 포함이니까 
    // setPerson만 해서 값을 넣어줘도 모두 저장 가능한 것.
    
    Chair chair2 = new Chair();
    chair2.setPerson(new Alba("고길동", "가산대학교", "투썸"));
    chair2.getPerson().info();  // 이름, 학교, 직장 출력
  }

}
