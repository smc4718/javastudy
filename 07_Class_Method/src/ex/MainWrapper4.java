package ex;

// [ 리턴(반환) ]

public class MainWrapper4 {

  // void : 리턴이 없다.(이 메소드를 호출해도 이 메소드가 나한테 주는 건 없다.라는 뜻)
  public static void ex01() {
    
    System.out.println("리턴이 없는 ex01");
    
  }
  
  // int : 리턴이 int 타입이다.
  public static int ex02() {
    return 100;
  // ex02() 를 호출하면 100을 준다.
  }
  
  public static String ex03() {   // <-- ex03(이곳은 인수전달 받을 때 씀) 
    return "Hello world";         // 리턴값 만들어줄 때는 return에만 전달해줄 값 씀.
  }
  
  public static void main(String[] args) {
   ex01(); // --> 호출할 때 리턴으로 받는 리턴값이 있어야 한다.
   int n = ex02();  // 실제로 실행 후에는 ex02()가 없어지고 이 자리에 100; 으로 리턴(반환) 받아서 바뀐다.
// int n = 100;
// 리턴 받는 값을 받을 수 있도록 int n 변수를 만들어줌.
   System.out.println(n);

// 사용법 2
   System.out.println(ex02());  // System.out.println(100);
   
// 사용법 3 . 이렇게도 호출해서 사용가능.
   if(ex02() > 0) {
     System.out.println("양수");
   } else {
     System.out.println("음수");
   }
   
   String str = ex03();
   System.out.println(str);  // Hello world
   
  }

}
//받아오는 건 return(반환)이라고 함.
