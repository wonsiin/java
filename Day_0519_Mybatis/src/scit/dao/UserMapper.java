package scit.dao;

import java.util.List;

import scit.vo.UserVO;

public interface UserMapper {
	public int insertUser(UserVO vo);
	public List<UserVO> selectUser();
	
	
}
