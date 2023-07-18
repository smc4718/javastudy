package ex;

//[ 인수를 전달하기 1 ]

public class MainWrapper {

  public static void ex01() {
    System.out.println("파라미터가 없는 ex01");
    
  }
  
  public static void ex01(String str) { // 파라미터 String str : 인수를 받아서 저장하는 변수[매개변수]
    System.out.println("파라미터 String str = " + str);
  }
  
  public static void ex01(int a, int b) {  // 파라미터 int a,  파라미터 int b가 생김.
    System.out.println("파라미터 int a = " + a);
    System.out.println("파라미터 int b = " + b);
    
  }
  
  public static void main(String[] args) {
    ex01(); // ex01() 메소드에 전달하는 인수가 없다.
    ex01("hello world"); // ex01 메소드에 인수 "hello world"를 전달한다.
    ex01(10, 20);  // ex01() 메소드에 인수 10, 20을 전달한다.
  }
//★★메소드로 값을 전달할 때 인수를 전달한다고 함. 전달받는 건 파라미터 혹은 매개변수가 받는다.
// (메인메소드에서)전달해줌 : 인수(아규먼츠)를 전달.  만든 클래스에서 전달받음 : 파라미터, 매개변수를 받았다고 함.
//메소드 오버로딩 : 같은 이름을 가진 메소드를 여러 개 만들어도 된다. 하지만 파라미터는 반드시 달라야 한다.
//(대표적으로 println 이 있다.
}
