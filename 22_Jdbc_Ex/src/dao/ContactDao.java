package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import dto.ContactDto;

// Singleton Pattern은 개념만 알고 있으면 됨.(중요x)

// CRUD 하나씩 다 함 : create, insert, update, delete
/*
 * Dao
 * 1. Database Access Object
 * 2. 데이터베이스에 접근해서 쿼리문을 실행하고 쿼리문의 실행 결과를 받는 객체이다.
 * 3. 하나의 객체만 만들어서 사용하는 Singleton Pattern으로 객체를 생성한다.
 * (DB를 갔다 온 애들은 전부 dao 에 모아 둔다.)
 */

public class ContactDao {

  /*
   * Singleton Pattern
   * 1. 오직 하나의 객체만 만들 수 있도록 처리하는 패턴이다.
   * 2. 미리 하나의 객체를 만든 뒤 해당 객체를 가져다 사용할 수 있도록 처리한다.
   * 3. 객체 생성이 불가능하도록 생성자를 호출할 수 없게 만든다.
   * (dao의 외부에서는 new ContactDao() 를 사용하지 못하게 막는다.)
   */
  private static ContactDao dao = new ContactDao();
  
  private ContactDao() {
    // 내부에서만 호출할 수 있는 생성자 ( private 으로 만든다. )
  }
  
    // Getter의 getDao() 가 있어야만 외부에서 호출 사용 가능.
    // (내가 만든 것만 가져다 사용할 수 있다.)
  public static ContactDao getDao() {
    return dao;
  }
  
  public static void setDao(ContactDao dao) {
    ContactDao.dao = dao;
  } 
  
  // 호출할 때는 (static이 붙어 있어서)클래스메소드이기 때문에 클래스를 호출해줘야 함.
  // ==> ContactDao.getDao()
  
  private Connection con;
  private PreparedStatement ps;
  private ResultSet rs;
  
  private Connection getConnection() {       
  
    try {
      
      // 클래스 부르기
     Class.forName("oracle.jdbc.OracleDriver");
      
     Properties p = new Properties();
     p.load(new BufferedReader(new FileReader("src/db.properties")));
     
     con = DriverManager.getConnection(p.getProperty("url"), p.getProperty("user"), p.getProperty("password")); 
    } catch (Exception e) {
      e.printStackTrace();
    }  
    
    return con;
    
  }
  
  private void close() {
    try {
      if(rs != null) rs.close();
      if(ps != null) ps.close();
      if(con != null) con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  /**
   * 삽입메소드<br>
   * @param contactDto 삽입할 연락처 정보(name, tel, email, address)
   * @return insertCount 삽입된 행(Row)의 개수, 1이면 삽입 성공, 0이면 삽입 실패
   */
  public int insert(ContactDto contactDto) {
    
    int insertCount = 0;
    
    try {
      
      con = getConnection();
      // 쿼리문은 항상 SQL파일에서 돌려보고 돌아가면 이곳에 복붙해서 적기.
      String sql = "INSERT INTO CONTACT_T(CONTACT_NO, NAME, TEL, EMAIL, ADDRESS, CREATED_AT) VALUES(CONTACT_SEQ.NEXTVAL, ?, ?, ?, ?, TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'))";
      ps = con.prepareStatement(sql);
      ps.setString(1, contactDto.getName());
      ps.setString(2, contactDto.getTel());
      ps.setString(3, contactDto.getEmail());
      ps.setString(4, contactDto.getAddress());
      insertCount = ps.executeUpdate();
      
    }catch (Exception e) {
      e.printStackTrace();
    } finally {
        close();
    }
    
    return insertCount;
    
  }
  
  /**
   * 수정 메소드<br>
   * @param contactDto 수정할 연락처 정보(contact_no, name, tel. email, address)
   * @return updateCount 수정된 행(Row)의 개수, 1이면 수정 성공, 0이면 수정 실패.
   */
  public int update(ContactDto contactDto) {
    
    int updateCount = 0;
    
    try {
      
      con = getConnection();
      String sql = "UPDATE CONTACT_T SET NAME = ?, TEL = ?, EMAIL = ?, ADDRESS = ?, WHERE CONTACT_NO = ?";
      ps = con.prepareStatement(sql);
      ps.setString(1, contactDto.getName());
      ps.setString(2, contactDto.getTel());
      ps.setString(3, contactDto.getEmail());
      ps.setString(4, contactDto.getAddress());
      ps.setInt(5, contactDto.getContact_no());
      updateCount = ps.executeUpdate();
          
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      close();
    }
    
    return updateCount;
    
  }
  
  /**
   * 삭제 메소드<br>
   * @param contact_no 삭제할 연락처 번호
   * @return deleteCount 삭제된 행(Row)의 개수, 1이면 삭제 성공, 0이면 삭제 실패
   */
  public int delete(ContactDto contactDto) {
    
    int deleteCount = 0;
    
    try {
      
      con = getConnection();
      String sql = "DELETE FROM CONTACT_T WHERE CONTACT_NO = ?";
      ps = con.prepareStatement(sql);
      ps.setInt(1, contactDto.getContact_no());
      deleteCount = ps.executeUpdate();
      
    }catch (Exception e) {
      e.printStackTrace();
    } finally {
      close();
    }
    return deleteCount;`
    
    
  }

  /**
   * 전체 조회 메소드<br> 
   * @return 조회된 모든 연락처 정보(ContactDto)
   */
  public List<ContactDto> selectList() {
    
    List<ContactDto> list = new ArrayList<ContactDto>();
    
    try {
      
      con = getConnection();
      String sql = "SELECT CONTACT_NO, NAME, TEL, EMAIL, ADDRESS, CREATEC_AT FROM CONTACT_T ORDER BY CONTACT_NO ASC";
      ps = con.prepareStatement(sql);
      rs = ps.executeQuery(); // select 는 executeQuery 로 함.
      
      // 검색 결과 행 하나를 Dto로 바꾸는 과정
      // (행 하나당 컨택 Dto 1개로 바꿔 준다.)
      while(rs.next()) {
        ContactDto contactDto = new ContactDto();
        contactDto.setContact_no(rs.getInt("CONTACT_NO"));
        contactDto.setName(rs.getString("NAME"));
        contactDto.setTel(rs.getString("TEl"));
        contactDto.setEmail(rs.getString("ADDRESS"));
        contactDto.setCreated_at(rs.getString("CREATED_AT"));
        list.add(contactDto);
      }
      
      
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      close();
    }
    
    
    return list;
    
  }

  /**
   * 상세 조회 메소드<br>
   * @param contact_no 조회할 연락처 번호
   * @return contactDto 조회된 연락처 정보, 조회된 연락처가 없으면 null 반환
   */
  public ContactDto selectContactByNo(int contact_no) {
    
    ContactDto contactDto = null;
    
    try {
      
      con = getConnection();
      String sql = "SELECT CONTACT_NO, NAME, TEL, EMAIL, ADDRESS, CREATED_AT FROM CONTACT_T WHERE CONTACT_NO = ?";
      ps = con.prepareStatement(sql);
      ps.setInt(1, contact_no);
      rs = ps.executeQuery();
      if(rs.next()) {
        contactDto = new ContactDto();
        contactDto.setContact_no(rs.getInt(1)); // CONTACT_NO
        contactDto.setName(rs.getString(2));
        contactDto.setTel(rs.getString(3));
        contactDto.setEmail(rs.getString(4));
        contactDto.setAddress(rs.getString(5));
        contactDto.setCreated_at(rs.getString(6));
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      close();
    }
    
    return contactDto;
    
  }
  
}
