package ex02_return;

public class MainWrapper2 {

  /*
   *  void 메소드의 return
   *  1. 반환값이 없는 메소드는 void 키워드를 사용한다.
   *  2. 이런 경우 return; 키워드를 이용해서 메소드 실행을 종료할 수 있다.
   *  3. return 키워드만 작성해야 한다.
   *  4. void 메소드에서만 사용할 수 있다.(return이 있는 메소드는 사용 못 한다.)
   */
  
  public static void main(String[] args) {
      positivePrint(10);
      positivePrint(-10);
      //positive number : 양수.  양수만 출력하겠다.
    

  }
  
  // 전달된 인수가 양수이면 출력하고 아니면 출력하지 않는 positivePrint 메소드
  public static void positivePrint(int a) {
    if(a < 0) {
      return; // "0보다 작으면 메소드 실행 안 할래."
              // retunr만 적고 값이 나오면 안 된다.
    }
    System.out.println(a);
  }
}
