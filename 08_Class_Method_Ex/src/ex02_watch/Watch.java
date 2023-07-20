package ex02_watch;

/**
 * 시, 분, 초 정보를 가지고 있는 시계 클라스
 * addHour, addMinute, addSecond 메소드를 이용해서 시, 분, 초를 조작할 수 있다.
 * @author  홍길동
 * @since   2023.07.20
 * @version 1.0
 */

public class Watch {
  
  
  /**
   * 시간 정보를 저장하는 필드로 0 ~ 23 사이 값을 가진다.
   */
  private int hour;
  
  /**
   * 분 정보를 저장하는 필드로 0 ~ 59 사이 값을 가진다.
   */
  private int minute;
  
  /**
   * 초 정보를 저장하는 필드로 0 ~ 59 사이 값을 가진다.
   */
  private int second;
 

  // Setter
  public void setHour(int hour) {
    this.hour = hour;
  }
  
  public void setMinute(int minute) {
    this.minute = minute;
  }
  
  public void setSecond(int second) {
    this.second = second;
  }
  
  // Getter
  
  public int getHour() {
    return hour;
  }
  
  public int getMinute() {
    return minute;
  }
  
  public int getSecond() {
    return second;
  }
  //setter getter 탄생 이유 : 필드에 private 값이 값을 바로 안 받고 게터 세터에 전달받아와야 하기 때문.
  
  /**
   * 필드 hour에 파라미터 param을 더하는 메소드<br>
   * 필드 hour값은 0 ~ 23 사이의 값을 가질 수 있도록 처리해야 한다.<br>
   * 파라미터 값이 0보다 작거나 같으면 처리하지 않는다.
   * @param param 증가시킬 시간 정보
   */
  public void addHour(int param) {
    if(param <= 0) {
      return; //메소드를 종료하겠다.(void에서만 사용가능),반환값 없음.
    }
    hour += param;
    hour %= 24;   // 몫이 1이 되면, 하루가 지난 것. 나머지는 현재 시간.
  
  }
  
  /**
   * 필드 minute에 파라미터 param을 더하는 메소드<br>
   * 필드 minute값은 0 ~ 59 사이의 값을 가질 수 있도록 처리해야 한다.<br>
   * 필드 minute값이 60보다 크거나 같으면 필드 hour값도 증가시켜야 한다.
   * @param param 증가시킬 분 정보
   */
  public void addMinute(int param) {
    if(param <= 0) {
      return;
    }
    minute += param;
    addHour(minute / 60);     //60으로 나눈 몫을 addHour에게 전달해준다, addHour(파라미터)로 보내주는 것.
    minute %= 60;
  }
  
  /**
   * 필드 second에 파라미터 param을 더하는 메소드<br>
   * 필드 second값은 0 ~ 59 사이의 값을 가질 수 있도록 처리해야 한다.<br>
   * 필드 second값이 60보다 크거나 같으면 필드 minute값도 증가시켜야 한다.
   * @param param 증가시킬 초 정보
   */
  public void addSecond(int param) {
    if(param <= 0) {
      return;
    }
    second += param;
    addMinute(second / 60);    //60으로 나눈 몫을 addMinute에게 전달해준다, addMinute(파라미터)로 보내주는 것.
    second %= 60;
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
}
