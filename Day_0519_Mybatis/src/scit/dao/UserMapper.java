package scit.dao;

import java.util.List;

import scit.vo.User;
import scit.vo.UserVO;

public interface UserMapper {
	public int insertUser(UserVO vo);//�̰����� ���Ǹ� ��. �������ٶ� ���� �̸��� ������ �ȵǱ⶧���� �̸��� �ٲ�����Ѵ�.
															//2���� ���� (���̵� , �̸�)
	public int insert(User user);			//4���� ������ ������ �ִ�. (���̵� , �̸�,����,�ּ�)
	public List<UserVO> selectUser();
	public UserVO findById(String usrid);
	public List<User> selectAll();
	public int Update(User user);
	public int updateUser(User user);
	public int updateAddress(User user);//�Ķ���� Ÿ�� & ����Ÿ��?
	public int delete(String usrid);
	
	
	
	
	
}
