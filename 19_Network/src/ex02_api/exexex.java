package ex02_api;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class exexex {

  
  public static void ex01() {
    
    File dir = new File("C:/storage");
    if(dir.exists() == false) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "ex_test0808");
    
    BufferedWriter fw = null;
    
    try {
      
      fw = new BufferedWriter(new FileWriter(file));
      
      String home = "집";
      String home2 = "에";
      String home3 = "가고 싶다.";
      
      fw.write(home);
      fw.write(home2);
      fw.write(home3);
      
      System.out.println(file.getPath() + " 파일 생성 완료");
      
    } catch (IOException e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        if(fw != null) {
          fw.close();
        }
      }catch (IOException e) {
        e.printStackTrace();
      }
    }
  
  }
  
  
  public static void main(String[] args) {
   ex01();
      

  }

}
