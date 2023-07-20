package ex04_singer;

public class Singer {

  // Field (속성)
  private String name;
  private Song titleSong;
 //클래스 자체가 타입이 되니까 다른 클래스를 불러올 때 타입으로 필드에 사용 가능.
  
  // Setter
  public void setName(String name) {
    this.name = name;
  }
  
  public void setTitleSong(Song titleSong) {
    this.titleSong = titleSong;
  }
  
  // Method (기능, 동작)
  public void info() {
    System.out.println("이름: " + name);
    titleSong.info();
   //titleSong 에 Song 클래스가 들어있으니까 
   //Song클래스의 info를 불러오기 위해 titleSong.info(); 를 해주면 된다.
  }
  
  
}
