package ex05_cup;

public class Cup {

  // Field
  private Coffee coffee;  // Cup에는 Coffee를 담을 수 있다.
  
  
  // Method
  public Coffee getCoffee() {
    return coffee;
  }
  
  public void setCoffee(Coffee coffee) {
    this.coffee = coffee;
  }
}

