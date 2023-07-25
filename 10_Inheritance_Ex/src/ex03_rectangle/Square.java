package ex03_rectangle;

// 정사각형은 사각형(Rectangle)이다.
// 슈퍼 클래스에서 모두 가져다 쓸 수 있는 상황.

public class Square extends Rectangle {
  
  // Field
  // 슈퍼 클래스인 Rectangle에 필요한 정보가 다 있기 때문에,
  // Square 에서는 필드 값이 없다.
  
  // Constructor
    // new Square()
    public Square() {
      super();
    }
    // new Square(6)
      public Square(int width) {
        super(width, width); // new Rectangle(6, 6)
      // 정사각형은 너비 높이가 같으니, 
      // height까지 둘 다 쓸 필요 없이,
      // 값을 width 너비 하나만 가지고 위처럼 두 가지 값을 가지게 하면 된다.
      }
      
}
