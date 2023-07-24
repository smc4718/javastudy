package ex02_computer;

public class MainWrapper {

  public static void main(String[] args) {
    
    Notebook notebook = new Notebook("gram", 70);
    System.out.println(notebook.getModel());    // gram
    System.out.println(notebook.getBattery());  // 70

  }
}
