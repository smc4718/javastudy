package ex07_constructor;


public class MainWrapper {

  
  public static void main(String[] args) {
    
    // Computer myCom 객체 선언
    Computer myCom;
    
    // Computer myCom 객체 생성
    myCom = new Computer(); // public Computer(){} 생성자가 호출된다.
    
    myCom.setModel("gram");
    System.out.println("myCom:" + myCom.getModel());
    
    
    // Computer yourCom 객체 선언
    Computer yourCom;
    
    // Computer yourCo  객체 생성
    yourCom = new Computer("macbook");  // public Computer(String model){} 생성자가 호출된다. 
    
    System.out.println("yourCom: " + yourCom.getModel());
    
    // 객체 생성 방법 : 2가지  = 1.아무 필드 값이 없는 생성자 (setter로 값을 받아와서 채워줘야 함)
                              // 2.애초에 필드값을 채운 상태로 생성자가 만들어져서 setter 가 필요 없다.
     
                           
  }

}
