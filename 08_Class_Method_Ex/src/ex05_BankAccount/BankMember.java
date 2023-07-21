package ex05_BankAccount;

public class BankMember {

  private String name;
  private BankAccount acc;
  
  public BankMember() {}
  
  public BankMember(String name, BankAccount acc) {
    this.name = name;
    this.acc = acc;
  }
  
  // Setter
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setAcc(BankAccount acc) {
    this.acc = acc;
  }
  
  // Getter
  
  public String getName() {
    return name;
  }
  
  public BankAccount getAcc() {
    return acc;
  }
  
  // Method
  
  public void info() {
    System.out.println("고객명: " + name);
    acc.info();
  }
  
  
  // BankAccount 클래스의 입금,출금 정보를 가져와서 씀.
  // 입금 메소드
  public void deposit(long money) {
    acc.deposit(money);
    // 돈을 입금하기 때문에 반환이 없다.
  }
  
  // 출금 메소드
  public long withdrawal(long money) {
    return acc.withdrawal(money);
    // 돈을 꺼내서 주기 때문에 long반환타입이 있음.
  }
  
  // 이체 메소드
  public void transfer(BankMember member, long money) {
    member.deposit(withdrawal(money));
    // 통장에서 돈을 출금 -> 입금.
  }
  
}