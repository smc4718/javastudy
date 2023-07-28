package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainWrapper {

  /*
   * HashMap
   * 1. Map 인터페이스를 구현한 클래스
   * 2. 객체(Object)/인스턴스(Instance)를 대신할 수 있는 자료구조이다.
   * 3. 용어
   *    1) Entry : Key + Value를 합쳐서 부르는 말
   *    2) Key   : 데이터를 식별하는 식별자( 변수명, ex: name ) 
   *    3) Value : 데이터 자체( 변수에 저장된 값, ex: 홍길동 )
   * 4. 특징
   *    1) Key는 중복이 불가능하다. (HashSet 구조로 되어 있다.)
   *    2) Value는 중복이 가능하다.
   *    3) Key와 Value 모두 Generic 처리한다. (Key의 타입과 Value의 타입을 따로따로 잡아주어야 한다는 말)
   */   
  
  //Key 만 저장하는 건 Set 이다.
  
  // 객체       : 클래스의 타입으로 '선언'되었을 때 ‘객체’라고 부른다.
  // 인스턴스는 : 실제 메모리에 저장된 객체의 실체화.
  // (인스턴스는 어떤 원본(추상적인 개념)으로부터 ‘생성된 복제본’을 의미한다.)
  
  public static void ex01() {
    
    // Map 인터페이스 타입으로 HashMap 선언
    //Map<K(Key), V(value)>
    Map<String, String> dict;
    
    // HashMap 생성
    dict = new HashMap<String, String>();
    
    // Entry 저장(Key, Value) : key와 value 를 합쳐서 entry라고 부른다. 실제 데이터는 밸류임.
    dict.put("봄", "spring");    // 봄이라는 키를 전달하면, spring이라는 밸류가 나옴.
    dict.put("여름", "summer");
    dict.put("가을", "autumn");
    dict.put("겨울", "winter");
    
    // Value 확인(Key를 전달한다.)
    System.out.println(dict.get("봄"));
    System.out.println(dict.get("여름"));
    System.out.println(dict.get("가을"));
    System.out.println(dict.get("겨울"));
  }
  
  public static void ex02() {
    
    // HashMap 선언 & 생성
    // Object는 전부 저장할 수 있는 만능 타입.
    Map<String, Object> person = new HashMap<String, Object>();
    
    // Entry 저장(Key는 변수명으로, Value는 변수값으로 저장)
    person.put("name", "홍길동");
    person.put("age", 30);
    
    // Entry 수정(기존의 key를 사용하면 해당 키의 Value가 수정되는 방식.
    person.put("name", "제시카");
    person.put("age", 40);   
    
    // Value 확인
    System.out.println(person.get("name")); // 홍길동
    System.out.println(person.get("age"));  // 30
  }
  
  public static void ex03() {
    
    // HashMap 선언 & 생성
    Map<String, Object> map = new HashMap();
    
    // Entry 저장
    map.put("top", 10);
    map.put("bottom", 20);
    map.put("left", 30);
    map.put("right", 40);
    
    // 반복자(Iterator)를 이용한 순회
    // 1. Key만 모두 꺼내서 Set에 저장한다. (keySet 메소드)
    // 2. Set에 반복자(Iterator)를 붙여서 Key를 하나씩 꺼낸다.
    // 3. get() 메소드에 key를 전달하면 Value가 나온다.
    Set<String> keySet = map.keySet();       
    Iterator<String> arm = keySet.iterator();
    while(arm.hasNext()) {                  
      String key = arm.next();
      Object value = map.get(key);
      System.out.println(key + ": " + value);
    }
    
  }

  public static void ex04() {
    
    // HashMap 선언 & 생성
    Map<String, Object> map = new HashMap<String, Object>();
    
    // Entry 저장
    map.put("id", "admin");
    map.put("pw", "1234");
    map.put("role", "DBA");
    
    // 향상 for문 순회 (주로 Entry 단위로 값을 빼는 entrySet() 메소드 활용)
    //for(변수 : 컬렉션) { }
    // Entry 도 자체 타입이다.
    for(Entry<String, Object> entry : map.entrySet()) {
      String key = entry.getKey();      //entry로부터 key를 빼고 싶어
      Object value = entry.getValue();  //entry로부터 value를 빼고 싶어
      System.out.println(key + ": " + value);
    } 
  }
  
  public static void main(String[] args) {
    //ex01();
    //ex02();
    //ex03();
    ex04();
  }
}
