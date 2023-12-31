package ex01_one_dim;

import java.util.Arrays;

public class MainWrapper {
  
  /*
   * 배열 (참조타입으로 주소값을 저장함)
   * 1. 여러 변수를 하나의 이름으로 관리하는 자료 구조이다.
   * 2. 배열에 저장된 모든 변수가 이름은 같지만, 인덱스가 다르다.
   * 3. 인덱스란 배열의 모든 변수를 구분하기 위한 위치 정보이다. 0부터 1씩 증가하는 값을 가진다.
   * 4. 기본 용어
   *    1) 배열명 : 모든 변수의 대표 이름
   *    2) 인덱스 : 첨자, 모든 변수를 구분하는 숫자
   *    3) 배열요소 : 배열에 속한 각 변수를 의미
   */
  
  /*
   * 배열의 선언 & 생성
   * 1. 배열 선언
   *    1) int[] 배열명  -- 자바 스타일, 추천
   *    2) int 배열명[]  <-- C언어 계열에서 나온 문법
   *    
   * 2. 배열 생성
   *    배열명 = new int[생성할 변수의 갯수]    
   * ' new ' = 메모리 공간을 확보하라는 의미.(new는 배열의 참조값을 배열명으로 리턴(반환)한다.)
   */
  
  /*
   * 배열요소
   * 1. 배열에 저장된 각 변수를 의미한다.
   * 2. 일반 변수와 다르게 자동으로 초기화된다.
   *    0(정수타입일 때), 0.0(실수타입일 때), false(boolean타입일 때), null(참조타입일 때)
   * 3. 배열요소 호출방법
   *    배열명[인덱스]
   */
  public static void ex01() {
    
    // 배열의 선언
    int[] a;
    
    // 배열의 생성
    a = new int[5];   //a라는 이름을 가진 변수가 5개가 생김.
    
    //배열요소 확인
    System.out.println(a[0]);
    System.out.println(a[1]);
    System.out.println(a[2]);
    System.out.println(a[3]);
    System.out.println(a[4]);
  //System.out.println(a[5]);  => Err, 인덱스의 범위를 벗어난 배열요소 : 예외발생
    //배열의 요소는 출력시 기본 값이 0으로 나옴.
    
  }
  
  public static void ex02() {
    
    // 배열에 저장할 변수의 갯수를 앞으로 "배열의 길이(length)"라고 표현한다.
    //  int length = 5;
    //  int[] a = new int[length];
    //  for(int i=0; i<length; i++) {    
    //  System.out.println(a[i]); 
    // 동일한 숫자가 들어가는 자리에 length를 적어주면 더 쉽다.
    
    // 배열의 선언 & 생성
    int[] a = new int[5];
    
    // 배열요소를 하나씩 순차적으로 for문으로 접근해 보기
    for(int i=0; i<5; i++) {      //for문에 데이터타입 반드시 적기.
      System.out.println(a[i]);  //a[0], a[1], a[2], a[3], a[4]를 순서대로 호출.
    }
    
  }
  
  public static void ex03() {
    
    //배열의 선언 & 생성
    int[] a = new int[5];
    
    // 배열의 순회  : for문으로 배열을 하나씩 순회하는 것.
    // 배열의 길이는 "배열명.length 로 알아낼 수 있다.
    for(int i = 0; i<a.length; i++) {     //인덱스의 시작은 0. 바꾸면 안됨.   
      System.out.println(a[i]);
    //배열의 길이를 구하는 문제를 풀 때 쓸 수 있다.
    //개발자들의 암묵적 약속 : 인덱스의 이름을 i,j,k 순으로 사용하기에  for(int i = 0) 가 되는 것. 꼭 i로 쓰자.
    //반대로 인덱스가 아니라면 ' i ' 라는 이름은 쓰지말자. 다른 곳에서도 i가 쓰이면 대부분 인덱스를 의미한다.
      
    }
    //*변수를 5개 써야하는데 배열을 모르면, int a, b, c, d, e; 이렇게 쓴다.
    //*배열을 알면, 변수이름을 같게 하고 int[] a = new int[5]; 여러 변수를 간단하게 만들 수 있다.
  }
  
  /*
   * 배열의 초기화
   * 1. 배열을 생성하면 데이터타입에 맞춰서 자동으로 초기화된다.(0, 0.0, false, null)
   * 2. 중괄호{} 를 이용해서 초기화 하고자 하는 값을 지정할 수 있다.(초기화 : 값 넣어주는 것)
   * 3. 배열의 초기화는 배열을 선언할 때만 사용할 수 있다.
   * 4. 형식
   *    int[] a = {10, 20, 30};
   */
  public static void ex04() {
    
    //배열의 초기화
    int[] a = {10, 20, 30};
    for(int i=0; i<a.length; i++) {   //i에 데이터타입 잊지말기.
      System.out.println(a[i]);
    } 
  } 
  
  public static void ex05() {
    
    int day = 14;
    int nDay = 10;
    day += nDay;  // 14일로부터 10일 후
    
    String[] weeknames = {"금", "토", "일", "월", "화", "수", "목"};
    //case 0:  에서 0에 요일을 적어줌.
    System.out.println(day + "일은 " + weeknames[day % 7] + "요일입니다.");
  }
  
  /*
   * 배열의 구조
   * 1. 배열의 타입은 참조 타입(reference type)이다.
   * 2. 배열의 모든 요소는 순서대로 메모리의 연속된 공간을 할당받는다.
   * (인덱스를 이용할 수 있는 이유가 배열의 구조 자체가 모여있기 때문이다.)
   * 
   */
  
  // 배열 ( reference type : 참조타입 )
  //
  //      int[] a = {10, 20, 30};
  
  //       ┌--------------┐
  //     a │  0x10000000  │
  //       │--------------│
  //       │      10      │ 0x10000000
  //       │--------------│
  //       │      20      │ 0x10000004  (방 하나는 4byte 차이가 난다.)
  //       │--------------│
  //       │      30      │ 0x10000008  
  //       └--------------┘
  //
  // 인덱스라는 것이 파생된 것은 "얼마나 떨어져 있는가" 이다.
  // a[0] 는 그 자리에서 떨어져 있지 않다. a[1]은 그 자리에서 한 칸 떨어져 있다는 의미이다.
  
  public static void ex06() {
    
    // 배열의 선언 & 생성
    int[] a = new int[5];   
    
    // 배열명 확인
    System.out.println(a);    
    // 출력시 ' [I@3d012ddd ' 라는 주소값이 나온다. 출력값에서 @의 의미는  "at : ~에 있는" 이다.
    // [ 는 배열, d는 16진수를 의미. 그래서 3d012ddd 는 메모리공간의 방의 이름(참조값=주소값)이다.
    
  }
  
  public static void ex07() {
    
    // 배열의 초기화
    int[] a = {10, 20, 30};
    
    // 배열의 선언
    int[] b;

    // 배열 a의 참조 값을 배열 b로 전달하면, 배열 a와 b는 동일한 메모리 공간을 참조할 수 있다.
    b = a;
    
    // 배열 순회
    for(int i=0; i<b.length; i++) {
        System.out.println(b[i]);   
        }
    // for(int i=0; i<b.length; i++) {
    // System.out.println(b[i]);   
      // Err -> 선언은 했으나 생성은 안했음 = 배열의 길이를 알려주지 않았음.
    }
    
   //  < ex07의 예제그림 >
   //   int[] a = {10, 20, 30};
    
    /*
     *    ┌--------------┐
     *   a│  0x10000000  │---------------
     *    │--------------│              │
     *    │     ...      │              │
     *    │--------------│              │
     *    │      10      │0x10000000    │
     *    │--------------│              │
     *    │      20      │0x10000004    │ b = a;
     *    │--------------│              │
     *    │      30      │0x10000008    │
     *    │--------------│              │
     *    │     ...      │              │
     *    │--------------│              │
     *   b│  0x10000000  │◀-------------
     *    └--------------┘              
     */
  
  public static void ex08() {
    
    // 배열이 생성되면 배열의 길이 변경은 불가능하다.
    // 하지만, 배열의 길이를 변경(대부분 길이를 늘리는 것)하려면??
    // 새로운 배열을 만들어서 기존 배열의 데이터를 모두 옮긴다.
    
    // 기존 배열
    int[] a = {10, 20, 30};
    
    // 신규 배열
    int[] b = new int[5];
    
    // 신규 배열 <- 기존 배열
    /*
    b[0] = a[0]
    b[1] = a[1]
    b[2] = a[2]
    for(int i=0; i<a.length; i++) {
      b[i] = a[i]; }
   */
    System.arraycopy(a, 0, b, 0, 3);  
    // (a, 0, b, 0, 0) => 배열 a의 인덱스 0번부터 복사 시작, 배열 b의 인덱스 0번으로 보내기 시작, 마지막 0은 몇개를 보낼 것인가 적는 것.
    // System.arraycopy 는 배열을 복사해준다.
    // Ctrl + 마우스클릭 = arraycopy 가 어떻게 만들어졌는지 보여준다.
    
    // 기존 배열 a의 참조 값을 새로운 배열 b의 참조 값으로 변경
    a = b;
    
    // 이제 더 이상 배열 a가 참조하던 0x10000000 영역을 참조하는 변수가 없다.
    // (기존에 a에 있던 배열요소 3개의 값은 아무도 모르는 참조값이 된다. 
    // 그래서 0x10000000 영역의 메모리 누수가 발생한다.
    // 이런 영역을 C++ 같은 언어에서는 delete 명령으로 개발자가 직접 메모리를 해제해야 하지만
    // Java는 스스로 메모리를 해제한다. (garbage collector가 담당 : System.gc() 명령어가 있다.하지만 호출하는 건 아니고 빨리 부르라고 재촉하는 것이다. ) 
    // => 이것이 자바가 자랑하는 메모리 기법이다.
    
    /*
     *    ┌--------------┐
     *   a│  0x10000000  │◀-------------- 원래 배열 a의 참조(주소)
     *    │  0x20000000  │◀-------------┐ 바뀐 배열 a의 참조(주소)
     *    │--------------│              │
     *    │     ...      │              │
     *    │--------------│              │---------┌----------------┐
     *    │      10      │0x10000000    │         │메모리 누수 영역│  *새집으로 옮기고 나면,
     *    │--------------│              │         │메모리 누수 영역│  *헌집에 메모리 누수가 발생한다.
     *    │      20      │0x10000004    │ a = b;  │메모리 누수 영역│ㄴ
     *    │--------------│              │         │메모리 누수 영역│
     *    │      30      │0x10000008    │         │메모리 누수 영역│
     *    │--------------│              │---------└----------------┘
     *    │     ...      │              │
     *    │--------------│              │
     *   b│  0x20000000  │--------------┘
     *    │--------------│              
     *    │     ...      │
     *    │--------------│
     *    │      10      │0x20000000
     *    │--------------│
     *    │      20      │0x20000004
     *    │--------------│
     *    │      30      │0x20000008
     *    │--------------│
     *    │      0       │0x2000000C
     *    │--------------│
     *    │      0       │0x20000010
     *    │--------------│
     *    │     ...      │
     *    └--------------┘
     */
    
    
  //배열 a 확인
  System.out.println(Arrays.toString(a));  //배열 a를 출력하는 구문(자동 완성 사용)  
}
  
  public static void main(String[] args) {
    
    //ex01();
    //ex02();
    //ex03();
    //ex04();
    //ex05();
    //ex06();
    //ex07();
    ex08();
  }
}






