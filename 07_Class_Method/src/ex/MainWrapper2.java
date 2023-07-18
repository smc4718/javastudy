package ex;

//[ 인수를 전달하기 2 ]

public class MainWrapper2 {

  public static void ex01(int a, int b) {
    System.out.println(a + ", " + b);
    a++;
    b++;
    System.out.println("ex01의 a = " + a);
    System.out.println("ex01의 b = " + b);
    // 여기서 늘린 a++ 와 b++ 은 메인메소드의 a와 b일까?, ex01의 a와 b일까?
    // 답 = 인수를 전달 받은 ex01 의 a,b를 늘린다.
    // 인수를 파라미터로 넘길 때는 값을 넘기는 게 아니라, 값을 복사해서 넘긴다.
    //(메인이 가지고 있던 10,20을 ex01이 복사받아서 자기 것을 늘린 것이다.
    // 용어 = 인수 (아규먼츠)
    // 같은 말이지만 역할에 따라 이름이 달라짐( 주면-> 인수를 준다. / 받으면 -> 파라미터(매개변수)를 받는다.)
  }
  
  public static void main(String[] args) {
 
    int a = 10;
    int b = 20;
    ex01(a, b);    // 10, 20 출력
    System.out.println("main의 a = " + a);
    System.out.println("main의 b = " + b);
  }

}
