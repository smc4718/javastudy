package api11;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
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

public class Api_ex12 {
  
  private static final String CLIENT_ID = "0ZmDGyDBmv6fI7U_AB5y";
  private static final String CLIENT_SECRET = "Q5iw70bf6I";

    private void generateImage(String spec) {
        URL url = null;
        HttpURLConnection con = null;
        BufferedInputStream bin = null;
        BufferedOutputStream bout = null;

        try {
          
          
          
            url = new URL(spec);
            con = (HttpURLConnection) url.openConnection();
            con.setDoOutput(true);

            bin = new BufferedInputStream(con.getInputStream());
            bout = new BufferedOutputStream(new FileOutputStream("C:/download/" + spec.substring(spec.lastIndexOf("/") + 1)));

            int byteData;
            while ((byteData = bin.read()) != -1) {
                bout.write(byteData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bout != null) bout.close();
                if (bin != null)  bin.close();
                if (con != null)  con.disconnect();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void getSearchList() {
        URL url = null;
        HttpURLConnection con = null;
        BufferedReader reader = null;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("검색어를 입력하세요: ");
            String query = scanner.nextLine();

            url = new URL("https://openapi.naver.com/v1/search/book.json?query=" + URLEncoder.encode(query, "UTF-8"));
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", CLIENT_ID);
            con.setRequestProperty("X-Naver-Client-Secret", CLIENT_SECRET);

            reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            JSONObject jsonObject = new JSONObject(response.toString());
            JSONArray items = jsonObject.getJSONArray("items");

            for (int i = 0; i < items.length(); i++) {
                JSONObject item = items.getJSONObject(i);
                String imageUrl = item.getString("image");
                generateImage(imageUrl);
            }

        } catch (Exception e) {
            e.printStackTrace();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String logMessage = LocalDateTime.now().format(formatter) + " , " + e.getMessage();
            try {
                FileWriter logWriter = new FileWriter("C:/download/log/log.txt", true);
                PrintWriter printWriter = new PrintWriter(logWriter);
                printWriter.println(logMessage);
                printWriter.close();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } finally {
            try {
                if (reader != null) reader.close();
                if (con != null) con.disconnect();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Api_ex12 searchBook = new Api_ex12();
        searchBook.getSearchList();
    }
}
