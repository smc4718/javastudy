package ex02_Insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import connect.DB_Connect;
import dto.UserDto;

public class MainWrapper {

  public static void main(String[] args) {
    
    // User 정보 입력
    Scanner sc = new Scanner(System.in);
    System.out.print("USER_ID >>> ");
    String user_id = sc.next();
    sc.nextLine();
    System.out.print("USER_NAME >>> ");
    String user_name = sc.nextLine();
    sc.close();  // 정보입력하고 Scanner 닫기.
    
    // UserDto 객체 생성
    UserDto user = new UserDto();
    user.setUser_id(user_id);
    user.setUser_name(user_name);
    
    // Connection 객체 선언 (Connection : DB 접속할 때 씀)
    Connection con = null;
    
    // PreparedStatement 객체 선언 (PreparedStatement : '구문(쿼리문)을 미리준비하라'라는 뜻. 쿼리문 실행할 때 씀.)
    PreparedStatement ps = null;
    
    try {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
      
      // Connection 객체 생성 (DB_Connect 클래스의 getConnection 메소드로부터 받아오기)
      // DB_Connect 를 자동완성으로 추가하고 .getConnection() 메소드 불러오기.
      // new DB_Connect 없이 호출하기 위해 DB_Connect클래스에서 static 으로 만들어뒀었음. 
      con = DB_Connect.getConnection();
    
      // PreparedStatement 객체 생성 전.
      // 쿼리문을 미리 준비해놓고 PreparedStatement 객체를 생성해라.
      // 쿼리문 (한 줄로 다 적어도되지만 길어지니 나눠서 적음)
      // 입력받을 변수가 들어갈 자리는 '?' 를 적어주는 것이 약속이다.
      // 현재 날짜-시간 함수는 오라클에서 SYSDATE .
      // 쿼리문 작성시에는 끝에 세미콜론(;) 작성 금지  - 구문 Err .
      String sql = "";
      sql += "INSERT INTO USER_T (USER_NO, USER_ID, USER_NAME, JOINED_AT) ";
      sql += "VALUES(USER_SEQ.NEXTVAL, ?, ?, SYSDATE)";
          
      // PreparedStatement 객체 생성.
      ps = con.prepareStatement(sql);
      
      // 쿼리문에 변수 넣기 (아이디,네임은 문자열이기 때문에 setString 을 씀.)
      ps.setString(1, user.getUser_id());   // 1번째 물음표에 user.getUser_id()  넣어라.
      ps.setString(2, user.getUser_name()); // 2번째 물음표에 user.getUser_nam() 넣어라.
      
      // 쿼리문 실행 : insert 된 행의 개수가 반환된다.
      int insertResult = ps.executeUpdate();
      
      // 결과
      System.out.println(insertResult + "개의 행이 삽입되었습니다.");
      
      // 커밋은 어떻게 할까? : 기본적으로 오토커밋이 잡혀있기 때문에 안합니다.
      // con.setAutoCommit(true);  <- 기본값으로 사용되고 있다.

    }catch (Exception e) {
     e.printStackTrace();
    } finally {
      try {
        if(ps != null) {ps.close();}
        if(con != null) {con.close();}
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
  }

}
