package ex03_operator;

public class MainWrapper {

  // ex01 메소드 만들기(메소드 정의)
  public static void ex01() {
    System.out.println("Hello World");
    
    //정수 연산
    int a = 5;     // ' = ' 대입연산자 : 오른쪽 값을 왼쪽으로 저장시키는 것, 항상 오른쪽 먼저 실행됨.
    int b = 2;
    
    int add = a + b;
    int sub = a - b;
    int mul = a * b;
    int mok = a / b;  //몫을 구할 때 씀.
    int mod = a % b;  //나머지 구할 때 씀.
    
    System.out.println(add);
    System.out.println(sub);
    System.out.println(mul);
    System.out.println(mok);
    System.out.println(mod);
    
    
    //실수 연산
    double x = 5;
    double y = 2;   //값이 정수인데 double 이 되는 이유는, 자동변환이 되어져서 가능.
    
    double addResult = x + y;
    double subResult = x - y;
    double mulResult = x * y;
    double divResult = x / y;  //몫이 아닌 진짜 나누기를 함. (소숫점까지 나옴)
    double modResult = x % y;  //실수를 나머지구하는 경우는 없음.
    
    System.out.println(addResult);
    System.out.println(subResult);
    System.out.println(mulResult);
    System.out.println(divResult);
    
    //미션: 정수끼리 계산해서 실수 결과 도출하기
    int i = 5;
    int j = 2;
    
    double result = (double)i / j;   // i가 5에서 casting 되서 5.0이 됨. 2도 계산하면서 5.0 / 2.0 으로 자바가 바꿈.
    System.out.println(result);     //2.5
    

  }
 
  // ex02 메소드 정의
  public static void ex02() {
    
    // 증감 연산(++, --)
    
    // 전위 연산(먼저 증감)
    int a = 10;
    System.out.println(++a); // a를 증가시킨 뒤 출력한다
    System.out.println(a);
    
    // 후위 연산(나중에 증감)
    int b = 10;
    System.out.println(b++);
    System.out.println(b);  //  b를 출력한 뒤 증가시킨다.
  }
 
  // ex03 메소드 정의
  public static void ex03() {
    
    // 대입 연산
    int a = 10;
    int b = a;   //최악의 해석 : b는 a와 같다. |  옳은 해석 : a를 b로 보내라.
    System.out.println(a);
    System.out.println(b);
    
    // 복합 연산(복합 대입 연산)
    int x = 10;
    int y = 1;
    y += x;    // y = y + x;   y값을 x만큼 늘리기.
    System.out.println(x);  // 10
    System.out.println(y);  // 11
    
  } 
     
  // ex04 메소드 정의
  public static void ex04() {
    
    // 관계 연산(크기 비교)
    int a = 3;
    int b = 5;
    
    boolean result1 = a >  b;   // a가 b보다 크면 true, 아니면 false.
    boolean result2 = a >= b;   // a가 b보다 크거나 같으면 true, 아니면 false.
    boolean result3 = a <  b;   // a가 b보다 작으면 true, 아니면 false
    boolean result4 = a <= b;   // a가 b보다 작거나 같으면 true, 아니면 false.
    boolean result5 = a == b;   // a와 b가 같으면 true, 아니면 false.
    boolean result6 = a != b;   // a와 b가 다르면 true, 같으면 false.
    
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
    System.out.println(result5);
    System.out.println(result6);
    
    //논리 연산
    // 1. 논리 AND : &&, 모든 조건이 만족하면 true, 아니면 false
    // 2. 논리 OR  : ||, 하나의 조건이라도 만족하면 true, 아니면 false
    // 3. 논리 NOT : ! , 조건 결과가 true 이면 false, 조건 결과가 false 이면, true.
    
    int x = 10;
    int y = 20;
    
    boolean andResult = (x == 10) && (y == 10);  // 모든 조건이 만족하지 않기 때문에 false.
    boolean orResult  = (x == 10) || (y == 10); // 하나의 조건이 만족하므로 true
    boolean notResult = !(x == 10);  // x != 10 와 동일한 조건.
    System.out.println(andResult);
    System.out.println(orResult);
    System.out.println(notResult);
    // 복붙하는 이유 : 오타를 줄이려고 (편할려고x).
    
    //Short Circuit Evaluation
    // 1. 논리 AND : 결과가 false인 조건이 나타나면 더 이상 조건을 체크하지 않는다. 최종 결과가 false로 정해졌기 때문이다.
    // 2. 논리 OR  : 결과가 ture인 조건이 나타나지 않으면 더 이상 조건을 체크하지 않는다. 최종 결과가 true로 정해졌기 때문이다.
    int i = 10;
    int j = 10;
    
    boolean andSceResult = (++i == 10) && (++j == 10);  //논리 AND로 첫 번째 조건에서 false가 나와서 더이상 체크 x
    System.out.println(andSceResult);  //false
    System.out.println(i);             // 11
    System.out.println(j);             // 10
    
    boolean orSceResult = (j++ == 10) || (i++ == 10); //논리 OR로 첫 번째에서 이미 true가 나왔기 때문에 더이상 체크 x , 결과 : true
    System.out.println(orSceResult);   //true
    System.out.println(i);             // 11
    System.out.println(j);             // 11
    
  }

  // ex05 메소드 정의
  public static void ex05() {
    
    // 조건 연산자(3개의 항을 사용하므로 삼항 연산이라고도 한다.)
    // 조건식 ? true인 경우 결과 : false인 경우 결과
    
    int score = 100;
    
    String result = (score >= 60) ? "합격" : "불합격";
      System.out.println(result);
    
    
  }
  
  // ex06 메소드 정의
  public static void ex06() {
    
    // 문자열 연결
    String str1 = "구디" + "아카데미";     // 구디아카데미
    String str2 = 4 + "달라";             //숫자+문자 연결가능
    String str3 = 1 + 2 + "번지";         //' 3번지 ' = 왼쪽에서 오른쪽으로 계산하기 때문에 1+2 를 먼저함, 후에 문자열과 합침.
              
    
    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
    
    // 정수 -> 문자열
    // 실수 -> 문자열
    String str4 = 100 + "";    // 빈 문자열("")을 더해주면 숫자가 문자열이 된다.
    String str5 = 1.5 + "";    // 빈 문자열("")을 더해주면 숫자가 문자열이 된다.
      
    System.out.println(str4);
    System.out.println(str5);
    
    //참고. 문자열로 변환하는 메소드가 있다.
    String str6 = String.valueOf(100);    //잘 안 쓸 뿐 있다.
    
    System.out.println();
    
  }
  
  public static void main(String[] args) {
    //항상 메인메소드 부터 실행됨.
    //메소드는 항상 만든다고 실행되지 않음 -> 메인메소드에서 호출해야 작동.
    // ex01 메소드 실행 부탁(메소드 호출)
    // ex01();
    
    // ex02 메소드 호출
    // ex02();
    
    // ex03 메소드 호출
    // ex03();
    
    // ex04 메소드 호출
    // ex04();
    
    // ex05 메소드 호출
    // ex05();
    
    // ex06 메소드 호출
    ex06();
    
    //먼저 적은 메소드순서대로 실행된다.(ex01 이 먼저, ex02가 나중).
    
  }

  public static void hello() {
    System.out.println("안녕 자바");
  }
  //메소드 만드는 위치는 클래스 안에만 있다면 어디든 상관 없다.
  //클래스 밖에는 어떤 코드도 넣을 수 없다.
}

                                                                                                                                                                                                                   