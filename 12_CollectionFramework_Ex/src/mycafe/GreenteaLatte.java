package mycafe;

public class GreenteaLatte implements Coffee {

  private String name;

  public GreenteaLatte(String name) {
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
    return "GreenteaLatte [name=" + name + "]";
  }
}
