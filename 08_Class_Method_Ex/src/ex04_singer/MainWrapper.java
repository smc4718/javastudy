package ex04_singer;

public class MainWrapper {

  public static void main(String[] args) {
   
    Song song = new Song();
    
    song.setTitle("모든 날 모든 순간");
    song.setGenre("발라드");
    song.setPlayTime(3.5);
    
    song.info();  // 제목: ㅌ, 장르: ㅌ, 재생시간: 3.5분
   
    Singer singer = new Singer();
    
    singer.setName("김흥국");
    singer.setTitleSong(song);
    
    singer.info(); // 이름: 김흥국
                    // 제목: 호랑나비, 장르: 댄스, 재생시간: 3.5분
    
    
  }

}