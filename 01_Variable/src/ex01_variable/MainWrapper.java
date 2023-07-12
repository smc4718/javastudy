package ex01_variable;

public class MainWrapper {
  
  public static void main(String[] args) {
    
    System.out.println("Hello World");
    
    // single comment (한 줄 주석)
    /*
     multiple comment
     여러 줄 주석
     */
    
    /*
    * 키워드 규칙
    *  1. 프로젝트 : 이름 맘대로
    *  2. 패키지   : 모두 소문자로 작성(실무는 회사 도메인을 거꾸로 작성 : com.samsung.xxx)
    *  3. 클래스   : Upper Camel Case (첫 글자가 대문자인 Camel Case)
    *  4. 메소드   : Lower Camel Case (첫 글자가 소문자인 Camel Case)
    *  5. 변수     : Lower Camel Case (첫 글자가 소문자인 Camel Case)
    *  6. 상수     : Snake Case(대문자를 밑줄로 연결)
     */
    
    // 들여쓰기는 필수이다. 코드가 개발자의 얼굴이다.
    
    
    // 변수 선언하기
    
    // primitive type - 1 : 논리타입
    boolean isGood  = true;
    boolean isAlive = false;
   System.out.println(isGood);
   System.out.println(isAlive);
   
    //변수 이름이 길면, 한두글자만 적고 ctrl + space 로 자동완성하는 게 빠름.
   //오타가 많은 건 직접 타이핑 한 경우가 많음.
   
   //실행 = Ctrl + F11
       
    // primitive type -2 : 문자타입 (한글도 저장가능)
     char ch1 = 'A';
     char ch2 = '가';
    System.out.println(ch1);
    System.out.println(ch2);
    
    // primitive type - 3 : 정수타입
    int score =  100;
    long money = 1000000000;
    //선언된 변수를 보고 L의 여부를 정하는 게 아니라
    //숫자 자체가 정수타입의 범위를 벗어나지 않으면 'L' 을 붙이지 않아도 된다.
    //(그래도 그냥 long은 'L' 붙여라)
    System.out.println(score);
    System.out.println(money);
    
    // primitive type -4 : 실수타입
    double commission = 0.5;
    System.out.println(commission);
    
    // 상수
    final double PI = 3.141592;       //파이널 변수는 소문자로 작성하지 않도록 하자
    System.out.println(PI);
    
    
    // reference type : 참조타입
    String name = "tom";
    System.out.println(name);         //name에는 tom이 아니라 톰의 주소값이 저장되어 있다.
    
    
    
    
    
    
    
    
    
    
    
    
  }
  
}





