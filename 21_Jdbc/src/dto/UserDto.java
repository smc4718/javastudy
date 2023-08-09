package dto;

import java.sql.Date;

public class UserDto {
  
  /*
   [ DTO 만들기 ]
   1. SQL 파일에서 데이터 보고 아래 똑같이 필드 작성.
   2. 타입 잘보고 만들기
   3. 생성자, Getter & Setter 만들기
  */
  
  // SQL 이랑 다르게 소문자로 작성
  // 데이터베이스로 데이터를 보낼 때는 dto에 담아서 보낸다.
  // ↓작성한 것이, " DTO "  : Database Transfer Object (데이터베이스 전송 객체)
  private int    user_no;
  private String user_id;
  private String user_name;
  private Date   joined_at;
  
  public UserDto() {
  }

  public UserDto(int user_no, String user_id, String user_name, Date joined_at) {
    super();
    this.user_no = user_no;
    this.user_id = user_id;
    this.user_name = user_name;
    this.joined_at = joined_at;
  }

  public int getUser_no() {
    return user_no;
  }

  public void setUser_no(int user_no) {
    this.user_no = user_no;
  }

  public String getUser_id() {
    return user_id;
  }

  public void setUser_id(String user_id) {
    this.user_id = user_id;
  }

  public String getUser_name() {
    return user_name;
  }

  public void setUser_name(String user_name) {
    this.user_name = user_name;
  }

  public Date getJoined_at() {
    return joined_at;
  }

  public void setJoined_at(Date joined_at) {
    this.joined_at = joined_at;
  }

  // toString 은 결과를 편하게 보기 위해 사용함(안 써도됨)
  @Override
  public String toString() {
    return "UserDto [user_no=" + user_no + ", user_id=" + user_id + ", user_name=" + user_name + ", joined_at="
        + joined_at + "]";
  }
  
  
  
  
  
}
