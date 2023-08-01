package ex04_Library;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Library {

  private List<Book> books;   // 선언
  private Scanner sc;         // 선언
  
  // new Library()
  public Library() {
    books = new ArrayList<Book>();  // 생성
    sc = new Scanner(System.in);    // 생성
  }

  /**
   * 등록<br>
   */
  private void addBook() throws InputMismatchException {
    System.out.println("=== 등록 ===");
    System.out.println("책 제목 입력");
    String title = sc.next(); // next();는 '어린 왕자' 공백 뒷글자는 못읽음. 공백포함이면 nextLine();
    System.out.println("책 가격 입력");
    int price = sc.nextInt();
    // books 리스트에 추가
  
    books.add(new Book(title, price));
    System.out.println(title + " 책이 등록되었습니다.");
  }
  
  /**
   * 삭제<br>
   */
  private void deleteBook() {
    
  }
  
  /**
   * 수정<br>
   */
  private void modifyBook() {
    
  }
  
  /**
   * 조회<br>
   */
  private void queryBook() {
    
  }
  
  /**
   * 전체조회<br>
   */
  private void queryAllBook() throws RuntimeException {
    System.out.println("=== 전체조회 ===");
    int size = books.size();
    System.out.println("전체 보유 도서 수: " + size + "권");
    if(books.isEmpty()) {
    throw new RuntimeException("도서관에 등록된 책이 없습니다.");
    } // isEmpty() = "비어있다" 는 메소드.
    for(int i = 0; i < size; i++) {
      System.out.println((i + 1) + "번째 도서: " + books.get(i));
    }                                     // Book클래스에 만들어둔 toString의 오버라이드 값이 books.get(i); 이다. (책 한 권)
  }
  
  /**
   * 운영<br>
   */
  public void manage() {
    
    // 사용자가 종료 명령을 내릴 때까지 프로그램은 종료되지 않는다.
    while(true) {
      
      try {
      
        System.out.println("1.등록 2.삭제 3.수정 4.조회 5.전체조회 0.종료");
        String choice = sc.next();
        // sc.next(); 는 String 타입으로 받아준다.
        
        switch(choice) {
        case "1":  addBook();      break;
        case "2":  deleteBook();   break;
        case "3":  modifyBook();   break;
        case "4":  queryBook();    break;
        case "5":  queryAllBook(); break;
        case "0":  System.out.println("도서관리프로그램을 종료합니다."); return;
        default :   System.out.println("잘못된 입력입니다. 다시 시도하세요.");
          // switch는 끝나고 while문이 돌기 때문에 종료 안됨.
          // 반환 없는 return은 메소드의 실행 중지를 의미한다.
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    
  } // while(true) 무한루프 끝나는 지점.
  
 } // manage()
}
