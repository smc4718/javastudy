package ex04_delete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import connect.DB_Connect;
import dto.UserDto;

public class MainWrapper {

  public static void main(String[] args) {
    
    // User 정보 입력
    Scanner sc = new Scanner(System.in);
    System.out.println("USER_NO >>> ");
    String user_no = sc.next();
    sc.nextLine();
    sc.close(); // 입력 마치면 스캐너 닫기
    
    // UserDto 객체 생성
    UserDto user = new UserDto();
    user.setUser_no(1);
   
    
    Connection con = null;
    PreparedStatement ps = null;
    
    try {
      
      con = DB_Connect.getConnection();
     
      String sql = "";
      sql += "DELETE";
      sql += "  FROM USER_T";
      sql += " WHERE USER_NO = ?";
      
      ps.setString(2, user.getUser_id());
      ps.setString(3, user.getUser_name());
      
      int insertResult = ps.executeUpdate();
      
      System.out.println(insertResult + "개의 행이 삭제되었습니다.");
      
      
    }catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(ps != null) {ps.close();}
        if(con != null) {con.close();}
    }catch (Exception e) {
      e.printStackTrace();
    }
    }
  }

}
