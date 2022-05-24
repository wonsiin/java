package scit.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import scit.vo.User;
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
	
	public int insertUser(User user) {
		SqlSession session = null;
		session = factory.openSession();	//세션값 빌려온걸 session에 담음
		
		UserMapper mapper = session.getMapper(UserMapper.class);		//UserMapper랑 연동
		//usr 테이블에 저장코드
		int result = 0;
		if(user.getPhone() == null || user.getAddress() ==null) {
			result = mapper.insertUser(new UserVO(user.getUsrid(), user.getUsrname())); //1곳만 저장
		}else {
			//usraddr 테이블에 저장 코드
			result = mapper.insertUser(new UserVO(user.getUsrid(), user.getUsrname())); //2곳에 저장
			result = mapper.insert(user);
		}
		//세션을 불러옴
		
	
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

	public UserVO findById(String usrid) {
		SqlSession session = null;
		session = factory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		UserVO vo = mapper.findById(usrid);	//세션을 불러옴
		return vo;
	}

	public List<User> selectAll() {
		SqlSession session = null;
		session = factory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> list = mapper.selectAll();	
		return list;
	}

	public int Update(User user) {
		SqlSession session = null;
		session = factory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
			//순서는 관계없다.
			int ret1 = mapper.updateUser(user);
			int ret2 = mapper.updateAddress(user);
			
			if(ret1 == 1 && ret2 == 1) {
				session.commit();
				return 1;
			}
			session.rollback();
			return 0;
	}

	public int delete(String usrid) {
		SqlSession session = null;
		session = factory.openSession();
		
		UserMapper mapper = session.getMapper(UserMapper.class);
		
		int result = mapper.delete(usrid);
		if(result == 1) { //값을받은게 있으면 commit하게
			session.commit();
			return 1;
		}
		return 0;
	}

}
