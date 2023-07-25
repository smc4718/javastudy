package ex04_Chair;

public class Alba extends Student {
  
  // Field
  private String work;

  // Constructor
  
  public Alba() {}
  
  public Alba(String name, String school, String work) {
    super(name, school);  // public Student(String name, String school){} 생성자가 호출.
    this.work = work;
  }

  // Method
  public String getWork() {
    return work;
  }

  public void setWork(String work) {
    this.work = work;
  }
 
  @Override
  public void info() {
    super.info();
    System.out.println("직장: " + work);
  // 부모가 가지고 있지만, 자식이 새로 만들었기 때문에 @Override.
  // 여기서의 super.info() 는 Student의 info() 메소드이다.
  }
  
}
