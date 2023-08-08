package ex02_api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

public class Temp {

  public static void main(String[] args) {
    
    
    Scanner sc = new Scanner(System.in);
    String query = null;
    System.out.println("검색어 입력하세요 >>> ");
    query = sc.nextLine();
    try {
      query = URLEncoder.encode(query, "UTF-8");
    } catch (UnsupportedEncodingException e) {
      System.out.println("검색어 인코딩 실패");
    }

    // 검색어를 입력받아서 주소 뒤에 검색어를 붙였습니다(필수요소 : query)
    String spec = "https://openapi.naver.com/v1/search/blog.json?query=" + query;
    
    String clientId = "0ZmDGyDBmv6fI7U_AB5y";
    String clientSecret = "Q5iw70bf6I";
    Map<String, String> requestHeaders = new HashMap<String, String>();
    requestHeaders.put("X-Naver-Client-Id", clientId);    // Map 에서 <키(변수), 밸류(값)> 을 합쳐서 Entry 라고 부름. 
    requestHeaders.put("X-Naver-Client-Secret", clientSecret);
    
    String result = get(spec, requestHeaders);
    System.out.println(result);
  
    }
    
  private static String get(String spec, Map<String, String> requestHeaders) {
    
    HttpsURLConnection con = connect(spec);
    String result = null;
    
    try {
      
      con.setRequestMethod("GET");
      
      // Map의 Entry 단위로 빼는 포문.
      for(Entry<String, String> entry : requestHeaders.entrySet()) {
       con.setRequestProperty(entry.getKey, entry.getValue());
      }
      
      int responseCode = con.getResponseCode();
      if(responseCode == HttpsURLConnection.HTTP_OK) {
        result readBody(con.getInputStream());  // 읽어드린 결과를 String으로 반환하는 것이 readBody() 이다.
      } else {
      result = readBody(con.getErrorStream());  // 실패했을 때 사용할 스트림 : .getErrorStream    
      }
      
    } catch (IOException e) {
      System.out.println("요청 또는 응답 실패");
    } finally {
      con.disconnect();
    }
    
  private static HttpURLConnection connect(String spec) {
   URL url = null;
   HttpURLConnection con = null;
   try {
     url = new URL(spec);
     con = (HttpURLConnection) url.openConnection();
  } catch (MalformedURLException e) {   // MalformedURLException : 주소가 잘못되었을 때 발생.
    System.out.println("주소가 잘못되었다.");
  } catch (IOException e) {  // IOException : 접속이 안되었을 때 발생.
    System.out.println("접속이 안 된다. "); 
  }
   return con;
    }
    
  private static String readBody(InputStream in) {
    
    String result = null;
    
    try (BufferedReader reader = BufferedReader(new InputStreamReader(in)) ) {
      
      StringBuilder sb = new StringBuilder();
      String line = null;
      while((line = reader.readLine()) != null) {
        sb.append(line + "\n");
      }
      return sb.toString();
    } catch (IOException e) {
      System.out.println("응답 실패");
    }
    return result;
  }
    
  }

  
}
