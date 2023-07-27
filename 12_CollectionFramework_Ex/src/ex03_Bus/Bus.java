package ex03_Bus;

import java.util.ArrayList;
import java.util.List;

public class Bus {

  // seat가 많이 있다 = List<Seat>
  private List<Seat> seats;
  private final int LIMIT = 25; // 25인승
  
  public Bus() {
    seats = new ArrayList<Seat>();  // 사람이 앉지 않은 시트
    for(int cnt=0; cnt<LIMIT; cnt++) {
      seats.add(new Seat());  
    }
      // [해석] -> 만들어진 보기를 해석할 때는 각 클래스마다 new 객체가 만들어져 있는지 찾자.
      // 사람이 앉지 않은 new ArrayList 빈 좌석 공간을 만들어준다. ( String[] a = new String[25] 와 같음 )
      // 그리고 좌석 개수를 25개로 정해줌(LIMIT).
      // 위에 for문 보면 new Seat를 원래는 25번 적어야 됐는데, 그걸 for문으로 돌려준 것
      // for문 돌림으로써 실제(객체) 25개의 좌석이 생김.
       
        
  }
 
  public void getOn(int seatNo, Person person) {
    if(seatNo <= 1 || seatNo > LIMIT) {
      System.out.println("존재하지 않는 좌석번호입니다.");
      return;
    }
    if(seats.get(seatNo - 1).getPerson() != null) {
      System.out.println("이미 점유된 좌석번호입니다.");
      return;
    }
    seats.get(seatNo - 1).setPerson(person);
    System.out.println(seatNo + "번 좌석에 " + person + " 탑승했습니다.");
  }
  
  public void getOff(int seatNo, Person person) {
    if(seatNo <= 1 || seatNo > LIMIT) {
      System.out.println("존재하지 않는 좌석번호입니다.");
      return;
    }
    if(seats.get(seatNo) - 1).getPerson() == null) {
      System.out.println("해당 좌석에 착석한 사람이 없습니다.");
      return;
    }
    System.out.println(seatNo + "번 좌석에 앉은 " + seats.get(seatNo - 1).getPerson() + " 하차했습니다.");
    seats.get(seatNo - 1).setPerson(null);
  }
  
   public void info() {
     for(int i = 0; i < LIMIT; i++) {
       System.out.print((i + 1) + "번 좌석: ");
       if(seats.get(i)).getPerson() != null {
         System.out.println(seats.get(i)).getPerson());
       } else {
           System.out.println("빈 좌석");
       }
     }
   }
  
  
}
