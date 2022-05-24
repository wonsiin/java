package scit.dao;

import java.util.List;

import scit.vo.User;
import scit.vo.UserVO;

public interface UserMapper {
	public int insertUser(UserVO vo);//이곳에서 정의를 함. 전송해줄때 같은 이름이 있으면 안되기때문에 이름은 바꿔줘야한다.
															//2개의 정보 (아이디 , 이름)
	public int insert(User user);			//4개의 정보를 가지고 있다. (아이디 , 이름,전번,주소)
	public List<UserVO> selectUser();
	public UserVO findById(String usrid);
	public List<User> selectAll();
	public int Update(User user);
	public int updateUser(User user);
	public int updateAddress(User user);//파라미터 타입 & 리턴타입?
	public int delete(String usrid);
	
	
	
	
	
}
