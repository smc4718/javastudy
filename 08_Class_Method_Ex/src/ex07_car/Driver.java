package ex07_car;

import javax.management.monitor.MonitorSettingException;

public class Driver {

  // Field
  private String  name;
  private int     career;
  private boolean bestDriver;
  
  
  // Constructor
  
  
  // Setter
  public void setName(String name) {
    this.name = name;
  }
  
  //경력에 따라 bestDriver 인지 결정하는 구문.
  public void setCareer(int career) {
    this.career = career;
    setBestDriver(career >= 10);
   // career 인수가 setBestDriver로 전달되고, 그 값에 따라 아래 boolean값에 들어가서 true,false 값이 나옴.
  }
  
  public void setBestDriver(boolean bestDriver) {
    this.bestDriver = bestDriver;  // 기준 career가 10년 이상이면 true
  }
  
  // Getter
  public String getName() {
    return name;
  }
  
  public int getCareer() {
    return career;
  }
  
  private boolean isBestDriver() {
    return bestDriver;
  }
  // ★ boolean 타입은 getter의 이름규칙이 다르다.
  // ★ ' get' 이 아닌 ' is ' 로 적어줘야 한다. 
  
  
  // Method

 }
