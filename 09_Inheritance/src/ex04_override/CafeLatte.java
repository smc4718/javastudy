package ex04_override;

/*
 * 메소드 오버라이드(method override)
 * 1. 슈퍼 클래스의 메소드를 서브 클래스가 다시 만드는 것을 말한다. (메소드 덮어쓰기)
 * 2. 오버라이드 하는 메소드는 @Override Annotation을 추가하는 것이 좋다. (권장이지만 필수로 하자.)
 * 3. 반드시 동일한 모습으로 오버라이드 해야 한다.
 *     ㄴ(반환타입, 이름 하나라도 다르게 만들면 안 된다.)
 */

public class CafeLatte extends Espresso {

  @Override // 오버라이드 한 메소드 (슈퍼클래스에도 있는데 내가 또 만든 거다. 라는 명시임.)
            // @Override를 적으면 똑같이 만들었는지 문법 체크를 해 준다.(똑같지 않으면 에러표시해줌)
  public void taste() {
    System.out.println("고소한 맛");
  }
}






