package ex02_has_a;

public class Remocon {

  private int ch;   // 0 ~ MAX_CH
  private int vol;  // 0 ~ MAX_VOL
  private final int MAX_CH  = 99;
  private final int MAX_VOL = 10;
  
  public void upCh() {
    ch++;
    if(ch == MAX_CH) {
     ch = 0;
     return;
    }
  }
  
  public void downCh() {
    ch--;
    if(ch < 0) {
      ch = MAX_CH;
      return;
    } 
  }
  
  public void upVol() {
    vol++;
    if(vol == MAX_VOL) {
      return;
    }
    vol++;
  }
  public void downVol() {
    vol--;
    if(vol == 0) {
      return;
    }
    vol--;
  }
             
  
  // Getter & Setter
  public int getCh() {
    return ch;
  }
  
  public void setCh(int ch) {
    this.ch = ch;
  }
  
  public int getVol() {
    return vol;
  }
  
  public void setVol(int vol) {
    this.vol = vol;
  }
}
