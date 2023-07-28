package ex06_BinaryNumber;

public class BinaryNumber {

  /* 10진수 */ private int number; // 10진수
  /*  2진수 */ private List<Integer> binary; // 2진수
  
  // new BinaryNumber(32) 2진수: 100000
  public BinaryNumber(int number) {
    this.number = number;
    // binary.get(0) : 0
    // binary.get(1) : 0
    // binary.get(2) : 0
    // binary.get(3) : 0
    // binary.get(4) : 0
    // binary.get(5) : 1
  }
  
  // BinaryNumber bn = new BinaryNumber(32);
  // System.out.println(bn);  // 100000
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
  }
  
  
  
}
