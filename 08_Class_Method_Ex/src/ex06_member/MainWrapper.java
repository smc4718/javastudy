package ex06_member;

public class MainWrapper {

  public static void main(String[] args) {
    
    
    Address address = new Address();
    // 정보 추가 (Setter 활용)
    address.setPostcode("08505");
    address.setRoadAddr("가산디지털2로 95");
    address.setJibunAddr("가산동 550-7");
    address.setDetailAddr("3층 G강의실");
    
    
    Contact contact = new Contact();
    // 정보 추가 (Setter 활용)
    contact.setHomeTel("02-818-7950");
    contact.setMobile("010-1234-5678");
    contact.setAddress(address);
    
    Member member = new Member();
    // 정보 추가 (Setter 활용)
    member.setName("홍길동");
    member.setContact(contact);
    
    // Member 객체 정보 확인 (Getter 활용 문제)
    // 알고자 하는 정보를 member.getContact 들과 연결된 메소드를 골라 순차적으로 기입해주면 된다.
    // info() 같은 것 만들지 말고 getter 호출로 연습하는 게 좋음(실무에서 많이 씀)
    System.out.println("이름: " + member.getName());
    System.out.println("집전화: " + member.getContact().getHomeTel());
    System.out.println("폰번호: " + member.getContact().getMobile());
    System.out.println("우편번호: " + member.getContact().getAddress().getPostcode());
    System.out.println("도로명주소: " + member.getContact().getAddress().getRoadAddr());
    System.out.println("지번주소: " + member.getContact().getAddress().getJibunAddr());
    System.out.println("상세주소: " + member.getContact().getAddress().getDetailAddr()); 
  }
}
