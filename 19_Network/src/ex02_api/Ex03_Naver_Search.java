package ex02_api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONArray;
import org.json.JSONObject;

public class Ex03_Naver_Search {

 public static void ex02() {
    
    /*
     * 네이버개발자센터 - 검색(블로그)
     * 1. 요청주소 : https://openapi.naver.com/v1/search/blog.json
     * 2. 요청변수
     *    1) query   : 필수, 검색어. UTF-8로 인코딩되어야 합니다.
     *    2) display : 선택, 한 번에 표시할 검색 결과 개수(기본값: 10, 최댓값: 100)
     *    3) start   : 선택, 검색 시작 위치(기본값: 1, 최댓값: 1000)
     *    4) sort    : 선택, 검색 결과 정렬 방법
                              ㄴ sim  : 정확도순으로 내림차순 정렬(기본값)
                              ㄴ date : 날짜순으로   내림차순 정렬
     */
    
    
    URL url = null;
    HttpURLConnection con = null;
    
    BufferedReader reader = null;
    
    try {
      
      String spec = "https://openapi.naver.com/v1/search/blog.json";
      String query = "폭염";
      String display = "10";
      String start  = "1";
      String sort = "sim";
      String clientId = "0ZmDGyDBmv6fI7U_AB5y";
      String clientSecret = "Q5iw70bf6I";
      
      StringBuilder sbUrl = new StringBuilder();
      sbUrl.append(spec);
      sbUrl.append("?query=").append(URLEncoder.encode(query, "UTF-8"));
      sbUrl.append("&display=").append(display);
      sbUrl.append("&start=").append(start);
      sbUrl.append("&sort=").append(sort);
      
      url = new URL(sbUrl.toString());
      con = (HttpURLConnection) url.openConnection();
     
      // http 메소드 : GET 방식이란 : "주소?(파라미터~~~~) => 주소에 '?'하고 뒤에 파라미터~~~~쭉 적는게 GET 방식이다.(GET방식은 생략 가능하다.)"
      // 요청 메소드
      con.setRequestMethod("GET");  // 반드시 대문자 GET 작성.
      
      // 요청 헤더
      con.setRequestProperty("X-Naver-Client-Id", clientId);
      con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
      
      int responseCode = con.getResponseCode();
      if(responseCode != HttpURLConnection.HTTP_OK) {   // HttpURLConnection.HTTP_OK 은 정상 접속 코드인 "200" 대신에 구문으로 적어준 것 (200으로 적어도 됨)
       throw new RuntimeException(responseCode + " 발생");
      }
      
      reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
      
      StringBuilder sb = new StringBuilder();
      String line = null;
      while((line = reader.readLine()) != null){
        sb.append(line + "\n");
      }
        
        JSONObject obj = new JSONObject(sb.toString());
        JSONArray items = obj.getJSONArray("items");
        for(int i = 0, length = items.length(); i < length; i++) {
          JSONObject item = items.getJSONObject(i);   // JSONObject 이면, ".getJSONObject" 로 꺼내줘야 한다.
          System.out.println((i + 1) +  "번째 블로그 검색 결과");
          System.out.println("제목: " + item.getString("title"));
          System.out.println("링크: " + item.getString("link"));
          System.out.println("요약: " + item.getString("description"));
          System.out.println("블로거: " + item.getString("bloggername"));
          System.out.println("블로거링크: " + item.getString("bloggerlink"));
          System.out.println("작성일: " + item.getString("postdate"));
      }
    }catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        if(reader != null) {reader.close();}
        if(con != null) {con.disconnect();}
      } catch (Exception e) {
        e.printStackTrace();
      }
    } 
    
  }
  
  public static void main(String[] args) {
    ex02();
  }
  
}
