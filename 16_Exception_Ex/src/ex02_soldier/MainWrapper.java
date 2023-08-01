package ex02_soldier;

public class MainWrapper {

  public static void main(String[] args) {  // main이 예외를 던지면 Java가 예외 처리한다.
   
    Gun gun = new Gun(30);         // 총알을 30개 가진 총
    Soldier s = new Soldier(gun);
    
    // Soldier s = new Soldier(30);  // 총알을 30개 가진 군인
    try {
    s.reload(30);  // 30발은 장전이 불가능합니다.
    s.reload(20);  // 20발이 장전되었습니다. 현재 50발이 들어있습니다.
    
    for(int n = 0; n < 50; n++) {
      s.shoot();
    }
    s.shoot();  // 헛빵!
    } catch (RuntimeException e) {
     System.out.println(e.getMessage());
    }
  }
  /*
    Gun 클래스 메소드 throws 던지고 -> 파라미터 받는 Soldier에서 throws 던지고 -> 메인에서 받기  
  (메인에서도 예외처리 하기 싫으면 던질 수 있다 => 마지막은 자바가 알아서 처리)
  메인에서 안 던지려면 try-catch 를 쓰면 된다.
 */
}