package ex08_static;

public class MainWrapper {

  public static void main(String[] args) {
    
    // 반지름
    double radius = 1.0;
    
    // 원 넓이 구하기
    double circleArea = MyMath.getCircleArea(radius);
        // static 이 붙어 있는 애들은 클래스로 부른다.
    System.out.println(circleArea);
  }

}
