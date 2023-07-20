package ex07_constructor;

/*
 *  생성자(constructor)
 *  1. 객체를 생성할 때 사용하는 메소드이다.
 *  2. new 키워드 이후에 호출된다.
 *  3. 특징
 *     1) 생성자도 메소드이다.
 *     2) 생성자의 이름은 클래스의 이름과 같다. 바꿀 수 없다.
 *     3) 반환(return)이 존재하지 않는다, 
 *     반환(return)이 없다는 의미의 void가 아니라 반환(return)이라는 개념 자체가 없다.
 *     4) 파라미터는 일반 메소드와 동일하게 사용할 수 있다, 
 *     메소드 오버로딩(overloading)이 가능하다.(생성자를 여러 개 만들 수 있다.)
 *     5) 생성자를 안 만들면 Java가 '디폴트 생성자'가 사용된다. 
 */

/*
 * 디폴트 생성자(default constructor)
 * 1. 개발자가 생성자를 하나도 만들지 않는다면 Java가 자동으로 만드는 생성자이다.  
 * 2. 파라미터가 없고, 본문이 비어 있다. (이름만 있는 메소드)
 * 3. 기본 필드값(0, 0.0, false, null)을 가진 객체를 생성할 때 사용한다.
 *    => 이전까지는 setter를 통해 필드값을 바꿔주었었다. 생성자를 통해 값을 지정해준다면, setter를 만들지 않아도 됨.
 */
//자바한테 생성자를 만들게 할 거면, 생성자를 단 하나도 만들어서는 안 된다.

public class Computer {

  private String model;
  
  //일반적으로 필드 다음이 생성자 자리이다.
  // 생성자
  public Computer() {
    System.out.println("Computer() 생성자가 호출되었다.");
  }
  
  public Computer(String model) {
    System.out.println("Computer(String model) 생성자가 호출되었다.");
    this.model = model;
  }
  
  
  
  // Setter (외부에서 model 이름을 받아와서 필드값에 저장시켜주는 역할을 합니다.)
  public void setModel(String model) {
    this.model = model;
   // setter 는 파라미터 이름이 필드명과 같으니 this. 로 구분해주는 것. 
   
  }
  
  
  // Getter ( model 값을 밖으로 빼주는 역할을 함 )
  public String getModel() {
    return model;
    // getter 는 파라미터 이름이 없으니 this. 가 필요 없다.
  }
}
