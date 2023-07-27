package ex02_Coffee;

import java.util.ArrayList;
import java.util.List;

public class Person {

  private List<Cup> tray; // 컵을 여러 개 저장하겠다.
  
  // new Person()
  public Person() {
    tray = new ArrayList<Cup>();
    
  }
  
  // 메인에서 cup을 전달했으니 Cup 타입으로 받아준다.
  // 트레이에서 컵을 꺼내 준다.
  public void addCupToTray(Cup cup) {
    tray.add(cup);
  }
  
  // 트레이에 들어있는 것 보여주기
  public void trayInfo() {
    for(int i=0, length=tray.size(); i<length; i++) {
      System.out.println((i + 1) + "번째 커피: " + tray.get(i).getCoffee()); // Americano와 CafeLatte toString() 동작.
    } // tray.get 은 컵이다. 컵에서 커피를 빼서 보여줘야 하니까, 뒤에 .getCoffee() 로 커피를 빼준다.
    
  }
  
  
}
