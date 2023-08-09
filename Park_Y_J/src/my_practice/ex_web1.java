package my_practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class ex_web1 {

  public static void main(String[] args) {
    
    String spec = "http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=108";
    
    URL url = null;
    HttpURLConnection con = null;
    BufferedReader reader = null;
    BufferedWriter writer = null;
    
    try {
      
      url = new URL(spec);
      con = (HttpURLConnection)url.openConnection();
      reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
      
      File dir = new File("C:/storage");
      if(dir.exists() == false) {
        dir.mkdirs();
      }
      
      File file = new File(dir, "weather.dat");
      
      writer = new BufferedWriter(new FileWriter(file));
      
      String line = null;
      while((line = reader.readLine()) != null) {
        writer.write(line + "\n");
      }
      
      System.out.println(file.getPath() + " 파일 생성 완료");
    }catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        if(writer != null) {writer.close();}
        if(reader != null) {reader.close();}
        if(con != null) {con.disconnect();}
      }catch (Exception e) {
        e.printStackTrace();
      }
    }
    
    
  }
  
}
