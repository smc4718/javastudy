package ex02_OutputStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class MainWrapper {
  
  /*
   * java.io.OutputStream
   * OutputStream 으로 끝나는 단어들은 다 OutputStream의 자식들.(OutputStream은 슈퍼클래스 이다.)
   * 1. 바이트 기반의 출력 스트림이다. (스트림 : 출력할 때 사용하는 통로)
   * 2. 출력 단위
   *    1) int
   *    2) byte[]
   * ★정리 : 출력스트림은 바이트 들을 파일로 보내어 파일 객체를 만드는 용도로 사용 된다.
   *         (데이터를 내보내는 게 목적이다.)
   */

  public static void ex01() {
    
    // 디렉터리를 File 객체로 만들기
    File dir = new File("C:/storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    // 파일을 File 객체로 만들기
    File file = new File(dir, "ex01.dat");
    
    // 파일 선언 & 생성을 분리하는 이유는 ' 스코프 조정 ' 하기 위함.
    
    // File로 byte 데이터를 내보낼 때 사용하는 Stream : FileOutputStream
    // 파일출력스트림 선언
    FileOutputStream fout = null;
    
    try {
    
    // 출력스트림이 file 로 출력할 것이다. (file = ex01.dat);
    // 파일출력스트림 생성 (반드시 예외 처리가 필요한 코드)
    fout = new FileOutputStream(file);
    
    // 출력할 데이터 (파일로 보낼 데이터)
    // int 와 byte[] 만 사용가능, Character 은 아예 불가능.
    int c = 'A';
    String s = "pple";
    byte[] b = s.getBytes();  // byte[] : String을 byte[]로 변환
    // String 을 byte[] 로 만들어주는 자동 메소드가 있음 :  .getBytes() , (인코딩(UTF-8)이 필요할 때는 3개의 getBytes중 파라미터가 있는 2개중에 쓰면 됨)
    
    // 출력 (파일로 데이터 보내기) 
    fout.write(c);
    fout.write(b);
  } catch (IOException e) {
    e.printStackTrace();   // 예외가 어디서 발생하는 알 수 있게 printStackTrace 써줌.
  } finally {
    try {
      if(fout != null) {
        fout.close();     // 출력스트림은 반드시 닫아줘야 함 (반드시 예외 처리가 필요한 코드)
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    // 예외처리가 필요한 아이들은 try 안에 들어가 있어야 한다.(예외 처리가 필요하면 Unhandled exception type IOException 뜸)
    
    // file 객체 이름 가져오는 법 : .getName  |  getParent : 폴더 가져오기 | getPath() : 폴더,파일 다 가져옴.
    System.out.println(file.getPath() + " 파일 크기 : " + file.length() + "바이트");    
  }     
  }
  
  public static void ex02() {
    
    // C:/storage/ex02.dat 파일로 안녕하세요 보내기, 파일 크기 확인
    
    File dir = new File("C:/storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "ex02.dat");
    
 
    FileOutputStream fout = null;
    
    try {
    fout = new FileOutputStream(file);
    
    String s = "안녕하세요";
    byte[] b = s.getBytes("UTF-8");  // UTF-8 로 인코딩해라. 
   
    fout.write(b);
  } catch (IOException e) {
    e.printStackTrace();   
  } finally {
    try {
      if(fout != null) {
        fout.close();     
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
    System.out.println(file.getPath() + " 파일 크기 : " + file.length() + "바이트");
  }
    
  public static void ex03() {
    
    /*
     * java.io.BufferedOutputStream 클래스
     * 1. 내부 버퍼를 가지고 있는 출력스트림이다.
     * 2. 많은 데이터를 한 번에 출력하기 때문에 속도 향상을 위해서 사용한다.
     * 3. 보조스트림이므로 메인스트림과 함께 사용한다.
     * 4. 주로 BufferedOutputStream 을 사용한다. 안 쓸 이유가 없다.
     */
    
    /*
    ex03.dat
    
    2줄로 안녕하세요
          \n
          반갑습니다
    */
    
    File dir = new File("C:/storage");
    File file = new File(dir, "ex03.dat");
    
    // 버퍼 출력스트림 선언  // 버퍼를 가지고 있어서 출력 속도가 빠름. 
    // (한 번에 byte 하나씩 내보내는 게 FileOutputStream, 한 번에 여러개 byte를 내보내는 게 BufferedOutputStream 이다.)
    BufferedOutputStream bout = null;
    
    try {
    // FileOutputStream 을 만들어서 file쪽으로 출력 통로를 하나 만들고, 거기에 BufferedOutputStream 를 추가해서 보낸다.
    bout = new BufferedOutputStream(new FileOutputStream(file));
    String s1 = "안녕하세요";
    String s2 = "반갑습니다";
    int c = '\n';  // s1이나 s2에 글자에 \n 을 넣어도 상관 없다.
    
    bout.write(s1.getBytes("UTF-8"));
    bout.write(c);
    bout.write(s2.getBytes(StandardCharsets.UTF_8));  // getBytes("UTF-8")과 동일하다.
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(bout != null) {
          bout.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    System.out.println(file.getPath() + "파일 크기 : " + file.length() + "바이트");
  }
  
  public static void ex04() {
    
    /*
     * java.io.DataOutputStream 클래스
     * 1. int, double, String 등의 변수를 그대로 출력하는 출력스트림
     * 
     */
    
  }
  
  public static void main(String[] args) {
   ex03();
  }
}
