package service;

import java.util.List;
import java.util.Map;

import dto.ContactDto;

//순서(중요) : ContactView -> ContactController -> ContactService -> ContactDao -> DB
//서비스는 다오를 호출(사용)한다.

public interface ContactService {
  int insert(Map<String, Object> map);
  int update(Map<String, Object> map);
  int delete(Map<String, Object> map);
  List<ContactDto> selectList();
  ContactDto selectContactByNo(Map<String, Object> map);
}