package ex02_computer;

public class Notebook extends Computer {

  private int battery;
  
  // 부모 클래스의 생성자를 쓰려면, 자식 클래스에서 부모 클래스에서 쓸 파라미터를 같이 적어준다.
  public Notebook(String model, int battery) {
    super(model);
    this.battery = battery;
  // super를 가장 먼저 첫 줄에 써야한다. (안 지키면 Err)
  }
  
  // Getter & Setter
  public int getBattery() {
    return battery;
  }
  
  public void setBattery(int battery) {
    this.battery = battery;
  }
  
}
