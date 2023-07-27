package Person;

import java.util.ArrayList;
import java.util.List;

public class MainWrapper {

  public static void main(String[] args) {
    
    List<Person> family = new ArrayList<Person>();
    
    //문제 : 가족 모두 저장하고 for문으로 확인하기
    
    // 배열 요소 추가
    // 두 번째 생성자를 바로 전달하는 구문.
    family.add(new Person("엄마", 30));
    family.add(new Person("아빠", 34));
    family.add(new Person("누나", 20));
    family.add(new Person("나", 17));
    
    // 배열 요소 확인
    System.out.println(family.get(0));
    System.out.println(family.get(1));
    System.out.println(family.get(2));
    System.out.println(family.get(3));
    
    // 배열 길이 확인
    System.out.println(family.size());
    
    
    // for문
    for(int i=0, length=family.size(); i<length; i++) {
      System.out.println(family.get(i));
      System.out.println("이름: " + family.get(i).getName());
      System.out.println("나이: " + family.get(i).getAge());
    }

  }

}
