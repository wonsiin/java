package scit.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import scit.vo.UserVO;

public class UserDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); //�������� �۾�
	
	public int insertUser(UserVO vo) {
		SqlSession session = null;
		session = factory.openSession();	//���ǰ� �����°� session�� ����
		
		UserMapper mapper = session.getMapper(UserMapper.class);		//UserMapper�� ����
		
		int result = mapper.insertUser(vo);	//������ �ҷ���
		session.commit();
		return result;
	}
	public List<UserVO> selectUser() {
		SqlSession session = null;
		session = factory.openSession(); //���ǰ� �����°� session�� ����
		
		UserMapper mapper = session.getMapper(UserMapper.class);		//UserMapper�� ����
		
		List<UserVO> list = mapper.selectUser();			//������ �ҷ���
		session.commit();
		return list;
	}
}
