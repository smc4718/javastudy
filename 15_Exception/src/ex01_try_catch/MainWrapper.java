package ex01_try_catch;

import java.net.URL;
import java.util.Scanner;

public class MainWrapper {

  public static void ex01() {
    
    try {
      String name = "tom";
      Integer.parseInt(name); // 발생한 NumberFormatException을 catch 블록으로 던진다.(throw라고 부름)
    } catch(NumberFormatException e) {  // RuntimeException, Exception 가능
      //예외 객체 이름은 일반적으로 'e'로 부름.
      System.out.println("예외발생");
    }
    
   
  }
  
  public static void ex02() {
    
    try {
      // Scanner 는 import 필수.
      Scanner sc = new Scanner(System.in);
      System.out.println("덧셈식을 입력하세요(예 : 1+2)");
      String expr = sc.next();              // split은 배열로 만들어줌.
      String[] numbers = expr.split("[+]"); // numbers = {"1", "2"}    // 대괄호[] 를 써주면 정규식이 아닌 문자로 인식한다. 
      int number1 = Integer.parseInt(numbers[0]);
      int number2 = Integer.parseInt(numbers[1]);
      System.out.println(number1 + number2);
      sc.close();
    } catch(NumberFormatException e) {
      System.out.println("정수 연산만 가능합니다.");
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("덧셈식에 +를 포함해서 입력하세요.");
    } catch(Exception e) {  // NumberFormatException 과 ArrayIndexOutOfBoundsException 으로 처리못하는 예외를 마지막 Exception이 담당한다.
      System.out.println("알 수 없는 예외가 발생했습니다.");
    }
      // catch 여러 개 만드는 이유는 사용자에게 안내하기 위해서이다.
  }
    
  public static void ex03() {
    
    // 반드시 try - catch가 필요한 예외를 Checked Exception이라고 한다.
    
    try {
      URL url = new URL("https://www.naver.com");
  } catch(Exception e) {
    System.out.println("예외 발생");
  // 예외 종류를 공부하는 건 쓸데없음 ( 다 Exception 으로 받으면 됨 )
    }
  }
  public static void main(String[] args) {
    ex02();

  }

}
