package ex01_File;

import java.io.File;
import java.io.IOException;

public class MainWrapper {
  
  /*
   * java.io.File 클래스
   * 1. 파일, 디렉터리(폴더)를 관리하는 클래스이다.
   * 2. 파일, 디렉터리를 생성/삭제가 가능하다.
   * 3. 파일, 디렉터리의 각종 정보(이름, 크기, 최종수정일 등)를 확인할 수 있다.
   */

  /*
   * 경로 작성 방법
   * 1. 윈도우 : 백슬래시(\), java에서 백슬래시 입력하는 방법(\\)  : 그러나 / 로도 가능하니 슬래시(/)로 쓰자.
   * 2. 리눅스 : 슬래(/)
   */
  
  public static void ex01() {
    
    // 디렉터리 생성/삭제
    
    // 경로 구분자
    String sep = File.separator;
    
    // File 객체 선언
    File dir;
    
    // File 객체 생성 (아래 구문이 공식적으로 윈도우 & 리눅스에서 모두 돌아간다.
    dir = new File("C:" + sep + "storage");  // C드라이브 아래에 있는 storage 디렉토리
  
    // C:\storage 디렉토리가 없으면 만들고, 있으면 지우기
    if(dir.exists()) {
     // dir.deleteOnExit();  // Java 실행이 끝나면 지운다.
     dir.delete();  // 지금 당장 지운다.
     System.out.println("C:\\storage 디렉토리 삭제 완료");
    } else {
      dir.mkdirs(); // 폴더 안에 폴더 만들기 가능. (mk : make  , dir : directory)
      System.out.println("C:\\storage 디렉터리 생성 완료");
    }
    
  }
  
  public static void ex02() {
    
    // 파일 생성/삭제
    
    try {
    
      // 디렉터리를 File 객체로 생성
      File dir = new File("C:/storage"); // Windows 플랫폼에서도 슬래시(/)가 인식된다.
      
      // 디렉터리가 없으면 만들기
      if(!dir.exists()) {
        dir.mkdirs();
      }
      
      // 파일을 File 객체로 생성
      File file = new File(dir, "myfile.txt");
      
      
      // 파일이 있으면 지우고, 없으면 만들기
      if(file.exists()) {
        file.delete();
        System.out.println("myfile.txt 파일 삭제 완료");
      } else {
        file.createNewFile(); // 반드시 예외 처리를 해야 하는 코드(Checked Exception인 IOException 발생)
        System.out.println("myfile.txt 파일 생성 완료");
      }
 
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  public static void main(String[] args) {
    ex02();
    
    
  }

}
