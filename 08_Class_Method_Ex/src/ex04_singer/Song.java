package ex04_singer;

public class Song {

  // Field (속성)   - private 사용 필수.
  private String title;
  
  private String genre;
  
  private double playtime;
  
  
  // Setter
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public void setGenre(String genre) {
    this.genre = genre;
  }
  
  public void setPlayTime(double playtime) {
    this.playtime = playtime;
    
  }
  
//Getter
  
  public String getTitle() {
    return title;
  }
 
  public String getGenre() {
    return genre;
  }
 
  public double getplaytime() {
    return playtime;
  }
  
  
  
  // Method (기능, 동작)
  
  public void info() {
   System.out.println("제목: " + title + " 장르: " + genre + " 재생시간: " + playtime + "분");
  } 
}
