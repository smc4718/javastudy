package ex01_BankAccount;

public class MainWrapper {

  public static void main(String[] args) {
    
    try {
      BankAccount acc = new BankAccount(10000, "1234");
      BankAccount acc2 = new BankAccount(10000,"56789");
      acc.deposit(10000);
      acc2.withdrawal(5000);
      acc.transfer(acc2, 1);
      acc.inquiry();
      acc2.inquiry();
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    }   //(★중요) BankAccount 에서 try-catch 를 다 제거하고 Main에서 하나로 모았다.
  }

}
