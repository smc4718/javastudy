package ex07_car;

public class Car {

  // Field
  private Driver driver;
  private int speed;       //속도
  private int fuel;        //연료
  private final int MAX_SPEED = 100;
  private final int MIN_SPEED = 0;
  
  // final int 고정(상수)값.
  
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
  
  
  
  // 이름에 is가 들어가면 isIsEmpty 라고 하지 않고, isEmpty 라고 한다.
  
  // Method
  
  public void engineStart() {
    if(fuel == 0) {
      System.out.println("시동이 걸리지 않았습니다.");
    } else {
      System.out.println("시동이 걸렸습니다.");
    }
  }
  
  public void drive() {
    if(fuel == 0 || driver == null)
      //driver는 참조타입이기 때문에 null값을 가짐(운전자가 없다면 null상태)
      System.out.println("자동차가 움직이지 않았습니다.");
      else {
      System.out.println("자동차가 움직입니다.");
    }
  }
  
  public void accel(int speed) {
    this.speed += speed;
    fuel--;
    if(this.speed > MAX_SPEED) {
      this.speed = MAX_SPEED;
    }     
    System.out.println("현재 속도는 " + this.speed + "입니다.");
  }
  
  public void brake(int speed) {
    this.speed -= speed;
    if(this.speed < MIN_SPEED) {
      this.speed = MIN_SPEED;
    }
    System.out.println("현재 속도는 " + this.speed + "입니다.");
  }
}
