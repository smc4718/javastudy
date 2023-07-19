package ex02_return;

import java.util.Arrays;

public class MainWrapper1 {
  
  /*
   * 반환(return)
   * 1. 메소드의 실행 결과 값을 의미한다.
   * 2. 반환값이 없을 때 void 키워드를 작성하고, 반환값이 있는 경우에는 반환값의 타입을 작성한다.
   */

  
  public static void main(String[] args) {
    System.out.println(getName());
    System.out.println(getAge());
    System.out.println(isAlive());
    System.out.println(Arrays.toString(getHobbies()));
  }
  
  // boolean 타입 반환
  public static boolean isAlive() {
    boolean isAlive = getAge() <= 100;
    return isAlive;
  }
  
  // int 타입 반환
  public static int getAge() {
    int age = 500;
    return age;
  }
  
  // 문자열 타입 반환
  public static String getName() {
    String name ="홍길동";
    return name; // 메소드를 호출한 곳으로 반환한다.
  // return 에 바로 값을 넣어 반환해도 되고, 변수를 만들고 변수이름으로 반환해도 된다.
    
  }
  
  // 문자열 배열 타입 반환
  public static String[] getHobbies() {
    String[] hobbies = {"스카이다이빙", "클라이밍", "국궁"};
    return hobbies;
    // 배열타입 반환이면, 배열 만들어서 반환하면 된다.
 } 
}












