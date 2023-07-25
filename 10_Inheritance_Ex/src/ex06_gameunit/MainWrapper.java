package ex06_gameunit;

public class MainWrapper {

  public static void main(String[] args) {
    
    // 게임 유닛 생성
    GameUnit unit1 = new Marine ("마린");
    GameUnit unit2 = new Firebat("파이어뱃");
    
    // 초기 에너지 설정
    unit1.setHp(100);
    unit2.setHp(50);
    
    // 공격 순서를 결정하는 flag
    boolean myTurn = false;
    
    // 게임 유닛이 모두 살아있으면 계속해서 공격
    while(unit1.isAlive() && unit2.isAlive()) {
      // isAlive = getter 이다. is 인 이유는 boolean 이라서.
      
      // 공격 순서에 따라 공격을 진행
      if(myTurn) {
        unit1.attack(unit2);
      } else {
        unit2.attack(unit1);
      }
      // unit1,2 에서 attack을 부를 수 있는 것을 보니 GameUnit 메소드임을 알 수 있다.
      
      // 공격 순서 변경
      myTurn = !myTurn;  // ! 표가 있는 쪽이 반대로 바뀜(false에서 true로 바뀜).
      
    }

    System.out.println("=== 게임 종료 ===");
    
    // 승리한 게임 유닛 확인
    if(unit1.isAlive()) {
      System.out.println(unit1.getName() + "의 승리! 현재 HP = " + unit1.getHp());
    } else {
      System.out.println(unit2.getName() + "의 승리! 현재 HP = " + unit2.getHp());
    }
    
  }

}
