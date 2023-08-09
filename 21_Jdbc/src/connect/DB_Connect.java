package connect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DB_Connect {

  // static 처리해준 메소드는 '클래스 메소드'라고 부른다.
  // 그래서 new 없이 호출해서 사용할 수 있다.
  public static Connection getConnection() {
      
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
   
 


}
