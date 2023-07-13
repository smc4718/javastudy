package ex02_loop;

public class MainWrapper {
  
  /*
   * for문 (반복문의 대부분은 for문을 사용.)
   * 1. 연속된 숫자(수열)를 생성하는 목적의 반복문이다.
   * 2. 형식
   *    for(초기값; 조건문; 증감문){
   *       실행문
   *    }
   * 3. 실행순서
   *    초기값 -> 조건문 -> 실행문 -> 증감문 -> 조건문 -> 실행문 -> 증감문 ~~~ 반복.
   */
  
  public static void ex01( ) {
    
    // 1 ~ 10 출력하기
    for(int n=1; n<=10; n++) {
      System.out.println(n);    //최초출력 1, 2 3 ...10
    }
    
    // 10 ~ 1 출력하기
    for(int n=10; n>=1; n--) {
      System.out.println(n); //최초출력 10, 9 8 ...10
    }
    
 }

  public static void ex02() {
    
    // 특정 횟수만큼 반복시키는 for문 (매우중요 꼭 암기)
    int count = 5;   // 5번
    for(int n=0; n<=count; n++) {     //n=0 : 시작은 세지 않았으니 0부터. (n앞에 데이터타입 꼭 적기)
      System.out.println(n + "번");
       }
}
  
  /*
   * while문  (몇 번 반복할지 모를 때 사용함, 상대적으로 쓰임새는 제한적이다.)
   * 1. 특정 조건을 만족하면 실행되는 반복문이다.
   * 2. 형식
   *    while(조건문){
   *       실행문
   *    }
   * if는 만족하면 한 번만 하지만, while은 만족하면 계속 돈다. (무한루프)
   */
  
  
  public static void ex03() {
    int n = 0;
    while(n < 10) {
      System.out.println(n);
      n++; 
    }
    
  }
  
  /*
   * do while문
   * 1. 반드시 1번은 실행되는 while문이다.
   * 2. 형식
   *    do {
   *       실행문
   *       } while(조건문);
   */
  public static void ex04() {
    
    int n = 100;
    do {
      System.out.println(n);
      n++;
       } while(n < 10); 
    
  }
  
  /*
   * break문
   * 1. switch문을 종료한다.
   * 2. 반복문(for, while, do while)을 종료한다.
   */
  
  public static void ex05() {
    
    // 무한루프(끝없는 반복) 만드는 2가지 방법
    // 1. while(true) { }    => 이 방법을 추천.
    // 2. for(;;) { }   => 조건문,초기문,증감문 하나도 안 적고 ;; 만 적어주기.
    //*내가 끝내고 싶을 때 끝내는 것들은 다 무한루프.
    
    // 무한루프와 break를 이용한 1 ~ 10 출력하기
    int n = 1;
    while(true) {
      if(n > 10) {       // 두 번째 방법: if(n == 11)
        break;
      }                  // 좋은 코드 작성 스타일은 언제 끝나는지 초반에 명시하는 것.
      System.out.println(n);
      n++;
    }
    
  }
  
  /*
   * continue문
   * 1. 반복문의 실행 시작 지점부터 다시 실행한다.
   * 2. continue문 이후의 코드를 실행에서 제외하고자 할 때 사용한다.
   */
  public static void ex06() {
    
    // 1 ~ 50 사이 정수 중 7의 배수는 제외하고 출력하기
    
    for(int n=0; n <= 50; n++) {
      if(n % 7 == 0) {
        continue; }               // continue = for문의 증감문(n++)으로 돌아가시오.
      System.out.println(n);   // if문에서 돌렸을 때, 7의 배수이면 다시 증감문으로 돌아가서 값이 증가되니 7의 배수는 값이 출력되지 못하고 사라짐.
       }
  }
  
  public static void ex07() {
    
    // 중첩(nested) for문     => 중첩문은 많아야 3번까지쓰고, 보통은 2번씀.
  for(int year = 1; year <= 10; year++) {
   System.out.println("========" + year + "년차 =========");
    for(int day = 1; day <= 5; day++) {
      System.out.println(day + "일차");
      for(int hour = 1; hour <= 8; hour++) {
        System.out.println("  " + day + "일차 " + hour + "교시입니다.");
         for(int minute = 1; minute <= 60; minute++) {
           System.out.println("  " + day + "일차 " + hour + "교시 " + minute + "분입니다. " );
             for(int second = 1; second <= 60; second++) {
               System.out.println("  " + day + "일차 " + hour + "교시 " + minute + "분 " + second + "초입니다.");
             }
         }
       }
      
     }
   } 
 }
  
  public static void main(String[] args) {
    
    // ex01();
    // ex02();
    // ex03();
    // ex04();
    // ex05();
    // ex06();
    // ex07(); 
// 주석처리하는 자동 단축키 : Ctrl + /(슬래시)
    
    
  }

}