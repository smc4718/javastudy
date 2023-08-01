package ex04_Library;

public class MainWrapper {

  public static void main(String[] args) {
   
    try {
    new Library().manage();
    
   
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
    // 여기서는 메모리에만 저장되기 때문에 출력 끄면 바로 휘발되어 날아감.
    // 그래서 DB가 필요함.
}
