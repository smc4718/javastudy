package my_practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insert_Select {

  public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);
    System.out.print("아이디 입력 >>> ");
    sc.nextLine();
    sc.next();
    System.out.print("이름 입력 >>> ");
    sc.nextLine();
    sc.next();
    
    UserDto user = new UserDto();
    user.setUser_id(user_id);
    user.setUser_name(user_name);
    
    Connection con = null;
    
    PreparedStatement ps = null;
    
    try {
      
      con = DB_Connect.getConnection();
      
      String sql = "";
      sql += "INSERT INTO USER_T (USER_NO, USER_ID, USER_NAME, JOINED_AT";
      
    }
    
    
    
  }
  
}
