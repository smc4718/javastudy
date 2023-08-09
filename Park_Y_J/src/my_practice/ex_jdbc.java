package my_practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ex_jdbc {

  public static Connection getConnection() {
    
  Connection con = null;
  
  try(BufferedReader reader = new BufferedReader(new FileReader("src/db.properties"))) {
    Class.forName("oracle.jdbc.OracleDriver");
    
    Properties p = new Properties();
    p.load(reader);
    
    con = DriverManager.getConnection(p.getProperty("url"), p.getProperty("user"), p.getProperty("password"));    
  } catch (Exception e) {
    e.printStackTrace();
  }
  
  return con;
    
  }
  
  public static void main(String[] args) throws Exception {
   
    Connection con = getConnection();
    System.out.println("Orace 접속 성공");
    con.close();

  }

}
