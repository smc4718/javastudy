package ex06_BinaryNumber;

import java.util.ArrayList;
import java.util.List;

public class BinaryNumber {

        //노란색 밑줄 경고 표시 : "이 변수 왜 사용 안했어?" 
        // ↑ 경고는 실행은 되는데, 잠재적으로 문제있는거 아닌지 물어보는 의문형임.
        // 경고 밑줄 마우스 갖다 대고 'unused' to 'number' 클릭하면 밑줄 없어짐 (경고 안띄워도 되 라는 의미)
  /* 10진수 */ private int number; // 10진수
  /*  2진수 */ private List<Integer> binary; // 2진수
  
  // new BinaryNumber(32) 2진수: 100000
  public BinaryNumber(int number) {
    // 32 % 2 == 0 -> binary.get(0) : 0
    // 16 % 2 == 0 -> binary.get(1) : 0
    //  8 % 2 == 0 -> binary.get(2) : 0
    //  4 % 2 == 0 -> binary.get(3) : 0
    //  2 % 2 == 0 -> binary.get(4) : 0
    //  1 % 2 == 1 -> binary.get(5) : 1
    //  0 % 2 == 불가능하므로 여기서 종료
    this.number = number;
    binary = new ArrayList<Integer>();
    if(number == 0) {
      binary.add(0);
    } else {
        while(number > 0) {
        binary.add(number % 2);
        number /= 2;
        }
     }
  }
  
  // BinaryNumber bn = new BinaryNumber(32);
  // System.out.println(bn);  // 100000
  // for문으로 거꾸로 출력하기.
  @Override
  public String toString() {
    String result = "";
    for(int i = binary.size()-1; i >= 0; i--) {
      result += binary.get(i);
    }
    return result;
  }
  
  
  
}
