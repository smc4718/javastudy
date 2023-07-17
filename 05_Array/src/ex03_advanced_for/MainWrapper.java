package ex03_advanced_for;

import java.util.Arrays;

// advanced-for문 : 향상된 for문 (사용법이 쉬운 for문) = 인덱스 명시가 없는 for문

public class MainWrapper {

  // 1차원 배열의 advanced-for문
  public static void ex01() {
    
    // 1차원 배열의 초기화
    int[] a = {10, 20, 30};
    
    //advanced-for
   // for(배열요소를 저장할 변수 : 배열명)     //배열요소 : 배열에 저장된 각각의 변수.
    for(int number : a) {
      System.out.println(number);
   //배열 a의 모든 배열요소들을 순차적으로 알아서 number로 넘기시오.
   //(인덱스 명시가 없는 향상된 for문)
    }
  }


  // advanced-for문을 사용하지 못하는 대표적인 경우 : 배열요소의 값이 변하는 경우
    public static void ex02() {
    
    // 1차원 배열 초기화
       int[] a = {10, 20, 30};
    
    // 모든 배열요소를 1씩 증가시키기 - 1 : advanced-for문 (불가능함)
    // for(int number : a) {
    // number++;
    // }
      
    //배열요소 확인
     // System.out.println(Arrays.toString(a));   // [11, 21, 31]
     //배열의 요소를 number라는 변수로 복사해와서 number를 늘린 것이지 a라는 배열변수 값이 바뀌는 것이 아님. 
     //그래서 배열의 요소의 값을 변하게 할 때는 불가능하다.
    // }
    
    // 모든 배열요소를 1씩 증가시키기 - 2 : 일반 for문 (가능)
      for(int i=0; i<a.length; i++) {
        a[i]++;
      }
    //배열요소 확인
      System.out.println(Arrays.toString(a));   // [11, 21, 31]
    }
    
    // 2차원 배열의 advanced-for문
    public static void ex03() {
      
      // 2차원 배열의 초기화  (웹개발에서 2차원배열을 사용할 일은 거의 없다.웹개발에선 중요하지 않다. 오늘 이후로 볼 일 없다.)
      int[][] a = {         //(2차원 배열은 '게임'에서 필수로 사용.)
          {10, 20},
          {30, 40},
          {50, 60}
      };
      
      // advanced-for
      //for(배열요소 : 배열) {
      // }  // 배열의 모든 요소를 배열요소로 복사해서 보내라.
        for(int[] b : a) {   // a의 첫 번째 요소는 1차원배열이기에 1차원으로 int[]로 잡아준 것.
          for(int number : b) {
            System.out.print(String.format("%4d", number));
          }
          System.out.println();
        }
      
    }
    
public static void main(String[] args) {
  //ex01();
  //ex02();
  ex03();
 }
}
  
