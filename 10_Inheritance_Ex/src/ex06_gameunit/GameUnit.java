package ex06_gameunit;

public class GameUnit {

  // Field
  private String name;
  private int hp;
  private boolean alive;
  
  // Constructor
    // new GameUnit("마린")
    public GameUnit(String name) {
      this.name = name;
    }
  

  //Method
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
    setAlive(hp > 0);
  }

  public boolean isAlive() {
    return alive;
  }

  private void setAlive(boolean alive) {
    this.alive = alive;
  }
  
  // Method
  // 호출을 위한 attack 메소드는 실행되서는 안 된다.
  public void attack(GameUnit other) { 
  }
  
}
