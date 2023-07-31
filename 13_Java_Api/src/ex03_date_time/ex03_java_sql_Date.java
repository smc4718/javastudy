package ex03_date_time;

import java.util.Date;
import java.sql.Timestamp;

public class ex03_java_sql_Date {

  public static void main(String[] args) {
    
    // java.sql.Date 클래스
    // DB의 DATE 타입을 처리하는 Date 클래스
 
       
    // 현재 날짜
    Date date = new Date(System.currentTimeMillis());
    System.out.println(date);
    
    // java.sql.Timestamp 클래스
    // DB의 TIMESTAMP 타입을 처리하는 Timestamp 클래스
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    System.out.println(timestamp);

  }

}
