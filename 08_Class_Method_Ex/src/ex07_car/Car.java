package ex07_car;

public class Car {

  // Field
  private Driver driver;
  private int speed;       //속도
  private int fuel;        //연료
  private boolean isEmpty; //기름 없다.
  
  // Constructor

  
  // Setter
  public void setDriver(Driver driver) {
    this.driver = driver;
  }
  
  public void setSpeed(int speed) {
    this.speed = speed;
  }
  
  public void setFuel(int fuel) {
    this.fuel = fuel;
  }
  
  public void setEmpty(boolean isEmpty) {
    this.isEmpty = isEmpty;
  }
  // 이름을 setIsEmpty 가 아닌, setEmpty 로 한다.
  
  // Getter
  public Driver getDriver() {
    return driver;
  }
  
  public int getSpeed() {
    return speed;
  }
  
  public int getFuel() {
    return fuel;
  }
  
  public boolean isEmpty() {
    return isEmpty;
  }
  // 이름에 is가 들어가면 isIsEmpty 라고 하지 않고, isEmpty 라고 한다.
  
  // Method
}
