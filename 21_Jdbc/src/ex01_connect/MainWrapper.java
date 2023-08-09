package ex01_connect;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MainWrapper {
  
  /*
   * ex01 ~ 03 건너뛰고 파이널버젼만 공부하면 됨.
   */

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
  //    1). gitIgnore 파일에 db.properties 목록 추가하기
  //    2). git push origin main
  //    3). db.properties 파일 만들기
  public static void ex03() {
    
    // 문자 기반 입력스트림 선언
    BufferedReader reader = null;
    
    try {
      
      // 입력스트림 생성
      reader = new BufferedReader(new FileReader("src/db.properties"));
      
      // 프로퍼티파일 -> 프로퍼티객체 (자바에서 프로퍼티 파일을 읽어서 프로퍼티 객체로 바꿀 수 있게 해놓음)
      Properties properties = new Properties();
      properties.load(reader); // Stream 으로 등록시켜주면 프로퍼티 객체가 완성 된다.
      
      // 프로퍼티객체의 프로퍼티 가져오기 (property : 소유)
      String url = properties.getProperty("url"); // 소유한 url get으로 가져오기.
      String user = properties.getProperty("user");
      String password = properties.getProperty("password");
      
      // 확인
      System.out.println(url);
      System.out.println(user);
      System.out.println(password);
      
    } catch (IOException e) {
      System.out.println("파일 읽기 실패");
    } finally {
      try {
        if(reader != null) {
          reader.close();
        }
      }catch (IOException e) {
        e.printStackTrace();
      }
    }
    
  }
  
  // 4. 파이널 버전 (ex 1,2,3 합친 버젼)
  //    Connection 객체를 만들어서 반환하는 getConnection() 메소드 만들기
  public static Connection getConnection() {
    
    // 기본으로 Connection 만들고 반환까지 넣고 그 사이에 작성 시작.
    Connection con = null;
    
    try(BufferedReader reader = new BufferedReader(new FileReader("src/db.properties"))) {
      
      // 1. OracleDriver 를 메모리에 먼저 저장시켜야 동작함.
      Class.forName("oracle.jdbc.OracleDriver");
      
      // 2. Properties 객체 만들어줌.
      Properties p = new Properties();
      p.load(reader);
      
      // 3. 커넥션을 만들기 위해서는 계정정보가 필요한데 그 계정정보를 DriverManager 로 연결해서 property 의 계정정보를 가져옴. 
      con = DriverManager.getConnection(p.getProperty("url"), p.getProperty("user"), p.getProperty("password"));      
    }catch (Exception e) {
      e.printStackTrace();
    }
    
    return con;
    
    
    
  }
  
  // try-catch 안 넣으려고 throws 써서 con.close() 사용.
  public static void main(String[] args) throws Exception {
    //ex01();
    //ex02();
    //ex03();
    
    // 커넥션을 받아오기 (getConnection() 호출)
    Connection con = getConnection();
    System.out.println("Oracle에 접속되었습니다.");
    con.close();
    
  }

}
