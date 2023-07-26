package ex09_Eatable;

public class MainWrapper {

  public static void main(String[] args) {
    
    Person p = new Person();
    
    p.eatEverything(new AppleMango("애플망고"));  // 애플망고 먹는다.
    p.eatEverything(new Gosu("고수"));  // 고수 먹는다.
    p.eatPossible(new AppleMango("애플망고"));  // 애플망고 먹는다.
    p.eatPossible(new Gosu("고수"));  // 컴파일 오류 발생
  
  // 같은 타입인데 다른 상황을 가져야 할 때, 인터페이스를 쓴다.
  // (둘 다 게임유닛이지만, 마린은 벙커에 들어가지지만, 탱크는 너무 커서 벙커에 안들어가진다.)
  }

}
