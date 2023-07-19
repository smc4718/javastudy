package ex05_access_modifier;

public class MainWrapper {

  public static void main(String[] args) {
  
   // User 객체(객체명 u) : 모든 클래스는 클래스 이름이 타입.
   User u = new User();
    
   // User 객체에 데이터 저장 
   u.setId("gdu");  // -> "gdu" Id가 저장이 된 상태.
   u.setAge(29);
   
   // User 객체의 데이터 확인
   System.out.println(u.getId());
   System.out.println(u.getAge());

  }

}
