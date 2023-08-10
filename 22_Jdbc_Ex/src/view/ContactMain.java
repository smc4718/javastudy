package view;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import controller.ContactController;

// CRUD는 반복숙달 필수(기초역량)

// ContactView 는 중요x (나중에 웹화면으로 입력은 대체됨)

// 순서(중요) : ContactView -> ContactController -> ContactService -> ContactDao -> DB

public class ContactMain {
  
  public static void main(String[] args) {
    
    ContactController contactController = new ContactController();
    
    while(true) {
      
      String choice = JOptionPane.showInputDialog("1.삽입\n2.수정\n3.삭제\n4.전체조회\n5.상세조회\n0.종료\n원하는 작업을 입력하세요.");
      View view = null;
      
      switch(choice) {
      case "1":
        view = new InsertView();
        break;
      case "2":
        view = new UpdateView();
        break;
      case "3":
        view = new DeleteView();
        break;
      case "4":
        view = new ListView();
        break;
      case "5":
        view = new DetailView();
        break;
      case "0": JOptionPane.showMessageDialog(null, "연락처 프로그램을 종료합니다.");
        return;
      default:
        JOptionPane.showMessageDialog(null, "잘못된 입력입니다. 다시 선택하세요.");
      }
      
      Map<String, Object> map = null;
      if(view != null) {
      map = view.display();
      }
    
    contactController.request(choice, map);
  }
 }
}