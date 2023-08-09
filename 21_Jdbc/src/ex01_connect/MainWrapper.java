package ex01_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainWrapper {

  // 1. oracle.jdbc.OracleDriver 클래스
  // (오라클.jdbc패키지에 저장된 OracleDriver클래스)
  public static void ex01() {
    
    try {
      
      Class.forName("oracle.jdbc.OracleDriver");
      
    } catch (ClassNotFoundException e) {  // ClassNotFoundException : 이 클래스를 못찾겠다. (이유 : 1. 오타, 2. ojdbc가 없다.)
      System.out.println("OracleDriver 클래스가 없다.");
    } 
    
  }
  
  // 2. java.sql.Connection 객체 생성 (DB 접속 생성)
  // (자바.sql패키지에 있는 커넥션)
  public static void ex02() {
    
    // 접속 정보
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    // (thin : 가벼운 버젼, Lite버젼)
    String user = "GD";
    String password = "1111";
    
    Connection con = null;
    
    try {
      // DriverManager 로 연결을 할 수 있다.
      con = DriverManager.getConnection(url, user, password);
      System.out.println("DB 접속 성공");
    } catch (SQLException e) { // DB 접속 실패시 예외 발생.
      System.out.println("DB 접속 실패");
    } finally {
    // Connection 객체 닫기
      try {
      if(con != null) con.close();  // 사용 후에는 DB 접속 닫기.
    } catch (SQLException e) {
      System.out.println("DB 접속 닫기 실패");
    }
  }
  }
  
  // 3. 접속 정보를 별도의 파일(프로퍼티 파일)에 저장(.gitIgnore 대비)
  // (깃에 접속 정보가 올라가서 유출되는 것을 방지하기 위함)
  public static void main(String[] args) {
    ex01();
    ex02();
  }

}
