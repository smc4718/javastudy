package ex02_loop;

public class MainWrapper {

  public static void ex01() {
    // 구구단 출력하기
    // 2 x 1 = 2
    // 2 x 2 = 4
    // ...
    // 2 x 9 = 17
    int dan = 2;  // 이 곳에 원하는 구구단을 넣으면 된다.
   
    for(int n=1; n<=9; n++) {
      System.out.println(dan + " x " + n + "는 " + "= " + (dan * n) + "입니다.");
    }
  }
  
  public static void ex02() {
    // 100000 넘을 때까지 60원씩 모금하면서 과정 출력하기
    // 1회 모금액 60원, 현재 모금액 60원
    // 2회 모금액 60원, 현재 모금액 120원
    // 3회 모금액 60원, 현재 모금액 180원
    // ...
    // 1667회 모금액 60원, 현재 모금액 100020원
    final int GOAL = 100000;  // 목표 모금액    //final로 상수처리해주면, 내가 가진 값은 변하지 않는다고 지정해줌.
    int money = 60;  // 1회당 모금액
    int total = 0;  // 모금액 합계
    int nth = 0;  // 회차
    
    while(total < goal) {
      total += money;
      nth++;
     System.out.println("목표 모금액 " + goal + "원중 " + nth + "회차를 통해서 " + total + "을 모았습니다." );
    }
   
   
   }
   
 
  
  public static void ex03() {
    // 전체 구구단 출력하기 - 1
    // 2 x 1 = 2
    // ...
    // 9 x 9 = 81
    // 고정 값 : 바깥 LOOP에 배치 
    //(원하는 dan으로 고정시키고, 1~9까지 순회시킴)
    
    for(int dan=2; dan<=9; dan++) {     //★★★데이터타입 꼭 써.
      for(int n=1; n<=9; n++) {
        System.out.println(dan + " x " + n + "는 " + "= " + (dan * n) + "입니다.");
      }
    }
    
    
  }
  
  public static void ex04() {
    // 전체 구구단 출력하기 - 2
    // 2x1=2  3x1=3  4x1=4  ... 9x1=9
    // ...
    // 2x9=18 3x9=27 4x9=36 ... 9x9=81
    
    // 참고할코드
    // System.out.print("2x1=2");  // 2x1=2를 출력한 뒤 줄을 바꾸지 않는다.
    
    for(int n=1; n<=9; n++) {
      for(int dan=2; dan<=9; dan++) {
        System.out.print(dan + "x" + n + "=" + String.format("%-4d", dan * n));
        // "%-4d" 로 끝자리에 4자리 숫자를 정수로 출력시켜서 숫자가 없는 곳에는 공백으로 채움.
      }
      System.out.println();    //줄 바꿈
    }
  }
  
  public static void ex05() {
    // 삼각별 출력하기 - 1 (2중 loop)
    //     star=12345 
    // row=1   *
    // row=2   **
    // row=3   ***
    // row=4   ****
    // row=5   *****
    //
    // row=1, star=1
    // row=2, star=12
    // row=3, star=123
    // row=4, star=1234
    // row=5, star=12345
    //형식을 써놓고 하면 편하다.
    // 풀이법 : ↓ 
    //모든 star의 시작값이 '1'이다.
    //row하고 star의 종료되는 숫자값이 같다.
    
    // 참고할 코드
    // System.out.print("*");  // *를 출력한 뒤 줄을 바꾸지 않는다.
    // System.out.println();   // 줄 바꾸기
    
    for(int row=1; row<=5; row++) {
      for(int star=1; star<=row; star++) {
        System.out.print("*");
      }
      System.out.println();
      
    }
      
      System.out.println();
    }
      
  
 

  
  public static void ex06() {
    // 삼각별 출력하기 - 2 (2중 loop)
    //     star=12345
    // row=1   *****
    // row=2   ****
    // row=3   ***
    // row=4   **
    // row=5   *
    //
    // row=1, star=12345
    // row=2, star=1234
    // row=3, star=123
    // row=4, star=12
    // row=5, star=1
    // 풀이법 : ↓ 
    // row와 스타의 시작값은 각각 1이다.
    // star의 종료값은 row 1일 때 5 .   2일 때 4.   이렇게 찾는다. 
    // *개발할 때 거꾸로 출력이라는 말은 없다. (숫자끼리 비교해서 값을 찾는 것)
    
    
    for(int row=1; row<=5; row++) {
      for(int star=1; star<=6-row; star++) {
        System.out.print("*");
      }
      System.out.println();
    }
    
  }
  
  
  public static void ex07() {
    // 삼각별 출력하기 - 3 (2중 loop)
    //     space/star=123456789
    // row=1              *
    // row=2             ***
    // row=3            *****
    // row=4           *******
    // row=5          *********
    // 풀이법 : ↓  , 공백이 보였어야 풀 수 있다.
    // row=1, space=1234, star=5
    // row=2, space=123,  star=456
    // row=3, space=12,   star=34567
    // row=4, space=1,  star=2345678
    // row=5, space=0,    star=123456789

    
    for(int row=1; row<=5; row++) {
      for(int space=1; space <= 5-row; space++) {
        //row 값과 space의 종료값을 더하면 5가 나온다.
        System.out.print(" ");
    }
    for(int star=6-row; star <= row+4; star++ ) {
      System.out.print("*");
    }
      System.out.println();
   }
      //star의 시작은 row의 시작과 비교해보면 된다. 1일때 5, 2일 때4  ... 더하면 6이다.
      //star의 종료는 row와 비교하면, 1일 때 5, 2일 때 6 ... 빼면 4이다.  = row + 4
  }
  
  
  public static void ex08() {
    // 삼각별 출력하기 - 4 (2중 loop)
    //        space/star=123456789
    // row=1             *********
    // row=2              *******
    // row=3               *****
    // row=4                ***
    // row=5                 *
    //
    // row=1, space=0,    star=123456789
    // row=2, space=1,    star=2345678
    // row=3, space=12,   star=34567
    // row=4, space=123,  star=456
    // row=5, space=1234, star=5
    
    for(int row=1; row<=5; row++) {
      for(int space=1; space<=row-1; space++) {
        System.out.print(" ");
      }
    for(int star=row; star<=10-row; star++) {
        //row와 star의 종료값이 더하면 10인데, star의 값을 구하는 것이니 10-row 이다.
      System.out.print("*");
    }
    
      System.out.println(" ");
    }
  }
  //별 모양 문제 못해도 웹개발이랑은 상관 없음.
  
  
  public static void main(String[] args) {
    
    //String str1 = String.format("%d", 10);     // %d : format 코드 중 하나, 정수를 의미.
    //String str2 = String.format("%2d", 10);    // %2d : 2자리 정수로 출력해라
    //String str3 = String.format("%4d", 10);    // %4d : 4자리 정수로 출력해라
    
    //String str4 = String.format("%-3d", 10);   // -를 붙이냐 안붙이냐에 따라 순서가 다름( -면 숫자가 앞으로감.)
    //String str5 = String.format("%-4d", 10);    
    
    //System.out.print(str3 + str2 + str1);  //전체 폭을 n자리에 맞춰서 출력해라.(빈 곳은 공백처리됨)
    //System.out.println();
    //System.out.print(str4 + str5);
    
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


