package ex01_web;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainWrapper {

  public static void ex01() {
    
    /*
     * URL
     * 1. Uniform(형태가 정해진) Resource(자원) Location(위치)
     * 2. 정형화된 자원의 경로 표기방법(웹 주소를 의미한다.)
     * 3. 형식
     *     (프로토콜)://(호스트):포트(생략가능)/(URL Mapping) ? (파라미터=값&파라미터=값&파라미터=값...) 
     *         https://search.naver.com:8080/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%ED%8F%AD%EC%97%BC = 폭염
     *     1) 프로토콜   : 통신규약, https(secure + http : 보안 처리된 하이퍼텍스트 전송 프로토콜)
     *     2) 호스트     : 서버주소 
     *     3) URLMapping : 서버경로
     *     4) 파라미터   : 서버로 보내는 데이터  
     */
    
    /*
     * java.net.URL 클래스
     * 1. URL을 관리하는 클래스이다.
     * 2. URL을 분석하여 원하는 정보를 얻어낼 수 있다.
     * 3. URL에 접속할 수 있는 URLConnection을 생성할 수 있다.
     */
    
    // URL 정보 분석하기
    String apiURL = "https://search.naver.com:8080/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%ED%8F%AD%EC%97%BC";
    
    // URL 객체 선언
    URL url = null;
    
    try {
      
      // URL 객체 생성
      url = new URL(apiURL);  // MalformedURLException 발생 (apiURL 에 웹주소가 틀렸으면 발생시키는 예외)
      
      // URL 분석
      System.out.println("프로토콜: " + url.getProtocol());
      System.out.println("호스트: " + url.getHost());
      System.out.println("포트번호: " + url.getPort());
      System.out.println("파라미터: " + url.getQuery());

    } catch (MalformedURLException e) {
      System.out.println("apiURL 형식 오류");
    }
  }
  
  public static void ex02() {
   
   // 접속할 주소
   String spec = "https://www.naver.com";
   
   // URL 객체 선언
   URL url = null;
   
   // HttpURLConnection 객체 선언
   HttpURLConnection con = null;
   
   try {
     
     // URL 객체 생성 (MalformedURLException 발생)
     url = new URL(spec);
     
     // HttpURLConnection 객체 생성 (IOException 발생)
     con = (HttpURLConnection)url.openConnection();
     
     /*
      * HTTP 응답코드
      * 1. 200 : 정상
      * 2. 4XX : 잘못된 요청 (클라이언트의 잘못된 요청)
      * 3. 5XX : 서버 오류 (잘못된 개발)
      */
     
     // 접속 여부 확인
     int responseCode = con.getResponseCode();
     System.out.println("접속 여부: " + (responseCode == HttpURLConnection.HTTP_OK));
     
     // 요청 헤더(User-Agent) : 무엇으로 접속했는가?
     String userAgent = con.getRequestProperty("User-Agent");
     System.out.println("User-Agent: " + userAgent);
     
     // 요청 헤더(Referer) : 이전 주소가 무엇인가?
     String referer = con.getRequestProperty("Referer");
     System.out.println("Referer: " + referer);
     
     // 요청 헤더(Content-Type) : 어떤 타입인가?
     String contentType = con.getRequestProperty("Content-Type");
     System.out.println("Content-Type: " + contentType);
     
     /*
      * 요청 메소드
      * 1. GET  : 주소(URL)를 이용한 데이터 전송 
      * 2. POST : 본문(Body)을 이용한 데이터 전송
      */
     // 요청 메소드 : 어떤 방식으로 요청했는가? 
     String requestMethod = con.getRequestMethod();
     System.out.println("RequestMethod: " + requestMethod);
      
   } catch (MalformedURLException e) {
    System.out.println("접속 주소 오류");
  } catch (IOException e) {
    System.out.println("접속 오류");
  }
   
  }
  
  public static void main(String[] args) {
    ex02();

  }

}
