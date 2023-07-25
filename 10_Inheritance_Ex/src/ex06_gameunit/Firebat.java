package ex06_gameunit;

public class Firebat extends GameUnit {

  // Field
  private final int POWER = 10;
  
  // Constructor
  public Firebat(String name) {
    super(name);
  }
  
  //Method
  @Override
  public void attack(GameUnit other) {  // unit2.attack(unit1)
    System.out.println(getName() + "의 공격!");
    if(POWER >= other.getHp()) {
      other.setHp(0);
    } else {
      other.setHp(other.getHp() - POWER);
    }
  }
}
