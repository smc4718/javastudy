package ex06_gameunit;

public class Marine extends GameUnit {

  // Field
  private final int POWER = 5;
  
  // Constructor
  public Marine(String name) {
    super(name);
  }
  
  // Method
  @Override
  public void attack(GameUnit other) { // unit1.attack(unit2)
    System.out.println(getName() + "의 공격!");
    if(POWER >= other.getHp()) {
      other.setHp(0);
    } else {
    other.setHp(other.getHp() - POWER);
    }
  }
}
