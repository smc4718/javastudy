package ex06_member;

public class Contact {

  // Field
  private String  homeTel;
  private String  mobile;
  private Address address;
  
  
  // Constructor
  public Contact() {}
  
  // Setter
  public void setHomeTel(String homeTel) {
    this.homeTel = homeTel;
  }
  
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }
  
  public void setAddress(Address address) {
    this.address = address;
  }
  
  
  //Getter
  public String getHomeTel() {
    return homeTel;
  }
  
  public String getMobile() {
    return mobile;
  }
  
  public Address getAddress() {
    return address;
  }
  
}
