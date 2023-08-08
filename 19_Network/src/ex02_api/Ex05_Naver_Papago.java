package ex02_api;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

public class Ex05_Naver_Papago {

  public static void ex01() {
    
    
    
  }
  
  public static void main(String[] args) {
    
    URL url = null;
    HttpURLConnection con = null;
    BufferedOutputStream bout = null; // 서버로 POST 데이터 보내는 용도
    BufferedReader reader = null;
    
    try {
      
      Scanner sc = new Scanner(System.in);
      System.out.println("번역할 한국어 입력 >>> ");
      String text = sc.nextLine();
      
      String spec = "https://openapi.naver.com/v1/papago/n2mt";
      String clientId = "0ZmDGyDBmv6fI7U_AB5y";
      String clientSecret = "Q5iw70bf6I";
      
      String params = "source=ko&target=en&text=" + text;
      
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      
      // 요청 메소드 POST (생략할 수 없다.)
      con.setRequestMethod("POST");
      
      // 요청 헤더 (client, clientSecret)
      con.setRequestProperty("X-Naver-Client-Id", clientId);    // Map 에서 <키(변수), 밸류(값)> 을 합쳐서 Entry 라고 부름. 
      con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
    
      // OutputStream을 이용해서 POST 데이터를 보내겠다.
      con.setDoOutput(true);
      
      // OutputStream을 이용해서 POST 데이터 보내기
      bout = new BufferedOutputStream(con.getOutputStream()); //그동안은 file로 보냈지만, 이번은 서버로 보내야함. 서버는 여기서 con임.
      bout.write(params.getBytes());;
      bout.flush();   // 통로가 빨대라면, flush()는 빨대(스트림) 안에 있는 데이터를 확실하게 바람 불어서 보내준다.
      
      int responseCode = con.getResponseCode();
      if(responseCode != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException(responseCode + " 발생");
      }
      
      reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
      
      StringBuilder sb = new StringBuilder();
      String line = null;
      while((line = reader.readLine()) != null) {
        sb.append(line);
      }
      
      JSONObject obj = new JSONObject(sb.toString());
      JSONObject message = obj.getJSONObject("message");
      JSONObject result = message.getJSONObject("result");
      String translatedText = result.getString("translatedText");
      
      System.out.println("번역 결과");
      System.out.println("=========");
      System.out.println(translatedText);
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        if(reader != null) {reader.close();}
        if(bout != null) {bout.close();}
        if(con != null) con.disconnect();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
    
    
  }

}
