package ex08_bakery;

public class BreadChange {

  // Field
  private int bread;  // 판매한 빵이 몇 개인가?
  private int change; // 잔돈이 얼마인가?
  
  // Constructor
  public BreadChange(int bread, int change) {
    this.bread  = bread;
    this.change = change;
  }
  
  // Getter
  
  public int getBread() {
    return bread;
  }
  
  public int getChange() {
    return change;
  }
  
  // Setter
  
  public void setBread(int bread) {
    this.bread = bread;
  }
  
  public void setChange(int change) {
    this.change = change;
  }
  
}
