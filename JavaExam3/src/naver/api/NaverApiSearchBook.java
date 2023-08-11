package naver.api;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class NaverApiSearchBook {

    private void generateImage(String spec) {
        URL url = null;
        HttpURLConnection con = null;
        BufferedInputStream bin = null;
        BufferedOutputStream bout = null;

        try {
            url = new URL(spec);
            con = (HttpURLConnection) url.openConnection();
            bin = new BufferedInputStream(con.getInputStream());

            String[] splitSpec = spec.split("/");
            String filename = splitSpec[splitSpec.length - 1];
            bout = new BufferedOutputStream(new FileOutputStream("C:/download/" + filename));

            byte[] buf = new byte[1024];
            int readByte = 0;
            while ((readByte = bin.read(buf)) != -1) {
                bout.write(buf, 0, readByte);
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                File logFile = new File("C:/download/log/log.txt");
                logFile.getParentFile().mkdirs();
                PrintWriter writer = new PrintWriter(new FileWriter(logFile, true));
                writer.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + ": " + e.getMessage());
                writer.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        } finally {
            try {
                if (bout != null) bout.close();
                if (bin != null) bin.close();
                if (con != null) con.disconnect();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void getSearchList() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("책 관련 검색어를 입력하세요 >>> ");
        String query = scanner.nextLine();
        scanner.close();

        try {
            String encodedQuery = URLEncoder.encode(query, "UTF-8");
            String apiUrl = "https://openapi.naver.com/v1/search/book.json?query=" + encodedQuery;

            URL url = new URL(apiUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", "0ZmDGyDBmv6fI7U_AB5y");
            con.setRequestProperty("X-Naver-Client-Secret", "Q5iw70bf6I");

            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            JSONObject jsonObject = new JSONObject(response.toString());
            JSONArray items = jsonObject.getJSONArray("items");

            for (int i = 0; i < items.length() && i < 10; i++) {
                JSONObject item = items.getJSONObject(i);
                String imageUrl = item.getString("image");
                generateImage(imageUrl);
            }
        } catch(Exception e) {
          LocalDateTime now = LocalDateTime.now();
          DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-DD a h:mm:ss");
          String time = dtf.format(now);
          
     
          String message = e.getMessage();
          
   
          String clazz = e.getClass().getName();
          

          File dir = new File("C:/storage");
          if(dir.exists() == false) {
            dir.mkdirs();
          }
          File file = new File(dir, "log.txt");
          

          try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
 
            bw.write(time + " " + message + " " + clazz);
            bw.newLine();
            

            System.out.println(file.getPath() + " 파일에 예외처리생성 완료");
          } catch (IOException e2) {
            e2.printStackTrace();
          } 
        
      }
    }
}