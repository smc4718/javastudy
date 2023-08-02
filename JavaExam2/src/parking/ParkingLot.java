package parking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParkingLot {

  private String name;
  private List<Car> cars = new ArrayList<Car>();
  private final int MAX = 5;
  private Scanner sc = new Scanner(System.in);
  
  public ParkingLot(String name) {
    this.name = name;
  }
  
  public void addCar() {
    if(cars.size() >= MAX) {
      System.out.println("만차입니다. 더 이상 차량 등록이 불가능합니다.");
      return;
    }
    
    System.out.println("차량번호 입력 >>>");
     String carNo = sc.next();
    System.out.println("모델 입력 >>>");
     String model = sc.next();
     
     Car car = new Car(carNo, model);
     cars.add(car);
     System.out.println("차량번호 " + carNo + "차량이 등록되었습니다.");
    
  }
  
  public void deleteCar() {
    if(cars.isEmpty()) {
      System.out.println("현재 주차장에 등록된 차량이 없습니다.");
      return;
    }
    
    System.out.println("삭제할 차량번호 입력 >>> ");
     String carNo = sc.next();
     
     for(Car car : cars) {
       if(car.getCarNo().equals(carNo)) {
           cars.remove(car);
           System.out.println("차량번호 " + carNo + " 차량이 삭제되었습니다.");
           return;
       }
     }
    System.out.println("차량번호 " + carNo + " 차량이 존재하지 않습니다.");
    }
  
  
  public void searchCar() {
    if(cars.isEmpty()) {
      System.out.println("현재 주차장에 등록된 차량이 없습니다.");
      return;
    }
    
    System.out.println("조회할 차량번호 입력 >>> ");
    String carNo = sc.next();
    
    for(Car car : cars) {
      if(car.getCarNo().equals(carNo)) {
        System.out.println("조회 결과: " + car);
        return;
      }
    }
    System.out.println("차량번호 " + carNo + " 차량이 존재하지 않습니다.");
  }
  
  public void printAllCars() {
   System.out.println(name + " 차량 목록");
   int totalCars = cars.size();
   if(totalCars == 0) {
       System.out.println("현재 주차장에 등록된 차량이 없습니다.");
     } else {
         for(int i=0; i < cars.size(); i++) {
           Car car = cars.get(i);
           System.out.println((i + 1) + "번째 차량: " + car);
         }
         if (totalCars < MAX) {
            for(int i = totalCars + 1; i <= MAX; i++) {
              System.out.println(i + "번째 차량: 없음");
            }
         }
   }
  }
  
  public void manage() {
    while(true) {
      System.out.print("1.추가 2.삭제 3.조회 4.전체조회 0.종료 >>> ");
      String choice = sc.next();
      switch(choice) {
      case "1": addCar(); break;
      case "2": deleteCar(); break;
      case "3": searchCar(); break;
      case "4": printAllCars(); break;
      case "0": System.out.println("주차관리 프로그램을 종료합니다."); return;
      default: System.out.println("존재하지 않는 메뉴입니다.");
      }
    }
  }
  
}