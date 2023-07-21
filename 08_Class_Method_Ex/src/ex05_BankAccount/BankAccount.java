package ex05_BankAccount;

public class BankAccount {

  // Field
  public Bank   bank;      // 은행
  public String accNo;     // 계좌번호
  public long   balance;   // 통장잔액
  
  // Constructor
  public BankAccount() {}
  public BankAccount(Bank bank, String accNo, long balance) {
    this.bank    = bank;
    this.accNo   = accNo;
    this.balance = balance;
  }
  
  
  
  // Setter
  public void setBank(Bank bank) {
    this.bank = bank;
  }
  
  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }
  
  public void setBalance(long balance) {
    this.balance = balance;
  }
  
  // Getter
  public Bank getBank() {
    return bank;
  }
  
  public String getAccNo() {
    return accNo;
  }
  
  public long getBalance() {
    return balance;
  }
    
  // Method  
  public void info() {
    System.out.println("-------------------------");
    System.out.println("계좌번호: " + accNo + "통장잔액: " + balance + "원" );    
    System.out.print("개설지점: ");
    bank.info();
    System.out.println("-------------------------");
  } 
  
  // 입금 메소드
  public void deposit(long money) {
    if(money <= 0) {
      return;
    }
    balance += money;
  }
  
  // 출금 메소드
  public long withdrawal(long money) {
    long retVal = 0;    // return Value = 반환값
    if(money > 0 && money <= balance) {
      balance -= money;
      retVal = money;
    }
    return retVal;
  }

  // 이체 메소드
  public void transfer(BankAccount acc, long money) {
    acc.deposit(withdrawal(money));
    //통장에서 실제 출금된 금액만큼 상대 계좌에 입금해주겠다.
  }
}
