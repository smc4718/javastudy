package ex02_api;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

// 이번에는 main 에서 호출해서 출력값을 보기 때문에, 메소드들에 static 붙인 것.(메소드에 static 이 있으니까.)

public class NaverCaptcha {

  // 필드로 잡아 놓으면 변수를 여러 번 안 쓰고 한 번에 끌어다 쓸 수 있다.
  private static final String CLIENT_ID = "0ZmDGyDBmv6fI7U_AB5y";
  private static final String ClIENT_SECRET = "Q5iw70bf6I";
  
  private static String getKey() {
    
    URL url = null;
    HttpURLConnection con = null;
    BufferedReader reader = null;
    String result = null;
    
    try {
      
      String spec = "https://openapi.naver.com/v1/captcha/nkey?code=0"; // code 작성은 필수x.
      
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      
      con.setRequestMethod("GET");
      
      con.setRequestProperty("X-Naver-Client-Id", CLIENT_ID);
      con.setRequestProperty("X-Naver-Client-Secret", ClIENT_SECRET);
      
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
    System.out.println(sb.toString());
    
    JSONObject obj = new JSONObject(sb.toString());
    result = obj.getString("key");
    
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        if(reader != null) reader.close();
        if(con != null) con.disconnect();
      } catch (Exception e) {
        e.printStackTrace();
        }
      }
    return result;
  
    
  }
  
  private static String getImage(){
    
    URL url = null;
    HttpURLConnection con = null;
    
    // 이미지를 읽어들이고 데이터도 내보내야 하니까 둘 다 필요.
    BufferedInputStream bin = null;
    BufferedOutputStream bout = null;
    String key = null;
    
    try {
      
      String spec = "https://openapi.naver.com/v1/captcha/ncaptcha.bin?key=" + key;
      
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
          
      con.setRequestMethod("GET");
      
      con.setRequestProperty("X-Naver-Client-Id", CLIENT_ID);
      con.setRequestProperty("X-Naver-Client-Secret", ClIENT_SECRET);
      
      int responseCode = con.getResponseCode();
      if(responseCode != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException(responseCode + " 발생");
      }
      
      // 네이버로부터 읽어들이는 것 (bin)
      bin = new BufferedInputStream(con.getInputStream());
      
      
      File dir = new File("C:/storage");
      if(dir.exists() == false) {
        dir.mkdirs();
      }
      File file = new File(dir, System.currentTimeMillis() + ".jpg");
      // System.currentTimeMillis() : 중복된 파일이름이 발생하지 않으면 난 아무거나 상관 없다. 라는 뜻.
      
      bout = new BufferedOutputStream(new FileOutputStream(file));
      
      byte[] b = new byte[1024];    // 1KB = 1024bytes
      int readByte = 0;
      
      while((readByte = bin.read(b)) != -1) {
        bout.write(b, 0, readByte);
      }
      System.out.println(file.getPath() + " 파일 생성 완료");

      
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        if(bout != null) {bout.close();}
        if(bin != null) {bin.close();}
        if(con != null) {con.disconnect();}
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    return key;
  }

  private static void validInput() {
    
    URL url = null;
    HttpURLConnection con = null;
    BufferedReader reader = null;
    
    try {
      
      String key = getImage();
      
      Scanner sc = new Scanner(System.in);
      System.out.println("입력 >> ");
      String value = sc.next();
      
      String spec = "https://openapi.naver.com/v1/captcha/nkey?code=1&key=" + key + "&value" + value;
      
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      
      con.setRequestMethod("GET");
      
      con.setRequestProperty("X-Naver-Client-Id", CLIENT_ID);
      con.setRequestProperty("X-Naver-Client-Secret", ClIENT_SECRET);
      
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
      System.out.println("응답시간: " + obj.getDouble("responseTime"));
      if(obj.getBoolean("result")) {
      System.out.println("맞습니다.");
      } else {
      System.out.println("틀립니다.");
      }
    
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      try {
       if(reader != null) reader.close();
       if(con != null) con.disconnect();
      }catch (Exception e) {
        e.printStackTrace();
      }
    }
   
  }
 
  public static void main(String[] args) {
    
  }
}
