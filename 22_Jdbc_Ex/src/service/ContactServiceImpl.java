package service;

import java.util.List;
import java.util.Map;

import dao.ContactDao;
import dto.ContactDto;

// (암묵적 룰)인터페이스 구현체는 클래스이름 뒤에 "Impl" ( => implements )  적어준다.

public class ContactServiceImpl implements ContactService {

  // ContactDao 클래스에 미리 만들어둬서 new 안써도 된다.(static이니 클래스 자체로 불러온다.)
  private ContactDao contactDao = ContactDao.getDao();
  
  @Override
  public int insert(Map<String, Object> map) {
    // Map -> ContactDao
    ContactDto contactDto = new ContactDto();
    contactDto.setName((String)map.get("name"));
    contactDto.setTel((String)map.get("tel"));
    contactDto.setEmail((String)map.get("email"));
    contactDto.setAddress((String)map.get("address"));
    
    // 실행 + 결과반환
    return contactDao.insert(contactDto);
  }

  @Override
  public int update(Map<String, Object> map) {
    // Map -> ContactDto
    ContactDto contactDto = new ContactDto();
    contactDto.setContact_no((int)map.get("contact_no"));
    contactDto.setName((String)map.get("name"));
    contactDto.setTel((String)map.get("tel"));
    contactDto.setEmail((String)map.get("email"));
    contactDto.setAddress((String)map.get("address"));
    return contactDao.update(contactDto);
  }

  @Override
  public int delete(Map<String, Object> map) {
    // Map에서 contact_no값 추출
    int contact_no = (int)map.get("contact_no");
    // 실행 + 결과반환
    
    return contactDao.delete(contact_no);
  }

  @Override
  public List<ContactDto> selectList() {
    // 실행 + 결과반환
    return null;
  }

  @Override
  public ContactDto selectContactByNo(Map<String, Object> map) {
    // Map에서 contact_no값 추출
    int contact_no = (int)map.get("contact_no");
    
    // 실행 + 결과반환
    return contactDao.selectContactByNo(contact_no);
  }

}
