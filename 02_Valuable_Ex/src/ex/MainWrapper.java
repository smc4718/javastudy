package ex;

public class MainWrapper {

  public static void main(String[] args) {
   
    System.out.println("--------1번---------");
    
    // 초 -> 분/초
    int second = 90;
    int m = second / 60;  // 1
    int s = second % 60;  // 30
    
    System.out.println (m);
    System.out.println (s);
    System.out.println (second + "초는 " + m + "분 " + s + "초 입니다." );
    
    
    
    
    System.out.println("--------2번---------");

    // x와 y값을 교환
    int x = 10;
    int y = 20;
    int temp;

    temp = x;
    x = y;
    y = temp;
    
    
    System.out.println(x + ", " + y);
    
    
    
    System.out.println("--------3번---------");
    
    
 // 5% 이자 받으면 통장잔액이 얼마?(소수 이하는 버림)
    long balance = 123456L;  // 통장잔액
    double pct = 0.05;  // 5%
    
    double total = balance * pct;
    int eza = (int)total;
    
    System.out.println("이자는 " + eza + "원 입니다.");
    System.out.println(balance + eza + "원의 잔액이 남아있습니다.");

    // ↓ 다른 방법
    //Err뜸. balance = balance * (1 + pct); <-- balance는 long타입인데 뒤에 pct계산하면 실수가 있기에 더블타입이 되서 오류남.
    //정상뜸. balance *= (1 + pct);

    
    System.out.println("--------4번---------");
    
    // 90점대 점수이면 true, 아니면 false
    int score1 = 95;
    boolean result1 = (score1 >= 90) && (score1 < 100);   // true
    int score2 = 75;
    boolean result2 = (score2 / 10) == 9;   // false
  
    
    
    System.out.println(result1);
    System.out.println(result2);
    
    System.out.println("--------5번---------");
    
    
    // n의 "짝수", "홀수" 여부 출력
    int n = 3;
    String res1 = (n % 2 == 0) ? "짝수" : "홀수";  // "홀수"
    
    System.out.println(n + "은 " + res1 + "입니다.");
    
    
    
    System.out.println("--------6번---------");
    
    // num의 "짝수", "홀수", "3의배수" 여부 출력 (3의 배수인지 먼저 체크해야 하고, 그 뒤에 짝수, 홀수를 판별.)
    int num = 3;
    String res2 = (num != 0) && (num % 3 == 0) ? "3의배수" : (num % 2 == 0) ? "짝수" : "홀수"; // "3의배수"
    System.out.println(num + "은(는) " + res2 + "입니다.");
    // 3/0 은 안되도 0/3 은 된다. 그래서 앞에 (num != 0) 을 붙여줌.
  }

}
