package ex06_member;

public class Member {

  // Field
  private String  name;
  private Contact contact;
  
  // Constructor
  public Member() {}
  
  // Setter
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setContact(Contact contact) {
    this.contact = contact;
  }
  
  // Getter
  
  public String getName() {
    return name;
  }
  
  public Contact getContact() {
    return contact;
  }
  
}
