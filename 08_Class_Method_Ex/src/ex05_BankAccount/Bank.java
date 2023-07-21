package ex05_BankAccount;

public class Bank {

  // Field
  
  private String name;
  private String tel;
  
  // Constructor
  
  public Bank() {}  //이름하고 연락처가 없는 Null값 상태.
  
  public Bank(String name, String tel) {
    this.name = name;
    this.tel = tel;
  }

  
  // Setter
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setTel(String tel) {
    this.tel = tel;
  }
  
  // Getter
  
  public String getName() {
    return name;
  }
  
  public String getTel() {
    return tel;
  }
  
  // Method
   
  public void info() {
    System.out.println(name + "(" + tel + ")");
  }
  
}
