package ex02_List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// java.lang 패키지만 유일하게 import를 생략할 수 있다.
// 자주 사용하는 패키지들은 java.lang 패키지에 집어넣고 import를 생략해도 좋다.



public class MainWrapper {

  public static void ex01() {
    
    // java.util.List. 
    // 자동완성 : Ctrl+Space 하면 util.java 뜸.
    // ArrayList의 인터페이스 List 타입 선언
    List<String> season;
    
    // ArrayList 생성
    // ArrayList 도 자동완성 util 선택.
    season = new ArrayList<String>();
    //부모타입으로 자식타입에 저장할 수 있는거랑 같음.
    
    // 배열 요소 추가하기
    season.add("여름");
    season.add("가을");
    season.add("겨울");
    season.add(0, "봄"); // 인덱스 0에 "봄"이 들어감.
    
    // 배열 요소 확인하기
    // 배열.get 메소드 쓰는 거 주의
    System.out.println(season.get(0));
    System.out.println(season.get(1));
    System.out.println(season.get(2));
    System.out.println(season.get(3));
    
  }
  
  public static void ex02() {
    
    // ArrayList의 선언 & 생성
    List<String> hobbies = new ArrayList<String>();
    
    // 배열 요소 추가하기
    hobbies.add("번지점프");
    hobbies.add("스노쿨링");
    hobbies.add("스카이다이빙");
    
    // 배열 길이 확인 (저장된 요소의 갯수)
    // 객체.size() : 배열 길이 확인.
    System.out.println(hobbies.size());
    // 처음에 배열의 길이를 잡지 않아도 됨.
    
    // 배열 길이 관련 (마지막 요소 꺼내기)
    System.out.println(hobbies.get(hobbies.size() - 1));
  
    // 배열 for문 적용하기 (동일한 메소드를 여러 번 불러서 사용하면 성능저하가 발생한다.)
    // 여기에서는 hobbies.length 가 아님.
    for(int i=0; i < hobbies.size(); i++) {
      System.out.println(hobbies.get(i));
    }  
    // 배열 for문 적용하기 (리팩토링 : hobbies.size() 메소드가 여러 번 호출되는 문제 해결)
    // 변수 length를 만들어서 hobbies 길이 넣고 돌림
      for(int i = 0, length = hobbies.size(); i < length; i++) {
        System.out.println(hobbies.get(i));
      }
    
  }
  
  public static void ex03() {
    
    // ArrayList 선언 & 생성
    List<String> flower = new ArrayList<String>();
    
    // 요소 추가하기
    flower.add("장미");
    flower.add("튤립");
    flower.add("무궁화");
    
    // 요소 수정하기  // 인덱스 0의 요소를 "백일홍"으로 수정
    flower.set(0, "백일홍");
    
    // 요소 삭제하기  //인덱스 1의 요소를 삭제
    flower.remove(1);
    
    // for문
    for(int i=0, length = flower.size(); i < length; i++) {
      System.out.println(flower.get(i));
    }
    
        
        
    
  }

  public static void ex04() {
    
    // 배열을 ArrayList로 바꾸기
    Integer[] a = {10, 20, 30, 40, 50};
    List<Integer> numbers = Arrays.asList(a);
    // int[] a 로 하면 안되고, 레퍼런스타입 Integer로 해야 한다.
  
    // 주의!!!!! 초기화된 ArrayList는 길이를 변경할 수 없다.
    // numbers.add(60); 불가능
    // numbers.remove(0); 불가능
    
    // for문
    for(int i=0, length=numbers.size(); i < length; i++) {
      System.out.println(numbers.get(i));
    }
  }
  
  public static void ex05() {
    
    // ArrayList 초기화
    // 자동완성시 asList(T...a) 는 말줄임표로 요소의 개수 상관 없이 원하는 만큼 넣을 수 있다.(말줄임표는 사실 배열이다.)
    List<Integer> numbers = Arrays.asList(10,20,30,40,50);
  
    // for문
    for(int i=0, length=numbers.size(); i<length; i++) {
      System.out.println(numbers.get(i));
    }
  }
  
  public static void main(String[] args) {
   //ex01();
   //ex02();
   //ex03(); 
   //ex04();
    ex05();
  }

}
