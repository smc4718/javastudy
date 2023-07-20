package ex02_watch;

public class MainWrapper {

  public static void main(String[] args) {
   
    // Watch 객체 선언 & 생성
    Watch watch = new Watch();
    
    // Watch 객체에 시, 분, 초 정보 설정하기
    watch.addHour(9);
    watch.addMinute(40);
    watch.addSecond(30);
    
    // Watch 객체에 시, 분, 초 증가시키기
    watch.addHour(25);      // 1일   1시간
    watch.addMinute(61);    // 1시간 1분
    watch.addSecond(3661);  // 1시간 1분 1초
    
    //시, 분, 초 확인하기
    System.out.println("시: " + watch.getHour());    // 12 시
    System.out.println("분: " + watch.getMinute());  // 42 분
    System.out.println("초: " + watch.getSecond());  // 31 초

  }

}
