package ex01_one_dim;

public class MainWrapper {
  
  /*
   * 배열
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
  
  
  public static void main(String[] args) {
    
    //ex01();
    //ex02();
    ex03();
  }

}











