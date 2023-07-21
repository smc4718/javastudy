package ex06_member;

public class Address {

  // Field
  private String postcode;   //우편번호
  private String roadAddr;   //도로명주소
  private String jibunAddr;  //지번주소
  private String detailAddr; //상세주소
  
  // Constructor (안 만들어도 Java에서 자동으로 만듦).
  public Address() {}
  
  // Setter
  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }
  
  public void setRoadAddr(String roadAddr) {
    this.roadAddr = roadAddr;
  }
  
  public void setJibunAddr(String jibunAddr) {
    this.jibunAddr = jibunAddr;
  }
  
  public void setDetailAddr(String detailAddr) {
    this.detailAddr = detailAddr;
  }
  
  // Getter
  public String getPostcode() {
    return postcode;
  }
  
  public String getRoadAddr() {
    return roadAddr;
  }
  
  public String getJibunAddr() {
    return jibunAddr;
  }
  
  public String getDetailAddr() {
    return detailAddr;
  }
  
}
