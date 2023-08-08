package my_practice;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;

public class ex_Reader {
  
  public static void ex01() {
    
    File dir = new File("C:/storage");
    File file = new File(dir, "ex_Reader");
    
    FileReader reader = null;
    
    try {
      
      reader = new FileReader(file);
      
      int ch = 0;
      
      StringBuffer sb = new StringBuffer();
      
      while((ch = reader.read()) != -1) {
           sb.append(ch);
      }
    System.out.println(sb.toString());
      
    }catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(reader != null) {
          reader.close();
        }
      }catch (Exception e) {
        e.printStackTrace();
      }
    }
   
    
  }

  public static void main(String[] args) {
   ex01();
  }

}
