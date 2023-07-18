package ex;

 // [ 인수를 전달하기 3 ]

import java.util.Arrays;

public class MainWrapper3 {

  public static void ex01(int[] a) {    
    //전달되는 인수가 배열타입이면, 전달받는 파라미터(매개변수)도 배열타입으로 받는다.
    System.out.println(Arrays.toString(a));   // Arrays.toString()은 배열요소 전체 출력.
    a[0] = 100;
    System.out.println("ex01의 배열 a = " + Arrays.toString(a));
  }
  
  
  public static void main(String[] args) {
    int[] a = {10, 20, 30};
    ex01(a);  // ex01(0x10000000); , {10,20,30}을 준 게 아니라 이 10,20,30의 참조값을 줬다.(이 배열은 3개의 변수로 이루어져 있기에 a[0]번지 변수만 데이터를 바꾼 것)
    System.out.println("main의 배열 a = " + Arrays.toString(a));
  // 배열 a에는 참조값(주소값)이 들어있기 때문에, 
  // 'ex01 메소드의 a' 와  '메인메소드의 a' 는 같은 주소값만 가지고 있다. 그 주소를 각자 따라가도 동일한 집(값이 있는 곳)에 도달한다.
  // 그래서 ex01에 값을 바꿔도 같은 집의 값을 바꾸는 것이기에 다른 곳에서 불러내도 바뀐 값이 나오는 것.
  // int나 double 등등 다른 모든 기본 타입(8개)은 값을 복사만 하기에 같이 안바뀌고 오로지 참조 타입만 동시에 바뀜(같은 집에서 값을 가져오기 때문에).
  // 항상 타입을 잘 확인해야함.
  }

}
