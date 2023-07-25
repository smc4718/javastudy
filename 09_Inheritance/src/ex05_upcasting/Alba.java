package ex05_upcasting;

// 학교 다니는 알바생

public class Alba extends Student {

  // Field
  private String work;
  
  // Constructor
    // new Alba()
    public Alba() {
      // super(); <-- 없어도 그만, 있어도 그만. Java가 자동 호출.
    }
  
    // new Alba("홍길동", "가산대학교", "투썸)
    public Alba(String name, String school, String work) {
      super(name, school);  // Alba 입장에서 슈퍼는 Person이 아닌 Student 이다.
    this.work = work;
    }
    
  // Getter & Setter
    //생성자에서 파라미터 쓰는데 Getter, Setter 쓰는 이유는
    //메소드들을 호출 하기 위함이다.
    public String getWork() {
      return work;
    }

    public void setWork(String work) {
      this.work = work;
    }
    
  // Method
    @Override
    public void working() {
      System.out.println("일함");
    }
    
    @Override
    public void info() {
      System.out.println("이름: " + getName());
      System.out.println("학교: " + getSchool());
      System.out.println("직장: " + work);
      // 이름과 학교는 슈퍼클래스에서 가져오니 get으로 가져와줌.
      // 직장은 자기가 필드값으로 가지고 있으니 바로 적어줌.
      // @Overrid 자동완성 : @Ov + Ctrl + Space
    }
    
    
}
