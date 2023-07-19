package ex01_BankAccount;

public class MainWrapper {

  public static void main(String[] args) {
    
    // BalanceAccount 객체 선언 & 생성
    BankAccount acc = new BankAccount();
    
    // BankAccount 객체에 계좌번호 등록하기
    acc.setAccNo("012-345-67-8910");
    
    // BankAccount 객체에 입금하기
    acc.deposit(50000);
    
    // BankAccount 객체에서 출금하기
    acc.withdrawal(10000);
    
    
    // BankAccount 객체 조회하기
    acc.inquiry();
    
    // BankAccount you 객체 선언 & 생성
    BankAccount you = new BankAccount();
    
    // you 객체에 계좌번호 등록하기
    you.setAccNo("002-111-1514-131");
    
    // 내가 너에게 30000원을 이체하겠다.
    my.transfer(you, 30000);
    
    // my 객체 조회하기
    my.inquiry();  // 통장잔액 : 19999원
    you.inquiry(); // 통장잔액 : 30000원
  }

}













