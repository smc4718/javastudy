package ex05_BankAccount;

public class Bank {

  // Field
  
  private String bankName;
  private String bankTel;
  
  // Constructor
  
  public Bank(String bankName, String bankTel) {
    this.bankName = bankName;
    this.bankTel = bankTel;
  }
  
  
  public void info() {
    System.out.println(bankName + "(" + bankTel + ")");
  }
  
}
