package scit.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import scit.vo.UserVO;

public class UserDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); //가져오는 작업
	
	public int insertUser(UserVO vo) {
		SqlSession session = null;
		session = factory.openSession();	//세션값 빌려온걸 session에 담음
		
		UserMapper mapper = session.getMapper(UserMapper.class);		//UserMapper랑 연동
		
		int result = mapper.insertUser(vo);	//세션을 불러옴
		session.commit();
		return result;
	}
	public List<UserVO> selectUser() {
		SqlSession session = null;
		session = factory.openSession(); //세션값 빌려온걸 session에 담음
		
		UserMapper mapper = session.getMapper(UserMapper.class);		//UserMapper랑 연동
		
		List<UserVO> list = mapper.selectUser();			//세션을 불러옴
		session.commit();
		return list;
	}
}
