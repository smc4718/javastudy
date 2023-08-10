package my_practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class ContactDao {

  private static ContactDao dao = new ContactDao();
  
  private ContactDao() {
  }

  public static ContactDao getDao() {
    return dao;
  }

  public static void setDao(ContactDao dao) {
    ContactDao.dao = dao;
  }
 
  private Connection con;
  private PreparedStatement ps;
  private ResultSet rs;
  
  private Connection getConnection() {
    
    try {
      
      Class.forName("oracle.jdbc.OracleDriver");
      
      Properties p = new Properties();
      p.load(new BufferedReader(new FileReader("src/db.properties")));
    
      con = DriverManager.getConnection(p.getProperty("url"), p.getProperty("user"), p.getProperty("password"));
    
    }catch (Exception e) {
      e.printStackTrace();
    }
    
    return con;
    
  }
  
  
}
