package mycafe;

public class Makkiatto implements Coffee {

  private String name;

  public Makkiatto(String name) {
    super();
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Makkiatto [name=" + name + "]";
  }
}
