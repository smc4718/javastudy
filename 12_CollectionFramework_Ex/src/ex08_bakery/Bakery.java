package ex08_bakery;

import java.util.HashMap;
import java.util.Map;

// 1가지 빵만 파는 빵집

//1가지 빵만 파는 빵집

public class Bakery {

// Field
public final int PRICE = 2000;  // 빵이 얼마인가?
private int count;  // 빵이 몇 개 있는가?
private int money;  // 빵집에 돈이 얼마 있는가?

// Constructor
  public Bakery(int count, int money) {
    this.count = count;
    this.money = money;
  }


  public int getCount() {
    return count;
  }
  public void setCount(int count) {
    this.count = count;
  }
  public int getMoney() {
    return money;
  }
  public void setMoney(int money) {
    this.money = money;
  }
  
  /**
   * 판매 메소드<br>
   * 고객으로부터 구매할 빵의 갯수와 돈을 전달 받아서 판매하다.<br>
   * @param  count 구매할 빵의 갯수
   * @param  money 빵을 사려고 내는 돈
   * @return 빵과 잔돈
   */
  public Map<String, Integer> sell(int count, int money) {
    
    // 0 이하의 빵을 요청했다.
    if(count <= 0) {
      System.out.println("판매 불가합니다.(0이하의 빵을 요청하다.)");
      return null;
    }
    
    // 빵이 부족하다
    if(this.count < count) {
      System.out.println("판매 불가합니다.(빵이 부족하다.)");
      return null;
    }
    
    // 잔돈이 부족하다.
    if(this.money < money - count * PRICE) {
      System.out.println("판매 불가합니다.(잔돈이 부족하다.)");
      return null;
    }
    
    // 고객이 돈을 안 냈다.
    if(money <= 0) {
      System.out.println("판매 불가합니다.(돈을 안 냈다.)");
      return null;
    }
    
    // 고객이 낸 돈이 모자르다.
    if(PRICE * count > money) {
      System.out.println("판매 불가합니다.(낸 돈이 모자르다.)");
      return null;
    }
    
    // 판매 처리
    this.count -= count;
    this.money += count * PRICE;
    
    // 고객에게 반환할 Map 생성
    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("bread", count);
    map.put("change", money - count * PRICE);

    // 고객에게 빵과 잔돈 반환
    return map;
  }
}